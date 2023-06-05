package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProveedorDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Proveedor buscar(int id) {
        Proveedor p = new Proveedor();
        String sql = "Select * from proveedor where IdProveedor=" + id;
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPag(rs.getString(3));
                p.setDir(rs.getString(4));
                p.setTel(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return p;
    }

//*******Operaciones CRUD***************//
    public List listar() {
        String sql = "select * from proveedor";
        List<Proveedor> lista = new ArrayList<>();
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor pr = new Proveedor();
                pr.setId(rs.getInt(1));
                pr.setNom(rs.getString(2));
                pr.setPag(rs.getString(3));
                pr.setDir(rs.getString(4));
                pr.setTel(rs.getString(5));
                lista.add(pr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Proveedor pr) {
        String sql = "insert into proveedor(NombreEmpresa, PaginaWeb, Direccion, Telefono)values(?,?,?,?)";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNom());
            ps.setString(2, pr.getPag());
            ps.setString(3, pr.getDir());
            ps.setString(4, pr.getTel());
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return r;
    }

    public Proveedor listarId(int id) {
        Proveedor pro = new Proveedor();
        String sql = "select * from proveedor where IdProveedor=" + id;
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setNom(rs.getString(2));
                pro.setPag(rs.getString(3));
                pro.setDir(rs.getString(4));
                pro.setTel(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return pro;
    }

    public int actualizar(Proveedor em) {
        String sql = "update proveedor set NombreEmpresa=?, PaginaWeb=?, Direccion=?, Telefono=? where IdProveedor=?";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNom());
            ps.setString(2, em.getPag());
            ps.setString(3, em.getDir());
            ps.setString(4, em.getTel());
            ps.setInt(5, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from proveedor where IdProveedor=" + id;
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}

package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompraDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public String GenerarSerie() {
        String numeroserie = "";
        String sql = "select max(NumeroSerie) from ventas";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroserie = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return numeroserie;
    }

    public String IdCompras() {
        String idcompras = "";
        String sql = "select ifnull(max(IdCompras),0) from compras";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idcompras = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idcompras;
    }

    public int guardarCompra(Compra co) {
        String sql;
        sql = "insert into compras(IdProveedor, IdEmpleado, NumeroSerie, FechaCompra, Monto, Estado) values (?,?,?,?,?,?)";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, co.getIdproveedor());
            ps.setInt(2, co.getIdempleado());
            ps.setString(3, co.getNumserie());
            ps.setString(4, co.getFecha());
            ps.setDouble(5, co.getMonto());
            ps.setString(6, co.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return r;
    }

    public int guardarDetallecompras(Compra compra) {
        String sql = "insert into detalle_compras(IdCompras, IdProducto, Cantidad, PrecioCompra)values(?,?,?,?)";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getId());
            ps.setInt(2, compra.getIdproducto());
            ps.setInt(3, compra.getCantidad());
            ps.setDouble(4, compra.getPrecio());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}

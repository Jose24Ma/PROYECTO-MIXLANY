package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String driver, user, password, urlBd, port, nameDB;
    private Connection con;
    //private String url = "jdbc:mysql://localhost:3306/mixlany_db";
    //private String user = "root";
    //private String pass = "";

    public Conexion() {

        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        nameDB = "mixlany_db";
        port = "3306";
        urlBd = "jdbc:mysql://localhost:" + port + "/" + nameDB;

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(urlBd, user, password);
            System.out.println("Conexion OK!");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("Error al conectarse" + e.toString());
        }
    }
    
    public Connection obtenerConexion(){
        return con;
    }
    
    public Connection cerrarConexion() throws SQLException{
        con.close(); 
        con = null;
        return con;
    }
    
    public static void main(String[] args) {
     Conexion conexionBd = new Conexion();
    }
}

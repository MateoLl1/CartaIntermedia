package clases;

import formularios.frmInicio;
import formularios.frmMenuJug;
import formularios.frmRegistro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection getConexion() {

        String url2 = "jdbc:sqlserver://localhost:1433;database=cartaIntermedia2C;user=##MT_LLSQL;password=123321";

        String url = "jdbc:sqlserver://localhost:1433;database=CartaIntermedia2C;user=sa;password=123456";
        try {
            Connection con = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null,"Conectado");
           
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO Conectado");
            return null;
        }
    }

    public static Connection InsertDatos(String usuario, String contra) {

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("insert into tbl_Registro (reg_usu,reg_contra) values ('" + usuario + "' , '" + contra + "')");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado");
            frmMenuJug obj1 = new frmMenuJug();
            obj1.setVisible(true);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error (Usuario No creado)" + e.getMessage());
            return null;
        }
    }

    public static Connection iniciarSeccion(String usuario, String contraseña) {
        String consulta, usuBase = "", contraBase = "";
        Connection con = Conexion.getConexion();
        try {
            consulta = "select * from tbl_Registro where reg_usu='" + usuario + "' and reg_contra='" + contraseña + "'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuBase = rs.getString(2);
                contraBase = rs.getString(4);
            }
            if ((usuario.equals("")) && (contraseña.equals(""))) {
                JOptionPane.showMessageDialog(null,"Llene los campos");
            } else if (usuario.equals(usuBase) && contraseña.equals(contraBase)) {
                JOptionPane.showMessageDialog(null, "Datos correctos");
                frmMenuJug obj1 = new frmMenuJug();
                obj1.setVisible(true);
                frmInicio obj2 = new frmInicio();
                obj2.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }

            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            return null;
        }
    }

    public static Connection tabla2llenar(String nombre, String contra) {
        Connection con = getConexion();
        int id = 0;
        try {
            String consulta = "select reg_id,reg_contra from tbl_Registro where reg_usu='" + nombre + "' and reg_contra='" + contra + "'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = Integer.valueOf(rs.getString(1));
            }
            consulta = "insert into tbl_datos (dat_nombre,reg_id) values ('" + nombre + "' ," + id + ")";
            PreparedStatement ps2 = con.prepareStatement(consulta);
            ps2.executeUpdate();
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            return null;
        }
    }
    
    public static Connection infoJuego (String nombre, String saldojugador,String fondoMesa){
        Connection con = getConexion();
        try {
            String consulta = "update tbl_datos set dat_saldojugador='"+saldojugador+"',dat_saldomesa='"+fondoMesa+"' where dat_nombre ='"+nombre+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR "+e.getMessage());
            return null;
        }
    }
    
    public static Connection eliminarUS(String usuario, String contraseña){
        Connection con = getConexion();
        try {
            String consulta = "delete from tbl_Registro  where reg_usu = '"+usuario+"'  delete from tbl_datos  where dat_nombre= '"+usuario+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            return con;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            return null;
        }
    }
    
    public static Connection actualizarUsuario(String Viejo,String actual){
        Connection con = getConexion();
        try {
            String consulta = "update tbl_datos set dat_nombre='"+actual+"' where dat_nombre = '"+Viejo+"'";
            PreparedStatement ps2 = con.prepareStatement(consulta);
            ps2.executeUpdate();
            consulta ="update tbl_Registro set reg_usu='"+actual+"' where reg_usu = '"+Viejo+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.executeUpdate();
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            return null;
        }
    }
    
    public static Connection actualizarContra(String usuario, String contraseña,String nueva){
        Connection con = getConexion();
        try {
            String consulta ="update tbl_Registro set reg_contra='"+nueva+"' where reg_usu='"+usuario+"' and reg_contra = '"+contraseña+"'";
            PreparedStatement ps = con.prepareStatement(consulta);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            return null;
        }
    }
    
    
}

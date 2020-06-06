package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SignUp {

    private static Connection conn;
    private static Database con;
    private static PreparedStatement consulta;

    //Recibe desde el controlador el usuario y contraseña para crear el statement e insertar a la tabla de usuarios en la base de datos
    public SignUp(String username,String password){
        try {
            conn = con.getConexion();
            consulta = conn.prepareStatement("insert into usuarios(usuario,contraseña) values(upper(?),?)");
            consulta.setString(1, username);
            consulta.setString(2, password);
            int result = consulta.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Se ha creado el usuario exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear usario");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

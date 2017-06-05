package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoBD {  
    
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/rh_sepool";
    private final String usuario = "root";
    private final String senha = "hihihiopato";

    public void conectar(){ 
            
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco!\n" + ex);
        }
    }

    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco!\n" + ex);
        }
    }

    public void consultaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao desconectar com o banco!\n" + ex);
        }    
    }    
}   
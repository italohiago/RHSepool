package controle;

import DAO.ConexaoBD;
import DAO.DAOTabelas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabelas;

public class ControleTabelas {
    
    ConexaoBD conex = new ConexaoBD();
    
    public ControleTabelas(JTable tabela, String[] camposTabela, String consulta){
                           //JTable1, {"Usuário", "Senha"}, DAOTabelas.consultaExemplo
        ArrayList dados = new ArrayList();
        String[] colunas = camposTabela;
        
        conex.conectar();
        conex.consultaSql(consulta);
        
         try{
            if(conex.rs.first()){
                do{
                    dados.add(camposBanco(conex));
                }while(conex.rs.next());    
            }
            else
                JOptionPane.showMessageDialog(null, "O servidor ainda não possui dados para esta tabela!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!");
        }
        
        conex.desconectar();
        ModeloTabelas modelo = new ModeloTabelas(dados, colunas);
        tabela.setModel(modelo);    
        configuracoes(tabela);
    }
    
    public Object[] camposBanco(ConexaoBD conex){
        //EXEMPLO
        try{
            return new Object[]{conex.rs.getString("usuario"), conex.rs.getString("cargo")}; 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao carregar objeto para tabela!");
        }
        return null;
    }
    
    public void configuracoes(JTable tabela){
        //EXEMPLO
        tabela.getColumnModel().getColumn(0).setPreferredWidth(184);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(184);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_ALL_COLUMNS);
        
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void consulta(){
        //EXEMPLO
        
    }
}

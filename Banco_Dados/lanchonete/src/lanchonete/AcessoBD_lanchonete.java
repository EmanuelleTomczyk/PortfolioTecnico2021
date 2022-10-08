package lanchonete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcessoBD_lanchonete {
    private static Connection connection;
   
   public static Connection getConnection(){
        if(connection == null){
            try{
                Class.forName("org.postgresql.Driver");
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "postgres";
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    
        public static void salvar_filial (Filial filial){
        try{	
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO filial (codigo_filial, nome, cidade, estado) values(?, ?, ?, ?)");
            ps.setString(1, filial.getCod());
            ps.setString(2, filial.getNome());
            ps.setString(3, filial.getCidade());
            ps.setString(4, filial.getEstado());
            ps.execute();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean deleta_filial(String codigo){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM filial WHERE cod = ?");
            ps.setString(1, codigo);
            ps.executeUpdate();
            return true;
            }
        catch (SQLException e) {
                e.printStackTrace();
            }
        return false;
    }
    
    public static void salvar_funcionarios (Funcionario_lanchonete funcionario_lanchonete){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO funcionarios_lanchonete (nome, cod_filial, pis, cargo, salario, carga_horaria) values(?, ?, ?, ?, ?, ?)");
            ps.setString(1, funcionario_lanchonete.getNome());
            ps.setString(2, funcionario_lanchonete.getCod_filial());
            ps.setString(3, funcionario_lanchonete.getPis());
            ps.setString(4, funcionario_lanchonete.getCargo());
            ps.setDouble(5, funcionario_lanchonete.getSalario());
            ps.setInt(6, funcionario_lanchonete.getCarga_horaria());
            ps.execute();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean deleta_funcionarios(String pis){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM funcionarios_lanchonete WHERE pis = ?");
            ps.setString(1, pis);
            ps.executeUpdate();
            return true;
            }
        catch (SQLException e) {
                e.printStackTrace();
            }
        return false;
    }
    
    public static void salvar_fornecedor (Fornecedor fornecedor){
        try{	
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO fornecedor (nome, email, cnpj, produto, estado) values(?, ?, ?, ?, ?)");
            ps.setString(3, fornecedor.getCnpj());
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getEmail());
            ps.setString(5, fornecedor.getEstado());
            ps.setString(4, fornecedor.getProduto());
            ps.execute();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public static boolean deleta_fornecedor(String cnpj){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM fornecedor WHERE cnpj = ?");
            ps.setString(1, cnpj);
            ps.executeUpdate();
                return true;  
        }
        catch (SQLException e) {
                e.printStackTrace();
            }
        return false;

    }
     
     public static void salvar_compra (Compras compras){
        try{	
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO compra (cpf_cliente, data_compra, total, cod_func) values(?, ?, ?, ?)");
            ps.setString(1, compras.getCpf_cliente());
            ps.setString(2, compras.getData_compra());
            ps.setDouble(3, compras.getTotal());
            ps.setString(4, compras.getCod_func());
            ps.execute();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static void deleta_compra(String cpf){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM compra WHERE cpf_cliente = ?");
            ps.setString(1, cpf);
            ps.executeUpdate();
            }
        catch (SQLException e) {
                e.printStackTrace();
            }
    }
     
     public static void salvar_produto (Produto produto){
        try{	
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO produto (codigo_produto, validade, qtd, data_compra, cod_fornecedor, marca, preco, descricao) values(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, produto.getCodigo_produto());
            ps.setString(2, produto.getValidade());
            ps.setInt(3, produto.getQtd());
            ps.setString(4, produto.getData_compra());
            ps.setString(5, produto.getCod_fornecedor());
            ps.setString(6, produto.getMarca());
            ps.setDouble(7, produto.getPreco());
            ps.setString(8, produto.getDescricao());
            ps.execute();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static boolean deleta_produto(int codigo_produto){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM produto WHERE codigo_produto = ?");
            ps.setInt(1, codigo_produto);
            ps.executeUpdate();
            return true;
            }
        catch (SQLException e) {
                e.printStackTrace();
            }
        return false;
    }
     
     public static void deleta_estoque(int cod_prod, String cod_filial){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM estoque where cod_prod = ? and cod_filial = ?");
            ps.setInt(1, cod_prod);
            ps.setString(2, cod_filial);
            ps.executeUpdate();
            }
        catch (SQLException e) {
                e.printStackTrace();
            }
    }

     public static void visualiza_tabela (String tabela, String... atributos){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from "+tabela);
            
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                for(String i : atributos){
                    res.getString(i);
                    selectfrom = selectfrom + " - " + res.getString(i);
                }
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public static void salvar_estoque (Estoque estoque){
        try{	
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO estoque (Cod_filial, Cod_prod) values(?, ?)");
            ps.setString(1, estoque.getCod_filial());
            ps.setInt(2, estoque.getCod_prod());
            ps.execute();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static boolean verifica_produto(String cnpj){
         try {
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from fornecedor");
            ResultSet res = ps.executeQuery();
            
            while(res.next()){
                String cnpj_fornc = res.getString("cnpj");
                
                if(cnpj_fornc.equals(cnpj)){
                    return true;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
              return false;
    }
     
     public static boolean verifica_funcionario(String cod){
         try {
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from filial");
            ResultSet res = ps.executeQuery();
            
            while(res.next()){
                String codigo_filial = res.getString("cod");
                
                if(codigo_filial.equals(cod)){
                    return true;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
              return false;
    }
     
        public static boolean verifica_compra(String cod_func){
         try {
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Funcionarios_lanchonete");
            ResultSet res = ps.executeQuery();
           
            while(res.next()){
                String codigo_funcionario = res.getString("cod_func");
                
                if(codigo_funcionario.equals(cod_func)){
                    return true;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
              return false;
    }
     
     public static boolean pesquisa_produto(String tabela, int codigo_produto){
         try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from produto where codigo_produto = ?");
            ps.setInt(1, codigo_produto);
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
         return false;
     }
     
     public static boolean pesquisa_fornecedor(String tabela, String cnpj){
         try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from fornecedor where cnpj = ?");
            ps.setString(1, cnpj);
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
         return false;
     }
     
     public static boolean pesquisa_funcionario(String tabela, String pis){
         try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from funcionarios_lanchonete where pis = ?");
            ps.setString(1, pis);
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
         return false;
     }
     
     public static boolean pesquisa_filial(String tabela, String codigo_filial){
         try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from filial where cod = ?");
            ps.setString(1, codigo_filial);
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
         return false;
     }
     
     public static boolean pesquisa_compra(String tabela, String cpf){
         try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from compra where cpf_cliente = ?");
            ps.setString(1, cpf);
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
         return false;
     }
     
     public static void visualiza_estoque (String... atributos){
        try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from estoque inner join produto on estoque.cod_prod = produto.codigo_produto \n" +
"inner join filial on estoque.cod_filial = filial.cod");
            
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                for(String i : atributos){
                    res.getString(i);
                    selectfrom = selectfrom + " - " + res.getString(i);
                }
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public static boolean pesquisa_estoque(String tabela, int codigo_produto, String codigo_filial){
         try{
            Connection con = AcessoBD_lanchonete.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from estoque where cod_prod = ? and cod_filial = ?");
            ps.setInt(1, codigo_produto);
            ps.setString(2, codigo_filial);
            ResultSet res = ps.executeQuery();
            String selectfrom = "";
            while(res.next()){
                selectfrom = selectfrom + "\n";
            }
            System.out.println(selectfrom);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
         return false;
     }
}
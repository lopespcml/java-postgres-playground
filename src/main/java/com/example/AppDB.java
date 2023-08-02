package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AppDB {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    

    public static void main(String[] args) {       
        new AppDB();   
          
    }

    public AppDB() {
        carregarDriver();
        try(var conn=getConnection()){
           /* listarEstados(conn);
            System.out.println();
            localizarEstado(conn, "TO");
            listasDados(conn,"marca"); */
            var marca=new Marca();
            marca.setId(3L);
            var produto =new Produto();
            produto.setId(202L);
            produto.setNome("Produto Alterado");
            produto.setMarca(marca);
            produto.setValor(100);
          //  inserirProduto(conn,produto);
          //  excluirProduto(conn,204L);
            alterarProduto(conn,produto);
            produto.listar(conn);
        }
        catch(SQLException e) {
            System.out.println("Nao foi possivel connectar ao banco de dados!!!!" + e.getMessage());
        }   
    }


 private  void carregarDriver() {
        try {Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel carregar o DB driver!!"+e.getMessage());
        }
    }

    private  Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
    }
    private void listarEstados(Connection conn) {
        try{
          //  Statement query=null;
            var query = conn.createStatement();
            var sql = "Select * from estado";
            var result = query.executeQuery(sql);
            while (result.next()) {
                System.out.printf("ID: %d Nome : %s UF: %s\n",result.getInt("id"),result.getString("Nome"), result.getString("uf"));
            }
        }    
        catch(SQLException e){
           System.out.println("Erro no SQL:"+ e.getMessage());
            }            
    }

    private void localizarEstado(Connection conn,String uf) {
        try{
           // Statement query=null;
           // query = conn.createStatement();
          //  var sql="Select * from estado where uf=" + "'"+uf+"'"; //SQL injection issue
            var sql= "Select * from estado where uf=?";
            var query =conn.prepareStatement(sql);
            query.setString(1,uf);
            var result = query.executeQuery();
            if (result.next()) {
                System.out.printf("ID: %d Nome : %s UF: %s\n",result.getInt("id"),result.getString("Nome"), result.getString("uf"));
            }
        }    
        catch(SQLException e){
           System.out.println("Erro no SQL:"+ e.getMessage());
            }            
    }

    private void listasDados(Connection conn, String tabela) {
        try{
            //  Statement query=null;
              var query = conn.createStatement();
              var sql = "Select * from " + tabela;
              var result = query.executeQuery(sql);
              int cols=result.getMetaData().getColumnCount();
              for (int i = 1; i < cols; i++) {
                 System.out.printf("%-25s",result.getMetaData().getColumnName(i));   
              } 
              System.out.println();

              while (result.next()) {
                  for (int i = 1; i < cols; i++) {
                    System.out.printf("%-25s",result.getString(i));
                  }
              System.out.println();     
              }
          }    
          catch(SQLException e){
             System.out.println("Erro no SQL:"+ e.getMessage());
              }      
    }
    private void inserirProduto(Connection conn, Produto produto) {
        var sql= "insert into produto (nome, marca_id,valor) values (?,?,?)";
        try {
            var statement= conn.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("Erro no SQL: "+ e.getMessage());
        }
    }    
    private void alterarProduto(Connection conn, Produto produto) {
        var sql= "update produto set nome=?, marca_id=?,valor=? where id=?";
        try {
            var statement= conn.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.setLong(4, produto.getId());
            statement.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("Erro no SQL: "+ e.getMessage());
        }
    }    


    private void excluirProduto(Connection conn, Long id) {
        var sql= "delete from produto where id=?";
        try {       
        var statement = conn.prepareStatement(sql);
        statement.setLong(1,id);
        statement.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("Erro no SQL: "+ e.getMessage());
        }
    }
  
}
  
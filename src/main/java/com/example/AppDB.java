package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDB {
    public static void main(String[] args) {
        try {Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel carregar o DB driver!!"+e.getMessage());
        }
        Statement statement=null;
        try(var conn=DriverManager.getConnection("jdbc:postgresql://localhost/postgres", 
        "gitpod","")){
            System.out.println("Connexo com sucesso!!!!");
            statement = conn.createStatement();
            var result = statement.executeQuery("Select * fro estado");
            while (result.next()) {
               System.out.printf("ID: %d Nome : %s UF: %s\n",result.getInt("id"),result.getString("Nome"), result.getString("uf"));
            }
        }    
        catch(SQLException e){
            if (statement==null) {
                System.out.println("Nao foi possivel connectar ao banco de dados!!!!");
            }
            else {
                System.out.println("Erro no SQL:"+ e.getMessage());
            }            
        }           
    }
}
  
package com.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Produto {
    private Long id;
    private String nome;
    private Marca marca;
    private double Valor;
    
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public double getValor() {
        return Valor;
    }
    public void setValor(double valor) {
        Valor = valor;
    }    
  public void listar(Connection conn) {
    var sql = "select * from Produto";
    try {
        var statement = conn.createStatement();
        var result=statement.executeQuery(sql);
        while (result.next()) {
            System.out.printf("ID: %s Produto : %s Marca: %s Valor: %s\n",
            result.getLong("id"),result.getString("nome"), result.getInt("marca_id"), result.getDouble("valor"));
        }
    } catch (SQLException e) {
        System.out.println("Erro no SQL:"+ e.getMessage());      
    }
    


  }  
}

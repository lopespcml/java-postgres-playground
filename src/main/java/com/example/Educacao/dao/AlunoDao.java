package com.example.Educacao.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.Educacao.Modelo.Aluno;
import com.example.dao.ConnectionManager;

public class AlunoDao  {
    
        
    public void inserir(Aluno Aluno,Connection conn) {
        var sql = "insert into Aluno (nome) values(?)";
        try {
            var statement = conn.prepareStatement(sql);
            statement.setString(1,Aluno.getNome());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

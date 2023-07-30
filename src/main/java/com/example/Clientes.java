package com.example;

public class Clientes{
    private String cpf;
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial; 

    public Clientes(){
        double aleatorio= Math.random();
        if(aleatorio >0.5)
           setEspecial(true);
        else
            setEspecial(false);    
    }
    public Clientes(String cpf,String nome, double renda, char sexo, int anoNascimento){
       this();
       this.setCpf(cpf);
       this.setNome(nome);
       this.setRenda(renda);
       this.setSexo(sexo);
       this.setAnoNascimento(anoNascimento);
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (!nome.isBlank())
            this.nome = nome.toUpperCase().trim();
        else
            System.err.println("Insira um nome");    
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo=='M'||sexo=='F')
            this.sexo = sexo;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        if(renda >= 0)
            this.renda=renda;
        else
            System.err.println("A renda precisa ser maior que zero");    
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public String toString() {
        return "Nome= " + nome + "||CPF= " + cpf;
    }
 }
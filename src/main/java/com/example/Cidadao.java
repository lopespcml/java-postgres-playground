package com.example;

import java.time.LocalDate;


public class Cidadao {
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int Idade() {
        return LocalDate.now().getYear() - getDataNascimento().getYear();
    }
    public String Eleitor() {
        int idade = Idade();
       
        if (idade <16) {
            return "Nao eh Eleitor ....!";
        }    
        else if ((idade>=16 && idade < 18)||(idade>70))    {
            return "Eleitor facultativo....!";
        }
        else {
            return "Eleitor obrigatorio ....!";
        }

        }
    }


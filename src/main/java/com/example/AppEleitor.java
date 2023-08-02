package com.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppEleitor {
    public static void main(String[] args) {
            LocalDate dataNascimento;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Entre com a data de nascimento do Eleitor: ");
            String strdataNascimento = scanner.nextLine();
            dataNascimento=LocalDate.parse(strdataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Cidadao cidadao = new Cidadao();
            cidadao.setDataNascimento(dataNascimento);
            System.out.println(cidadao.getDataNascimento());
            System.out.println(cidadao.Eleitor());
            scanner.close();
            
            }
           
    }

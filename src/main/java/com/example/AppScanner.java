package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        Clientes cliente1=new Clientes("?","?",0,'?',1966);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        cliente1.setNome(scanner.nextLine());
        System.out.println("Digite o seu CPF:");
        cliente1.setCpf(scanner.nextLine());
        System.out.println("Digite o seu Salario:");
        cliente1.setRenda(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite o seu sexo:");
        cliente1.setSexo(scanner.nextLine().charAt(0));


    
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getRenda());
        System.out.println(cliente1.getSexo());
        System.out.println(cliente1.getAnoNascimento());
        System.out.println(cliente1.isEspecial());
     
    }
    
}

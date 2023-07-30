package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AppListas {
    public static void main(String[] args) {
      Clientes[] clientes = new Clientes[5];
      LinkedList<Clientes> listClientes = new LinkedList<>();
        
      

      for (int i=0; i<5; i++) {
        clientes[i]=new Clientes();
        clientes[i].setNome("Paulo 0" + i);
        listClientes.add(i, clientes[i]);
      //  System.out.println(clientes[i].getNome());
      }
       // System.out.println(listClientes); 
     //  listClientes.remove(listClientes.size()-1);
     listClientes.removeFirst();
       for (var cliente: listClientes) {
        System.out.println(cliente); 
       }





      
        
    }

}

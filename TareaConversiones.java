/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaconversiones;

/**
 *
 * @author Daniel Camargo
 */
public class TareaConversiones {

    public static void main(String[] args) {
        int numeroEntero = 10;
        float numeroFloat = 3.14f;
        double numeroDouble = 9.81;
        boolean valorBooleano = true;
        
        // Conversión de primitivo a objeto
        Integer objetoEntero = numeroEntero;
        Float objetoFloat = numeroFloat;
        Double objetoDouble = numeroDouble;
        Boolean objetoBooleano = valorBooleano;
        
        // Imprimir los resultados
        System.out.println("Objetos:");
        System.out.println("Integer: " + objetoEntero);
        System.out.println("Float: " + objetoFloat);
        System.out.println("Double: " + objetoDouble);
        System.out.println("Boolean: " + objetoBooleano);
        System.out.println();
        // Número de teléfono de mi amigo en float. El numero es demasiado grande para declararse como integer
        float numeroAmigo = (float) 3.204459884;

        // Conversión a double
        double numDouble = (double) numeroAmigo;

        // Convertir a String
        String numeroString = String.valueOf(numeroAmigo);
        
        // Mostrar los resultados
        System.out.println("Numero original (float): " + numeroAmigo);
        System.out.println("Numero convertido a double: " + numDouble);
        System.out.println("Numero como String: " + numeroString);
        System.out.println();
        
        String nombre = "Camilo";
        char[] arregloDeCaracteres = nombre.toCharArray();
        System.out.println("Camilo");
        // Convertir el nombre a codigo ASCII
        
        for (int i = 0; i < nombre.length(); i++) {
        int valorAscii = (int) nombre.charAt(i);  // Convertir a valor ASCII
        System.out.println("El valor ASCII de '" + nombre.charAt(i) + "' es: " + valorAscii);} 
        System.out.println();
        
        System.out.println("¿Como convertir el nombre o numero de telefono a object?");
        String nombre_2 = "Camilo";
        System.out.println("Camilo");
        
        // Convertir String a Object
        Object objetoNombre = nombre_2;
        
        // Imprimir el valor
        System.out.println("Nombre como Object: " + objetoNombre);
        System.out.println();
        
        long numeroTelefono = (long) 3.204459887;
        Object objetoTelefono = numeroTelefono;
        System.out.println("Numero de telefono como Object: " + objetoTelefono);
        System.out.println();
        
        //Convertir un número booleano (boolean) a Object
        boolean valorBool = false;
        Object objetoBoolean = Boolean.valueOf(valorBool);
        System.out.println("Valor booleano como Object: " + objetoBoolean);
        
           
}
}

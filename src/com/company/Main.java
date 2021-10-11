package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// const edad = 31;
//        String nombre = "Emmanuel Gomez";
//        byte  num1 = 10;
//
//        short numShort1 = num1;
//        int numInt = numShort1;
//
//        byte numByte1 = 120;
//        byte numByte2 = 120;
//        short suma = (short)(numByte1+numByte2);
//        System.out.println(suma);
//        short num2 = 10;
//        int   num3 = 10;
//        long  num4 = 10;
//
//        //datos primitivos decimales
//        float  decimal1 = 10.1212323f;
//        double decimal2 = 20.2121544564564542d;
//
//        //dato primitivo char
//        char caracter = 'f';
//
//        //dato primitivo boolean
//        boolean verdadero = true;


//        System.out.println(nombre);
//        System.out.println(num1);



//        Operadores aritmeticos en Java
//        + - * / %
        Scanner entrada = new Scanner(System.in);

        float num1;
        System.out.println("Ingresa el primer numero");
        num1 = entrada.nextFloat();
        float num2;
        System.out.println("Ingresa el segundo numero");
        num2 = entrada.nextFloat();

        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicacion: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));


    }
}

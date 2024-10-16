package com.iterasys;

public class Main {
    public static void main(String[] args) {
        float num1 = 5;
        float num2 = 3;

        System.out.println(somar(num1, num2));
        System.out.println(subtrair(num1, num2));
       
    }

    public static float somar(float num1, float num2){
        float resultado = num1 + num2;

        System.out.println("Soma de " + num1 + " + " + num2 + " é: " + resultado);

        return resultado;
    }

    public static float subtrair(float num1, float num2){
        float resultado = num1 - num2;

        System.out.println("A diferença de " + num1 + " - " + num2 + " é: " + resultado);

        return resultado;
    }

    public static float multiplicar(float num1, float num2){
        return num1 * num2;
    }

    public static float dividirIf(float num1, float num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }

        return num1/num2;
    }

    public static String dividir(int num1, int num2){
        try {
            return String.valueOf (num1 / num2);
        } catch (Exception e) {
            return "Divisão por zero não é permitida.";
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.banco;

/**
 *
 * @author david
 */
public class Banco {

    public static void main(String[] args) {
        int saldo = 100000; // Cambiar aquí para probar con diferentes saldos
        int retiro = 50000; // Cambiar aquí para probar con diferentes montos de retiro

   if (saldo <= 0){
    System.out.println("sin saldo");
} else if (retiro <= 0) {
    System.out.println("no es posible");
} else if (retiro > saldo) {
    System.out.println("saldo insuficiente");
} else {
    int[] billetes = {100000, 50000, 20000, 10000};
    int[] cantidadBilletes = new int[4];
    int montoRestante = retiro;
    for (int i = 0; i < 4; i++) {
        cantidadBilletes[i] = montoRestante / billetes[i];
        montoRestante %= billetes[i];
    }
    if (montoRestante != 0) {
        System.out.println("no es posible");
    } else if (cantidadBilletes[0] == 0 && cantidadBilletes[1] == 0 && cantidadBilletes[2] == 0) {
        System.out.println(saldo + ":0;0;0;" + cantidadBilletes[3] + ";saldo" + (saldo - retiro));
    } else {
        System.out.println(saldo + ":" + cantidadBilletes[0] + ";" + cantidadBilletes[1] + ";" + cantidadBilletes[2] + ";" + cantidadBilletes[3] + ";saldo" + (saldo - retiro));
    }
}
}
   
}

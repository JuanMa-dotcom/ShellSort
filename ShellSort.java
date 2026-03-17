/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shellsort;

/**
 *
 * @author jv134
 */
public class ShellSort {

    public static void shellSort(String[] arr) {
        int n = arr.length;
        int intervalo = n / 2;

        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                String temp = arr[i];
                int j = i;

                while (j >= intervalo && arr[j - intervalo].compareToIgnoreCase(temp) > 0) {
                    arr[j] = arr[j - intervalo];
                    j -= intervalo;
                }

                arr[j] = temp;
            }
            intervalo /= 2;
        }
    }

    public static void mostrarArreglo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  [" + i + "] " + arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] nombres = {
            "Paulo",
            "Sandro",
            "Tonoto",
            "Eduardo",
            "Mariana",
            "Rodrigo",
            "Isabella",
            "Juan",
            "Manuel",
            "Oscar"
        };
        System.out.println("ORDENAMIENTO SHELL SORT");
       

        System.out.println("\nArreglo ORIGINAL (sin ordenar):");
        
        mostrarArreglo(nombres);

        shellSort(nombres);

        System.out.println("\nArreglo ORDENADO (A --> Z):");
        mostrarArreglo(nombres);
    }
}
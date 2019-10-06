package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * Kelas : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini akan menampilkan hasil ejaan dari nama yang dimasukkan
 *
 */

public class EjaanNama {

    public static void eja(String name) {
        String [] arrayOfName = name.split("");
        System.out.println(String.format("Ejaan untuk \"%s\" adalah ", name));
        for (int i = 0; i < arrayOfName.length; i++) {
            System.out.println(String.format("Huruf ke-%d = %s", i+1, arrayOfName[i]));
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan nama Anda untuk dieja: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        eja(name);
    }
}

package com.Anshari.pbo.modul2.latihan;

public class BigInteger {
    public static void main(String[] args) {

        /** analisa :
         * Tipe data long dapat menampung 2^63-1 angka tapi kenapa angka diatas terjadi kesalahan???
         *
         * Karena syntax diatas dibaca oleh java adalah bertipe data integer
         * jika ingin java membaca dengan tipe data long kita harus menambah huruf(suffix) "L" dibelakang angka
         *
         * Contoh:
         * long p = 2147483648L;
         *
         * */

        // berikut adalah syntax yang benar:
        long p = 2147483648L;

        System.out.println(p);
    }
}

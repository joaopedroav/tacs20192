package br.com.jops425.tacs20191.romanconverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Entre com um número válido em algarismos romanos");
        String romanNumber = reader.nextLine();
        romanNumber = romanNumber.toUpperCase();

        int arabicNumber = RomanToArabic.convertRomanToArabic(romanNumber);
        System.out.printf("%s em algarismos indoarábicos é %s", romanNumber, arabicNumber);
    }

}

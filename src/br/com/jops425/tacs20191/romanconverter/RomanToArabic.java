package br.com.jops425.tacs20191.romanconverter;

public class RomanToArabic {

    static int getValueOfRomanSymbol (char romanSymbol) {
        int arabicNumberEquivalent = 0;
        switch (romanSymbol) {
            case 'I':
                arabicNumberEquivalent = 1;
                break;
            case 'V':
                arabicNumberEquivalent = 5;
                break;
            case 'X':
                arabicNumberEquivalent = 10;
                break;
            case 'L':
                arabicNumberEquivalent = 50;
                break;
            case 'C':
                arabicNumberEquivalent = 100;
                break;
            case 'D':
                arabicNumberEquivalent = 500;
                break;
            case 'M':
                arabicNumberEquivalent = 1000;
                break;
            default:
                arabicNumberEquivalent = -1;
                break;
        }
        return arabicNumberEquivalent;
    }

    public static int convertRomanToArabic(String romanNumber) {
        int convertedArabicNumber = 0;

        for (int index = 0; index < romanNumber.length(); index++) {
            int arabicNumberEquivalent = getValueOfRomanSymbol(romanNumber.charAt(index));

            if ((index + 1) < romanNumber.length()) {
                int nextArabicNumberEquivalent = getValueOfRomanSymbol(romanNumber.charAt(index + 1));

                if (arabicNumberEquivalent >= nextArabicNumberEquivalent) {
                    convertedArabicNumber += arabicNumberEquivalent;
                } else {
                    convertedArabicNumber += nextArabicNumberEquivalent - arabicNumberEquivalent;
                    index++;
                }
            } else {
                convertedArabicNumber += arabicNumberEquivalent;
                index++;
            }
        }

        return convertedArabicNumber;
    }

}

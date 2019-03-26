package ru.avalon.java.dev.j10.labs.generator;


// Генератор строк длиной от 1 до 20 символов, символы - буквы латинского алфавита в верхнем регистре.
public class StringCreator {

    public static String next(){
        int sizeOfString = (int)new Random(20).next() + 1;
        char[] charSequence = new char[sizeOfString];

        for (int i = 0; i < charSequence.length; i++) {
            char currentSymbol = (char) new Random(255).next();
            if ((currentSymbol >= 65) && (currentSymbol <= 90))
                charSequence[i] = currentSymbol;
            else
                --i;
        }

        return new String(charSequence);
    }
}

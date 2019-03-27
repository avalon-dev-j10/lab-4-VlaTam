package ru.avalon.java.dev.j10.labs.generator;


// Генератор строк длиной от 1 до 20 символов, символы - буквы латинского алфавита в верхнем регистре.
public class StringCreator {

    public static String next(){
        int sizeOfString = (int)new GeneratorOfPositiveLong(1,20).next();
        char[] charSequence = new char[sizeOfString];

        for (int i = 0; i < charSequence.length; i++) {
            charSequence[i] = (char) new GeneratorOfPositiveLong('A','Z').next();
        }

        return new String(charSequence);
    }
}

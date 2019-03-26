package ru.avalon.java.dev.j10.labs.generator;

//Класс генерирует псевдослучайные числа в диапазоне [0;upperLimit)
public class Random {
    private long upperLimit;

    public Random(long upperLimit){
        this.upperLimit = upperLimit;
    }

    public long next(){
        return (long)(Math.random()*upperLimit);
    }


}

package ru.avalon.java.dev.j10.labs.generator;

// Класс генерирует положительные целые псевдослучайные числа(включая ноль) в диапазоне [bottomLimit; topLimit]
// Если границы задаются в конструкторе отрицательными числами, то они меняют знак на '+'
// Если bottomLimit > topLimit, то они меняются местами

public class GeneratorOfPositiveLong {
    private long bottomLimit;
    private long topLimit;

    public GeneratorOfPositiveLong(long bottomLimit, long topLimit){
        this.bottomLimit = (bottomLimit < 0) ? -bottomLimit : bottomLimit;
        this.topLimit = (topLimit < 0) ? -topLimit : topLimit;

        if (bottomLimit > topLimit){
            long buffer = this.bottomLimit;
            this.bottomLimit = this.topLimit;
            this.topLimit = buffer;
        }
    }

    public long next() {
        long multiplier = topLimit - bottomLimit + 1;

        return (long)(Math.random()*multiplier) + bottomLimit;
    }

}

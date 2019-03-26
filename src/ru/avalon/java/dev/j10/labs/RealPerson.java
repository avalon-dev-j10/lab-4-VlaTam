package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class RealPerson implements Person {

    private String name;
    private Date birthDay;

    public RealPerson(String name, Date birthDay){
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDay;
    }

    @Override
    public int compareTo(Object o) {
        Person other = (Person)o;

        if (name.compareTo(other.getName()) > 0)
            return 1;
        if (name.compareTo(other.getName()) < 0)
            return -1;

        if (birthDay.before(other.getBirthDate()))
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return name + " " + birthDay;
    }
}

/**
 * Абстрактное представление о человеке.
 *
 * <p>С точки зрения модели, человек описывается именем и
 * датой рождения.
 *
 * <p>При сравнении одного человека с другим следует
 * учитывать, что больше будет тот человек, чьё имя должно
 * быть ниже в списке имён, отсортированном по возрастанию.
 * Из двух людей с одним и тем же именем больше будет тот,
 * который старше.
 */
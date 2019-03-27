package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.Formatter;

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

        // Сравниваем лексикографически имена
        if (name.compareTo(other.getName()) > 0)
            return 1;
        if (name.compareTo(other.getName()) < 0)
            return -1;

        if (birthDay.before(other.getBirthDate()))
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%15s\t\t\t%tF", name, birthDay);

        return formatter.toString();
    }
}

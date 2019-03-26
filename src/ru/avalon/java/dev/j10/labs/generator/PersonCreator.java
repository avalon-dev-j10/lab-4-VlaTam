package ru.avalon.java.dev.j10.labs.generator;

import ru.avalon.java.dev.j10.labs.Person;
import ru.avalon.java.dev.j10.labs.RealPerson;
import java.util.Date;
import static ru.avalon.java.dev.j10.labs.generator.NamesOfPerson.*;

public class PersonCreator {

    public Person next(){
        Random birthDayCreator = new Random(new Date().getTime());

        switch ((int)new Random(10).next()){
            case 0:
                return new RealPerson(VLADIMIR.toString(), new Date(birthDayCreator.next()));
            case 1:
                return new RealPerson(IVAN.toString(), new Date(birthDayCreator.next()));
            case 2:
                return new RealPerson(OLEG.toString(), new Date(birthDayCreator.next()));
            case 3:
                return new RealPerson(ANTON.toString(), new Date(birthDayCreator.next()));
            case 4:
                return new RealPerson(PETR.toString(), new Date(birthDayCreator.next()));
            case 5:
                return new RealPerson(SERGEY.toString(), new Date(birthDayCreator.next()));
            case 6:
                return new RealPerson(SVETLANA.toString(), new Date(birthDayCreator.next()));
            case 7:
                return new RealPerson(IRINA.toString(), new Date(birthDayCreator.next()));
            case 8:
                return new RealPerson(ANNA.toString(), new Date(birthDayCreator.next()));
            default:
                return new RealPerson(OLGA.toString(), new Date(birthDayCreator.next()));
        }
    }
}

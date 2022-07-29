package guru.qa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Integer year = LocalDate.now().getYear();
        if (year >= 2022 & year%4==0)
            System.out.println("2022 прошёл!, да ешё сейчас високсоный год");
    }

}

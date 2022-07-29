package guru.qa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Integer year = LocalDate.now().getYear();
        if (year > 2022)
            System.out.println("2022 прошёл!");
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Человек: ");
        Human newHuman = new Human(
                "Грёнвольт Олег",
                "06.02.1996г.",
                "+79118526070",
                "Калининград",
                "Россия",
                "Не дом и не улица"
        );

        System.out.println(
                newHuman.getName()
                        + "\n" + newHuman.getDateOfBirth()
                        + "\n" + newHuman.getPhoneNumber()
                        + "\n" + newHuman.getCity()
                        + "\n" + newHuman.getCountry()
                        + "\n" + newHuman.getAddress()
        );

        System.out.println();

        //task2
        System.out.println("Город: ");
        City newCity = new City(
                "Калининград",
                "Калининградская область",
                "Россия",
                "460000 человек",
                "236000",
                "412"
        );

        System.out.println(
                newCity.getCityName()
                        + "\n" + newCity.getRegion()
                        + "\n" + newCity.getCountry()
                        + "\n" + newCity.getPopulation()
                        + "\n" + newCity.getPostCode()
                        + "\n" + newCity.getPhoneCode()
        );

        System.out.println();

        //task3
        String[] arrCities = {"Москва", "Воронеж", "Калининград", "Санкт-Питербург", "Чайковский", "Владивосток"};
        Country newCountry = new Country(
                "Россия",
                "Евразия",
                "147000000",
                "+7",
                "Москва",
                arrCities
        );

        System.out.println("Страна:");
        System.out.println(
                newCountry.getCountryName()
                + "\n" + newCountry.getContinentName()
                + "\n" + newCountry.getPopulation()
                + "\n" + newCountry.getPhoneCode()
                + "\n" + newCountry.getCapital()
                + "\n" + newCountry.getCities()
        );

        System.out.println();

        //task4
        System.out.println("Дробь:");
        Fraction firstFraction = new Fraction(2,5);
        Fraction secondFraction = new Fraction(2,10);

        System.out.println(
                "Сумма дробей: " +
                firstFraction.add(secondFraction)
        );

        System.out.println(
                "Разница дробей: " +
                        firstFraction.minus(secondFraction)
        );
    }
}

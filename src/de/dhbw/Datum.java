package de.dhbw;

public class Datum {
    private String day;
    private String month;
    private String year;

    // date1.day = "01";
    // int i = 01;
    // 01.01.2020 -> day: 1, month: 1, year: 2020
    Datum(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println("Neues Objekt vom Typ Date erstellt: " + this.day + "." + this.month + "." + this.year);
    }

    public void setDay(String day) {
        int dayAlsInteger = Integer.parseInt(day); // int(day)
        if(dayAlsInteger <= 31) {
            this.day = day;
        } else {
            System.out.println(day + " ist kein valider Tag!");
        }
    }

    String getInGermanFormat() {
        return this.day + "." + this.month + "." + this.year;
        // return this.day + "." + this.month + "." + this.year;
    }

    String getInUSFormat() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    boolean isLeapYear() {
        int yearAlsInteger = Integer.parseInt(this.year); // int(year)
        if(yearAlsInteger % 4 == 0) {
            return true;
        } else {
            return false;
        }
        // return (yearAlsInteger % 4 == 0);
    }
}

package dateandtime;

/**
 * Copyright Ionate 2018-2019
 * Created by Sujatha
 */
public class DateAndTime {

    public static void main(String[] args) {
        dayOfYear("2019-02-02"); //expected 31+2 -> 33
    }

    /**
     * Get day of the year.
     *
     * @param date
     * @return
     */
    public static int dayOfYear(String date) {
        //JDK 8
        //LocalDate localDate = LocalDate.parse(date);

        //int month = localDate.getMonth().getValue();
        //int totalDays = localDate.getDayOfMonth();

        //if (localDate.isLeapYear()) {
        //    daysInMonth[1] = 29;
        //}

        String[] date1 = date.split("-");
        int year = Integer.parseInt(date1[0]);
        int month = Integer.parseInt(date1[1]);
        int day = Integer.parseInt(date1[2]);

        java.time.Year year1 = java.time.Year.of(year);
        int totalDays = day;

        Integer[] daysInMonth = new Integer[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year1.isLeap()) {
            daysInMonth[1] = 29;
        }

        int index = 1;
        while (index < month) {
            totalDays = totalDays + daysInMonth[index - 1];
            index++;
        }
        System.out.println(totalDays);
        return totalDays;
    }

}

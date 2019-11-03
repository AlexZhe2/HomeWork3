import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[] args) {

        System.out.println("========== Task #1");

        LocalTime currentTime1 = LocalTime.now();
        System.out.println("Текущее время  " + currentTime1);

        DateTimeFormatter setPattern = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime parseTime0700 = LocalTime.parse("07:00", setPattern);
        LocalTime parseTime1500 = LocalTime.parse("15:00", setPattern);
        LocalTime parseTime2300 = LocalTime.parse("23:00", setPattern);

        boolean isAfter0700 = parseTime0700.isAfter(currentTime1);
        boolean isBefore1500 = parseTime1500.isBefore(currentTime1);
        boolean isAfter1500 = parseTime1500.isAfter(currentTime1);
        boolean isBefore2300 = parseTime2300.isBefore(currentTime1);

        if (isAfter0700 && isBefore1500) {
            System.out.println("Первая смена");
        }
        if (isAfter1500 && isBefore2300) {
            System.out.println("Вторая смена");
        } else {
            System.out.println("Третья смена");
        }

        System.out.println();
        System.out.println("========== Task #2");

        int counter=0;
        String emptyString="";
        String dayOfWeeks;

        LocalDate currentDate1 = LocalDate.now();
        System.out.println("Текущая дата  " + currentDate1);

        DateTimeFormatter setPattern2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parseDate2 = LocalDate.parse("2020/01/20", setPattern2);
        long between2 = ChronoUnit.DAYS.between(currentDate1, parseDate2);

        for (int i = 0; i <between2 ; i++) {
            dayOfWeeks=emptyString+parseDate2.plusDays(i).getDayOfWeek();
            if(dayOfWeeks.equals("MONDAY")||dayOfWeeks.equals("WEDNESDAY")||dayOfWeeks.equals("FRIDAY")){
                counter++;
            }
        }
        System.out.println("Занятий до 20 января осталось: "+counter);
    }
}


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam02 {

    public static void main(String[] args) {
        
        LocalTime thisTima = LocalTime.of(11, 59, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh時m分s秒");
        LocalTime time = thisTima.plusSeconds(1);
        System.out.println(thisTima.format(formatter) + "の1秒後は" + time.format(formatter) + "です");

        LocalTime thisTima1 = LocalTime.of(23, 59, 59);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh時m分s秒");
        LocalTime time1 = thisTima1.plusSeconds(1);

        System.out.println(thisTima1.format(formatter1) + "の1秒後は" + time1.format(formatter1) + "です");


    }

}

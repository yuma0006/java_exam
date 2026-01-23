import java.time.LocalDateTime;

public class Exam6 {

    public static void main(String[] args) {
        LocalDateTime birthDay = LocalDateTime.of(1543,2,10,5,12);
        System.out.println("徳川家康の誕生日は" + birthDay + "です");

        birthDay = birthDay.plusYears(1);
        birthDay = birthDay.plusMonths(2);
        birthDay = birthDay.plusDays(3);
        birthDay = birthDay.plusHours(4);
        birthDay = birthDay.plusMinutes(5);
        System.out.println("1年2ヶ月3日4時間5分後は" + birthDay + "です");




    }
    
}

import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        
        LocalDate birthDay = LocalDate.of(1999,6,28);

        int year = birthDay.getYear();
        int month = birthDay.getMonthValue();
        int day = birthDay.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");
    }
    
}

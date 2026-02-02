public class Exam03 {

    public static void main(String[] args) {
        
        int year = 2000;

        if(year <=99){
            int result = (year / 100) + 1 ;
             System.out.println(year + "年は" + result + "世紀です");
        }else if(year % 10 == 0){
            int result1 = (year/100) ;
            System.out.println(year + "年は" + result1 + "世紀です");
        }else {
            int result2 = (year/100) + 1;
             System.out.println(year + "年は" + result2 + "世紀です");
            
        }
    }

}

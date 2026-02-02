public class Exam04 {

    public static void main(String[] args) {

        int n = 2100;
        
        if(year(n)){
            System.out.println(n + "年はうるう年ではありません");
        }else{
            System.out.println(n + "年はうるう年です");
        }

    }

    private static boolean year(int n){
        if(n % 4 == 0 && n % 100 == 0 && n % 400 == 0){
            return false;
        }else if (n % 4 == 0 && n % 100 == 0){
            return true;
        }else if (n % 4 == 0){
            return false;
        }else {
            return true;
        }
        
    }

}

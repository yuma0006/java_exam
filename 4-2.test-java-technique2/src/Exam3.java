import java.util.ArrayList;
import java.util.List;


public class Exam3 {

    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("後藤",31));
        list.add(new Employee("山田",28));
        list.add(new Employee("佐藤",25));
        list.add(new Employee("田中",19));

        for(Employee name : list){
<<<<<<< HEAD
            System.out.println(name.getName() + "(" +  name.getAge() + ")");
=======
            System.out.println(name.getName() + "(" + name.getAge() + ")"); /* 年齢入ってないよ♡ */
>>>>>>> 9ce6c0ade5db26002b756fc29222c77132c97869
        }

        


    }

}

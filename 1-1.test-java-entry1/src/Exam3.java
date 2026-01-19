public class Exam3 {
    public static void main(String[] args) {
        int price1 = 200;
        int price2 = 250;
        double tax = 0.1;
        int subTotal = (price1 * 3 + price2 * 4);
        int totalTax = ((int)( subTotal * tax));
        int total = (((int)subTotal + totalTax));

        System.out.println("小計\n" + subTotal + "円");
        System.out.println("消費税\n" + totalTax + "円");
        System.out.println("合計金額\n" + total + "円");


    }
    
}

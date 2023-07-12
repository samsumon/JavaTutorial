package secondCode;

public class AllMethod {


    public static String car="Tesla";

    public void doSum() {
        int a=10;
        int b=6;
        int sum=a+b;


        System.out.println(sum);
    }


    public static void main(String[] args) {

        AllMethod obj =new AllMethod();

        obj.doSum();
        System.out.println(obj.car);


    }

}

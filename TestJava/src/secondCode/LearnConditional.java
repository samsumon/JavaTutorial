package secondCode;

public class LearnConditional {

    // Write method that can identify if a number is greater than 100 or not


    public static void doIdentify() {

        // if ( Condition )  { Statement 1 } else { Statement 2 }

        int num1= 100;

        if (num1 > 100) {
            System.out.println(num1 +" "+ "is greater than 100.");


        } else if (num1==100) {
            System.out.println(num1 +" "+ "is equal to 100.");


        } else {
            System.out.println(num1 +" "+ "is not greater than 100.");
        }

    }



    public static void main(String[] args) {

        //doIdentify();



      int incomeLimit =10000;
      int rumelIncome =20000;


      if (rumelIncome > incomeLimit) {
          int rumelPayToGov= rumelIncome*50/100;
          System.out.println(" Rumels have to pay " + rumelPayToGov);
      } else {
          int rumelGetFromGov= rumelIncome*50/100;
          System.out.println(" Rumels will get " + rumelGetFromGov);
      }


      int days = 25;

      if (days > 30) {
          System.out.println("Rumel have to pay $50 penalty.");
      } else {
          System.out.println("Rumel do not have to pay $50 penalty.");
      }



    }
}

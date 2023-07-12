package secondCode;

public class LearnLoop {

    public static void main(String[] args) {

        // For Loop   for (DataType StartPoint; EndPoint; i++) { LoopBody }


        for( int i=1;i<=2;i++) {
            System.out.println(i);
        }


// Identifying even and odd numbers

        for(int i =1; i <=20; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }

            }

        // print out all odd numbers between 1 and 100

       // for (int i =2; i <=100; i =i+2) {
        //    System.out.println(i);


       // }




        // while Loop

        int i =1;
        while (i<=10) {
            System.out.println(i);

            i= i+1;
        }


        // Do while Loop

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k<=10);




    }

}

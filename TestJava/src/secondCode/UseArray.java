package secondCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseArray {


    public static void main(String[] args) {
        //Array Declare: DataType [] nameOfArray = new DataType[arrayLength];

        String[] stName = new String[5]; // Declare an Array with length or size

        stName[0] = "Nishat"; // Initialize a value
        stName[1] = "Rumel";
        stName[2] = "Sadaq";
        stName[3] = "Russel";
        stName[4] = "Saikot";

        //  String [] stName = { "Nishat", "Rumel", "Sadaq","Russel","Saikot"};

// Declare an integer type Array and insert values into it?


        System.out.println(stName[1]);
        System.out.println(stName[2] + " " + stName[3]);
        System.out.println(stName.length);
        //System.out.println(stName.clone());
        System.out.println(".....................................");


        String[] carName = {"Toyota", "BMW", "Tesla", "Lexus", "Audi"};
        System.out.println(carName.length);
        //carName[0]="Honda";

        // For Loop
        for (int i = 0; i < stName.length; i++) {
            System.out.println(stName[i]);
        }

        // For each loop
        for (String car : carName) {
            System.out.println(car);
        }


        // Array Value = Element
        // Array position = Index
        // Array length = Number of elements in the array.


       //ArrayList

        List<String> nameList=new ArrayList<>();

       // List<String> newNameList=new LinkedList<>();

        nameList.add("Sadaq");
        nameList.add("Stalin");
        nameList.add("Putin");
        nameList.add("Biden");

        System.out.println(nameList.get(2));

        for (String st:nameList) {
            System.out.println(st);
        }





                 // 1D Array { 1,2,3,4 }

       // int [][] stName1=new int [2][3];
                // 2D Array :
        int [][] arr= { { 1,2,3} , {4,7,5} };
        System.out.println(arr[0][2]);


        // 3D array { { {1,2}, {2,3} } , { { 99, 199}, {44, 55} } }

                String[][] stName1=new String[10][15];

                stName1[0][0]="Sl";
                stName1[0][1]="stName";
                stName1[1][1]="Fahim";
                stName1[2][1]="Aroz";
                stName1[3][1]="Kollol";
                stName1[4][1]="Tarik";
                stName1[5][1]="Abir";
                stName1[8][0]="Quazi";
                stName1[8][1]="Arefeen";


                String[][] stFirstName=new String[10][15];
                String[][] stLastName=new String[10][15];
                stFirstName[8][0]="Quazi";
                stLastName[8][1]="Arefeen";



                System.out.println(stName1[2][1]);







    }

}





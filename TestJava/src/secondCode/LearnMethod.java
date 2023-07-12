package secondCode;

public class LearnMethod {

// There are two types of method.    1. Return Type Method   2. Non-return type.

  // 1.   Return Type Method ----a) Return Type Parameterised  b) Return Type Non-Parameterised
    // 2. Non-Return Type Method ----a) Non-Return Type Parameterised  b) Non-Return Type Non-Parameterised


    //Non-Return Type Non-Parameterised
    //AccessModifier + static/not + void + methodName() + {   MethodBody   }
public static void doSum() {

    int a=5;
    int b=10;
    int sum= a+b;
    System.out.println(sum);

}

    //Non-Return Type Parameterised Method
    //AccessModifier + static/not + void + methodName(DataType Signature1, DataType Sigature2) + {   MethodBody   }

    //How to multiply two numbers.
    public static void doMultiply(int a, int b) {

        int multiply= a * b;
        System.out.println(multiply);

    }



    //Non-Return Type Non-Parameterised
    //AccessModifier + static/not + void + methodName() + {   MethodBody   }

    // Write a method by we can subtract one number from another number.

    public static void doSubtract() {

    int num1 = 100;
    int num2 = 11;

    int subtract = num1 - num2;

        System.out.println(subtract);

    }


    public static void doDivision( ) {

double num1=100;
double num2 =40;

double division= num1/num2;

        System.out.println(division);

    }


   // Return Type Method---1. Non-parameterised
    // AccessModifier + Static/not + DataType + MethodName + () + {
    // Return result
    // }

 public static double testReturnMethod() {

    double a= 3.22;
    double b=2.22;

    double result= a + b;

     System.out.println(result);

    return result;
 }

// Return Type Parameterised
    public static double testRParameterised(double num1, double num2) {

    double res= num1 + num2;


        System.out.println(res);
    return res;
    }





public static void main(String[] args) {
doSum();
doSum();

doMultiply(10,65);

doSubtract();

testReturnMethod();

testRParameterised(4.9, 5.1);


    }

}

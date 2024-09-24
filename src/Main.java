public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 42; //created variable
        int intOperandB = 11;

        int intSum = 0; //+
        int intProduct = 0;  //times
        int intDifference = 0;  //-
        int intQuotient = 0;   //division
        int intModulo = 0;  //remainder

        double doubleOperandA = 35.0;
        double doubleOperandB = 20.0;

        double doubleSum = 0; //double means it has fractions for ex 10.5
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;


        intSum = intOperandA + intOperandB;
        System.out.println("The sum using two ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using two ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using two ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using two ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder using two ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("Double the sum of " + doubleOperandA + " and " + doubleOperandB + " is " + (2 * doubleSum));

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("Double the product of " + doubleOperandA + " and " + doubleOperandB + " is " + (2* doubleProduct));

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("Double the difference of " + doubleOperandA + " and " + doubleOperandB + " is " + (2 * doubleDifference));

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("Double the quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + (2 * doubleQuotient));

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("Double the remainder of " + doubleOperandA + " and " + doubleOperandB + " is " + (2 * doubleModulo));

        double lunchCost = 15.50;
        System.out.println("The cost of my lunch is " + lunchCost + ".");

        int numOfFamily = 6;
        System.out.println("The number of people in my family is " + numOfFamily + ".");

        boolean isItRaining = true;
        System.out.println("It is raining. " + isItRaining);

        double pricePerGallon = 2.99;
        System.out.println("The price per gallon of gas is " + pricePerGallon + ".");

        int favNumber = 42;
        System.out.println("My favorite number is " + favNumber + ".");

        double shoeSize = 10.5;
        System.out.println("My shoe size is " + shoeSize + ".");

        String birthMonth = "August";
        System.out.println("My birth month is " + birthMonth + ".");

        String fullName = "Behniya Esmaeil Abadi";
        System.out.println("My full name is " + fullName + ".");




    }
}
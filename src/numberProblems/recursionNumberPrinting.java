package numberProblems;

public class recursionNumberPrinting {
    public static void main(String[] args){
//        numberPrinting();
       int output = numberPrintingUsingRecursion(104);
       System.out.println(output);


    }

    public static int numberPrinting(int startNumber,int endNumber){
        return  numberPrintingUsingRecursion(endNumber);

    }

    public static int numberPrintingUsingRecursion(int endNumber){
       if (endNumber == 0){
           return endNumber;
       }
       System.out.println(endNumber);
      return numberPrintingUsingRecursion(endNumber-1);

    }


    public static void numberPrintings(){

    }
}

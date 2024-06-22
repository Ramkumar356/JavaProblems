package primeNumberProblem;

public class primeNumbers {

    public static void main(String[] args) {
       primeNumber();
//            prime();
//          divideNumber();
    }

    public static void primeNumber() {

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = false;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i == j) {
                        isPrime = true;
                    } else {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime == true) {
                System.out.println(i + " is Prime number");
            } else {
//               System.out.println(i + "is not a prime number");
            }
        }

    }



    public static void prime() {
      for (int i = 0 ; i < 50; i++){
          boolean isPrime = true;
          for(int j = 0 ; j <= i ; j++){
              if (i % j == 0){
                  if (i == j){
                      isPrime = true;
                  }else{
                      isPrime = false;
                      break;
                  }
              }
          }
          if (isPrime == true){
              System.out.println(i + " is Prime Number");
          }
      }
    }

    public static void divideNumber(){
        for (int i = 0; i <= 300; i++){
            if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0){   // one true and two false
                System.out.println("Gobi");
            }else if (i % 5 == 0 && i % 3 != 0 && i % 7 != 0){  // one true and two false
                System.out.println("Gokul");
            } else if (i % 7 == 0 && i % 5 != 0 && i % 3 != 0) {  // one true and two false
                System.out.println("Dhaksith");
            }else if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0) {   // two true and one false
                System.out.println("GobiGokul");
            }else if (i % 5 == 0 && i % 7 == 0 && i % 3 != 0) {    // two true and one false
                System.out.println("GokulDhaksith");
            }else if (i % 3 == 0 && i % 7 == 0 && i % 5 != 0) {     // two true and one false
                System.out.println("GobiDhaksith");
            }else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {      // three true
                System.out.println("GobiGokulDhaksith");
            }else {
                System.out.println(i);
            }
        }
    }
    // 4 divide by 1,2,4
    // 8 divided by 1,2,4,8
    // 10 divided by 1,2,5,10


    // input =  1,2,3,4,5,6,7,8,9,10
    // output = 1,3,5,7,9,
    // 1 % 1 == 0 - t
    // 1 % 2 == 0
    // 1 % 3 == 0
    // 1 % 4 == 0
    // 2 % 1 == 0
    // 2 % 2 == 0
    // 2 % 3 == 0 - f
    // 4 % 2 == 0 - t
    // 4 % 3 == 0 -
}



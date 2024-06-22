package twoDArray;

public class twoDimensionalArray {
    public static void main(String[] args) {
        dimensionalArray();
    }

    public static void dimensionalArray() {
        int[][] numbers = new int[3][3];
        numbers[0] = new int[]{1, 2, 3};
        numbers[1] = new int[]{4, 5, 6};
        numbers[2] = new int[]{7, 8, 9};

        char[][] alphabets = new char[2][8];
        alphabets[0] = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        alphabets[1] = new char[]{'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};


        String[][] nameList = new String[3][2];
        nameList[0] = new String[]{"Gobi", "Gokul"};
        nameList[1] = new String[]{"Dhaksith", "Leo"};
        nameList[2] = new String[]{"Kamalesh", "Mukesh"};

        boolean[][] twoValues = new boolean[2][4];
        twoValues[0] = new boolean[]{true, true, true, false};
        twoValues[1] = new boolean[]{false, false, false, false};

    /*    for (int i = 0; i < numbers.length;i++){
            int[] numberValue = numbers[i];
            for (int j = 0; j < numberValue.length;j++){
                System.out.print(numberValue[j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < alphabets.length;i++){
            char[] alphatesCharacters = alphabets[i];
            for ( int j = 0; j < alphatesCharacters.length;j++){
                System.out.print(alphatesCharacters[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < nameList.length;i++){
            String[] allNames = nameList[i];
            for ( int j = 0; j < allNames.length;j++){
                System.out.print(allNames[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < twoValues.length;i++){
           boolean[] booleanvalues = twoValues[i];
            for ( int j = 0; j < booleanvalues.length;j++){
                System.out.print(booleanvalues[j] + " ");
            }
            System.out.println(" ");
        }



        for (int i = 0; i < numbers.length;i++){
            int[] numberValue = numbers[i];
            for (int j = numberValue.length-1; j >= 0;j--){
                System.out.print(numberValue[j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < alphabets.length;i++){
            char[] alphatesCharacters = alphabets[i];
            for ( int j = alphatesCharacters.length-1; j >= 0;j--){
                System.out.print(alphatesCharacters[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < nameList.length;i++){
            String[] allNames = nameList[i];
            for ( int j = allNames.length-1; j >= 0;j--){
                System.out.print(allNames[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < twoValues.length;i++){
            boolean[] booleanvalues = twoValues[i];
            for ( int j = booleanvalues.length-1; j >= 0;j--){
                System.out.print(booleanvalues[j] + " ");
            }
            System.out.println(" ");
        }


        for (int i = numbers.length-1; i >= 0;i--){
            int[] numberValue = numbers[i];
            for (int j = numberValue.length-1; j >= 0;j--){
                System.out.print(numberValue[j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = alphabets.length-1; i >= 0 ;i--){
            char[] alphatesCharacters = alphabets[i];
            for ( int j = alphatesCharacters.length-1; j >= 0;j--){
                System.out.print(alphatesCharacters[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = nameList.length-1; i >= 0 ;i--){
            String[] allNames = nameList[i];
            for ( int j = allNames.length-1; j >= 0;j--){
                System.out.print(allNames[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = twoValues.length-1; i >= 0;i--){
            boolean[] booleanvalues = twoValues[i];
            for ( int j = booleanvalues.length-1; j >= 0;j--){
                System.out.print(booleanvalues[j] + " ");
            }
            System.out.println(" ");
        }


        for (int i = numbers.length-1; i >= 0;i--){
            int[] numberValue = numbers[i];
            for (int j = 0; j < numberValue.length;j++){
                System.out.print(numberValue[j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = alphabets.length-1; i >= 0 ;i--){
            char[] alphatesCharacters = alphabets[i];
            for ( int j = 0; j < alphatesCharacters.length;j++){
                System.out.print(alphatesCharacters[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = nameList.length-1; i >= 0 ;i--){
            String[] allNames = nameList[i];
            for ( int j = 0; j < allNames.length;j++){
                System.out.print(allNames[j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = twoValues.length-1; i >= 0;i--){
            boolean[] booleanvalues = twoValues[i];
            for ( int j = 0; j < booleanvalues.length;j++){
                System.out.print(booleanvalues[j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = nameList.length-1; i >= 0; i--) {
            String[] names = nameList[i];
            int nameArrayLength = names.length-1;
            if (i%2 == 0) {
                for (int j = 0; j < names.length; j++) {
                    System.out.print(names[j] + " ");
                }
                System.out.println(" ");
            }else {
                for (int j = 0; j < names.length; j++) {
                    System.out.print(names[nameArrayLength] + " ");
                    nameArrayLength--;
                }
                System.out.println(" ");

            }
            }

        for (int i = 0; i < nameList[0].length;i++){
            int namesListLength = nameList.length-1;
            if (i%2 == 0) {
                for (int j = 0; j < nameList.length; j++) {
                    System.out.print(nameList[j][i] + " ");
                }
                System.out.println(" ");
            }else{
                for (int k = nameList.length-1; k >= 0; k--) {
                    System.out.print(nameList[k][i] + " ");
                    namesListLength--;
                }
            }
        }
         System.out.println(" ");


        for (int i = 0; i < numbers[0].length;i++){
            int numberLength = numbers.length-1;
            if (i%2 == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    System.out.print(numbers[j][i] + " ");
                }
                System.out.println(" ");
            }else{
                for (int k = numbers.length-1; k >= 0; k--) {
                    System.out.print(numbers[k][i] + " ");
                    numberLength--;
                }
                System.out.println(" ");
            }
        } */

        for (int i = 0; i < numbers.length;i++){
            int[] arrayCurrentValue = numbers[i];
            int arrayLastIndex = numbers.length-1;
            for (int j = 0; j < arrayCurrentValue.length;j++){
                if (j%2 == 0){
                    System.out.print(numbers[i][j] + " ");
                }else{
                    System.out.print(numbers[arrayLastIndex-i][j] + "   ");
                }
            }
            System.out.println(" ");
        }

        }
    }



// input = gobi gokul
//         dhaksith leo
//         kamalesh mukesh
// output = gobi mukesh
//          dhaksith leo
//          kamalesk gokul
// for loop
// names = namelist[o]
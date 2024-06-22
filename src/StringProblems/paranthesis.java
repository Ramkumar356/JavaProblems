package StringProblems;

import java.util.ArrayList;

public class paranthesis {
    public static void main(String[] args){

        boolean output = paranthesisCheck("{{}");
        System.out.println(output);
    }



    public static boolean paranthesisCheck(String braces){
        ArrayList indexvalue = new ArrayList();
    for (int i = 0;i < braces.length();i++){
            if (braces.charAt(i) == '}'){
                for (int j = i - 1;j >= 0 ; j--){
                    if (braces.charAt(j) == '{'){
                        if(!indexvalue.contains(j)){
                            indexvalue.add(j);
                            break;
                        }
                    }
                  if(j == 0){
                      return false;
                  }
                }
                // add to linked list

            }
        }
       if(indexvalue.contains(0)) {
           return true;
       }
       return false;
    }


    // input -
    // { { { { } } } }      { } }     }}{{}}      { { } { } }
    //output - true - valid StringProblems.paranthesis

    // 0 { == {
    // 1 { == {
    // 2 { == {
    // 3 { == {
    // 4 } == {
    // 4-1 { == { int currentindexvalue = i - 1 =  3;
    // 5 } == {
    // currentindexvalue  = 2 == { currentindexvalue-- ;
    // 6 } == {
    // cuurentindexvalue  = 1 == {
    // 7 } == {
    // currentindex 0 { == {

    // 0 { == {

    // 2 } == {
    // else - 2-1 = 1 { == {
    // 4 { == {
    // 5 } == {
    // else


}

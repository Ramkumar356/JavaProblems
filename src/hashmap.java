import java.util.HashMap;

public class hashmap {
    public static void main (String[] args){
        HashMap<String, java.lang.Integer> results = new HashMap<>();

        results.put("english",80);
        results.put("tamil",90);
        results.put("computerscience",100);
        results.forEach((subject,marks) ->{
            System.out.println(subject + "-" + marks);

        });






    }

}

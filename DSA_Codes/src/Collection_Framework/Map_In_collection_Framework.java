package Collection_Framework;

import java.util.Map ;
import java.util.HashMap ;

public class Map_In_collection_Framework {
    public static void main(String[] args) {
        Map<String , Integer> mp = new HashMap<>() ;
        mp.put("Hello" , 20) ;
        mp.put("World" , 32) ;
        mp.put("This" , 12) ;
        mp.put("is" , 65) ;
        mp.put("Tanir" , 23) ;
        mp.put("Sahoo" , 90) ;
        mp.put("Hello" , 29) ;

        System.out.println(mp.get("Hello"));
        System.out.println(mp.get("Tanir"));
        System.out.println(mp.get("This"));
        System.out.println(mp.get("is"));

    }
}

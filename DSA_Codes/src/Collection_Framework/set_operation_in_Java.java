package Collection_Framework;

import java.util.HashSet;
import java.util.* ;

class new_test{
    int roll ;
    String name ;
    new_test(int roll , String name){
        this.roll = roll ;
        this.name = name ;
    }

    @Override
    public String toString() {
        return "new_test{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        new_test newTest = (new_test) o;
        return roll == newTest.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}

public class set_operation_in_Java {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>() ;
        s.add(20) ;
        s.add(13) ;
        s.add(64) ;
        s.add(34) ;
        s.add(65) ;
        s.add(76) ;
        s.add(12) ;
        s.add(34) ;
        System.out.println(s);
        s.remove(34) ;
        System.out.println(s);
        System.out.println(s.hashCode());


        HashSet<new_test> hs = new HashSet<>() ;
//        hs.add(15) ;
//        hs.add(45) ;
//        hs.add(16) ;
//        hs.add(30) ;
//        hs.add(26) ;
//
//        System.out.println(hs);
//        hs.add(30) ;
        hs.add(new new_test(1 , "Tanir Sahoo")) ;
        hs.add(new new_test(2 , "Ankush panda")) ;
        hs.add(new new_test(5 , "Ramesh Sharma")) ;
        hs.add(new new_test(2 , "Edwin Aldrin")) ; // as the roll numbers are the same thus this obeject will not get appended.
        System.out.println(hs);
    }
}

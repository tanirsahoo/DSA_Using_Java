class two_node<DType>{
    DType data ;
    two_node nextnd ;
    two_node random ;
    two_node(DType data){
        this.data = data ;
    }
}

class clone_work{
    public two_node<Integer> clone(two_node<Integer> head){
        two_node<Integer> ctr = head;
        while(ctr != null){
            two_node<Integer> next_ptr = ctr.nextnd ;
            ctr.nextnd = new two_node<>(ctr.data) ;
            ctr.nextnd.nextnd = next_ptr ;
            ctr = next_ptr ;
        }
        ctr = head ;
        while(ctr != null){
            if(ctr.nextnd != null){
                ctr.nextnd.random = (ctr.random != null)? ctr.random.nextnd : null ;
            }
            ctr = ctr.nextnd.nextnd ;
        }
        two_node<Integer> orig = head ;
        two_node<Integer> copy = head.nextnd ;
        two_node<Integer> temp = copy ;
        while(copy.nextnd != null){
            orig.nextnd = orig.nextnd.nextnd ;
            copy.nextnd = copy.nextnd.nextnd ;
            orig = orig.nextnd ;
            copy = copy.nextnd ;
        }
        orig.nextnd = orig.nextnd.nextnd ;
        return temp ;
    }
    public void display_list(two_node<Integer> head){
        two_node<Integer> cpy = head ;
        do{
            System.out.println("The element is: " + cpy.data);
            cpy = cpy.nextnd ;
        }while(cpy != null) ;
    }
}

public class Clone_Linked_List {
    public static void main(String[] args) {
        two_node<Integer> node1 = new two_node<>(10) ;
        two_node<Integer> node2 = new two_node<>(16) ;
        two_node<Integer> node3 = new two_node<>(40) ;
        two_node<Integer> node4 = new two_node<>(56) ;
        two_node<Integer> node5 = new two_node<>(23) ;
        two_node<Integer> node6 = new two_node<>(46) ;
        two_node<Integer> node7 = new two_node<>(29) ;
        two_node<Integer> node8 = new two_node<>(27) ;

        node1.nextnd = node2 ;
        node2.nextnd = node3 ;
        node3.nextnd = node4 ;
        node4.nextnd = node5 ;
        node5.nextnd = node6 ;
        node6.nextnd = node7 ;
        node7.nextnd = node8 ;
        node8.nextnd = null ;

        node1.random = node5 ;
        node2.random = node8 ;
        node4.random = node6 ;
        node7.random = node2 ;
        node5.random = node1 ;

        clone_work ob=  new clone_work() ;
        ob.display_list(node1) ;
        System.out.println("=================================================");
        two_node<Integer> cloned_list = ob.clone(node1) ;
        ob.display_list(cloned_list) ;
    }
}

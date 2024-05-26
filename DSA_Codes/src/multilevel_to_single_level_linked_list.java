import java.util.ArrayDeque;
import java.util.Queue;

class nd_ag<DType>{
    DType data ;
    nd_ag<DType> next_nd ;
    nd_ag<DType> child_nd ;
}

class flatten_linked_list{
    public nd_ag<Integer> node_head_return(nd_ag<Integer> node){
        Queue<nd_ag> q = new ArrayDeque<>() ;
        nd_ag<Integer> head = node;
        nd_ag<Integer> clone = new nd_ag<>() ;
        node = clone ;
        while(head != null){
            if(head.child_nd != null)
                q.offer(head.child_nd) ;
            clone.data = head.data ;
            clone.child_nd = null ;
            clone.next_nd = head.next_nd ;
            head = head.next_nd ;
            if(head != null) {
                nd_ag<Integer> new_node = new nd_ag<>();
                clone.next_nd = new_node ;
                clone = clone.next_nd ;
            }
        }
        while(!q.isEmpty()){
            nd_ag<Integer> ref = q.poll() ;
            nd_ag<Integer> new_node = new nd_ag<>();
            clone.next_nd = new_node ;
            clone = clone.next_nd ;
            clone.data = ref.data ;
            clone.child_nd = null ;
            while(ref != null){
                if(ref.child_nd != null)
                    q.offer(ref.child_nd) ;
                clone.data = ref.data ;
                clone.child_nd = null ;
                clone.next_nd = ref.next_nd ;
                ref = ref.next_nd ;
                if(ref != null) {
                    nd_ag<Integer> new_nde = new nd_ag<>();
                    clone.next_nd = new_nde ;
                    clone = clone.next_nd ;
                }
            }
        }
        return node ;
    }
    public void display(nd_ag<Integer> clone){
        while(clone != null){
            System.out.print(clone.data + " ");
            clone = clone.next_nd ;
        }
        System.out.println();
    }
}

public class multilevel_to_single_level_linked_list {
    public static void main(String[] args) {
        nd_ag<Integer> nd1 = new nd_ag<>() ;
        nd_ag<Integer> nd2 = new nd_ag<>() ;
        nd_ag<Integer> nd3 = new nd_ag<>() ;
        nd_ag<Integer> nd4 = new nd_ag<>() ;
        nd_ag<Integer> nd5 = new nd_ag<>() ;
        nd_ag<Integer> nd6 = new nd_ag<>() ;
        nd_ag<Integer> nd7 = new nd_ag<>() ;
        nd_ag<Integer> nd8 = new nd_ag<>() ;
        nd_ag<Integer> nd9 = new nd_ag<>() ;
        nd_ag<Integer> nd10 = new nd_ag<>() ;
        nd_ag<Integer> nd11 = new nd_ag<>() ;
        nd_ag<Integer> nd12 = new nd_ag<>() ;
        nd_ag<Integer> nd13 = new nd_ag<>() ;
        nd_ag<Integer> nd14 = new nd_ag<>() ;
        nd_ag<Integer> nd15 = new nd_ag<>() ;
        nd_ag<Integer> nd16 = new nd_ag<>() ;
        nd_ag<Integer> nd17 = new nd_ag<>() ;

        nd1.data = 1 ;
        nd2.data = 2 ;
        nd3.data = 3 ;
        nd4.data = 4 ;
        nd5.data = 5 ;
        nd6.data = 6 ;
        nd7.data = 7 ;
        nd8.data = 8 ;
        nd9.data = 9 ;
        nd10.data = 10 ;
        nd11.data = 11 ;
        nd12.data = 12 ;
        nd13.data = 13 ;
        nd14.data = 14 ;
        nd15.data = 15 ;
        nd16.data = 16 ;
        nd17.data = 17 ;

        nd1.next_nd = nd2 ;
        nd1.child_nd = nd6 ;

        nd2.next_nd = nd3 ;
        nd2.child_nd = null ;

        nd3.next_nd = nd4 ;
        nd3.child_nd = null ;

        nd4.next_nd = nd5 ;
        nd4.child_nd = nd9 ;

        nd5.next_nd = null ;
        nd5.child_nd = null ;

        nd6.next_nd = nd7 ;
        nd6.child_nd = null ;

        nd7.next_nd = nd8 ;
        nd7.child_nd = nd11 ;

        nd8.next_nd = null ;
        nd8.child_nd = nd12 ;

        nd9.next_nd = nd10 ;
        nd9.child_nd = nd13 ;

        nd10.next_nd = null ;
        nd10.child_nd = null ;

        nd11.next_nd = null ;
        nd11.child_nd = null ;

        nd12.next_nd = null ;
        nd12.child_nd = nd15 ;

        nd13.next_nd = nd14 ;
        nd13.child_nd = nd16 ;

        nd14.next_nd = null ;
        nd14.child_nd = null ;

        nd15.next_nd = null ;
        nd15.child_nd = null ;

        nd16.next_nd = nd17 ;
        nd16.child_nd = null ;

        nd17.next_nd = null ;
        nd17.child_nd = null ;

        flatten_linked_list ob = new flatten_linked_list() ;
        nd_ag<Integer> headnode = ob.node_head_return(nd1) ;
        ob.display(headnode);
    }
}

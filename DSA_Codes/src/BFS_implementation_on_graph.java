
class itm_nd<DType>{
    DType data ;
    itm_nd<DType> cld_node1 = null ;
    itm_nd<DType> cld_node2 = null;
    itm_nd<DType> cld_node3 = null;
    itm_nd<DType> cld_node4 = null;

    public itm_nd(DType data) {
        this.data = data;
    }
}

public class BFS_implementation_on_graph {
    
    public static void main(String[] args) {
        itm_nd<Integer> head = new itm_nd<>(10) ;
        itm_nd<Integer> cld1 = new itm_nd<>(15) ;
        itm_nd<Integer> cld2 = new itm_nd<>(19) ;
        itm_nd<Integer> cld3 = new itm_nd<>(16) ;
        itm_nd<Integer> cld4 = new itm_nd<>(13) ;
        itm_nd<Integer> cld5 = new itm_nd<>(24) ;
        itm_nd<Integer> cld6= new itm_nd<>(27) ;
        itm_nd<Integer> cld7 = new itm_nd<>(29) ;
        itm_nd<Integer> cld8 = new itm_nd<>(33) ;
        itm_nd<Integer> cld9 = new itm_nd<>(42) ;


        itm_nd<Integer> head11 = new itm_nd<>(51) ;
        itm_nd<Integer> cld12 = new itm_nd<>(55) ;
        itm_nd<Integer> cld13 = new itm_nd<>(58) ;
        itm_nd<Integer> cld14 = new itm_nd<>(60) ;


        itm_nd<Integer> head21 = new itm_nd<>(93) ;
        itm_nd<Integer> cld22 = new itm_nd<>(95) ;
        itm_nd<Integer> cld23 = new itm_nd<>(24) ;


        head.cld_node1 = cld1 ;
        head.cld_node2 = cld2 ;
        cld2.cld_node1 = cld1 ;
        cld2.cld_node2 = cld5 ;
        cld2.cld_node3 = cld6 ;
        cld1.cld_node1 = cld3 ;
        cld1.cld_node2 = cld4 ;
        cld6.cld_node1 = cld2 ;
        cld5.cld_node1 = cld8 ;
        cld5.cld_node2 = cld4 ;
        cld3.cld_node1 = cld7 ;
        cld4.cld_node1 = cld5 ;
        cld4.cld_node2 = cld9 ;
        cld4.cld_node3 = cld7 ;
        cld4.cld_node4 = cld1 ;
        cld3.cld_node2 = cld1 ;
        cld5.cld_node3 = cld2 ;
        cld1.cld_node3 = cld2 ;
        cld1.cld_node4 = head ;
        cld2.cld_node4 = head ;
        cld7.cld_node1 = cld3 ;
        cld7.cld_node2 = cld4 ;
        cld7.cld_node3 = cld9 ;
        cld9.cld_node1 = cld7 ;
        cld9.cld_node2 = cld4 ;
        cld9.cld_node3 = cld8 ;
        cld8.cld_node1 = cld9 ;
        cld8.cld_node2 = cld5 ;



        head11.cld_node1 = cld12 ;
        head11.cld_node2 = cld13 ;
        cld12.cld_node1 = head11 ;
        cld12.cld_node2 = cld13 ;
        cld13.cld_node1 = head11 ;
        cld13.cld_node2 = cld12 ;
        cld13.cld_node3 = cld14 ;
        cld14.cld_node1 = cld13 ;


        head21.cld_node1 = cld23 ;
        head21.cld_node2 = cld22 ;
        cld22.cld_node1 = head21 ;
        cld23.cld_node1 = head21 ;
    }
}

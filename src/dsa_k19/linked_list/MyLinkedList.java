package dsa_k19.linked_list;

/**
 *
 * @author phuoc
 */
public class MyLinkedList {
    //head
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    void printLinkedList(){
        System.out.println("Danh SACH LIEN KET:");
        
        Node current ;
        current = head;//lấy nút đầu
        
        while(current != null){
            //print nội dung của nút
        System.out.println(current.data);
        //di chuyển sang nút sau nút đầu
        current = current.next;
        }
    }
    
    
    
}

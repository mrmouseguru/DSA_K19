package dsa_k19.linked_list;

/**
 *
 * @author phuoc
 */
public class DemoLinkedList {
    
    public static void main(String[] args) {
        System.out.println("--- MINH HOA DANH SANH LIEN KET---");
        //khởi tạo danh sách rỗng
        MyLinkedList dslk;
        dslk = new MyLinkedList();
        System.out.println("kich thuoc ban dau: " + dslk.size);
        
        //tạo các nút dslk - thủ công
        Node nut12 = new Node(12);
        dslk.head = nut12;
        dslk.tail = nut12;
        dslk.size++;
        //nút 99
        Node nut99 = new Node(99);
        
        
    }
    
}

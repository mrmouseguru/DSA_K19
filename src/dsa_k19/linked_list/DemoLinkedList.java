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
        nut12.next = nut99;//nút 12 liên kết đến nút 99
        dslk.tail = nut99;
        dslk.size++;
        
        //thêm nút 37
        Node nut37 = new Node(37);
        nut99.next = nut37;
        dslk.tail = nut37;
        dslk.size++;
        
        dslk.addFirst(15);
        dslk.addLast(66);
        
        dslk.printLinkedList();
    }
    
    
    
}

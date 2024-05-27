public class Main{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    
    public static int size(Node head){
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static void nthLastNode(Node head, int idx){
        if (idx > 0 && idx <= size(head)) {
            Node fast = head;
            Node slow = head;
            for(int i=1;i<=idx;i++){
                fast = fast.next;
            }
            
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            System.out.println(slow.data);

            // int m = (size(head) - idx) +1;
            // Node temp = head;
            // for(int i = 1;i<=m-1;i++){
            //     temp = temp.next;
            // }
            // System.out.println(idx+" Node from the Last is : "+temp.data);


        }
        else{
            System.out.println("Invalid index");
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        Node head = first;
        print(head);
        nthLastNode(head, 3);
    }
}
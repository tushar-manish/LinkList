public class Link_Implement {
    Node head;

    Link_Implement(){
        head = null;
    }

    public void insert(int data){
        Node ns = new Node(data);
        if (isempty()){
            head = ns;
        }
        else{
            Node tmp = head;
            while(tmp.next!=null) tmp = tmp.next;
            tmp.next = ns;
        }
    }


    private boolean isempty() {
        return head==null;
    }


}

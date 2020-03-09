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

    public void deletefirst(){
        if(isempty()) System.out.println("Not Possible! List is empty");
        else{
            Node tmp1 = head;
            Node tmp2 = null;
            while(tmp1.next!=null){
                tmp2 = tmp1;
                tmp1 = tmp1.next;
            }
            tmp2.next = null;
        }
    }

    private boolean isempty() {
        return head==null;
    }


}

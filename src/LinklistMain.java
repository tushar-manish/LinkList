public class LinklistMain {
    public static void main(String[] args) {
        Link_Implement link = new Link_Implement();
        link.insert(10);
        link.insert(20);
        link.insert(30);
        link.display();
        link.deleteFirst();
        System.out.println();
        link.display();
    }
}

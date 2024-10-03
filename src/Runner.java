public class Runner {
    public static void main(String[] args){
        Linkedlist list=new Linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insertAtStart(0);
        list.insertAt(2,15);
        list.insertAt(0,-1);
        list.deleteAt(0);
        list.deleteAt(5);
        list.show();

    }
}

public class RunnerQueue {
    public static void main(String[] args){
        Queue obj= new Queue();
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(8);
        obj.enqueue(9);
        obj.dequeue();
        obj.dequeue();
        obj.show();
    }
}

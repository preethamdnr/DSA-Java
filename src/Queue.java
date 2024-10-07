public class Queue{
    int queue[]= new int[5];
    int front;
    int rear;
    int size;
    public void enqueue(int data){
        queue[rear]=data;
        rear++;
        size++;
    }
    public int dequeue(){
        int data=queue[front];
        front++;
        size--;
        return data;
    }
    public void show(){
        System.out.print("Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(queue[front+i]+" ");
        }
    }
}

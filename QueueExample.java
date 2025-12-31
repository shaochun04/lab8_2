import java.util.LinkedList;

class MyQueue<T> {

    // 用 JCF 的 LinkedList 當作底層儲存結構
    private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // enqueue: 放到佇列尾端
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // dequeue: 從佇列前端取出元素並回傳（FIFO）
    public T dequeue() {
        // 若為空，removeFirst() 會丟 NoSuchElementException
        return queue.removeFirst();
    }

    // 檢查佇列是否為空
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 返回佇列中的元素數量
    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        // do some test if needed
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        System.out.println(intQueue.dequeue()); // 1
        System.out.println(intQueue.dequeue()); // 2
        System.out.println(intQueue.isEmpty()); // true
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------

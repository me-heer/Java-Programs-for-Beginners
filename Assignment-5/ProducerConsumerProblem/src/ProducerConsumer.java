class Queue{
    int n;
    boolean available = false;
    synchronized int get(){
        while(!available){
            System.out.println("Consumer Waiting...");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumer: " + n);
        available = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        while(available){
            System.out.println("Producer Waiting...");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Producer: " + n);
        available = true;
        notify();
    }
}

class Producer implements Runnable{
    Queue q;
    Producer(Queue q){
        this.q = q;
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    Queue q;
    Consumer(Queue q){
        this.q = q;
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        while(true){
            q.get();
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

class ProducerConsumer{
    public static void main(String[] args){
        Queue q = new Queue();
        q.n = 0;
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
    }
}
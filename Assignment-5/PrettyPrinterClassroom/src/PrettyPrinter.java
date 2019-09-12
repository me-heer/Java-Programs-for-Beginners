class Printer{
    public void print(String msg){
        System.out.print("[");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){
            System.out.println("Interrupted.");
        }
        System.out.print(msg);
        System.out.print("]");
    }
}

class  User implements Runnable{
    Printer p;
    String message;
    Thread t;
    User(String printJob, Printer p){
        this.p = p;
        message = printJob;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        p.print(message);
    }
}

class PrettyPrinter{
    public static void main(String[] args){
        try{
            Printer p = new Printer();
            User u1 = new User("This",p);
            User u2 = new User("is",p);
            User u3 = new User("Sparta!",p);
        }catch(Exception ie){
            ie.printStackTrace();
        }
    }
}
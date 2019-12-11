class Printer{
    synchronized public void print(String msg){
        System.out.print("[");
        try{
            Thread.sleep(500);
        }catch(InterruptedException ie){
            System.out.println("Interrupted.");
        }
        System.out.print(msg);
        System.out.print("]\n");
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
    }
    public void run(){
        p.print(message);
    }
}

class PrettyPrinter{
    public static void main(String[] args){
	        Printer p = new Printer();
            User u1 = new User("This",p);
            User u2 = new User("is",p);
            User u3 = new User("Mihir",p);
            u1.t.start();
        try{
            u1.t.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
            u2.t.start();
            try{
                u2.t.join();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }

            u3.t.start();
            try{
                u3.t.join();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
            
        }
    }

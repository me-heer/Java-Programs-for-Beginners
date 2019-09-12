class Typewriter implements Runnable{

    String message;
    Typewriter(String message){
        this.message = message;
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        for(int i = 0; i < message.length();i++)
        {
            System.out.print(message.charAt(i));
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                System.out.println("Interrupted.");
            }
        }
    }
    public static void main(String[] args){
        Typewriter tw = new Typewriter("This is Sparta.");
    }
}
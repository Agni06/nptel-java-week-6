public class Main extends Thread
{
   public void run()
   {System.out.println("Running");
       
   }
}
class a{

	public static void main(String[] args) throws InterruptedException {
	    Runnable r = new Main();
	    Thread t = new Thread(r);
	    t.start();
	    
	   
	}
}
	 


public class Main extends Thread
{
   



	public static void main(String[] args) {
	    Main m = new Main();
	    
	   Thread t = new  Thread(m);
	 t.start();
	   
	    
	   
	}
public void run()
{
    System.out.println("running");
    
}
	    
	    
}

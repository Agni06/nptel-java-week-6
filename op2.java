public class Main extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.print(i++ + " ");
            
        }
        
    }


	public static void main(String[] args) {
	    Main m1 = new Main();
	    m1.run();
	    
	    
	
	}
}

package classloader;

public class Demo {

	public void show()
	{
		System.out.println("Hello... This is demo...");
		
		
	}
	
	  @Override
      public void finalize()
      {
    	  System.out.println("Priority of garbage collection thread is :" + Thread.currentThread().getPriority());
  		
      }
	
}

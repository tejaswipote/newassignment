package classloader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {

	
		// TODO Auto-generated method stub
		@Override
		protected
		Class<?> findClass(String name) {
	         byte[] bt = loadClassData(name);
	         return defineClass(name, bt, 0, bt.length);
	      }
	      byte[] loadClassData(String className) {
	        //read class
	        InputStream is = getClass().getClassLoader().getResourceAsStream(className.replace(".", "/")+".class");
	        ByteArrayOutputStream byteSt = new ByteArrayOutputStream();
	        //write into byte
	        int len =0;
	        try {
	                     while((len=is.read())!=-1){
	                           byteSt.write(len);
	                      }
	               } catch (IOException e) {
	                     e.printStackTrace();
	               }
	        //convert into byte array
	        return byteSt.toByteArray();
	     } 
	      
	      @Override
	      public void finalize()
	      {
	    	  System.out.println("Priority of garbage collection thread is :" + Thread.currentThread().getPriority());
	  		
	      }
      
	}


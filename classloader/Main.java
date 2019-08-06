package classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		CustomClassLoader loader = new CustomClassLoader();
		Class<?> c = loader.findClass("classloader.Demo");
		Object ob = c.newInstance();
		Method md = c.getMethod("show");
		md.invoke(ob);
		ob = null;
		System.gc();
		
	}

}

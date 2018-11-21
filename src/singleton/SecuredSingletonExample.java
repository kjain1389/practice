package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton implements Cloneable, Serializable {
	
	private static Singleton singleton;
	private static Object mutex = new Object();
	
	private Singleton() {
		if(null != singleton) {
			throw new IllegalStateException("Single object already created!!");
		}
	}
	
	public static Singleton getInstance() {
		
		synchronized(mutex) {
			if(null == singleton) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	protected Object readResolve() {
		return singleton;
	}
}

public class SecuredSingletonExample {

	public static void main(String[] args) {

		Class<?> clazz = Singleton.class;
		Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
		
		Singleton instance = Singleton.getInstance();
		
		Object newInstance = null;
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			try {
				newInstance = constructor.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ObjectOutput out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("C:\\file.txt"));
			out.writeObject(instance);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// deserailize from file to object
		ObjectInput in = null;
		Singleton instance2 = null;
		try {
			in = new ObjectInputStream(new FileInputStream("C:\\file.txt"));
			instance2 = (Singleton) in.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Singleton : "+instance);
		System.out.println("Object : "+newInstance);
		System.out.println("Singleton with serialize : "+instance2);
	}
}

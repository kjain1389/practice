/**
 * 
 */
package com.unique.interview.questions.statics;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;

//import sun.instrument.InstrumentationImpl;

/**
 * @author rs99000
 *
 */

class FinalStaticAndInstanceVariable implements Serializable {
	
	static final int STATIC_INT = 10;
	final int INSTANCE_INT = 10;
	
	public static int getStaticInt() {
		return STATIC_INT;
	}
	public int getINSTANCE_INT() {
		return INSTANCE_INT;
	}
}

class ObjectSize {
	
	public static Instrumentation instrumentation;
	
	static {
		
		try {
            Class<?> uc = Class.forName("sun.instrument.InstrumentationImpl");
            instrumentation = (Instrumentation)uc.newInstance();
            
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}

}

public class FinalStaticAndInstanceVariablesExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FinalStaticAndInstanceVariable obj = new FinalStaticAndInstanceVariable();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(obj);
		oos.close();
		
		System.out.println("Size of : "+baos.size()/8);
//		long objectSize = ObjectSize.instrumentation.getObjectSize(obj);
		
//		System.out.println("Size of : "+objectSize);
		
	}
}

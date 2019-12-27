package com.p3c.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
	
	static final String FILE_PATH = "c:/msb/dog.txt";
	
	public static void main(String[] args) {
		try {
			serializeDog();
			Dog d = deserializeFlyPig();
			System.out.println(d.getColor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
     * 序列化
     */
    private static void serializeDog() throws IOException {
        Dog dog = new Dog();
        dog.setColor("black");
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(FILE_PATH)));
        oos.writeObject(dog);
        System.out.println("dog 序列化成功");
        oos.close();
    }
 
    /**
     * 反序列化
     */
    private static Dog deserializeFlyPig() {
    	Dog dog = null;
    	// jdk7后with-resource
    	try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(FILE_PATH)));){
    		dog = (Dog) ois.readObject();
            System.out.println("dog 反序列化成功");
            
    	}catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	return dog;
        
    }
}



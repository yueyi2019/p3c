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
			// 修改完dog的版本号，再反序列化。
//			serializeDog();
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
        System.out.println("dog 对象序列化成功！");
        oos.close();
    }
 
    /**
     * 反序列化
     */
    private static Dog deserializeFlyPig() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(FILE_PATH)));
        Dog dog = (Dog) ois.readObject();
        System.out.println("dog 对象反序列化成功！");
        return dog;
    }
}



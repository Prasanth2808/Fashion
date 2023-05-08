package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandiling {

	public static void main(String[] args) {
		
        File file = new File("D:\\java clas\\file.txt");
        try {
			if(file.createNewFile()) {
				System.out.println("file was created successfully...!!!");
			}else {
				System.out.println("file was already created...!!!");
			}
		} catch (IOException e) {
			System.err.println("An Error Occurred...!!!");
		}
		
//        File file = new File("D:\\java clas\\file.txt");
//        if(file.exists()) {
//        	
//        	System.out.println("Name of the file" + file.getName() );
//        	System.out.println("Absolute Path of the file" + file.getAbsolutePath());
//        	System.out.println("Is the file writable?" + file.canWrite());
//        	System.out.println("Is the file Readable?" + file.canRead());
//        	System.out.println("File size in byte" + file.length());
//        } else {
//        	System.out.println("File was not found");
//}
//	
//		try {
//			FileWriter mywritter = new FileWriter("D:\\java clas\\file.txt");
//			mywritter.write("Java is a widely used object-oriented programming language and software "
//					+ "platform that runs on billions of devices, including notebook computers, "
//					+ "mobile devices, gaming consoles, medical devices and many others");
//			mywritter.close();
//			System.out.println("Successfully wrote to that file...!");
//		} catch (IOException e) {
//			System.out.println("An Error Occurred...!!!");
//		}
//		File file = new File("D:\\java clas\\file.txt");
//		try {
//			Scanner scanner = new Scanner(file);
//			while (scanner.hasNext()) {
//				String text = scanner.nextLine();
//				System.out.println(text);
//			}
//		} catch (FileNotFoundException e) {
//			
//			System.out.println("An Error Occurred...!!!");
//			
//		}
//		File file = new File("D:\\java clas\\file.txt");
//		if(file.delete()) {
//			System.out.println("File was deleted successfully...!!!");
//		}else {
//			System.out.println("File was not exist...!!!");
//		}
//		
		}	
}

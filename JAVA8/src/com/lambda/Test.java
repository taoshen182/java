package com.lambda;

import java.io.File;
import java.io.FileFilter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:/Users/want/Desktop/sql/";
		
		File dir = new File(path);
		FileFilter directoryFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		System.out.println(directoryFilter.accept(dir));
		
		
		File dir2 = new File(path);  
		
		//lambda表达式
		File[] dirs = dir2.listFiles((File f) -> f.isFile());
		
		File[] dirss = dir2.listFiles(ff -> ff.isFile());//Java编译器可以自动推导出参数类型，所以你可以不用再写一次类型。
		
		System.out.println("dirs="+dirs.length);
		for (int i = 0; i < dirs.length; i++) {
			System.out.println("dirs="+dirs[i]);
		}
	}

}

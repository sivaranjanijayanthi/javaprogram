package com.edubri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int sid;
String sname;
//accept data from user
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//or
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);

System.out.println("Enter student id");
sid= Integer.parseInt(br.readLine());
System.out.println("Enter name of student");
sname=br.readLine();

System.out.println("Id="+sid);
System.out.println("Name="+sname);

	}

}

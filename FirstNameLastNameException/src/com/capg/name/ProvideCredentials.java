package com.capg.name;

import java.util.Scanner;

public class ProvideCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        String first=scan.nextLine();
        String last=scan.nextLine();
        Controller con=new Controller();
        try {
        	 con.controls(first, last);
        }
        catch (Exception e) {
        	// TODO: handle exception
        	System.err.println("ERROR..."+e);
        }
	}

}

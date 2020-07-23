package algorithms.misc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MessageDigest5 {
	public static String getMd5(String s){
		try{
			//call getInstance method for hashing MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			//calculate message digest using digest() and return in the byte array
			byte[] messageDigest = md.digest(s.getBytes());
			//convert byte array to BigInteger
			BigInteger bi = new BigInteger(1, messageDigest);
			
			//create string hash with the above calculated value
			String hash = bi.toString(16);
			while(hash.length() < 32){
				hash = "0"+hash;
			}
			return hash;
		}
		catch(NoSuchAlgorithmException e){
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("The hashCode for the given string is: "+getMd5(s));
	}

}

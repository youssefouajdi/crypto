package crupto;

import java.math.BigInteger;


public class home {

	public static void main(String[] args) 
	{
	    final String secretKey = "r";
	    String originalString = "youssef ouajdi";
	    String encryptedString = AES.encrypt(originalString, secretKey) ;
	    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
	    
	    System.out.println("algorithme cesar");
	    System.out.println("*************************");
	    System.out.println(" Encrypted Text : " + cesar.encoding(originalString, 4)) ;
        System.out.print(" Decryptd Text : ") ;
        System.out.print(cesar.decoding (cesar.encoding (originalString, 4), 4)) ;
	     
	    System.out.println("algorithme AES");
	    System.out.println("*************************");
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	    
	    
	    System.out.println("algorithme DES");
	    System.out.println("*************************");
	    DES.encrypt(originalString, secretKey) ;
	    
	    
	    System.out.println("algorithme RSA");
	    System.out.println("*************************");
	    RSA rsa = new RSA(1024);
	    System.out.println("Plaintext: " + originalString);
	    BigInteger plaintext = new BigInteger(originalString.getBytes());

	    BigInteger ciphertext = rsa.encrypt(plaintext);
	    System.out.println("Ciphertext: " + ciphertext);
	    plaintext = rsa.decrypt(ciphertext);

	    String text2 = new String(plaintext.toByteArray());
	    System.out.println("Plaintext: " + text2);
	    
	    
	}
}

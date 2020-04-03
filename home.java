package crupto;

import java.math.BigInteger;
import javax.crypto.spec.*;
import java.security.*;
import javax.crypto.*;
  

public class home {

	public static void main(String[] args) throws Exception 
	{
	    final String secretKey = "password";
	    String originalString = "youssef ouajdi";
	    String encryptedString = AES.encrypt(originalString, secretKey) ;
	    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
	    
	    System.out.println("algorithme cesar");
	    System.out.println("*************************");
	    System.out.println(" Encrypted Text : " + cesar.encoding(originalString, 4)) ;
        System.out.println(" Decryptd Text : ") ;
        System.out.println(cesar.decoding (cesar.encoding (originalString, 4), 4)) ;
	     
	    System.out.println("algorithme AES");
	    System.out.println("*************************");
	    System.out.println("text original" + originalString);
	    System.out.println("text crypte " +encryptedString);
	    System.out.println("text decrypte "+decryptedString);
	    
	    
	    System.out.println("algorithme DES");
	    System.out.println("*************************");
	    DES.encrypt(originalString, secretKey) ;
	    
	    System.out.println("algorithme BLOWFISH");
	    System.out.println("*************************");
	    BlowfishCipher.encrypt(originalString, secretKey) ;
	    
	    System.out.println("algorithme IDEA");
	    System.out.println("*************************");
	    IDEA.encrypt(originalString, secretKey) ;
	    
	    
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
	    
	    System.out.println("algorithme RC6");
	    System.out.println("*************************");
	    RC.encrypt(originalString, secretKey) ;
	
	    
	    
	}
}

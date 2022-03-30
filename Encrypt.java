
package enc;


import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import java.math.BigInteger;

import java.security.*;



public class Encrypt {
   
    private static final String SECRET_KEY_ALGORITHM = "AES";
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static Cipher cipher;
    private static byte[] ivByte;

    private static void init(){
        try{
            if(cipher == null)
                cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            if(ivByte == null)
                ivByte = new byte[cipher.getBlockSize()];
        }catch (NoSuchPaddingException | NoSuchAlgorithmException exception){

            throw new RuntimeException("Cannot initialize Cipher", exception);
        }
    }

    /**
     * Encrypt the data
     *
     * @param dataToBeDecrypted
     * @return
     */
    public static String encryptData( String dataToBeDecrypted){
        String encodedString ="";
        try{
            init();
            cipher.init(Cipher.ENCRYPT_MODE,getSecretKey("6E9EA84D3DC84C6B6D68A81A55A9DA15"), new IvParameterSpec(ivByte));
            byte[] encryptedByte = cipher.doFinal(dataToBeDecrypted.getBytes());
            encodedString = DatatypeConverter.printBase64Binary(encryptedByte);
            return encodedString;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {

        }
        return encodedString;
    }
    private static Key getSecretKey(String key) {
        return new SecretKeySpec(key.getBytes(), SECRET_KEY_ALGORITHM);
    }


    public static String decrypt(String encrypted) throws GeneralSecurityException {
    	init();
    	//6E9EA84D3DC84C6B6D68A81A55A9DA15
    	//s9s8dgZSjh9143sjGKDPefSik843
    	
        cipher.init(Cipher.DECRYPT_MODE, getSecretKey("s9s8dgZSjh9143sjGKDPefSik843"), new IvParameterSpec(ivByte));
        /*
         * prod key  6E9EA84D3DC84C6B6D68A81A55A9DA15*/
         
     //   cipher.init(Cipher.DECRYPT_MODE, getSecretKey("9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08"), new IvParameterSpec(ivByte));
        byte[] original = cipher.doFinal(DatatypeConverter.parseBase64Binary(encrypted));
        return new String(original);
    }
    public static String getSHA(String input) 
    { 
  
        try { 
  
            // Static getInstance method is called with hashing SHA 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
  
            // digest() method called 
            // to calculate message digest of an input 
            // and return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
  
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            return hashtext; 
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            System.out.println("Exception thrown"
                               + " for incorrect algorithm: " + e); 
  
            return null; 
        } 
    } 
}

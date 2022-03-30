package enc;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;


public class CSVReaderWithHeaderAutoDetection {
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

	    public static void main(String[] args) throws IOException, GeneralSecurityException {
	    	 BufferedReader read =  
	                   new BufferedReader(new InputStreamReader(System.in));
	    	 System.out.println("Enter 1 for USER_ID table,2 for USER_GROUP_MEMBER,3 for change_history_xml::");
	    	 String option = read.readLine();
	        switch(option){
	    case "1":
	       userId();
	       break;
	    case "2":
	    	affiliate();
	    	break;
	    case "3":
	    	change_history_xml();
	    	break;
	        }
	    }

		private static void writeToCSV(ArrayList<String> record,String fileName) throws IOException {
			 
			File file = new File(fileName);
	        FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
	        for(String str : record){
	        	bw.write(str);
	        	bw.newLine();
	        }
	        bw.close();
	        fw.close();
		}
		
		static String getSHA(String input) 
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
		
		public static String decrypt(String encrypted) throws GeneralSecurityException {
	    	init();
	        cipher.init(Cipher.DECRYPT_MODE, getSecretKey("6E9EA84D3DC84C6B6D68A81A55A9DA15"), new IvParameterSpec(ivByte));
	        byte[] original = cipher.doFinal(DatatypeConverter.parseBase64Binary(encrypted));
	        return new String(original);
	    }
		 private static Key getSecretKey(String key) {
		        return new SecretKeySpec(key.getBytes(), SECRET_KEY_ALGORITHM);
		    }
		 
		 private static void userId() throws IOException, GeneralSecurityException {
	    	 BufferedReader read =  
	                   new BufferedReader(new InputStreamReader(System.in));
	    	 System.out.println("Enter userId file name in CSV format::");
	    	 String fileName = read.readLine();
	        try (
	        		  Reader reader = Files.newBufferedReader(Paths.get(fileName));
	            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
	                    .withFirstRecordAsHeader()
	                    .withIgnoreHeaderCase()
	                    .withTrim());
	        ) {
	        	ArrayList<String> record = new ArrayList();
	        	
	            for (CSVRecord csvRecord : csvParser) {
	            	String pass =csvRecord.get("PASSWORD");
	            	String userIde = csvRecord.get("USER_IDENTIFIER");
	            	String affiliate=csvRecord.get("AFFILIATE_ID");
	            	String fName = csvRecord.get("FIRST_NAME");
	            	String lName = csvRecord.get("LAST_NAME");


	            	String hashed = getSHA(pass);
	            	
	            	String temp = ",";
	          		   if(fName != null && !fName.isEmpty() )  {
	          			   temp = temp + "FIRST_NAME = '"+decrypt(fName) +"' ,";
	          		   } 
	          		 if(lName != null && !lName.isEmpty() ){
	          			temp = temp + "LAST_NAME = '"+decrypt(lName) +"'";
	          		 }
	          		String sql = "update USER_ID set PASSWORD = '"+hashed +"' , USER_IDENTIFIER ='"+decrypt(userIde)+"' "+temp+" where USER_IDENTIFIER='" +userIde +"' and AFFILIATE_ID= '" +affiliate+"' ;";
	          		 
	          	record.add(sql);
	          	

	            }
	            writeToCSV(record,"user_id_update.sql");
	           
	            System.out.println("Find update script in user_id_update.sql ");
	        }

	}
		 private static void change_history_xml() throws IOException, GeneralSecurityException{
			
	        	ArrayList<String> record = new ArrayList();
	        	ArrayList<String> userId= new ArrayList<>();
	        	userId.add("BNb80Xkjcp2n30rLSufixQ==");
	        	userId.add("5nTEj5LznhllUKwex/jOgg==");
	        	userId.add("R3racmmpjEK3LZv4qo905g==");
	        	userId.add("/axw54ey8lRXuz2Smo4DWQ==");
	        	userId.add("+LLd7grBKFJxJmg6K2adGw==");
	        	userId.add("1hgvOp9YhpX7S3NUv1ZaIw==");
	        	userId.add("7zXfb1V4/Rds/on22yWlpQ==");
	        	userId.add("tq0wm+iVjDobuFmUsmnVZA==");
	        	userId.add("IquzMvgtZdGeWVfolH/XkA==");
	        	userId.add("J9DFflqbABhzSJSpehfX6A==");
	        	userId.add("2cmE/50ZfuZxR9EORRKmiQ==");
	        	userId.add("p+5Wp2ZwjePCfOvRnjFIgg==");
	        	userId.add("ba8ABSTVtbL16/2jxuqB5Q==");
	        	userId.add("rh65LZUlWzOmySJiazAGmA==");
	        	userId.add("ZwNvmZND1eLTGoZnMQ5EMA==");
	        	userId.add("Rm22+E+l/dJ2vWFXrQUboQ==");
	        	userId.add("ANzDGwfy3Nipq0iIGo0tYQ==");
	        	
	        	
	        	
	            for (String uId : userId) {
	            	
	            	
	            	
	          		String sql = "update change_history_xml set  user_id ='"+uId+"'  where user_id='" +decrypt(uId) +"'  ;";
	          		 
	          record.add(sql);
	          	

	            }
	            writeToCSV(record,"int_change_history_xml_rollback.sql");
	           
	            System.out.println("Find update script in affiliate_update.sql ");
	        }
			 
		 

		 private static void affiliate() throws IOException, GeneralSecurityException {
	    	 BufferedReader read =  
	                   new BufferedReader(new InputStreamReader(System.in));
	    	 System.out.println("Enter affiliate file name in CSV format::");
	    	 String fileName = read.readLine();
	        try (
	        		  Reader reader = Files.newBufferedReader(Paths.get(fileName));
	            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
	                    .withFirstRecordAsHeader()
	                    .withIgnoreHeaderCase()
	                    .withTrim());
	        ) {
	        	ArrayList<String> record = new ArrayList();
	        	
	            for (CSVRecord csvRecord : csvParser) {
	            	String userIde = csvRecord.get("ADMIN_USER_IDENTIFIER");
	            	String affiliate=csvRecord.get("AFFILIATE_ID");
	            	
	            	
	          		String sql = "update AFFILIATE set  ADMIN_USER_IDENTIFIER ='"+decrypt(userIde)+"'  where ADMIN_USER_IDENTIFIER='" +userIde +"' and AFFILIATE_ID= '" +affiliate+"' ;";
	          		 
	          record.add(sql);
	          	

	            }
	            writeToCSV(record,"affiliate_update.sql");
	           
	            System.out.println("Find update script in affiliate_update.sql ");
	        }

	}
}
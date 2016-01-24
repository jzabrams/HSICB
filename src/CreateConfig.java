import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

public class CreateConfig {

	
 
	
	static secureFileTransfer toServer = null;
	
	
	public static  String[] getUserInput() 
	{
		
		int confirmedInput=1;
		int testForValidInput=0;
		String input[]= new String[20];
		while(confirmedInput!=JOptionPane.YES_OPTION){
		
		
		input[0]= JOptionPane.showInputDialog("Client Name:");
		if (input[0]==null) System.exit(0);
		
		input[9]= JOptionPane.showInputDialog("Client Location:");
		if (input[9]==null) System.exit(0);
		
		input[1]= JOptionPane.showInputDialog("Client WLAN SSID:");
		if (input[1]==null) System.exit(0);
		
		
		
		
		while(testForValidInput==0){
		input[2]= JOptionPane.showInputDialog("Client WLAN WPA/WPA2 Personal password:");
		if (input[2]==null) System.exit(0);
		 if (input[2].length() < 8){
			  JOptionPane.showMessageDialog(null, "You did not enter a long enough wpa/wpa2 password, (at least 8 charecters). Please try again.", "Invalid Input", JOptionPane.ERROR_MESSAGE);

		    }
		
		  else testForValidInput=1;
		  
		}
		
		testForValidInput=0;
		
		while(testForValidInput==0){
		  input[3]= JOptionPane.showInputDialog("Management WLAN WPA/WPA2 Personal password:");
		  if (input[3]==null) System.exit(0);
		  
		  if (input[3].length() < 8){
			  JOptionPane.showMessageDialog(null, "You did not enter a long enough wpa/wpa2 password, (at least 8 charecters). Please try again.", "Invalid Input", JOptionPane.ERROR_MESSAGE);

		    }
		
		  else testForValidInput=1;
		  
		}
		
		testForValidInput=0;
		
		while(testForValidInput==0){
		  input[4]= JOptionPane.showInputDialog(" Account number:");
		  if (input[4]==null) System.exit(0); 
		
		  if (input[4].length()!=5|| !input[4].matches("[0-9]+")){
			
			  JOptionPane.showMessageDialog(null, "You did not enter a valid management number, (four digit integer). Please try again.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	
		  }
		  else testForValidInput=1;
		
		}
		
		testForValidInput=0;
		
		while(testForValidInput==0){
		input[5]= JOptionPane.showInputDialog("Public(transit) gateway ip:");
		if (input[5]==null) System.exit(0);
				if (validIP(input[5])==false) {
						JOptionPane.showMessageDialog(null, "You did not enter a valid IPv4 address. Please try again.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				}
			else testForValidInput=1;
		}
		
		testForValidInput=0;
		
		while(testForValidInput==0){
			input[6]= JOptionPane.showInputDialog("Private(management) gateway ip:");
			if (input[6]==null) System.exit(0);
					if (validIP(input[6])==false) {
						JOptionPane.showMessageDialog(null, "You did not enter a valid IPv4 address. Please try again.", "Invalid Input", JOptionPane.ERROR_MESSAGE);

					}
				else testForValidInput=1;
		}
		
		

		input[7] = randomMACAddress();

		input[8] = randomMACAddress();
		
		confirmedInput = JOptionPane.showConfirmDialog(null, 
				"Client Name:"+input[0]+"\n"+
				"Client Location:"+input[9]+"\n"+
			    "Client WLAN SSID:"+input[1]+"\n"+
			    "Client WLAN WPA/WPA2 Personal password:"+input[2]+"\n"+
			    "Management WLAN WPA/WPA2 Personal password:"+input[3]+"\n"+
			    "Account number:"+input[4]+"\n"+
			    "Public(transit) gateway ip:"+input[5]+"\n"+
			    "Private(management) gateway ip:"+input[6]+"\n"+
			    "MAC address for public vlan interface:"+input[7]+"\n"+
			    "MAC address for private vlan interface:"+input[8]+"\n"
				+ "Are all of your values correct?\n"
				+ "If you select no the information prompts will be shown again.","Confirm Info", JOptionPane.YES_NO_OPTION);
				
		}
		
		return input;
		
       
     }
	
	
	
    private static void readwriteFile(File fin, File fout,  String uInput[]) throws IOException, JSchException {
    	
    	FileInputStream fis = new FileInputStream(fin);
 
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	    
	    Writer fileWriter = new FileWriter(fout);
	    
	    
	    String line = null;
	    while ((line = br.readLine()) != null) {
		
	    line = line.replace("CLIENTNAME", uInput[0]);
	    line = line.replace("CLIENTLOCATION", uInput[9]);
		
	    line = line.replace("CWLANSSID", uInput[1]);
	    line = line.replace("CWLANPASS", uInput[2]);
	
	    line = line.replace("MWLANPASS", uInput[3]);
		line = line.replace("MGMNTNUM", uInput[4]);
		
		line = line.replace("GATEWAYPUB", uInput[5]);
		line = line.replace("GATEWAYPRIV", uInput[6]);
		
		line = line.replace("MACPUB", uInput[7]);
		line = line.replace("MACPRIV", uInput[8]);
		
		//line = line.replace("ADMINPASS", uInput[10]);
	    	
		
		fileWriter.write(line + "\n");
		fileWriter.flush();
		
		
		
		
		
		
		
	}
	fileWriter.close();
	br.close();
	
}
  
    
    public static void uploadConf(String in[], File fout){
    	
    	
    		secureFileTransfer.sendFile("/var/www/files/accounts/"+in[4]+"/files/", fout.getAbsolutePath());
    		

  	}
    	
    
    
    
   
     @SuppressWarnings("unused")
	public static void createFile(String fileName) {
          
          File f = null;
         
		  boolean fileCreated = false;
          
          try{
             
             f = new File(fileName);
             
             
             fileCreated = f.createNewFile();
  
          }catch(Exception e){
             e.printStackTrace();
          }
       }
    

     private static String randomMACAddress(){
    	    Random rand = new Random();
    	    byte[] macAddr = new byte[6];
    	    rand.nextBytes(macAddr);

    	    macAddr[0] = (byte)(macAddr[0] & (byte)254);  

    	    StringBuilder sb = new StringBuilder(18);
    	    for(byte b : macAddr){

    	        if(sb.length() > 0)
    	            sb.append(":");

    	        sb.append(String.format("%02x", b));
    	    }


    	    return sb.toString();
    	}
     
     public static boolean validIP (String ip) {
    	    try {
    	        if ( ip == null || ip.isEmpty() ) {
    	            return false;
    	        }

    	        String[] parts = ip.split( "\\." );
    	        if ( parts.length != 4 ) {
    	            return false;
    	        }

    	        for ( String s : parts ) {
    	            int i = Integer.parseInt( s );
    	            if ( (i < 0) || (i > 255) ) {
    	                return false;
    	            }
    	        }
    	        if ( ip.endsWith(".") ) {
    	            return false;
    	        }

    	        return true;
    	    } catch (NumberFormatException nfe) {
    	        return false;
    	    }
    	}
     
     
     public static void setUpFiletransfer () {
    	 
    	 String host = "XXXXXXX";
    	 int port = 22;
    	 String usr = "XXXXXXX";
    	 String pass = "XXXXXXX"; 
    	
    	 
    	 toServer = new secureFileTransfer(host, port, usr, pass);
    	 
 	}
     

    


}
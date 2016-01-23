

    import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
    import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.jcraft.jsch.Channel;
	import com.jcraft.jsch.ChannelSftp;
	import com.jcraft.jsch.JSch;
	import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

	public class secureFileTransfer {
	 
		static String SFTPHOST = null;
		static int    SFTPPORT = 0;
		static String SFTPUSER = null;
		static String SFTPPASS = null;

		 
		static Session     session     = null;
		static Channel     channel     = null;
		static ChannelSftp channelSftp = null;


	 secureFileTransfer(String host, int port, String usr, String pass ) {
	 SFTPHOST = host;
	 SFTPPORT = port;
	 SFTPUSER = usr;
	 SFTPPASS = pass;

	 
	session     = null;
	channel     = null;
	channelSftp = null;
	 
	}

	 static void sendFile(String wrkindir, String fname) {
		try{
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER,SFTPHOST,SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp)channel;
            channelSftp.cd(wrkindir);
            File f = new File(fname);
            channelSftp.put(new FileInputStream(f), f.getName());
}catch(Exception ex){
ex.printStackTrace();
}
 System.exit(0);
		
	}
	 
	 static void recFile(String wrkindir, String fname) { 
	 try{
		 JSch jsch = new JSch();
		 session = jsch.getSession(SFTPUSER,SFTPHOST,SFTPPORT);
		 session.setPassword(SFTPPASS);
		 java.util.Properties config = new java.util.Properties();
		 config.put("StrictHostKeyChecking", "no");
		 session.setConfig(config);
		 session.connect();
		 channel = session.openChannel("sftp");
		 channel.connect();
		 channelSftp = (ChannelSftp)channel;
		 channelSftp.cd(wrkindir);
		 byte[] buffer = new byte[1024];
		 BufferedInputStream bis = new BufferedInputStream(channelSftp.get("Test.java"));
		 File newFile = new File(fname);
		 OutputStream os = new FileOutputStream(newFile);
		 BufferedOutputStream bos = new BufferedOutputStream(os);
		 int readCount;
		 //System.out.println("Getting: " + theLine);
		 while( (readCount = bis.read(buffer)) > 0) {
		 System.out.println("Writing: " );
		 bos.write(buffer, 0, readCount);
		 }
		 bis.close();
		 bos.close();
		 }catch(Exception ex){
		 ex.printStackTrace();
		 }
	
	}
	
	 static boolean testDir(String dir){
		 
		 ChannelSftp channelSftp = (ChannelSftp)channel;
		 
		 
		 SftpATTRS attrs=null;
		 try {
		     attrs = channelSftp.stat(dir);
		 } catch (Exception e) {
		     System.out.println(dir);
		     
		 }

		 if (attrs != null) {
		     return true;
		 } 
		 else {
		     return false;
		      
		 }
		
	 }
	
	 

}

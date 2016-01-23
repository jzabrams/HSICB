

import java.awt.*;
import javax.swing.*;

public class HSCB_GUI {

    public static void main(String[] args) {
        new HSCB_GUI();
    }

    GridBagConstraints gbc = new GridBagConstraints();
    
    public HSCB_GUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                
                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridBagLayout());
                
                 frame.setSize(795,670);
                
                 gbc.fill = GridBagConstraints.HORIZONTAL;
                 gbc.anchor = GridBagConstraints.NORTH;
                
                gbc.gridx=0;
                gbc.gridy=2;
                frame.add(new Pane3(),gbc);
                
                gbc.gridx=1;
                gbc.gridy=2;
                frame.add(new Pane4(),gbc);
                
                gbc.gridx=1;
                gbc.gridy=3;
                frame.add(new Pane5(),gbc);
                
                
                gbc.gridwidth=2;
                gbc.gridx=0;
                gbc.gridy=0;
                frame.add(new Pane1(),gbc);
                
                
                gbc.insets=new Insets(5, 0, 0, 0);
                gbc.gridwidth=2;
                gbc.gridx=0;
                gbc.gridy=1;
                frame.add(new Pane2(),gbc);
                
                gbc.insets=new Insets(0, 0, 0, 0);
                gbc.gridwidth=1;
                gbc.gridx=0;
                gbc.gridy=4;
                frame.add(new Pane6(),gbc);
                gbc.gridwidth=1;
                
                gbc.gridx=1;
                gbc.gridy=4;
                frame.add(new Pane7(),gbc);
               
                //frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    protected class Pane1 extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Pane1() {
            setLayout(new GridBagLayout());
            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            
            
            JTextField clientName = new JTextField(15);
            JTextField clientAcctNum = new JTextField(10);
            JTextField clientLoc = new JTextField(15);
            
            JLabel clientNameLabel = new JLabel("Client Name:");
            JLabel clientAcctLabel = new JLabel("Account #:");
            JLabel clientLocLabel = new JLabel("Location:");

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 0, 0);
            add(clientNameLabel, gbc);
            
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 0, 15);
            add(clientName, gbc);
            
            
            gbc.gridx = 2;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 0, 0);
            add(clientAcctLabel, gbc);
            
            gbc.gridx = 3;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 0, 0);
            add(clientAcctNum, gbc);
            
            gbc.gridx = 4;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 0, 0);
            add(clientLocLabel, gbc);
            
            gbc.gridx = 5;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 0, 0);
            add(clientLoc, gbc);
            
           
            
            
            
           

            

                            
        }            
    } 
    
    @SuppressWarnings("serial")
	protected class Pane2 extends JPanel {
    	
		public Pane2() {
			
            setLayout(new GridBagLayout());

            
            JLabel configHWLabel = new JLabel("Hardware to Config:");
            JLabel configRadioLabel = new JLabel("Radio:");
            JLabel configRouterLabel = new JLabel("Router:");
            
            String[] radios = { "NBrM5", "PBM2", "NSM5", "NSM2", "MT-SXT2", "MT-SXT5", "None" };
            String[] routers = { "HAPLite", "HAP POE", "None" };
            
            JComboBox<String> radioList = new JComboBox<String>(radios);
            JComboBox<String> routerList = new JComboBox<String>(routers);
            
           
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.NORTH;
            
            gbc.gridx=0;
            gbc.gridy=0;
            //gbc.gridwidth=2;
            gbc.insets = new Insets(0,0,0,0);
            add (configHWLabel,gbc);
            
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add (configRadioLabel,gbc);
            
            gbc.gridx=0;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add (radioList,gbc);
            
            gbc.gridx=1;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add (configRouterLabel,gbc);
            
            gbc.gridx=1;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add (routerList,gbc);
               
             
        }            
    } 
    
    protected class Pane3 extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Pane3() {
            setLayout(new GridBagLayout());

            String[] radioConfigTypes = { "Bridge","Router","Mgmnt Vlan Bridge" };
            
            JLabel radioInfoLabel = new JLabel("Radio Information:");
            JLabel radioConfigTypeLabel = new JLabel("Config Type:");
            JLabel radioSSIDLabel = new JLabel("AP SSID:");
            JLabel encryptionPasswordLabel = new JLabel("Passcode:");
            JLabel vlanLabel = new JLabel("VLAN ID:");
            JLabel IPLabel = new JLabel("IP Address:");
            JLabel gatewayLabel = new JLabel("Gateway:");
           
            JCheckBox radioEncryption = new JCheckBox("Encrypted");
            JCheckBox DHCP = new JCheckBox("DHCP");
            
            JPasswordField encryptionPass= new JPasswordField();
            
            JTextField ssid= new JTextField();
            JTextField vlanID= new JTextField();
            JTextField IPAddress= new JTextField("xxx.xxx.xxx.xxx/xx");
            JTextField gatewayIP= new JTextField("xxx.xxx.xxx.xxx");
   
            JComboBox<String> radioList = new JComboBox<String>(radioConfigTypes);
    
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.NORTH;
            
            gbc.gridx=1;
            gbc.gridy=0;
            gbc.insets = new Insets(0,0,0,0);
            add(radioInfoLabel, gbc);
           
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(radioConfigTypeLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(radioList, gbc);
            
            gbc.gridx=0;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(radioSSIDLabel, gbc); 
            gbc.gridx=1;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(ssid, gbc);
            
            gbc.gridx=0;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(radioEncryption, gbc);
            
            gbc.gridx=0;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(encryptionPasswordLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(encryptionPass, gbc);
            
            gbc.gridx=0;
            gbc.gridy=5;
            gbc.insets = new Insets(0,0,0,0);
            add(vlanLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=5;
            gbc.insets = new Insets(0,0,0,0);
            add(vlanID, gbc);
            
            gbc.gridx=0;
            gbc.gridy=6;
            gbc.insets = new Insets(0,0,0,0);
            add(DHCP, gbc);

            gbc.gridx=0;
            gbc.gridy=7;
            gbc.insets = new Insets(0,0,0,0);
            add(IPLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=7;
            gbc.insets = new Insets(0,0,0,0);
            add(IPAddress, gbc);
            
            gbc.gridx=0;
            gbc.gridy=8;
            gbc.insets = new Insets(0,0,0,0);
            add(gatewayLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=8;
            gbc.insets = new Insets(0,0,0,0);
            add(gatewayIP, gbc);
                         
        }            
    } 
    
    
    protected class Pane4 extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Pane4() {
			setLayout(new GridBagLayout());

            String[] routerConfigTypes = { "Dual VLAN","AP","Radio Bridge","Dual WAN Failover" };
            
            JLabel routerInfoLabel = new JLabel("Router Information:");
            JLabel routerConfigTypeLabel = new JLabel("Config Type:");
            JLabel mgmntIPLabel = new JLabel("Management IP:");
            JLabel wan1IPLabel = new JLabel("WAN1 Trans IP:");
            JLabel wan2IPLabel = new JLabel("WAN2 Trans IP:");
            JLabel mgmntGatewayLabel = new JLabel("Management Gateway:");
            JLabel wan1GatewayLabel = new JLabel("WAN1 Gateway:");
            JLabel wan2GatewayLabel = new JLabel("WAN2 Gateway:");
            JLabel mgmntVLANIDLabel = new JLabel("Management VLAN ID:");
            JLabel transVLANIDLabel = new JLabel("Trans VLAN ID:");
            
            JTextField mgmntIP = new JTextField();
            JTextField wan1IP = new JTextField();
            JTextField wan2IP = new JTextField();
            JTextField mgmntGatewayIP = new JTextField();
            JTextField wan1GatewayIP = new JTextField();
            JTextField wan2GatewayIP = new JTextField();
            JTextField mgmntVLANID = new JTextField();
            JTextField transVLANID = new JTextField();
            
            JCheckBox mgmntDHCP = new JCheckBox("DHCP");
            JCheckBox wan1DHCP = new JCheckBox("DHCP");
            JCheckBox wan2DHCP = new JCheckBox("DHCP");
            
   
            JComboBox<String> routerList = new JComboBox<String>(routerConfigTypes);
    
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.NORTH;
            
            gbc.gridx=1;
            gbc.gridy=0;
            gbc.insets = new Insets(0,0,0,0);
            add(routerInfoLabel, gbc);
           
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(routerConfigTypeLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(routerList, gbc);
             
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(routerConfigTypeLabel, gbc);
            gbc.gridx=1;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(routerList, gbc);
            
            gbc.gridx=0;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntIPLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntIP,gbc);
            gbc.gridx=2;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntDHCP,gbc);
            
            gbc.gridx=0;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(wan1IPLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(wan1IP,gbc);
            gbc.gridx=2;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(wan1DHCP,gbc);
            
            gbc.gridx=0;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(wan2IPLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(wan2IP,gbc);
            gbc.gridx=2;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(wan2DHCP,gbc);
            
            gbc.gridx=0;
            gbc.gridy=5;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntGatewayLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=5;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntGatewayIP,gbc);
            
            gbc.gridx=0;
            gbc.gridy=6;
            gbc.insets = new Insets(0,0,0,0);
            add(wan1GatewayLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=6;
            gbc.insets = new Insets(0,0,0,0);
            add(wan1GatewayIP,gbc);
            
            gbc.gridx=0;
            gbc.gridy=7;
            gbc.insets = new Insets(0,0,0,0);
            add(wan2GatewayLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=7;
            gbc.insets = new Insets(0,0,0,0);
            add(wan2GatewayIP,gbc);
            
            gbc.gridx=0;
            gbc.gridy=8;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntVLANIDLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=8;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntVLANID,gbc);
            
            gbc.gridx=0;
            gbc.gridy=9;
            gbc.insets = new Insets(0,0,0,0);
            add(transVLANIDLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=9;
            gbc.insets = new Insets(0,0,0,0);
            add(transVLANID,gbc);
            
            
                          
        }            
    } 
    
  
    protected class Pane5 extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Pane5() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.NORTH;
            
            JLabel wirelessInfoLabel = new JLabel("Wireless Information:");
            JLabel clientWirelessSSIDLabel = new JLabel ("Client Wireless SSID:");
            JLabel clientWirelessEnLabel = new JLabel ("Client Wireless Encryption:");
            JLabel clientWirelessEnPassLabel = new JLabel ("Password:");
            JLabel mgmntWirelessEnPassLabel = new JLabel ("Management WLAN Encryption Password:");
            
            JTextField clientWirelessSSID = new JTextField();
            JTextField clientWirelessEnPass = new JTextField();
            JTextField mgmntWirelessEnPass = new JTextField();
            
            JCheckBox clientWireless = new JCheckBox("Enable Client WLAN");
            JCheckBox clientWirelessEnWPA = new JCheckBox("WPA/WPA2");
            JCheckBox clientWirelessEnWEP = new JCheckBox("WEP");
            JCheckBox clientWirelessEnNone= new JCheckBox("None");
            
            gbc.gridx=1;
            gbc.gridy=0;
            gbc.insets = new Insets(0,0,0,0);
            add(wirelessInfoLabel, gbc);
            
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWireless, gbc);

            gbc.gridx=0;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessSSIDLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessSSID,gbc);
            
            gbc.gridx=0;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessSSIDLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessSSID,gbc);
            
            gbc.gridx=0;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessEnLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessEnWPA,gbc);
            gbc.gridx=2;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessEnWEP,gbc);
            gbc.gridx=3;
            gbc.gridy=4;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessEnNone,gbc);
            
            gbc.gridx=0;
            gbc.gridy=5;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessEnPassLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=5;
            gbc.insets = new Insets(0,0,0,0);
            add(clientWirelessEnPass,gbc);

            gbc.gridx=0;
            gbc.gridy=6;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntWirelessEnPassLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=6;
            gbc.insets = new Insets(0,0,0,0);
            add(mgmntWirelessEnPass,gbc);
            
            
            
        }            
    } 
     
    
    
    
    
    protected class Pane6 extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Pane6() {
            setLayout(new GridBagLayout());
            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.NORTH;
            
            JLabel outputDirLabel = new JLabel("Output file(s) directory:");
            
           // JFileChooser outPutDir = new JFileChooser();
           // outPutDir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            JTextField outputDir = new JTextField();
            
            
            gbc.gridx=0;
            gbc.gridy=0;
            gbc.insets = new Insets(0,0,0,0);
            add(outputDirLabel,gbc);
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(outputDir,gbc);
        }            
    } 
    
    protected class Pane7 extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Pane7() {
            setLayout(new GridBagLayout());

            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.NORTH;
            
            JLabel uploadLabel = new JLabel("Upload Files");
            JLabel uploadHostLabel = new JLabel("Destination Host:");
            JLabel uploadUserLabel = new JLabel("User:");
            JLabel uploadPassLabel = new JLabel("Password:");
            
            
            JTextField uploadHost = new JTextField(15);
            JTextField uploadUser = new JTextField(15);
            JPasswordField uploadPass = new JPasswordField(15);
            
            
            
            
            gbc.gridx=0;
            gbc.gridy=0;
            gbc.gridwidth=2;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadLabel,gbc);
            
            gbc.gridwidth=1;
            gbc.gridx=0;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadHostLabel,gbc);
            
            gbc.gridx=1;
            gbc.gridy=1;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadHost,gbc);
            
            gbc.gridx=0;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadUserLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=2;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadUser,gbc);
            
            gbc.gridx=0;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadPassLabel,gbc);
            gbc.gridx=1;
            gbc.gridy=3;
            gbc.insets = new Insets(0,0,0,0);
            add(uploadPass,gbc);
        }            
    }
}
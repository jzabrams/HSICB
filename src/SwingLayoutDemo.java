

import java.awt.*;
import javax.swing.*;

public class SwingLayoutDemo {

    public static void main(String[] args) {
        new SwingLayoutDemo();
    }

    GridBagConstraints gbc = new GridBagConstraints();
    
    public SwingLayoutDemo() {
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
                
                 frame.setSize(600,700);
                
                
                gbc.gridx=0;
                gbc.gridy=2;
                frame.add(new Pane5(),gbc);
                
                gbc.gridx=1;
                gbc.gridy=2;
                frame.add(new Pane4(),gbc);
                
                gbc.gridx=1;
                gbc.gridy=3;
                frame.add(new Pane3(),gbc);
                
                
                gbc.gridwidth=2;
                gbc.gridx=0;
                gbc.gridy=0;
                frame.add(new Pane1(),gbc);
                
                
                
                gbc.gridwidth=2;
                gbc.gridx=0;
                gbc.gridy=1;
                frame.add(new Pane2(),gbc);
                
                
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
    
    protected class Pane2 extends JPanel {

        public Pane2() {
            setLayout(new GridBagLayout());

            JPanel buttonPane = new JPanel(new GridBagLayout());

            JButton btnOkay = new JButton("Ok");
            JButton btnCancel = new JButton("Cancel");
            JButton btnCancel1 = new JButton("Cancel2");

            JTextArea textArea = new JTextArea(1, 4);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPane.add(btnOkay, gbc);
            gbc.gridy++;
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel, gbc);
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel1, gbc);
           

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 20, 20, 20);
            add(buttonPane, gbc);

            gbc.insets = new Insets(30, 20, 30, 20);
            gbc.gridx++;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            add(new JScrollPane(textArea), gbc);                
        }            
    } 
    
    protected class Pane3 extends JPanel {

        public Pane3() {
            setLayout(new GridBagLayout());

            JPanel buttonPane = new JPanel(new GridBagLayout());

            JButton btnOkay = new JButton("Ok");
            JButton btnCancel = new JButton("Cancel");
            JButton btnCancel1 = new JButton("Cancel2");

            JTextArea textArea = new JTextArea(1, 4);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPane.add(btnOkay, gbc);
            gbc.gridy++;
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel, gbc);
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel1, gbc);
           

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 20, 20, 20);
            add(buttonPane, gbc);

            gbc.insets = new Insets(30, 20, 30, 20);
            gbc.gridx++;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            add(new JScrollPane(textArea), gbc);                
        }            
    } 
    
    protected class Pane4 extends JPanel {

        public Pane4() {
            setLayout(new GridBagLayout());

            JPanel buttonPane = new JPanel(new GridBagLayout());

            JButton btnOkay = new JButton("Ok");
            JButton btnCancel = new JButton("Cancel");
            JButton btnCancel1 = new JButton("Cancel2");

            JTextArea textArea = new JTextArea(1, 4);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPane.add(btnOkay, gbc);
            gbc.gridy++;
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel, gbc);
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel1, gbc);
           

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 20, 20, 20);
            add(buttonPane, gbc);

            gbc.insets = new Insets(30, 20, 30, 20);
            gbc.gridx++;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            add(new JScrollPane(textArea), gbc);                
        }            
    } 
    
    protected class Pane5 extends JPanel {

        public Pane5() {
            setLayout(new GridBagLayout());

            JPanel buttonPane = new JPanel(new GridBagLayout());

            JButton btnOkay = new JButton("Ok");
            JButton btnCancel = new JButton("Cancel");
            JButton btnCancel1 = new JButton("Cancel2");

            JTextArea textArea = new JTextArea(1, 4);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPane.add(btnOkay, gbc);
            gbc.gridy++;
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel, gbc);
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel1, gbc);
           

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 20, 20, 20);
            add(buttonPane, gbc);

            gbc.insets = new Insets(30, 20, 30, 20);
            gbc.gridx++;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            add(new JScrollPane(textArea), gbc);                
        }            
    } 
    
    protected class Pane6 extends JPanel {

        public Pane6() {
            setLayout(new GridBagLayout());

            JPanel buttonPane = new JPanel(new GridBagLayout());

            JButton btnOkay = new JButton("Ok");
            JButton btnCancel = new JButton("Cancel");
            JButton btnCancel1 = new JButton("Cancel2");

            JTextArea textArea = new JTextArea(1, 4);
            
            JLabel marker = new JLabel ("6");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            
           
            
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPane.add(btnOkay, gbc);
            gbc.gridy++;
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel, gbc);
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel1, gbc);
           

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 20, 20, 20);
            add(buttonPane, gbc);

            gbc.insets = new Insets(30, 20, 30, 20);
            gbc.gridx++;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            add(new JScrollPane(textArea), gbc); 
            
            gbc.gridx = 1;
            gbc.gridy = 1;
            
            add (marker);
        }            
    } 
    
    protected class Pane7 extends JPanel {

        public Pane7() {
            setLayout(new GridBagLayout());

            JPanel buttonPane = new JPanel(new GridBagLayout());

            JButton btnOkay = new JButton("Ok");
            JButton btnCancel = new JButton("Cancel");
            JButton btnCancel1 = new JButton("Cancel2");

            JTextArea textArea = new JTextArea(1, 4);
            
            JLabel marker = new JLabel ("7");

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            
           
            
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPane.add(btnOkay, gbc);
            gbc.gridy++;
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel, gbc);
            gbc.insets = new Insets(10, 0, 0, 0);
            buttonPane.add(btnCancel1, gbc);
           

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 20, 20, 20);
            add(buttonPane, gbc);

            gbc.insets = new Insets(30, 20, 30, 20);
            gbc.gridx++;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            add(new JScrollPane(textArea), gbc); 
            
            gbc.gridx = 1;
            gbc.gridy = 1;
            
            add (marker);
        }            
    }
}
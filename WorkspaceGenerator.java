/*
	Testing tool that 
	
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SimpleGUI {
	SimpleGUI(){    
		JFrame f=new JFrame("Benthic Workspace File Generator"); 
		
		
		// 	SUBMIT BUTTON
		JButton submitButt=new JButton("Submit");    
		submitButt.setBounds(100,100,140, 40);

		
		//	LABEL FOR textfield 
		JLabel groupNamePrompt = new JLabel();		
		groupNamePrompt.setText("Enter Group Name:");
		groupNamePrompt.setBounds(10, 10, 100, 100);
		
		
		//	Empty label for displaying the outcome of the search for the Group Name
		//	entered in textfield when the submit button is clicked
		JLabel outcome = new JLabel();
		outcome.setBounds(10, 110, 200, 100);
		
		
		
		//	Textfield for the user to enter the Group Name 
		JTextField nameEntered= new JTextField();
		nameEntered.setBounds(110, 50, 130, 30);
		
		
		//	Add all of the above objects into the frame
		f.add(outcome);
		f.add(nameEntered);
		f.add(groupNamePrompt);
		f.add(submitButt);    
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
		
		//	Action Listener that is waiting for the submit button to be clicked
		submitButt.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					// Call to WorkSpace Generator with the current value in textField.
					// The WSG function should return NULL if the groupName entered is in the database AND WS successfully generates
					// otherwise, returns a String containing an Error Msg
					String groupName = nameEntered.getText();
					if(wsg.is(groupName) == null)
						outcome.setText("File Successfully Created.");	
					else
						outcome.setText("An Error Has Occured.");
			}          
	      });
		}         
	
		//	Very Simple GUI Main. 
		//	A MISLEADING name that I should probably change
	public static void main(String[] args) {  
		    new SimpleGUI();    
		}    
 }
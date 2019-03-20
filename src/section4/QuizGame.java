package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		System.out.println("What is a 9 squared");
		String ans1 = JOptionPane.showInputDialog(null, "");
		// 3.  Use an if statement to check if their answer is correct
		if (ans1.equals("81")) {
			 score ++;
		}
		
	System.out.println("What is a 6 squared");
	String ans2 = JOptionPane.showInputDialog(null, "");
	// 3.  Use an if statement to check if their answer is correct
	if (ans2.equals("36")) {
		 score ++;
	}
	System.out.println("What is a 11 squared");
	String ans3 = JOptionPane.showInputDialog(null, "");
	// 3.  Use an if statement to check if their answer is correct
	if (ans3.equals("121")) {
		 score ++;
	}
	System.out.println(""+score);
	}
	
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}


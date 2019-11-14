//This program uses dialog boxes and 3 parallel arrays. You can enter a 4 digit number to fins a student's name and GPA.
//CSIS 212 - Fall 2019 B03



import javax.swing.JOptionPane; //import JOptionPane to use a dialog box

public class Assignment1 {
    
    public static void main(String [] args){
                
        //initialize arrays
        String[] studentID = new String[] { "0001", "0002", "0003", "0004", "0005", "0006", "0007", "0008", "0009", "0010"};
        
        String[] name = new String[] {"Michael", "Jim", "Dwight", "Pam", "Kevin", "Angela", "Andy", "Toby", "Creed", "Oscar"};
        
        double[] gpa = new double[] { 2.7, 3.5, 3.4, 3.0, 2.0, 4.0, 3.3, 3.2, 2.7, 1.9, 3.8}; 
        
        //initialize input variable from user
        String student;
      
        
        //loop while input dialog is NOT null
        while ( (student = JOptionPane.showInputDialog(null, "Alex Jones - Final Assignment 1\n \nEnter Student ID: ")) != null ){
            
            boolean found = false;
            
            
            //validate the student number input by the user, if a match is found the message displays the name and GPA
            for(int i = 0; i < studentID.length; i++){
                
                //used student.equals instead of == because I am comparing Strings
                if( student.equals(studentID[i]) ){
                    
                    JOptionPane.showMessageDialog(null, "Name: " + name[i] + "\nAverage: " + gpa[i], "Student", JOptionPane.INFORMATION_MESSAGE);
                    
                    found = true;
                
                    break;
                }
               
                
            }
         
         //if a match is not found, the following message displays
         if ( ! found ){
             
             JOptionPane.showMessageDialog( null, "No Match Found. \nHint: Use Numbers 0001 - 0010", "Student", JOptionPane.INFORMATION_MESSAGE);
         }
                
        }
       
    }
    
}

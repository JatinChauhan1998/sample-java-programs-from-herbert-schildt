import javax.swing.*;
import java.awt.event.*;
/*
 * This is a Sample Java project
 * to build a Simple Calculator based 
 * on Java Swing.
 * This calculator is the basic version
 * and can only operate using two operands
 * Thus, making it less complicated for the beginners
 * Feel free to contact for any queries
 * https://github.com/JatinChauhan1998
 * */ 

//class implementing the ActionListener interface to recognize mouse actions
class Calc implements ActionListener
{
    JFrame f;//to make a frame so as to put necessary elements on it
    JTextField t; //text field where you can put operands and display the results
    //initializing the buttons
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
    
    
    //initializing the operands and the result
    static double a=0,b=0,result=0;
    static int operator=0;
    
    //Calc(), is a constructor that will be initialized at the 
    //beginning of the program where the main function starts
    Calc()
    {
    	//initializing the buttons
        f=new JFrame("Calculator");
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("X");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("CC");
        bclr=new JButton("C");
        
        
        //setting the bounds where each element will obtain a unique space.
        //NOTE- THE ORIGIN STARTS FROM THE TOP LEFT CORNER OF THE FRAME
        t.setBounds(0,0,200,30); // TEXT filed bounds
                
        b7.setBounds(0,30,50,40);
        b8.setBounds(50,30,50,40);
        b9.setBounds(100,30,50,40);
        bdiv.setBounds(150,30,50,40);
        
        b4.setBounds(0,70,50,40);
        b5.setBounds(50,70,50,40);
        b6.setBounds(100,70,50,40);
        bmul.setBounds(150,70,50,40);
        
        b1.setBounds(0,110,50,40);
        b2.setBounds(50,110,50,40);
        b3.setBounds(100,110,50,40);
        bsub.setBounds(150,110,50,40);
        
        bdec.setBounds(0,150,50,40);
        b0.setBounds(50,150,50,40);
        beq.setBounds(100,150,50,40);
        badd.setBounds(150,150,50,40);
        
        bdel.setBounds(0,190,100,40);
        bclr.setBounds(100,190,100,40);
        
        //adding the elements to the main frame
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);
        
        //basic frame initialization
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(200,260);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        //implementing the action listener to
        //detect the click on the JButtons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
    }
    
    
    //This method is to perform the necessary functions
    //after the mount click is initiated on the JButton
    //and the operands is loaded in the TextField
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        
        //Addition
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        //Subtraction
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        //Multiplication
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        //Division
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        
        //Equals to..
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
        
            switch(operator) // Different switch cases for different operators
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            t.setText(""+result);
        }
        
        if(e.getSource()==bclr)
            t.setText("");
        
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
    }
    
    //Main method
    //from where the execution begins
    public static void main(String...s)
    {
        new Calc();//calling the Calc() constructor
    }
}
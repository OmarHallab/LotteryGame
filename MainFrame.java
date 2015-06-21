import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class MainFrame extends JFrame {
	
	
	// 6 Lotto balls 
	private LottoBall b1 = new LottoBall();
	private LottoBall b2 = new LottoBall();
	private LottoBall b3 = new LottoBall();
	private LottoBall b4 = new LottoBall();
	private LottoBall b5 = new LottoBall();
	private LottoBall b6 = new LottoBall();
	
	// 4 Lotto Sets
	private LottoSet s1 = new LottoSet();
	private LottoSet s2 = new LottoSet();
	private LottoSet s3 = new LottoSet();
	private LottoSet s4 = new LottoSet();

	// 3 buttons 
	private JButton Start = new JButton("Start");
	private JButton Reset = new JButton("Reset");
	private JButton Result = new JButton("Result");
	
	//4 Text fields for each set
	    private JTextField r1 = new JTextField("    Check six numbers in the set to start game");
	    private JTextField r2 = new JTextField("    Check six numbers in the set to start game");
	    private JTextField r3 = new JTextField("    Check six numbers in the set to start game");
	    private JTextField r4 = new JTextField("    Check six numbers in the set to start game");
	    
	    private int[] shuffle= new int[42];
	    int ck1;
	    int ck2;
	    int ck3;
	    int ck4;
	    
	    int selected = 0;
	    
	    private CoverPage cp = new CoverPage();
	    
	    
	   public MainFrame(){
		   
		   
		   Border Line = LineBorder.createBlackLineBorder();
		    b1.setBackground(Color.orange);
		    b1.setBorder(Line);
	        b2.setBackground(Color.orange);
	        b2.setBorder(Line);
	        b3.setBackground(Color.orange);
	        b3.setBorder(Line);
	        b4.setBackground(Color.orange);
	        b4.setBorder(Line);
	        b5.setBackground(Color.orange);
	        b5.setBorder(Line);
	        b6.setBackground(Color.orange);
	        b6.setBorder(Line);
	        s1.setBackground(Color.orange);
	        s2.setBackground(Color.orange);
	        s3.setBackground(Color.orange);
	        s4.setBackground(Color.orange);
	        
	        
	        Start.setBackground(Color.GRAY);
	        Start.setFont(new Font("Times new Roman",Font.BOLD,25));
	        Start.setBorder(Line);
	        Reset.setBackground(Color.GRAY);
	        Reset.setFont(new Font("Times new Roman",Font.BOLD,25));
	        Reset.setBorder(Line);
	        Result.setBackground(Color.GRAY);
	        Result.setFont(new Font("Times new Roman",Font.BOLD,25));
	        Result.setBorder(Line);
		   
	        
	        r1.setBackground(Color.white);
	        r1.setFont(new Font("Times New Roman",Font.BOLD,20));
	        r1.setForeground(Color.BLACK);
	        r1.setBorder(Line);
	        r2.setBackground(Color.white);
	        r2.setFont(new Font("Times New Roman",Font.BOLD,20));
	        r2.setForeground(Color.BLACK);
	        r2.setBorder(Line);
	        r3.setBackground(Color.white);
	        r3.setFont(new Font("Times New Roman",Font.BOLD,20));
	        r3.setForeground(Color.BLACK);
	        r3.setBorder(Line);
	        r4.setBackground(Color.white);
	        r4.setFont(new Font("Times New Roman",Font.BOLD,20));
	        r4.setForeground(Color.BLACK);
	        r4.setBorder(Line);
	        
	       

	
	        JPanel p1=new JPanel();
	        p1.setLayout(new GridLayout(2,4));
	      
	        
	        p1.add(r1);
	        p1.add(r2);
	        p1.add(r3);
	        p1.add(r4);
	        p1.add(s1);
	        s1.setBorder(Line);
	        p1.add(s2);
	        s2.setBorder(Line);
	        p1.add(s3);
	        s3.setBorder(Line);
	        p1.add(s4);
	        s4.setBorder(Line);
	        
	      
	        
	        
	        JPanel p2=new JPanel();
	        p2.setLayout(new GridLayout(1,6));
	        p2.add(b1);
	        b1.setBorder(Line);
	        p2.add(b2);
	        b2.setBorder(Line);
	        p2.add(b3);
	        b3.setBorder(Line);
	        p2.add(b4);
	        b4.setBorder(Line);
	        p2.add(b5);
	        b5.setBorder(Line);
	        p2.add(b6);
	        b6.setBorder(Line);
	        
	        JPanel p3 = new JPanel();
	        p3.setLayout(new GridLayout(1,1));
	        p3.add(cp);
	        cp.setFocusable(true);
	        
	        
	        JPanel p4 = new JPanel();
	        p4.setBorder(Line);
	        p4.setLayout(new GridLayout(2,1));
	        p4.add(p2);
	        p4.add(p3);
	        add(p1,BorderLayout.SOUTH);
	        add(p4, BorderLayout.CENTER);
	    
	        
	        
	        JPanel p5 = new JPanel();
	        p5.setLayout(new GridLayout(3,1));
	        p5.add(Start);
	        Start.setToolTipText("Push to start game");
	        p5.add(Reset);
	        Reset.setToolTipText("Push to restart game");
	        p5.add(Result);
	        Result.setToolTipText("Push to see ending results");
	       
	        add(p5, BorderLayout.EAST);
	        p5.setBorder(Line);
	        
	        
	        // Button ActionListeners 
	        Start.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {

	                   if(selected == 0){
	                	   selected = 1;
	                   }
	                   
	                    
	                SwapNbs();
	                
	                b1.start();
	                b1.t0 = System.currentTimeMillis();
	                
	                b2.start();
	                b2.t0 = System.currentTimeMillis();
	                
	                b3.start();
	                b3.t0 = System.currentTimeMillis();
	                
	                b4.start();
	                b4.t0 = System.currentTimeMillis();
	                
	                b5.start();
	                b5.t0 = System.currentTimeMillis();
	                
	                b6.start();
	                b6.t0 = System.currentTimeMillis();
	                
	                
	                ck1 = s1.checked();
	                ck2 = s2.checked();
	                ck3 = s3.checked();
	                ck4 = s4.checked();
	                
	                
	                
	                if(ck1==6){
	                    r1.setText("the game has started \n Please wait a moment..");
	                }else{
	                    r1.setText("       Must check off six boxes to proceed");
	                    
	                }
	                
	                
	                if(ck2==6){
	                    r2.setText("the game has started \n Please wait a moment..");
	                }else{
	                    r2.setText("       Must check off six boxes to proceed");
	                    
	                }
	                
	                
	                if(ck3==6){
	                    r3.setText("the game has started \n Please wait a moment..");
	                }else{
	                    r3.setText("       Must check off six boxes to proceed");
	                    
	                }
	                
	               
	                if(ck4==6){
	                    r4.setText("the game has started \n Please wait a moment..");
	                } else{
	                    r4.setText("       Must check off six boxes to proceed");
	                
	                }
	                   
	            }
	        });
		  
	        Reset.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {

	             s1.uncheck();
	             s2.uncheck();
	             s3.uncheck();
	             s4.uncheck();
	            	
	            	
	                b1.reset();
	                b2.reset();
	                b3.reset();
	                b4.reset();
	                b5.reset();
	                b6.reset();
	                
	                
	                r1.setText("check six numbers in this set to start game");
	                r2.setText("check six numbers in this set to start game");
	                r3.setText("check six numbers in this set to start game");
	                r4.setText("check six numbers in this set to start game");
	                

	            }
	        });
	        
	        Result.addActionListener(new ActionListener() {
	        	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            
	            	cp.repaint();
	            	
	             if(selected == 1){
	                
	                ck1 = s1.checked();
	                ck2 = s2.checked();
	                ck3 = s3.checked();
	                ck4 = s4.checked();
	                
	               
	                
	                if(ck1==6){
	
	                int counter1 = 0;
	              
	                    for(int i = 0;i<6;i++){
	                    	
	                        for(int j =0;j<6;j++){
	                        	
	                        if(shuffle[i] == s1.checking()[j]){
	                        	
	                            counter1++;
	                        }
	                       String s= shuffle[i]+" ";
	                       
	                        }
	                    }
	                    
	                    if(counter1!=0){
	                    	
	                        r1.setText("you'v got "+counter1+" equal numbers");
	                    }
	                    if(counter1==0){
	                    	
	                        r1.setText("Sorry, you lost. Try Again :)");
	                    }
	                }
	                 
	                
	                if(ck2==6){
	                	
	                int counter2 = 0;
	                    for(int i = 0;i<6;i++){
	                    	
	                        for(int j =0;j<6;j++){
	                        	
	                        if(shuffle[i] == s2.checking()[j]){
	                        	
	                            counter2++;
	                        }
	                        }
	                    }
	                    if(counter2!=0){
	                        r2.setText("you'v got "+counter2+" equal numbers");
	                    }
	                    if(counter2==0){
	                        r2.setText("Sorry, you lost. Try Again :)");
	                    }
	                }
	              
	                
	                if(ck3==6){
	                	
	                int counter3 = 0;
	                    for(int i = 0;i<6;i++){
	                    	
	                        for(int j =0;j<6;j++){
	                        	
	                        if(shuffle[i] == s3.checking()[j]){
	                            counter3++;
	                        }
	                        }
	                    }
	                    
	                    if(counter3!=0){
	                        r3.setText("you'v got "+counter3+" equal numbers");
	                    }
	                    if(counter3==0){
	                        r3.setText("Sorry, you lost. Try Again :)");
	                    }
	                }
	                
	                
	                if(ck4==6){
	                	
	                int counter4 = 0;
	                    for(int i = 0;i<6;i++){
	                    	
	                        for(int j =0;j<6;j++){
	                        	
	                        if(shuffle[i] == s4.checking()[j]){
	                            counter4++;}
	                        }
	                    }
	                    if(counter4!=0){
	                        r4.setText("you'v got "+counter4+" equal numbers");
	                    }
	                    if(counter4 ==0){
	                        r4.setText("Sorry, you lost. Try Again :)");
	                    }
	                    
	                    
	                 
	                }
	                
	               
	                }
	                
	               
	            }
	            
	            
	          
	        });
	        
	        
	        
	        
	        for(int i = 1; i<=42;i++){
	            shuffle[i-1]=i;
	        }
	   }
	   public void SwapNbs(){
	        int fnb;
	        for(int i = 1; i<100;i++){
	        	
	            int r1 = (int) (Math.random()*42);
	            int r2 = (int) (Math.random()*42);
	            
	            fnb = shuffle[r1];
	            
	            shuffle[r1]= shuffle[r2];
	            
	            shuffle[r2]= fnb;
	            
	        }
	        
	            b1.Ballnb = shuffle[0];
	            b2.Ballnb = shuffle[1];
	            b3.Ballnb = shuffle[2];
	            b4.Ballnb = shuffle[3];
	            b5.Ballnb = shuffle[4];
	            b6.Ballnb = shuffle[5];
	    }
	   
	   
	   public class CoverPage extends JPanel {
		   
		   
		   
		   public void paintComponent(Graphics g){
			   super.paintComponent(g);
			   
			   g.setFont(new Font("Times New Roman",Font.BOLD,40));
			   g.setColor(Color.BLUE);
  		       g.drawString("The last winning numbers are :" +b1.n+"  " +b2.n +"  "+b3.n+"  "+b4.n+"  "+b5.n +"  "+b6.n, 300, 250);
			   setBackground(Color.gray);
			   g.setColor(Color.PINK);
			   g.setFont(new Font("Calibri",Font.ITALIC,50));
	           g.drawString("to the lottery Game",50 ,100 );
	           g.setColor(Color.PINK);
	           g.setFont(new Font("Calibri",Font.ITALIC,50));
	           g.drawString(" Welcome ", 50, 50);
	           g.setColor(Color.PINK);
	           g.setFont(new Font("Calibri",Font.BOLD,60));
	           g.drawString("By Omar Hallab", 800, 100);
	           
	          
	      
	         
	           
			   
		   }
		   
		  	   }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainFrame frame = new MainFrame();
		System.out.println("Lottery game initiated!");
	    frame.setSize(1800, 720);
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Lottery");
	    frame.setVisible(true);
	   
	    }

	}



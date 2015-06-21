import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LottoBall extends JPanel {
	
	 private int nb;
	 int Ballnb;
	 protected int n = 0;
	 protected long t0;
	 protected Timer timer ;
	 protected int start =1 ;
	 protected int reset = 0;

	 
	 public LottoBall(){
		 this.nb = 0;
	 }
	
	   public void paintComponent (Graphics g){
		   
		   
	        super.paintComponent(g);
	        
	        if(nb == start ){
	        	
	        timer = new Timer(100, new TimerListener());
	        timer.start(); 
	        
	        
	        super.paintComponent(g);
	        g.fillOval(30, 30, 110, 110);
	        g.setColor(Color.WHITE);
	        g.fillOval(51, 43, 80, 80);
	        n = (int) (Math.random()*42);
	        g.setFont(new Font("Times New Roman",Font.BOLD,50));
	        g.setColor(Color.black);
	        g.drawString(n+ "", 69, 99);
	        g.setColor(Color.red);
	        
	        
	        if (System.currentTimeMillis() - t0 > 3 * 1000) {
	        	
	                  timer.stop();
	           super.paintComponent(g);
	           n=Ballnb;
	           
	           g.fillOval(30, 30, 110, 110);
	           g.setColor(Color.WHITE);
	           g.fillOval(50, 45, 80, 80);
	           g.setColor(Color.BLUE);
	           g.drawString(n+ "", 69, 99);
	         
	           
	          }
	     
	        }
	            if(nb == reset ){
	            	n =0;
	                super.paintComponent(g);
	                g.setColor(Color.black);
	                g.fillOval(30, 30, 110, 110);
	                g.setColor(Color.WHITE);
	                g.fillOval(50, 45, 80, 80);
	                g.drawString(n+"", 69, 99);
	                
	                

	            }
	        }
	   
	   
    public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public void reset(){
	        nb=reset;
	        repaint();
	    }
	    public void start(){
	    	
	        nb=start;
	        repaint();
	    }
	
	      class TimerListener implements ActionListener {
	               public void actionPerformed(ActionEvent e) {
                               repaint();
}                          }
                        }
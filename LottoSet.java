import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LottoSet extends JPanel {
	
	 private JCheckBox[] cBox=new JCheckBox[43];
	 
	
	    protected int nbchkd[];
	    protected int chkd = 0;
	    
	    
	    public LottoSet(){
	    	// The set panel constructor  
	        setLayout(new GridLayout(6,7));
	        
	       for (int i=1;i<=42;i++){

	           cBox[i]=new JCheckBox(" "+i+"");
	           add(cBox[i]);
	           
	           
	           cBox[i].setBackground(Color.orange);
	           cBox[i].setForeground(Color.BLACK);
	           }
	       }
	   
	    
	    public void uncheck(){
	    	 for (int i=1;i<=42;i++){
	    	cBox[i].setSelected(false);
	    	
	    	 }
	    }
	    
	    
	    public int checked(){
	    	
	        int counter =0;
	        
	        for (int i=1;i<=42;i++){
	        	
	            if(cBox[i].isSelected())
	            	
	                counter++;
	            
	          
	            	
	        }
	            
	        
	        // count how many checked in set 
	        return counter;
	    }
	    
	    
	    public int[] checking(){
	    	
	        int chking=0;
	        int[] nbchkd = new int[6];
	        
	        // 6 boxes to check
	        //send back array of checkd numbered boxes with specified number
	        
	        for (int j=1;j<=42;j++){
	        	
	        	
	            if(cBox[j].isSelected()){
	            	
	                nbchkd[chking]= j;
	                chking++;
	            }
	            	
	        }
	        return nbchkd;
	    }
	}



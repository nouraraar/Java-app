import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class EcoQuitter  implements ActionListener{
      TacheComplexeSwing t;
      
	 public EcoQuitter (TacheComplexeSwing t) 
	     {this.t=t;}
	
     public void actionPerformed(ActionEvent ev )
	     {t.fenetre.dispose();}
     
	}



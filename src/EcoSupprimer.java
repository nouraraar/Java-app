import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class EcoSupprimer implements ActionListener {
	TacheComplexeSwing t;
	
	  public EcoSupprimer (TacheComplexeSwing t)
	    {this.t=t;}
	
	  public void actionPerformed(ActionEvent ev )
	    {Iterator<Tache> it=t.tache.sousTaches.iterator();
	     String nom=t.valeurNom.getText();
           while(it.hasNext())
	        { if(it.next().getNom().equals(nom))
	         {it.remove();}
	        }
	   }
}

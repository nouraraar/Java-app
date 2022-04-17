import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;


 public class EcoAfficher implements ActionListener {
    TacheComplexeSwing t;
   
    
    public EcoAfficher (TacheComplexeSwing t)
      {this.t=t;
      t.text.append(t.tache.getNom()+ ":"+"\n");}
    
    public void actionPerformed(ActionEvent ev )
      { Iterator<Tache> it=t.tache.sousTaches.iterator();
        
        while(it.hasNext())
  	  {TacheElementaire ta=(TacheElementaire) it.next();
	    t.text.append( ta.getNom()+"=");
	    t.text.append( ta.getCout()+"\n");
	    t.text.setEditable(false);
	  }
        
       }
    
  }
  
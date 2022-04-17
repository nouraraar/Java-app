import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class EcoAjouter implements ActionListener {
	 TacheComplexeSwing t;	
	 
     public EcoAjouter (TacheComplexeSwing t)
	    {this.t=t;}
     
	 public void actionPerformed (ActionEvent ev){
		try{
		    String nom=t.valeurNom.getText();int cout=Integer.parseInt(t.valeurCout.getText());
		    TacheElementaire soustache=new TacheElementaire(nom,cout);
		    if(!t.tache.sousTaches.contains(soustache))
		     {t.tache.sousTaches.add(soustache);
		    System.out.println(t.tache.sousTaches.size());}
		    else 
		    	t.text.append("l element existe deja");
		  }
			catch(NumberFormatException e){t.valeurCout.setBackground(Color.RED);}
	}
}


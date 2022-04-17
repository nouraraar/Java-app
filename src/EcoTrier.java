import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

public class EcoTrier implements ActionListener {
	TacheComplexeSwing t;
	 
	
	 public EcoTrier (TacheComplexeSwing t)
	   {this.t=t;}
	 
	 public void actionPerformed(ActionEvent e) 
		{String selectedchoice = (String) t.liste.getSelectedItem ();
		   if(selectedchoice.contentEquals("trie par cout"))
		     { PriorityQueue<Tache> trie1=new PriorityQueue<Tache>(new CoutComparateur());
		       for(Tache x : t.tache.sousTaches) 
			    trie1.add(x);
		       t.text.append("la liste triée : \n");
		       while(!trie1.isEmpty())
		       { Tache p=trie1.poll();
		 	    t.text.append( p.getNom()+"=");
		 	    t.text.append( p.getCout()+"\n");
		 	    t.text.setEditable(false);
		    	   System.out.println(p.getNom()+"="+p.getCout() +"\n");//AFFICHAGE DANS LA CONSOLE 
		       } 
		}

		else 
			
		    { PriorityQueue<Tache> trie2=new PriorityQueue<Tache>(new NomComparateur());
		      for(Tache x :  t.tache.sousTaches) 
			  trie2.add(x);
		      t.text.append("la liste triée : \n");
			       while(!trie2.isEmpty())
			       { Tache p=trie2.poll();
			        t.text.append( p.getNom()+"=");
			 	    t.text.append( p.getCout()+"\n");
			 	    t.text.setEditable(false);
			    	   System.out.println(p.getNom()+"="+p.getCout() +"\n");//AFFICHAGE DANS LA CONSOLE 
			       } 
		    }

      }
	 
}
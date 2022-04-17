import java.util.PriorityQueue;

public class TacheComplexe {
	public  PriorityQueue<Tache> sousTaches;
	private String nom;
	
	   public TacheComplexe(String nom) 
				{this.nom = nom;
				 this.sousTaches =new PriorityQueue<Tache>();}

	   public String getNom() 
			{return this.nom;}
	   
}

public class TacheElementaire implements Tache , Comparable<Tache> {
	private String nom;
	private int cout;
	
     public TacheElementaire (String nom , int cout )	
      {this.nom=nom;
       this.cout=cout;}

     public String getNom ()
      {return this.nom;}
     
    public int getCout ()
      {return this.cout ;}
    
    public int compareTo(Tache o) {
	if(this.getNom().equals(o.getNom()))
		return 1 ;
	else
	return 0;}

 }



import java.util.Comparator;

 public class CoutComparateur implements Comparator<Tache> {
	 
	public int compare(Tache o1, Tache o2) 
	   {if (o1.getCout()>o2.getCout()) 
            return 1;
        
        else if  (o1.getCout()<o2.getCout()) 
            return -1;
	   
        else return 0;    
       
    
    }
	
}

import java.util.Comparator;

public class NomComparateur implements Comparator<Tache> {
	
		public int compare(Tache o1, Tache o2) {
			String first_Str=o1.getNom();
			String second_Str=o2.getNom();
		return first_Str.compareTo(second_Str);}

}



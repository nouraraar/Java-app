import javax.swing.*;
import java.awt.*;
public class TacheComplexeSwing {
	 JFrame fenetre = new JFrame("Nouvelle tache");
	 JTextField valeurNom = new JTextField(10);
	 JTextField valeurCout = new JTextField(10);
 private JButton boutonAjouter = new JButton("Ajouter");
 private JButton boutonQuitter = new JButton("Quitter");
 private JButton boutonAfficher = new JButton("Afficher");
 private JButton boutonSupprimer = new JButton("Supprimer");
 private JButton boutonTrier = new JButton("Trier");
    String[] choix={"trie par nom", "trie par cout"};
    JTextArea text;
        
      
    
 public JComboBox<String> liste=new JComboBox<String>(choix); 
    TacheComplexe tache;
    Container c;

 public TacheComplexeSwing(TacheComplexe tache) 
   {this.tache=tache;
    text= new JTextArea(2,3); 
   
    c = fenetre.getContentPane();
    c.setLayout(new BorderLayout());
    c.add(text,BorderLayout.CENTER);
    JPanel  informations = new JPanel(new GridLayout(2,2));
            informations.add(new JLabel("Nom : ", SwingConstants.RIGHT));
            informations.add(valeurNom);
            informations.add(new JLabel("Cout : ", SwingConstants.RIGHT));
            informations.add(valeurCout);
    c.add(informations, BorderLayout.WEST);
    
    
  JPanel boutons = new JPanel(new FlowLayout());
         boutons.add(boutonAjouter);
         boutons.add(boutonQuitter);
         boutons.add(boutonAfficher);
         boutons.add(boutonSupprimer);
         boutons.add(boutonTrier);
         boutons.add(liste);
  c.add(boutons, BorderLayout.SOUTH);
  
EcoQuitter e=new EcoQuitter(this);
boutonQuitter.addActionListener(e);

EcoAjouter e1=new EcoAjouter(this);
boutonAjouter.addActionListener(e1);

EcoAfficher e2=new EcoAfficher(this);
boutonAfficher.addActionListener(e2);

EcoSupprimer e3=new EcoSupprimer(this);
boutonSupprimer.addActionListener(e3);

EcoTrier e4=new EcoTrier(this);
boutonTrier.addActionListener(e4);

   fenetre.pack();
   fenetre.setVisible(true);}

public static void main (String [] args)
{TacheComplexeSwing t = new TacheComplexeSwing (new TacheComplexe("Test Tache Complexe"));} 
}

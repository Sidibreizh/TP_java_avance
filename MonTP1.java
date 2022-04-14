package TP1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MonTP1 extends JFrame implements WindowListener{

    // declaration des composants
    private JLabel lbl_etatCivil, lbl_nom, lbl_prenom, lbl_annee;
    private JLabel lbl_pref, lbl_commentaire, lbl_image;
    private JComboBox cbb_etatCivil;
    private JTextField tf_nom, tf_prenom, tf_autre; // autre : en option TP1
    private JRadioButton rb_1A, rb_2A;
    private ButtonGroup groupAnnee;
    private JCheckBox ckb_robotique, ckb_jeuEchec, ckb_jeuGo, ckb_libres, ckb_autre;
    private JComboBox cbb_niveauR;
    private JComboBox cbb_niveauG;
    private JComboBox cbb_niveauE;
    private JComboBox cbb_niveauL;
    private JComboBox cbb_niveauA; // option
    private JTextArea ta_commentaire;
    private JButton bt_ajouter, bt_modifier, bt_suppr;

    // declaration des panneaux necessaires (en attribut car utilisés par 2 fonctions)
    private JPanel pannImageEtatCivil, pannNomPrenomAnneePref, pannPrefNiveaux,
            pannCommentaire, pannBoutons;

    // constructeurs
    public MonTP1(String title) {
        super(title);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MonTP1() {
        initComponents();
        this.setTitle("Sondage Clubs Etudiant");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // initialisation des composants
    private void initComponents() {

        // definition des composants
        lbl_etatCivil = new JLabel("Etat civil:");
        lbl_nom = new JLabel("Nom:");
        lbl_prenom = new JLabel("Prénom:");

        // label image (projet Maeven : cf structure des fichiers)
        //lbl_image = new JLabel(new ImageIcon("src/main/java/gif/garcon.jpg"));
        ImageIcon userIcon = new ImageIcon("src/main/java/gif/garcon.jpg");
        Image userImage = userIcon.getImage(); // transform it
        Image newUser = userImage.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        userIcon = new ImageIcon(newUser);  // transform it back
        lbl_image = new JLabel(userIcon);

        lbl_annee = new JLabel("Année:");
        lbl_pref = new JLabel(" Préférences:");
        lbl_commentaire = new JLabel("Commentaire:");
        // définit une textarea de 5 lignes et 15 caract. de large
        ta_commentaire = new JTextArea(5, 35);
        ta_commentaire.setText("(Mentionnez si vous êtes prêt à animer un club)");

        cbb_etatCivil = new JComboBox();
        cbb_etatCivil.addItem("M.");
        cbb_etatCivil.addItem("Mme");

        tf_nom = new JTextField(12);
        tf_prenom = new JTextField(12);
        tf_autre = new JTextField(10); // option

        // Def des comboBox : on doit redéfinir n fois la même comboBox car un
        // élément ne peut être ajouté qu'une fois à un conteneur +
        // gestion des evts pour chaque CBBox
        String[] niveaux = {"Debutant", "Moyen", "Expert"};
        cbb_niveauR = new JComboBox(niveaux);
        cbb_niveauG = new JComboBox(niveaux);
        cbb_niveauE = new JComboBox(niveaux);
        cbb_niveauL = new JComboBox(niveaux);
        cbb_niveauA = new JComboBox(niveaux);          // ajout option TP1

        ckb_robotique = new JCheckBox("Robotique");
        ckb_jeuEchec = new JCheckBox("Jeu Echec");
        ckb_jeuGo = new JCheckBox("Jeu de Go");
        ckb_libres = new JCheckBox("Logiciels libres");
        ckb_autre = new JCheckBox("Autre");         // en option TP1

        rb_1A = new JRadioButton("1A");
        rb_2A = new JRadioButton("2A");
        // ajout des RB au même groupe de boutons pour gerer les exclusions :
        groupAnnee = new ButtonGroup();
        groupAnnee.add(rb_1A);
        groupAnnee.add(rb_2A);

        // DEF des boutons
        bt_ajouter = new JButton("Ajouter");
        bt_modifier = new JButton("Modifier");
        bt_suppr = new JButton("Supprimer");

        // definition du layout de la fenetre : grille 5 lignes, 1 colonne
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new GridLayout(5, 1));

        definirPanneaux();

        // ajout des panneaux au content pane de la fenetre, sur le gridlayout
        contentPane.add(pannImageEtatCivil);
        contentPane.add(pannNomPrenomAnneePref);
        contentPane.add(pannPrefNiveaux);
        contentPane.add(pannCommentaire);
        contentPane.add(pannBoutons);

    }

    private void definirPanneaux() {
        // Panneaux supplémentaires dont on a besoin :
        JPanel pannNomPrenom, pannAnnee;

        // definition d'un placement en FlowLayout cadré à Gauche :
        LayoutManager monLayout = new FlowLayout(FlowLayout.LEFT);

        // definition des 4 panneaux : 1er panneau Etat Civil
        pannImageEtatCivil = new JPanel(); // 1ere ligne centrée
        pannImageEtatCivil.add(lbl_image);
        pannImageEtatCivil.add(lbl_etatCivil);
        pannImageEtatCivil.add(cbb_etatCivil);

        // 2e panneau nom/prenom et lbl préférence
        pannNomPrenomAnneePref = new JPanel(new GridLayout(3, 1));

        pannNomPrenom = new JPanel(); // Nom, prenom centrés
        pannNomPrenom.add(lbl_nom);
        pannNomPrenom.add(tf_nom);
        pannNomPrenom.add(lbl_prenom);
        pannNomPrenom.add(tf_prenom);

        pannAnnee = new JPanel(monLayout); // aligné à G.
        pannAnnee.add(lbl_annee);
        pannAnnee.add(rb_1A);
        pannAnnee.add(rb_2A);

        pannNomPrenomAnneePref.add(pannNomPrenom);
        pannNomPrenomAnneePref.add(pannAnnee);
        pannNomPrenomAnneePref.add(lbl_pref);

        // 3e panneau checkBox et niveau :
        pannPrefNiveaux = new JPanel(new GridLayout(2, 5)); // 'autre' : en option TP1
        pannPrefNiveaux.add(ckb_robotique);
        pannPrefNiveaux.add(ckb_jeuGo);
        pannPrefNiveaux.add(ckb_jeuEchec);
        pannPrefNiveaux.add(ckb_libres);
        pannPrefNiveaux.add(ckb_autre);             // en option TP1
        pannPrefNiveaux.add(cbb_niveauR);
        pannPrefNiveaux.add(cbb_niveauG);
        pannPrefNiveaux.add(cbb_niveauE);
        pannPrefNiveaux.add(cbb_niveauL);

        // ajout d'un textField pour saisir un autre club :
        JPanel pannAutre = new JPanel(new GridLayout(2, 1));
        pannAutre.add(tf_autre);
        pannAutre.add(cbb_niveauA);
        pannPrefNiveaux.add(pannAutre);

        pannCommentaire = new JPanel(monLayout);
        pannCommentaire.add(lbl_commentaire);
        pannCommentaire.add(ta_commentaire);

        pannBoutons = new JPanel(); // boutons centré
        pannBoutons.add(bt_suppr);
        pannBoutons.add(bt_modifier);
        pannBoutons.add(bt_ajouter);
    }

    @Override
    //titre
    public void windowOpened(WindowEvent e) {
        setTitle(this.getTitle() + " " + "de Lyon");
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
package TP1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MonTP1 extends JFrame implements WindowListener{

    // declaration des composants

    private JLabel lbl_etatCivil, lbl_nom, lbl_prenom, lbl_annee, lbl_pref, lbl_commentaire, lbl_image, lbl_semestre;
    private JComboBox cbb_etatCivil;
    private JTextField tf_nom, tf_prenom, tf_autre; // autre : en option TP1
    private JRadioButton rb_1A, rb_2A, rb_s1, rb_s2, rb_s3, rb_s4;
    private ButtonGroup groupAnnee, groupSemestre;
    private JCheckBox ckb_robotique, ckb_jeuEchec, ckb_jeuGo, ckb_libres, ckb_autre;
    private JComboBox cbb_niveauR, cbb_niveauG, cbb_niveauE, cbb_niveauL, cbb_niveauA; // option
    private JTextArea ta_commentaire;
    private JButton bt_ajouter, bt_modifier, bt_suppr;
    private String annee, semestre, clubEchec, clubRobo, clubLibre,clubAutre,clubGo,nivoE, nivoR, nivoL, nivoA, nivoG;

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
        this.setTitle("Sondage Clubs Etudiant");
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                setTitle(getTitle()+" de Lyon");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                int reply = JOptionPane.showConfirmDialog(null,"Etes-vous d'accord pour quitter ?","Confirmation",JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
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
            });
            initComponents();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    // initialisation des composants
    private void initComponents() {

        // definition des composants
        lbl_etatCivil = new JLabel("Etat civil:");
        lbl_nom = new JLabel("Nom:");
        lbl_prenom = new JLabel("Prénom:");

        cbb_etatCivil = new JComboBox();
        cbb_etatCivil.addItem("M.");
        cbb_etatCivil.addItem("Mme");

        // label image (projet Maeven : cf structure des fichiers)
        //lbl_image = new JLabel(new ImageIcon("src/main/java/gif/garcon.jpg"));
        ImageIcon userIconmale = new ImageIcon("src/main/java/gif/garcon.jpg");
        ImageIcon userIconfemale = new ImageIcon("src/main/java/gif/fille.jpg");
        lbl_image = new JLabel(userIconmale);

        cbb_etatCivil.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cbb_etatCivil.getSelectedItem().equals("Mme")){
                    lbl_image.setIcon(userIconfemale);// transform it
                }
                 else{
                    lbl_image.setIcon(userIconmale);// transform it
                }
            }
        });

        lbl_annee = new JLabel("Année:");
        lbl_pref = new JLabel(" Préférences:");
        lbl_commentaire = new JLabel("Commentaire:");
        // définit une textarea de 5 lignes et 15 caract. de large
        ta_commentaire = new JTextArea(5, 35);
        ta_commentaire.setText("(Mentionnez si vous êtes prêt à animer un club)");

        tf_nom = new JTextField(12);
        tf_prenom = new JTextField(12);
        tf_autre = new JTextField(10); // option
        tf_autre.addActionListener(new MyButtonListner());

        // Def des comboBox : on doit redéfinir n fois la même comboBox car un
        // élément ne peut être ajouté qu'une fois à un conteneur +
        // gestion des evts pour chaque CBBox
        String[] niveaux = {"Debutant", "Moyen", "Expert"};
        cbb_niveauR = new JComboBox(niveaux);
        cbb_niveauR.addActionListener(new MyButtonListner());
        cbb_niveauG = new JComboBox(niveaux);
        cbb_niveauG.addActionListener(new MyButtonListner());
        cbb_niveauE = new JComboBox(niveaux);
        cbb_niveauE.addActionListener(new MyButtonListner());
        cbb_niveauL = new JComboBox(niveaux);
        cbb_niveauL.addActionListener(new MyButtonListner());
        cbb_niveauA = new JComboBox(niveaux);// ajout option TP1
        cbb_niveauA.addActionListener(new MyButtonListner());
        nivoE = nivoA = nivoG = nivoL = nivoR = "";

        ckb_robotique = new JCheckBox("Robotique");
        ckb_robotique.addActionListener(new MyButtonListner());
        ckb_jeuEchec = new JCheckBox("Jeu Echec");
        ckb_jeuEchec.addActionListener(new MyButtonListner());
        ckb_jeuGo = new JCheckBox("Jeu de Go");
        ckb_jeuGo.addActionListener(new MyButtonListner());
        ckb_libres = new JCheckBox("Logiciels libres");
        ckb_libres.addActionListener(new MyButtonListner());
        ckb_autre = new JCheckBox("Autre");         // en option TP1
        ckb_autre.addActionListener(new MyButtonListner());

        rb_1A = new JRadioButton("1A");
        rb_1A.addActionListener(new MyButtonListner());
        rb_2A = new JRadioButton("2A");
        rb_2A.addActionListener(new MyButtonListner());
        rb_s1 = new JRadioButton("s1");
        rb_s1.addActionListener(new MyButtonListner());
        rb_s2 = new JRadioButton("s2");
        rb_s2.addActionListener(new MyButtonListner());
        rb_s3 = new JRadioButton("s3");
        rb_s3.addActionListener(new MyButtonListner());
        rb_s4 = new JRadioButton("s4");
        rb_s4.addActionListener(new MyButtonListner());
        lbl_semestre = new JLabel("---> Semestre:");

        // ajout des RB au même groupe de boutons pour gerer les exclusions :
        groupAnnee = new ButtonGroup();
        groupSemestre = new ButtonGroup();
        groupAnnee.add(rb_1A);
        groupAnnee.add(rb_2A);

        groupSemestre.add(rb_s1);
        groupSemestre.add(rb_s2);
        groupSemestre.add(rb_s3);
        groupSemestre.add(rb_s4);

        // DEF des boutons
        bt_ajouter = new JButton("Ajouter");
        bt_modifier = new JButton("Modifier");
        bt_suppr = new JButton("Supprimer");
        bt_ajouter.addMouseListener(new MyButtonListener());
        bt_modifier.addMouseListener(new MyButtonListener());
        bt_suppr.addMouseListener(new MyButtonListener());

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
        pannAnnee.add(lbl_semestre);
        lbl_semestre.setVisible(false);
        pannAnnee.add(rb_s1);
        rb_s1.setVisible(false);
        pannAnnee.add(rb_s2);
        rb_s2.setVisible(false);
        pannAnnee.add(rb_s3);
        rb_s3.setVisible(false);
        pannAnnee.add(rb_s4);
        rb_s4.setVisible(false);

        pannNomPrenomAnneePref.add(pannNomPrenom);
        pannNomPrenomAnneePref.add(pannAnnee);
        pannNomPrenomAnneePref.add(lbl_pref);

        // 3e panneau checkBox et niveau :
        pannPrefNiveaux = new JPanel(new GridLayout(2, 5)); // 'autre' : en option TP1
        pannPrefNiveaux.add(ckb_robotique);
        pannPrefNiveaux.add(ckb_jeuGo);
        pannPrefNiveaux.add(ckb_jeuEchec);
        pannPrefNiveaux.add(ckb_libres);
        pannPrefNiveaux.add(ckb_autre);
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

        pannBoutons = new JPanel(); // boutons centrés
        pannBoutons.add(bt_suppr);
        pannBoutons.add(bt_modifier);
        pannBoutons.add(bt_ajouter);
    }

    @Override
    public void windowOpened(WindowEvent e) {
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

    public class MyButtonListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == bt_suppr) { // clique sur le bouton supprimer
                int reponse = JOptionPane.showConfirmDialog(null,"Etes-vous d'accord pour supprimer ?","Confirmation",JOptionPane.YES_NO_OPTION);
                if (reponse == JOptionPane.YES_OPTION) {
                groupAnnee.clearSelection(); //decoche l'annee
                groupSemestre.clearSelection(); //decoche les semestres
                cbb_etatCivil.setSelectedItem("Mme");
                tf_nom.setText(" ");
                tf_prenom.setText(" ");
                tf_autre.setText(" ");// option
                lbl_semestre.setVisible(false);
                rb_s1.setVisible(false);
                rb_s2.setVisible(false);
                rb_s3.setVisible(false);
                rb_s4.setVisible(false);
                cbb_niveauR.setSelectedItem("Debutant");
                cbb_niveauG.setSelectedItem("Debutant");
                cbb_niveauE.setSelectedItem("Debutant");
                cbb_niveauL.setSelectedItem("Debutant");
                cbb_niveauA.setSelectedItem("Debutant");
                ckb_jeuGo.setSelected(false);
                ckb_jeuEchec.setSelected(false);
                ckb_autre.setSelected(false);
                ckb_libres.setSelected(false);
                ckb_robotique.setSelected(false);
                ta_commentaire.setText("(Mentionnez si vous êtes prêt à animer un club)");
                }
            }

            if (e.getSource() == bt_modifier){
                JOptionPane.showMessageDialog(null,"Modifier directement les champs dans la fenetre" ,"Message", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (e.getSource() == bt_ajouter){
                JOptionPane.showMessageDialog(null, cbb_etatCivil.getSelectedItem() + " " + tf_prenom.getText() +
                                " " + tf_nom.getText() + " est inscrit(e) en " + annee + "eme annee en semestre "
                                + semestre + " et souhaiterait participer aux clubs : "+ clubRobo + "" + nivoR + "" + clubGo + "" + nivoG
                                + "" + clubEchec + "" + nivoE + "" + clubLibre + "" + nivoL + "" + clubAutre + "" +nivoA +
                                ". \nAutres informations : " + ta_commentaire.getText(),"Resume", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource() == bt_modifier){
                bt_modifier.setForeground(Color.red);
                bt_modifier.setText("Bouton en train d'etre clique");
            }
            if(e.getSource() == bt_suppr){
                bt_suppr.setForeground(Color.red);
                bt_suppr.setText("Bouton en train d'etre clique");
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource() == bt_modifier){
                bt_modifier.setForeground(Color.black);
                bt_modifier.setText("Modifier");
            }
            if(e.getSource() == bt_suppr){
                bt_suppr.setForeground(Color.black);
                bt_suppr.setText("Supprimer");
            }
        }
    }

    public class MyButtonListner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(rb_1A.isSelected()){
                annee = "1";
                lbl_semestre.setVisible(true);
                rb_s1.setVisible(true);
                rb_s2.setVisible(true);
                rb_s3.setVisible(false);
                rb_s4.setVisible(false);

                if(rb_s1.isSelected()){
                    semestre = "S1";
                }
                else if(rb_s2.isSelected()){
                    semestre = "S2";
                }
            }
            if(rb_2A.isSelected()){
                annee = "2";
                lbl_semestre.setVisible(true);
                rb_s1.setVisible(false);
                rb_s2.setVisible(false);
                rb_s3.setVisible(true);
                rb_s4.setVisible(true);

                if(rb_s3.isSelected()){
                    semestre = rb_s3.getText();
                }
                else if(rb_s4.isSelected()){
                    semestre = rb_s4.getText();
                }
            }

            if(ckb_autre.isSelected()){
                clubAutre = "\n - " + tf_autre.getText();
                if(e.getSource() == cbb_niveauA){
                    nivoA = " (" + cbb_niveauA.getSelectedItem() + ")";
                }
                else if(e.getSource() == null){
                    nivoA = " (Debutant)"; // si l'utilisateur ne choisit pas le niveau, par defaut "Debutant"
                }
            }
            if(!ckb_autre.isSelected()){
                clubAutre = "";
            }

            if(ckb_jeuEchec.isSelected()){
                clubEchec = "\n - " + ckb_jeuEchec.getText();
                if(e.getSource() == cbb_niveauE){
                    nivoE = " (" + cbb_niveauE.getSelectedItem() + ")";
                }
                else if(e.getSource() == null){
                    nivoE = " (Debutant)"; // si l'utilisateur ne choisit pas le niveau, par defaut "Debutant"
                }
            }
            if(!ckb_jeuEchec.isSelected()){
                clubEchec = "";
            }

            if(ckb_robotique.isSelected()){
                clubRobo = "\n - " + ckb_robotique.getText();
                if(e.getSource() == cbb_niveauR){
                    nivoR = " (" + cbb_niveauR.getSelectedItem() + ")";
                }
                else if(e.getSource() == null){
                    nivoR = " (Debutant)"; // si l'utilisateur ne choisit pas le niveau, par defaut "Debutant"
                }
            }
            if(!ckb_robotique.isSelected()){
                clubRobo = "";
            }

            if(ckb_libres.isSelected()){
                clubLibre = "\n - " + ckb_libres.getText();
                if(e.getSource() == cbb_niveauL){
                    nivoL = " (" + cbb_niveauL.getSelectedItem() + ")";
                }
                else if(e.getSource() == null){
                    nivoL = " (Debutant)"; // si l'utilisateur ne choisit pas le niveau, par defaut "Debutant"
                }
            }
            if(!ckb_libres.isSelected()){
                clubLibre = "";
            }

            if(ckb_jeuGo.isSelected()){
                clubGo = "\n - " + ckb_jeuGo.getText();
                if(e.getSource() == cbb_niveauG){
                    nivoG = " (" + cbb_niveauG.getSelectedItem() + ")";
                }
                else if(e.getSource() == null){
                    nivoG = " (Debutant)"; // si l'utilisateur ne choisit pas le niveau, par defaut "Debutant"
                }
            }
            if(!ckb_jeuGo.isSelected()){
                clubGo = "";
            }
        }
    }
}

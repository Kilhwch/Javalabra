

package anki.Kayttoliittyma;

import anki.Cards;
import anki.Decks;
import anki.HandleFiles;
import anki.Stats;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class UI extends javax.swing.JFrame {

    private File file;
    private ArrayList<String> words = new ArrayList<String>();
    private HandleFiles handler = new HandleFiles(file, getName());
    private Decks deck = new Decks();
    private Stats stats = new Stats();
    private int wordIndex = 0;
    

    /** Creates new form UI */
    public UI() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddNewWordWindow = new javax.swing.JDialog();
        NewWordField = new javax.swing.JTextField();
        NewTranslationField = new javax.swing.JTextField();
        NewWordAddButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NewWordDoneButton = new javax.swing.JButton();
        AddDeckNameWindow = new javax.swing.JDialog();
        NewDeckNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NewDeckFieldOkButton = new javax.swing.JButton();
        NewDeckFieldCancel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        DrillWindow = new javax.swing.JDialog();
        DrillWIndowSeparator = new javax.swing.JSeparator();
        DrillShowWordLabel = new java.awt.Label();
        DrillShowAnswerLabel = new java.awt.Label();
        DrillEvaluateCorrectButton = new javax.swing.JButton();
        DrillEvaluateIncorrectButton = new javax.swing.JButton();
        DrillShowAnswerButton = new javax.swing.JButton();
        DrillWindowProgressLabel = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        StatsWindow = new javax.swing.JDialog();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        StatsShowInformation = new javax.swing.JLabel();
        StatsShowInformation2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        FileChooser = new javax.swing.JFileChooser();
        UiNewDeckButton = new javax.swing.JButton();
        UiCloseButton = new javax.swing.JButton();
        UiStartDrillingButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        UiOpenFileButton = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        jList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        UiUpdateListButton = new javax.swing.JButton();
        UiDeleteButton = new javax.swing.JButton();
        UiEditButton = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        UiTopMenu = new javax.swing.JMenuBar();
        UiTopMenuFile = new javax.swing.JMenu();
        UiTopMenuEdit = new javax.swing.JMenu();

        AddNewWordWindow.setMinimumSize(new java.awt.Dimension(230, 333));
        AddNewWordWindow.setResizable(false);

        NewWordAddButton.setText("Add");
        NewWordAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWordAddButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Translation");

        jLabel2.setText("Word");

        NewWordDoneButton.setText("Done");
        NewWordDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWordDoneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddNewWordWindowLayout = new javax.swing.GroupLayout(AddNewWordWindow.getContentPane());
        AddNewWordWindow.getContentPane().setLayout(AddNewWordWindowLayout);
        AddNewWordWindowLayout.setHorizontalGroup(
            AddNewWordWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewWordWindowLayout.createSequentialGroup()
                .addGroup(AddNewWordWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewWordWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddNewWordWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NewWordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewTranslationField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewWordAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                    .addGroup(AddNewWordWindowLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2))
                    .addGroup(AddNewWordWindowLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(AddNewWordWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewWordDoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        AddNewWordWindowLayout.setVerticalGroup(
            AddNewWordWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewWordWindowLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewTranslationField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewWordAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewWordDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        AddDeckNameWindow.setMinimumSize(new java.awt.Dimension(300, 300));
        AddDeckNameWindow.setResizable(false);

        NewDeckNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDeckNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Please give your deck a name:");

        NewDeckFieldOkButton.setText("OK");
        NewDeckFieldOkButton.setPreferredSize(new java.awt.Dimension(65, 23));
        NewDeckFieldOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDeckFieldOkButtonActionPerformed(evt);
            }
        });

        NewDeckFieldCancel.setText("Cancel");
        NewDeckFieldCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewDeckFieldCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddDeckNameWindowLayout = new javax.swing.GroupLayout(AddDeckNameWindow.getContentPane());
        AddDeckNameWindow.getContentPane().setLayout(AddDeckNameWindowLayout);
        AddDeckNameWindowLayout.setHorizontalGroup(
            AddDeckNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                .addGroup(AddDeckNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                    .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                    .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(AddDeckNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                                .addComponent(NewDeckFieldOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewDeckFieldCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NewDeckNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        AddDeckNameWindowLayout.setVerticalGroup(
            AddDeckNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(NewDeckNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddDeckNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDeckFieldOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewDeckFieldCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        DrillWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DrillWindow.setMinimumSize(new java.awt.Dimension(350, 469));
        DrillWindow.setResizable(false);

        DrillShowWordLabel.setFont(new java.awt.Font("Dialog", 0, 24));

        DrillShowAnswerLabel.setFont(new java.awt.Font("Dialog", 0, 24));

        DrillEvaluateCorrectButton.setText("Correct");
        DrillEvaluateCorrectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrillEvaluateCorrectButtonActionPerformed(evt);
            }
        });

        DrillEvaluateIncorrectButton.setText("Incorrect");
        DrillEvaluateIncorrectButton.setMinimumSize(new java.awt.Dimension(69, 23));
        DrillEvaluateIncorrectButton.setPreferredSize(new java.awt.Dimension(69, 23));
        DrillEvaluateIncorrectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrillEvaluateIncorrectButtonActionPerformed(evt);
            }
        });

        DrillShowAnswerButton.setText("Show Answer");
        DrillShowAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrillShowAnswerButtonActionPerformed(evt);
            }
        });

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        DrillWindow.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout DrillWindowLayout = new javax.swing.GroupLayout(DrillWindow.getContentPane());
        DrillWindow.getContentPane().setLayout(DrillWindowLayout);
        DrillWindowLayout.setHorizontalGroup(
            DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrillWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DrillWindowProgressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillWIndowSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillShowAnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillShowWordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(DrillWindowLayout.createSequentialGroup()
                        .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DrillShowAnswerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DrillWindowLayout.createSequentialGroup()
                                .addComponent(DrillEvaluateCorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DrillEvaluateIncorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        DrillWindowLayout.setVerticalGroup(
            DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrillWindowLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(DrillShowWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(DrillWIndowSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(DrillShowAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(DrillShowAnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrillEvaluateCorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrillEvaluateIncorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DrillWindowProgressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        StatsWindow.setTitle("Stats");
        StatsWindow.setAlwaysOnTop(true);
        StatsWindow.setMinimumSize(new java.awt.Dimension(250, 250));
        StatsWindow.setResizable(false);

        StatsShowInformation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        StatsShowInformation2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Results:");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        StatsWindow.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout StatsWindowLayout = new javax.swing.GroupLayout(StatsWindow.getContentPane());
        StatsWindow.getContentPane().setLayout(StatsWindowLayout);
        StatsWindowLayout.setHorizontalGroup(
            StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatsShowInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatsShowInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        StatsWindowLayout.setVerticalGroup(
            StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StatsShowInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatsShowInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(800, 300, 0, 0));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        UiNewDeckButton.setText("New Deck");
        UiNewDeckButton.setMaximumSize(new java.awt.Dimension(80, 20));
        UiNewDeckButton.setMinimumSize(new java.awt.Dimension(80, 20));
        UiNewDeckButton.setPreferredSize(new java.awt.Dimension(80, 20));
        UiNewDeckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiNewDeckButtonActionPerformed(evt);
            }
        });

        UiCloseButton.setText("Quit");
        UiCloseButton.setMaximumSize(new java.awt.Dimension(80, 20));
        UiCloseButton.setMinimumSize(new java.awt.Dimension(80, 20));
        UiCloseButton.setPreferredSize(new java.awt.Dimension(80, 20));
        UiCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiCloseButtonActionPerformed(evt);
            }
        });

        UiStartDrillingButton.setText("Start");
        UiStartDrillingButton.setPreferredSize(new java.awt.Dimension(79, 23));
        UiStartDrillingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiStartDrillingButtonActionPerformed(evt);
            }
        });

        UiOpenFileButton.setText("Browse");
        UiOpenFileButton.setMaximumSize(new java.awt.Dimension(80, 20));
        UiOpenFileButton.setMinimumSize(new java.awt.Dimension(80, 20));
        UiOpenFileButton.setPreferredSize(new java.awt.Dimension(80, 20));
        UiOpenFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiOpenFileButtonActionPerformed(evt);
            }
        });

        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ScrollPane.setViewportView(jList);

        jLabel4.setText("Choose a file and click start:");

        UiUpdateListButton.setText("Update List");
        UiUpdateListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiUpdateListButtonActionPerformed(evt);
            }
        });

        UiDeleteButton.setText("Delete");
        UiDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiDeleteButtonActionPerformed(evt);
            }
        });

        UiEditButton.setText("Edit");
        UiEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UiEditButtonActionPerformed(evt);
            }
        });

        UiTopMenuFile.setText("File");
        UiTopMenuFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UiTopMenuFileMouseClicked(evt);
            }
        });
        UiTopMenu.add(UiTopMenuFile);

        UiTopMenuEdit.setText("Edit");
        UiTopMenu.add(UiTopMenuEdit);

        setJMenuBar(UiTopMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 229, Short.MAX_VALUE))
                            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(UiStartDrillingButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UiDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UiEditButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UiNewDeckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UiUpdateListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(UiOpenFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UiCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UiNewDeckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UiEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UiDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UiStartDrillingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UiUpdateListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UiOpenFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UiCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-541)/2, (screenSize.height-464)/2, 541, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void NewDeckNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckNameFieldActionPerformed
        deck.setDeckName(NewDeckNameField.getText());
    }//GEN-LAST:event_NewDeckNameFieldActionPerformed

    private void NewDeckFieldCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewDeckFieldCancelMouseClicked
        AddDeckNameWindow.setVisible(false);
    }//GEN-LAST:event_NewDeckFieldCancelMouseClicked

    private void NewWordDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWordDoneButtonActionPerformed
        AddNewWordWindow.setVisible(false);
        UiUpdateListButton.doClick();
    }//GEN-LAST:event_NewWordDoneButtonActionPerformed

    private void NewWordAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWordAddButtonActionPerformed
        if (NewWordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (NewTranslationField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            Cards card = new Cards(NewWordField.getText(), NewTranslationField.getText());
            deck.add(card);
            String word = card.getWord();
            String translation = card.getTranslation();
            try {
            handler.writeToFile(word, translation);
            } catch (Exception e) {
            System.out.println("NewWordAddButton(Translation) = ERROR");
            }
            NewWordField.setText("");
            NewTranslationField.setText("");
        }
    }//GEN-LAST:event_NewWordAddButtonActionPerformed

    private void UiCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_UiCloseButtonActionPerformed

    private void UiStartDrillingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiStartDrillingButtonActionPerformed
        if (jList.getSelectedValue() != null) {
        
            wordIndex = 0;
            DrillShowAnswerLabel.setVisible(false);
            DrillShowAnswerButton.setVisible(true);
        
            DrillWindow.setLocationRelativeTo(this);
            DrillWindow.setTitle("Practice - " + jList.getSelectedValue().toString());
            DrillWindow.setVisible(true);
            DrillEvaluateCorrectButton.setVisible(false);
            DrillEvaluateIncorrectButton.setVisible(false);
            String selected = jList.getSelectedValue().toString();
            try {
            words = handler.loadFile(selected);
            } catch (Exception e) {
                System.out.println("UiStartDrillingButton = ERROR");
            }
            DrillShowWordLabel.setText(words.get(wordIndex));
        }
    }//GEN-LAST:event_UiStartDrillingButtonActionPerformed

    private void DrillEvaluateCorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillEvaluateCorrectButtonActionPerformed
        ++wordIndex;
        stats.countToCorrectAnswers();
        allCardsGonethroughCheck();
    }//GEN-LAST:event_DrillEvaluateCorrectButtonActionPerformed

    private void DrillEvaluateIncorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillEvaluateIncorrectButtonActionPerformed
        ++wordIndex;
        stats.countToIncorrectAnswers();
        allCardsGonethroughCheck();
    }//GEN-LAST:event_DrillEvaluateIncorrectButtonActionPerformed

    private void DrillShowAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillShowAnswerButtonActionPerformed
        DrillShowAnswerButton.setVisible(false);
        DrillEvaluateCorrectButton.setVisible(true);
        DrillEvaluateIncorrectButton.setVisible(true);
        DrillShowAnswerLabel.setVisible(true);
        DrillShowAnswerLabel.setText(words.get(wordIndex+1));
        ++wordIndex;
    }//GEN-LAST:event_DrillShowAnswerButtonActionPerformed

    private void UiTopMenuFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UiTopMenuFileMouseClicked
    }//GEN-LAST:event_UiTopMenuFileMouseClicked

    private void UiOpenFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiOpenFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File openedfile = chooser.getSelectedFile();
        try {
        String openedfilename = openedfile.getName();
        handler.addOpenedFileToFileList(openedfilename, this.file);
        handler.addFile(openedfilename);
        UiUpdateListButton.doClick();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_UiOpenFileButtonActionPerformed

    private void UiNewDeckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiNewDeckButtonActionPerformed
        NewDeckNameField.setText("");
        AddDeckNameWindow.setLocationRelativeTo(this);
        AddDeckNameWindow.setTitle("Create a new deck");
        AddDeckNameWindow.setVisible(true);
    }//GEN-LAST:event_UiNewDeckButtonActionPerformed

    private void UiUpdateListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiUpdateListButtonActionPerformed
        try {
            jList.setListData(handler.getExistingFiles().toArray());
        } catch (Exception e) {
            System.out.println("UiUpdateListButtonActionPerformed = ERROR");
        }
        jList.setSelectedIndex(0);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_UiUpdateListButtonActionPerformed

    private void UiDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiDeleteButtonActionPerformed
        if (jList.getSelectedValue() != null) {
        handler.deleteFile(jList.getSelectedValue().toString());
        UiUpdateListButton.doClick();
        }
    }//GEN-LAST:event_UiDeleteButtonActionPerformed

    private void NewDeckFieldOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckFieldOkButtonActionPerformed
        deck.setDeckName(NewDeckNameField.getText());
        if (!deck.getDeckName().isEmpty()) {
            handler.createFile(NewDeckNameField.getText());
            AddDeckNameWindow.setVisible(false);
            AddNewWordWindow.setLocationRelativeTo(this);
            AddNewWordWindow.setTitle("Create new cards - " + deck.getDeckName());
            AddNewWordWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid file name!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NewDeckFieldOkButtonActionPerformed

    private void UiEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiEditButtonActionPerformed
        try {
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe", jList.getSelectedValue().toString());
        pb.start();
            System.out.println("notepad " + jList.getSelectedValue().toString());
        } catch (IOException ex){
            System.out.println("error");
        }

    }//GEN-LAST:event_UiEditButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            
            @Override
            public void run() {
                File list = new File("./Tiedostot/Tiedostolista.txt");
                if (!list.exists()) {
                    try {
                        list.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("An error occurred with Tiedostolista");
                    }
                }
                
                UI Window = new UI();
                Window.setTitle("Anki");
                Window.pack();
                Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Window.setVisible(true);
                Window.UiUpdateListButton.doClick();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddDeckNameWindow;
    private javax.swing.JDialog AddNewWordWindow;
    private javax.swing.JButton DrillEvaluateCorrectButton;
    private javax.swing.JButton DrillEvaluateIncorrectButton;
    private javax.swing.JButton DrillShowAnswerButton;
    private java.awt.Label DrillShowAnswerLabel;
    private java.awt.Label DrillShowWordLabel;
    private javax.swing.JSeparator DrillWIndowSeparator;
    private javax.swing.JDialog DrillWindow;
    private javax.swing.JLabel DrillWindowProgressLabel;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton NewDeckFieldCancel;
    private javax.swing.JButton NewDeckFieldOkButton;
    private javax.swing.JTextField NewDeckNameField;
    private javax.swing.JTextField NewTranslationField;
    private javax.swing.JButton NewWordAddButton;
    private javax.swing.JButton NewWordDoneButton;
    private javax.swing.JTextField NewWordField;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel StatsShowInformation;
    private javax.swing.JLabel StatsShowInformation2;
    private javax.swing.JDialog StatsWindow;
    private javax.swing.JButton UiCloseButton;
    private javax.swing.JButton UiDeleteButton;
    private javax.swing.JButton UiEditButton;
    private javax.swing.JButton UiNewDeckButton;
    private javax.swing.JButton UiOpenFileButton;
    private javax.swing.JButton UiStartDrillingButton;
    private javax.swing.JMenuBar UiTopMenu;
    private javax.swing.JMenu UiTopMenuEdit;
    private javax.swing.JMenu UiTopMenuFile;
    private javax.swing.JButton UiUpdateListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables

    private void allCardsGonethroughCheck() {
        if (wordIndex == words.size()) {
            StatsWindow.setLocationRelativeTo(this);
            DrillWindow.setVisible(false);
            StatsWindow.pack();
            StatsWindow.setVisible(true);
            StatsShowInformation.setText(stats.getTotalCorrectStats());
            StatsShowInformation2.setText(stats.getTotalIncorrectStats());
            wordIndex = 0;
            stats.reset();

        } else {
           
            DrillShowAnswerLabel.setText("");
            DrillShowAnswerButton.setVisible(true);
            DrillShowWordLabel.setText(words.get(wordIndex));

            DrillEvaluateCorrectButton.setVisible(false);
            DrillEvaluateIncorrectButton.setVisible(false);
        }
    }
}

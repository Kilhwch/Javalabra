

package anki.Kayttoliittyma;

import anki.Cards;
import anki.Decks;
import anki.HandleFiles;
import anki.Stats;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.io.File;
import java.util.logging.FileHandler;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class UI extends javax.swing.JFrame {

    private File file;
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
        NewWordCancelButton = new javax.swing.JButton();
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
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        StatsWindow = new javax.swing.JDialog();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        StatsShowDeckName = new javax.swing.JLabel();
        StatsShowInformation = new javax.swing.JLabel();
        StatsShowInformation2 = new javax.swing.JLabel();
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

        NewWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWordFieldActionPerformed(evt);
            }
        });

        NewWordAddButton.setText("Add");
        NewWordAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWordAddButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Translation");

        jLabel2.setText("Word");

        NewWordCancelButton.setText("Close");
        NewWordCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWordCancelButtonActionPerformed(evt);
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
                .addComponent(NewWordCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
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
                .addComponent(NewWordCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        NewDeckFieldOkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewDeckFieldOkButtonMouseClicked(evt);
            }
        });
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
                        .addGap(37, 37, 37)
                        .addGroup(AddDeckNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                                .addComponent(NewDeckFieldOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewDeckFieldCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NewDeckNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(AddDeckNameWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
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
                    .addGroup(DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillShowWordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillShowAnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillEvaluateCorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(DrillEvaluateIncorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrillWindowLayout.createSequentialGroup()
                        .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DrillWIndowSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(DrillShowAnswerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        DrillWindowLayout.setVerticalGroup(
            DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrillWindowLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(DrillShowWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(DrillWIndowSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(DrillShowAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DrillShowAnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrillEvaluateCorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrillEvaluateIncorrectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        StatsWindow.setMinimumSize(new java.awt.Dimension(250, 250));
        StatsWindow.setResizable(false);

        StatsShowDeckName.setFont(new java.awt.Font("Tahoma", 0, 18));

        StatsShowInformation.setFont(new java.awt.Font("Tahoma", 0, 14));

        StatsShowInformation2.setFont(new java.awt.Font("Tahoma", 0, 14));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        StatsWindow.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout StatsWindowLayout = new javax.swing.GroupLayout(StatsWindow.getContentPane());
        StatsWindow.getContentPane().setLayout(StatsWindowLayout);
        StatsWindowLayout.setHorizontalGroup(
            StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StatsShowDeckName, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatsShowInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatsShowInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        StatsWindowLayout.setVerticalGroup(
            StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(StatsShowDeckName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StatsShowInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatsShowInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(800, 300, 0, 0));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        UiNewDeckButton.setText("New Deck");
        UiNewDeckButton.setMaximumSize(new java.awt.Dimension(80, 20));
        UiNewDeckButton.setMinimumSize(new java.awt.Dimension(80, 20));
        UiNewDeckButton.setPreferredSize(new java.awt.Dimension(80, 20));
        UiNewDeckButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UiNewDeckButtonMouseClicked(evt);
            }
        });
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

        UiOpenFileButton.setText("Open");
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
                            .addComponent(UiDeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UiEditButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UiNewDeckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UiUpdateListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(UiOpenFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(UiCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
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
                .addComponent(UiStartDrillingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UiUpdateListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UiCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UiOpenFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-541)/2, (screenSize.height-464)/2, 541, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void NewDeckNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckNameFieldActionPerformed
        deck.setDeckName(NewDeckNameField.getText());
    }//GEN-LAST:event_NewDeckNameFieldActionPerformed

    private void UiNewDeckButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UiNewDeckButtonMouseClicked
        AddDeckNameWindow.setLocationRelativeTo(this);
        AddDeckNameWindow.setTitle("Create a new deck");
        AddDeckNameWindow.setVisible(true);
    }//GEN-LAST:event_UiNewDeckButtonMouseClicked

    private void NewDeckFieldOkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewDeckFieldOkButtonMouseClicked

        deck.setDeckName(NewDeckNameField.getText());
        handler.createFile(NewDeckNameField.getText());

        AddDeckNameWindow.setVisible(false);
        AddNewWordWindow.setLocationRelativeTo(this);
        AddNewWordWindow.setTitle("Create new cards - " + deck.getDeckName());
        AddNewWordWindow.setVisible(true);

    }//GEN-LAST:event_NewDeckFieldOkButtonMouseClicked

    private void NewDeckFieldCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewDeckFieldCancelMouseClicked
        AddDeckNameWindow.setVisible(false);
    }//GEN-LAST:event_NewDeckFieldCancelMouseClicked

    private void NewWordCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWordCancelButtonActionPerformed
        AddNewWordWindow.setVisible(false);
    }//GEN-LAST:event_NewWordCancelButtonActionPerformed

    private void NewWordAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWordAddButtonActionPerformed
        Cards newCard = new Cards(NewWordField.getText(), NewTranslationField.getText());
        deck.add(newCard);
        String temporary = NewWordField.getText() + ":" + NewTranslationField.getText() + ":";
        handler.writeToFile(temporary);

        NewWordField.setText("");
        NewTranslationField.setText("");
    }//GEN-LAST:event_NewWordAddButtonActionPerformed

    private void NewWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWordFieldActionPerformed
    }//GEN-LAST:event_NewWordFieldActionPerformed

    private void UiCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_UiCloseButtonActionPerformed

    private void UiStartDrillingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiStartDrillingButtonActionPerformed
        
        DrillWindow.setLocationRelativeTo(this);
        DrillWindow.setTitle("Practice");
        DrillWindow.setVisible(true);
        DrillEvaluateCorrectButton.setVisible(false);
        DrillEvaluateIncorrectButton.setVisible(false);
        DrillShowWordLabel.setText(deck.getNextWord(wordIndex));
    }//GEN-LAST:event_UiStartDrillingButtonActionPerformed

    private void DrillEvaluateCorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillEvaluateCorrectButtonActionPerformed
        stats.countToCorrectAnswers();
        allCardsGonethroughCheck();
    }//GEN-LAST:event_DrillEvaluateCorrectButtonActionPerformed

    private void DrillEvaluateIncorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillEvaluateIncorrectButtonActionPerformed
        stats.countToIncorrectAnswers();
        allCardsGonethroughCheck();
    }//GEN-LAST:event_DrillEvaluateIncorrectButtonActionPerformed

    private void DrillShowAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillShowAnswerButtonActionPerformed
        DrillShowAnswerButton.setVisible(false);
        DrillEvaluateCorrectButton.setVisible(true);
        DrillEvaluateIncorrectButton.setVisible(true);
        DrillShowAnswerLabel.setVisible(true);
        DrillShowAnswerLabel.setText(deck.getNextTranslation(wordIndex));
        ++wordIndex;

    }//GEN-LAST:event_DrillShowAnswerButtonActionPerformed

    private void UiTopMenuFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UiTopMenuFileMouseClicked
    }//GEN-LAST:event_UiTopMenuFileMouseClicked

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
    }//GEN-LAST:event_FileChooserActionPerformed

    private void UiOpenFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiOpenFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File openedfile = chooser.getSelectedFile();
        String openedfilename = openedfile.getName();
        handler.addOpenedFileToFileList(openedfilename, this.file);
        
            
        
    }//GEN-LAST:event_UiOpenFileButtonActionPerformed

    private void UiNewDeckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiNewDeckButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UiNewDeckButtonActionPerformed

    private void NewDeckFieldOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckFieldOkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewDeckFieldOkButtonActionPerformed

    private void UiUpdateListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiUpdateListButtonActionPerformed
   
        jList.setListData(handler.getFilesArray().toArray());
        jList.setSelectedIndex(0);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_UiUpdateListButtonActionPerformed

    private void UiDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UiDeleteButtonActionPerformed
        
    }//GEN-LAST:event_UiDeleteButtonActionPerformed

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

                UI Window = new UI();
                Window.setTitle("Anki");
                Window.pack();
                Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Window.setVisible(true);



//                new UI().setVisible(true);

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
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton NewDeckFieldCancel;
    private javax.swing.JButton NewDeckFieldOkButton;
    private javax.swing.JTextField NewDeckNameField;
    private javax.swing.JTextField NewTranslationField;
    private javax.swing.JButton NewWordAddButton;
    private javax.swing.JButton NewWordCancelButton;
    private javax.swing.JTextField NewWordField;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel StatsShowDeckName;
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
        if (deck.allWordsReviewed(wordIndex) == true) {
            StatsWindow.setLocationRelativeTo(this);
            DrillWindow.setVisible(false);
            StatsWindow.pack();
            StatsWindow.setVisible(true);
            StatsShowDeckName.setText("Deck: " + deck.getDeckName());
            StatsShowInformation.setText(stats.getTotalCorrectStats());
            StatsShowInformation2.setText(stats.getTotalIncorrectStats());

        } else {


            DrillShowAnswerLabel.setText("");
            DrillShowAnswerButton.setVisible(true);
            DrillShowWordLabel.setText(deck.getNextWord(wordIndex));

            DrillEvaluateCorrectButton.setVisible(false);
            DrillEvaluateIncorrectButton.setVisible(false);
        }
    }
}

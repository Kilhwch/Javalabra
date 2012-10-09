

package anki.Kayttoliittyma;

import anki.Cards;
import anki.Decks;
import anki.HandleFiles;
import anki.Stats;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class UI extends javax.swing.JFrame implements Runnable {

    private File file;
    private ArrayList<String> words = new ArrayList<String>();
    private HandleFiles handler = new HandleFiles(file, getName());
    private Decks deck = new Decks();
    private Stats stats = new Stats();
    private int wordIndex = 0;

    /** Creates new form UI */
    public UI() {  
    }

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

                initComponents();
                this.setTitle("Anki");
                this.pack();
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.UIWindow_UpdateList.setVisible(false);
                this.setVisible(true);
                this.UIWindow_UpdateList.doClick();
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewCardWindow = new javax.swing.JDialog();
        NewCardWindow_WordField = new javax.swing.JTextField();
        NewCardWindow_TranslationField = new javax.swing.JTextField();
        NewCardWindow_Add = new javax.swing.JButton();
        NewCardWindow_Done = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        jSeparator9 = new javax.swing.JSeparator();
        NewDeckWindow = new javax.swing.JDialog();
        NewDeckWindow_NameField = new javax.swing.JTextField();
        NewDeckWindow_OK = new javax.swing.JButton();
        NewDeckWindow_Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jSeparator5 = new javax.swing.JSeparator();
        DrillWindow = new javax.swing.JDialog();
        DrillWindow_Correct = new javax.swing.JButton();
        DrillWindow_Incorrect = new javax.swing.JButton();
        DrillWindow_ShowAnswer = new javax.swing.JButton();
        DrillShowWordLabel = new java.awt.Label();
        DrillWindow_AnswerLabel = new java.awt.Label();
        DrillWIndowSeparator = new javax.swing.JSeparator();
        StatsWindow = new javax.swing.JDialog();
        StatsWindow_InfoLabel1 = new javax.swing.JLabel();
        StatsWindow_InfoLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        FileChooser = new javax.swing.JFileChooser();
        EditWindow = new javax.swing.JDialog();
        EditWindow_NewCard = new javax.swing.JButton();
        EditWindow_Delete = new javax.swing.JButton();
        EditWindow_Done = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        EditWindowTable = new javax.swing.JTable();
        EditWindow_NewCardWindow = new javax.swing.JDialog();
        EditWindow_NewCardWindow_Add = new javax.swing.JButton();
        EditWindow_NewCardWindow_WordField = new javax.swing.JTextField();
        EditWindow_NewCardWindow_TranslationField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        EditWindowAddWordLabel = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        UIWindow_NewDeck = new javax.swing.JButton();
        UIWindow_Quit = new javax.swing.JButton();
        UIWindow_Start = new javax.swing.JButton();
        UIWindow_Browse = new javax.swing.JButton();
        UIWindow_Delete = new javax.swing.JButton();
        UIWindow_UpdateList = new javax.swing.JButton();
        UIWindow_Edit = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        jList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        NewCardWindow.setMinimumSize(new java.awt.Dimension(300, 400));
        NewCardWindow.setResizable(false);

        NewCardWindow_Add.setText("Add");
        NewCardWindow_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCardWindow_AddActionPerformed(evt);
            }
        });

        NewCardWindow_Done.setText("Done");
        NewCardWindow_Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCardWindow_DoneActionPerformed(evt);
            }
        });

        jLabel1.setText("Translation");

        jLabel2.setText("Word");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 1, 18));
        label2.setText("New Card");

        javax.swing.GroupLayout NewCardWindowLayout = new javax.swing.GroupLayout(NewCardWindow.getContentPane());
        NewCardWindow.getContentPane().setLayout(NewCardWindowLayout);
        NewCardWindowLayout.setHorizontalGroup(
            NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewCardWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewCardWindowLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewCardWindow_WordField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewCardWindow_TranslationField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewCardWindow_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NewCardWindowLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2))
                            .addGroup(NewCardWindowLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1))
                            .addComponent(NewCardWindow_Done, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addContainerGap())
        );
        NewCardWindowLayout.setVerticalGroup(
            NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewCardWindowLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewCardWindow_WordField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewCardWindow_TranslationField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewCardWindow_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewCardWindow_Done, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        NewDeckWindow.setMinimumSize(new java.awt.Dimension(300, 300));
        NewDeckWindow.setResizable(false);

        NewDeckWindow_NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDeckWindow_NameFieldActionPerformed(evt);
            }
        });

        NewDeckWindow_OK.setText("OK");
        NewDeckWindow_OK.setPreferredSize(new java.awt.Dimension(65, 23));
        NewDeckWindow_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDeckWindow_OKActionPerformed(evt);
            }
        });

        NewDeckWindow_Cancel.setText("Cancel");
        NewDeckWindow_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewDeckWindow_CancelMouseClicked(evt);
            }
        });

        jLabel3.setText("Please give your deck a name:");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 18));
        label1.setText("New Deck");

        javax.swing.GroupLayout NewDeckWindowLayout = new javax.swing.GroupLayout(NewDeckWindow.getContentPane());
        NewDeckWindow.getContentPane().setLayout(NewDeckWindowLayout);
        NewDeckWindowLayout.setHorizontalGroup(
            NewDeckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewDeckWindowLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(NewDeckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewDeckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(NewDeckWindowLayout.createSequentialGroup()
                            .addComponent(NewDeckWindow_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewDeckWindow_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(NewDeckWindow_NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewDeckWindowLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
            .addGroup(NewDeckWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewDeckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        NewDeckWindowLayout.setVerticalGroup(
            NewDeckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewDeckWindowLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(NewDeckWindow_NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewDeckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDeckWindow_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewDeckWindow_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        DrillWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DrillWindow.setMinimumSize(new java.awt.Dimension(350, 469));
        DrillWindow.setResizable(false);
        DrillWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                DrillWindowWindowClosed(evt);
            }
        });

        DrillWindow_Correct.setText("Correct");
        DrillWindow_Correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrillWindow_CorrectActionPerformed(evt);
            }
        });

        DrillWindow_Incorrect.setText("Incorrect");
        DrillWindow_Incorrect.setMinimumSize(new java.awt.Dimension(69, 23));
        DrillWindow_Incorrect.setPreferredSize(new java.awt.Dimension(69, 23));
        DrillWindow_Incorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrillWindow_IncorrectActionPerformed(evt);
            }
        });

        DrillWindow_ShowAnswer.setText("Show Answer");
        DrillWindow_ShowAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrillWindow_ShowAnswerActionPerformed(evt);
            }
        });

        DrillShowWordLabel.setAlignment(java.awt.Label.CENTER);
        DrillShowWordLabel.setFont(new java.awt.Font("Dialog", 0, 24));

        DrillWindow_AnswerLabel.setAlignment(java.awt.Label.CENTER);
        DrillWindow_AnswerLabel.setFont(new java.awt.Font("Dialog", 0, 24));

        javax.swing.GroupLayout DrillWindowLayout = new javax.swing.GroupLayout(DrillWindow.getContentPane());
        DrillWindow.getContentPane().setLayout(DrillWindowLayout);
        DrillWindowLayout.setHorizontalGroup(
            DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrillWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillWIndowSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(DrillWindowLayout.createSequentialGroup()
                        .addComponent(DrillShowWordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrillWindowLayout.createSequentialGroup()
                        .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DrillWindow_ShowAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DrillWindowLayout.createSequentialGroup()
                                    .addComponent(DrillWindow_Correct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(DrillWindow_Incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DrillWindow_AnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        DrillWindowLayout.setVerticalGroup(
            DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrillWindowLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(DrillShowWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(DrillWIndowSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(DrillWindow_AnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(DrillWindow_ShowAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrillWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrillWindow_Correct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrillWindow_Incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        StatsWindow.setTitle("");
        StatsWindow.setAlwaysOnTop(true);
        StatsWindow.setMinimumSize(new java.awt.Dimension(250, 250));
        StatsWindow.setResizable(false);

        StatsWindow_InfoLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));

        StatsWindow_InfoLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("Results:");

        javax.swing.GroupLayout StatsWindowLayout = new javax.swing.GroupLayout(StatsWindow.getContentPane());
        StatsWindow.getContentPane().setLayout(StatsWindowLayout);
        StatsWindowLayout.setHorizontalGroup(
            StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatsWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatsWindow_InfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatsWindow_InfoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(StatsWindow_InfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatsWindow_InfoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        EditWindow.setAlwaysOnTop(true);
        EditWindow.setMinimumSize(new java.awt.Dimension(450, 570));
        EditWindow.setResizable(false);

        EditWindow_NewCard.setText("New Card");
        EditWindow_NewCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditWindow_NewCardActionPerformed(evt);
            }
        });

        EditWindow_Delete.setText("Delete");
        EditWindow_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditWindow_DeleteActionPerformed(evt);
            }
        });

        EditWindow_Done.setText("Done");
        EditWindow_Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditWindow_DoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel6.setText("Cards");

        EditWindowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Word", "Translation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EditWindowTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(EditWindowTable);
        EditWindowTable.getColumnModel().getColumn(0).setResizable(false);
        EditWindowTable.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout EditWindowLayout = new javax.swing.GroupLayout(EditWindow.getContentPane());
        EditWindow.getContentPane().setLayout(EditWindowLayout);
        EditWindowLayout.setHorizontalGroup(
            EditWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditWindow_Done, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditWindowLayout.createSequentialGroup()
                        .addComponent(EditWindow_NewCard, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(EditWindow_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        EditWindowLayout.setVerticalGroup(
            EditWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EditWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditWindow_NewCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditWindow_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(EditWindow_Done, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        EditWindow_NewCardWindow.setAlwaysOnTop(true);
        EditWindow_NewCardWindow.setMinimumSize(new java.awt.Dimension(400, 400));
        EditWindow_NewCardWindow.setResizable(false);

        EditWindow_NewCardWindow_Add.setText("Add");
        EditWindow_NewCardWindow_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditWindow_NewCardWindow_AddActionPerformed(evt);
            }
        });

        EditWindowAddWordLabel.setAlignment(java.awt.Label.CENTER);
        EditWindowAddWordLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        EditWindowAddWordLabel.setText("New Card");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setText("Word");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setText("Translation");

        javax.swing.GroupLayout EditWindow_NewCardWindowLayout = new javax.swing.GroupLayout(EditWindow_NewCardWindow.getContentPane());
        EditWindow_NewCardWindow.getContentPane().setLayout(EditWindow_NewCardWindowLayout);
        EditWindow_NewCardWindowLayout.setHorizontalGroup(
            EditWindow_NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditWindow_NewCardWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EditWindow_NewCardWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditWindowAddWordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EditWindow_NewCardWindowLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(EditWindow_NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditWindow_NewCardWindowLayout.createSequentialGroup()
                        .addGroup(EditWindow_NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(EditWindow_NewCardWindow_WordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditWindow_NewCardWindow_TranslationField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(EditWindow_NewCardWindowLayout.createSequentialGroup()
                        .addComponent(EditWindow_NewCardWindow_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        EditWindow_NewCardWindowLayout.setVerticalGroup(
            EditWindow_NewCardWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditWindow_NewCardWindowLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(EditWindowAddWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(EditWindow_NewCardWindow_WordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditWindow_NewCardWindow_TranslationField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditWindow_NewCardWindow_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(800, 300, 0, 0));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        UIWindow_NewDeck.setText("New Deck");
        UIWindow_NewDeck.setMaximumSize(new java.awt.Dimension(80, 20));
        UIWindow_NewDeck.setMinimumSize(new java.awt.Dimension(80, 20));
        UIWindow_NewDeck.setPreferredSize(new java.awt.Dimension(80, 20));
        UIWindow_NewDeck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_NewDeckActionPerformed(evt);
            }
        });

        UIWindow_Quit.setText("Quit");
        UIWindow_Quit.setMaximumSize(new java.awt.Dimension(80, 20));
        UIWindow_Quit.setMinimumSize(new java.awt.Dimension(80, 20));
        UIWindow_Quit.setPreferredSize(new java.awt.Dimension(80, 20));
        UIWindow_Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_QuitActionPerformed(evt);
            }
        });

        UIWindow_Start.setText("Start");
        UIWindow_Start.setPreferredSize(new java.awt.Dimension(79, 23));
        UIWindow_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_StartActionPerformed(evt);
            }
        });

        UIWindow_Browse.setText("Browse");
        UIWindow_Browse.setMaximumSize(new java.awt.Dimension(80, 20));
        UIWindow_Browse.setMinimumSize(new java.awt.Dimension(80, 20));
        UIWindow_Browse.setPreferredSize(new java.awt.Dimension(80, 20));
        UIWindow_Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_BrowseActionPerformed(evt);
            }
        });

        UIWindow_Delete.setText("Delete");
        UIWindow_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_DeleteActionPerformed(evt);
            }
        });

        UIWindow_UpdateList.setText("Update List");
        UIWindow_UpdateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_UpdateListActionPerformed(evt);
            }
        });

        UIWindow_Edit.setText("Edit");
        UIWindow_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIWindow_EditActionPerformed(evt);
            }
        });

        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ScrollPane.setViewportView(jList);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Decks");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UIWindow_NewDeck, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UIWindow_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UIWindow_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UIWindow_Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(460, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UIWindow_Start, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(UIWindow_Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(UIWindow_UpdateList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UIWindow_NewDeck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UIWindow_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UIWindow_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UIWindow_Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UIWindow_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIWindow_Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UIWindow_UpdateList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-541)/2, (screenSize.height-470)/2, 541, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void NewDeckWindow_NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckWindow_NameFieldActionPerformed
        deck.setDeckName(NewDeckWindow_NameField.getText());
    }//GEN-LAST:event_NewDeckWindow_NameFieldActionPerformed

    private void NewDeckWindow_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewDeckWindow_CancelMouseClicked
        NewDeckWindow.setVisible(false);
    }//GEN-LAST:event_NewDeckWindow_CancelMouseClicked

    private void NewCardWindow_DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCardWindow_DoneActionPerformed
        NewCardWindow.setVisible(false);
        UIWindow_UpdateList.doClick();
    }//GEN-LAST:event_NewCardWindow_DoneActionPerformed

    private void NewCardWindow_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCardWindow_AddActionPerformed
        if (NewCardWindow_WordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (NewCardWindow_TranslationField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            Cards card = new Cards(NewCardWindow_WordField.getText(), NewCardWindow_TranslationField.getText());
            deck.add(card);
            String word = card.getWord();
            String translation = card.getTranslation();
            try {
            handler.writeToFile(deck.getDeckName(), word, translation);
            } catch (Exception e) {
            System.out.println("NewWordAddButton(Translation) = ERROR");
            }
            NewCardWindow_WordField.setText("");
            NewCardWindow_TranslationField.setText("");
        }
    }//GEN-LAST:event_NewCardWindow_AddActionPerformed

    private void UIWindow_QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_UIWindow_QuitActionPerformed

    private void UIWindow_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_StartActionPerformed
        if (jList.getSelectedValue() != null) {
        
            wordIndex = 0;
            DrillWindow_AnswerLabel.setVisible(false);
            DrillWindow_ShowAnswer.setVisible(true);
        
            DrillWindow.setLocationRelativeTo(this);
            DrillWindow.setTitle("Practice - " + jList.getSelectedValue().toString());
            DrillWindow.setVisible(true);
            DrillWindow_Correct.setVisible(false);
            DrillWindow_Incorrect.setVisible(false);
            String selected = jList.getSelectedValue().toString();
            try {
            words = handler.getWords(selected);
            } catch (Exception e) {
                System.out.println("UiStartDrillingButton = ERROR");
            }
            DrillShowWordLabel.setText(words.get(wordIndex));
        }
    }//GEN-LAST:event_UIWindow_StartActionPerformed

    private void DrillWindow_CorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillWindow_CorrectActionPerformed
        ++wordIndex;
        stats.countToCorrectAnswers();
        allCardsGonethroughCheck();
    }//GEN-LAST:event_DrillWindow_CorrectActionPerformed

    private void DrillWindow_IncorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillWindow_IncorrectActionPerformed
        ++wordIndex;
        stats.countToIncorrectAnswers();
        allCardsGonethroughCheck();
    }//GEN-LAST:event_DrillWindow_IncorrectActionPerformed

    private void DrillWindow_ShowAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrillWindow_ShowAnswerActionPerformed
        DrillWindow_ShowAnswer.setVisible(false);
        DrillWindow_Correct.setVisible(true);
        DrillWindow_Incorrect.setVisible(true);
        DrillWindow_AnswerLabel.setVisible(true);
        DrillWindow_AnswerLabel.setText(words.get(wordIndex+1));
        ++wordIndex;
    }//GEN-LAST:event_DrillWindow_ShowAnswerActionPerformed

    private void UIWindow_BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_BrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File openedfile = chooser.getSelectedFile();
        try {
        String openedfilename = openedfile.getName();
        String newname = openedfilename.replace(".txt", "");
        System.out.println(newname);
        handler.addFile(newname);
        UIWindow_UpdateList.doClick();
        } catch (Exception e) {
            System.out.println("UI OPEN ERROR");
        }
    }//GEN-LAST:event_UIWindow_BrowseActionPerformed

    private void UIWindow_NewDeckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_NewDeckActionPerformed
        NewDeckWindow_NameField.setText("");
        NewDeckWindow.setLocationRelativeTo(this);
        NewDeckWindow.setTitle("Create decks");
        NewDeckWindow.setVisible(true);
    }//GEN-LAST:event_UIWindow_NewDeckActionPerformed

    private void UIWindow_UpdateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_UpdateListActionPerformed
        try {
            jList.setListData(handler.getWords("Tiedostolista").toArray());
        } catch (Exception e) {
            System.out.println("UiUpdateListButtonActionPerformed = ERROR");
        }
        jList.setSelectedIndex(0);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_UIWindow_UpdateListActionPerformed

    private void UIWindow_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_DeleteActionPerformed
        if (jList.getSelectedValue() != null) {
        handler.deleteFile(jList.getSelectedValue().toString());
        UIWindow_UpdateList.doClick();
        }
    }//GEN-LAST:event_UIWindow_DeleteActionPerformed

    private void NewDeckWindow_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDeckWindow_OKActionPerformed
        deck.setDeckName(NewDeckWindow_NameField.getText());
        if (!deck.getDeckName().isEmpty()) {
            try { 
                handler.createFile(NewDeckWindow_NameField.getText());
            } catch (Exception e) {
                System.out.println("error");
            
            }
            NewDeckWindow.setVisible(false);
            NewCardWindow.setLocationRelativeTo(this);
            NewCardWindow.setTitle("Create new cards - " + deck.getDeckName());
            NewCardWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid file name!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NewDeckWindow_OKActionPerformed

    private void UIWindow_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIWindow_EditActionPerformed
        if (jList.getSelectedValue() != null) {
        EditWindow.setLocationRelativeTo(this);
        EditWindow.setTitle(jList.getSelectedValue().toString());
        EditWindow.setVisible(true);
        getTableContent();
        }
    }//GEN-LAST:event_UIWindow_EditActionPerformed

    private void EditWindow_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditWindow_DeleteActionPerformed

        try {
        DefaultTableModel model = (DefaultTableModel) this.EditWindowTable.getModel();
        int row = EditWindowTable.getSelectedRow();
        int column = EditWindowTable.getSelectedColumn();
        
        String word = (String) EditWindowTable.getModel().getValueAt(row, column);
        String translation = (String) EditWindowTable.getModel().getValueAt(row, 1);
        try {
        handler.deleteWord(EditWindow.getTitle(), word, translation);
        } catch (Exception e) {
            System.out.println("EditWindowDeleteButton = ERROR");
        }
        model.removeRow(row);
        } catch (Exception e) {
            System.out.println("Cant delete Empty (Edit Window Delete Button)");
        }
        
    }//GEN-LAST:event_EditWindow_DeleteActionPerformed

    private void EditWindow_NewCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditWindow_NewCardActionPerformed
        EditWindow_NewCardWindow.setVisible(true);
        EditWindow_NewCardWindow.setLocationRelativeTo(this);
        EditWindow_NewCardWindow.setTitle(jList.getSelectedValue().toString());
    }//GEN-LAST:event_EditWindow_NewCardActionPerformed

    private void EditWindow_NewCardWindow_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditWindow_NewCardWindow_AddActionPerformed
        if (EditWindow_NewCardWindow_WordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (EditWindow_NewCardWindow_TranslationField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid input", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
            handler.writeToFile(jList.getSelectedValue().toString(), EditWindow_NewCardWindow_WordField.getText(), EditWindow_NewCardWindow_TranslationField.getText());
            } catch (Exception e) {
            System.out.println("NewWordAddButton(Translation) = ERROR");
            }
        }
        EditWindow_NewCardWindow_WordField.setText("");
        EditWindow_NewCardWindow_TranslationField.setText("");
        EditWindow_NewCardWindow.setVisible(false);
        getTableContent();
    }//GEN-LAST:event_EditWindow_NewCardWindow_AddActionPerformed

    private void DrillWindowWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_DrillWindowWindowClosed
        stats.reset();
    }//GEN-LAST:event_DrillWindowWindowClosed

    private void EditWindow_DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditWindow_DoneActionPerformed
        EditWindow.setVisible(false);
    }//GEN-LAST:event_EditWindow_DoneActionPerformed

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
        
        java.awt.EventQueue.invokeLater(new UI());
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label DrillShowWordLabel;
    private javax.swing.JSeparator DrillWIndowSeparator;
    private javax.swing.JDialog DrillWindow;
    private java.awt.Label DrillWindow_AnswerLabel;
    private javax.swing.JButton DrillWindow_Correct;
    private javax.swing.JButton DrillWindow_Incorrect;
    private javax.swing.JButton DrillWindow_ShowAnswer;
    private javax.swing.JDialog EditWindow;
    private java.awt.Label EditWindowAddWordLabel;
    private javax.swing.JTable EditWindowTable;
    private javax.swing.JButton EditWindow_Delete;
    private javax.swing.JButton EditWindow_Done;
    private javax.swing.JButton EditWindow_NewCard;
    private javax.swing.JDialog EditWindow_NewCardWindow;
    private javax.swing.JButton EditWindow_NewCardWindow_Add;
    private javax.swing.JTextField EditWindow_NewCardWindow_TranslationField;
    private javax.swing.JTextField EditWindow_NewCardWindow_WordField;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JDialog NewCardWindow;
    private javax.swing.JButton NewCardWindow_Add;
    private javax.swing.JButton NewCardWindow_Done;
    private javax.swing.JTextField NewCardWindow_TranslationField;
    private javax.swing.JTextField NewCardWindow_WordField;
    private javax.swing.JDialog NewDeckWindow;
    private javax.swing.JButton NewDeckWindow_Cancel;
    private javax.swing.JTextField NewDeckWindow_NameField;
    private javax.swing.JButton NewDeckWindow_OK;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JDialog StatsWindow;
    private javax.swing.JLabel StatsWindow_InfoLabel1;
    private javax.swing.JLabel StatsWindow_InfoLabel2;
    private javax.swing.JButton UIWindow_Browse;
    private javax.swing.JButton UIWindow_Delete;
    private javax.swing.JButton UIWindow_Edit;
    private javax.swing.JButton UIWindow_NewDeck;
    private javax.swing.JButton UIWindow_Quit;
    private javax.swing.JButton UIWindow_Start;
    private javax.swing.JButton UIWindow_UpdateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables

    private void allCardsGonethroughCheck() {
        if (wordIndex == words.size()) {
            StatsWindow.setLocationRelativeTo(this);
            DrillWindow.setVisible(false);
            StatsWindow.pack();
            StatsWindow.setVisible(true);
            StatsWindow.setTitle("Stats - " + jList.getSelectedValue().toString());
            StatsWindow_InfoLabel1.setText(stats.getTotalCorrectStats());
            StatsWindow_InfoLabel2.setText(stats.getTotalIncorrectStats());
            wordIndex = 0;
            stats.reset();

        } else {
           
            DrillWindow_AnswerLabel.setText("");
            DrillWindow_ShowAnswer.setVisible(true);
            DrillShowWordLabel.setText(words.get(wordIndex));

            DrillWindow_Correct.setVisible(false);
            DrillWindow_Incorrect.setVisible(false);
        }
    }

    private void getTableContent() {
        try {
        ArrayList<String> list = handler.getWords(jList.getSelectedValue().toString());
        DefaultTableModel model = new DefaultTableModel();
        EditWindowTable.setModel(model);
        model.setColumnIdentifiers(new String[] {"Word", "Translation"});
            for (int i = 0; i < list.size(); i++) {
                model.addRow(new String[] { list.get(i), list.get(i+1) });
                i++;
            }
        } catch (Exception e) {
            System.out.println("UiEditButtonAction = ERROR");
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clubpenguints;

/**
 *
 * @author CGouslin2026
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;

public class ClubPenguinTS {
    public static void main(String[] args) {
        // Launch the GUI on the Event Dispatch Thread
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClubGUI();
            }
        });
    }
}

class ClubGUI {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel container;
    private Map<String, int[]> records = new HashMap<>();

    public ClubGUI() {    
        createUI();
        loadRecords();
        initializeRecordsFile();
    }
    
    private void initializeRecordsFile() {
    File file = new File("record.txt");

        if (!file.exists()) {
            // Set up the default records
            records.put("Set One", new int[]{0, 0});
            records.put("Set Two", new int[]{0, 0});
            records.put("Set Three", new int[]{0, 0});

            // Save them to the file
            saveRecords();
        } else {
            // If the file exists, load existing records
            loadRecords();
        }
    }

    private void createUI() {
        // Create the frame
        frame = new JFrame("Club Goose");
        frame.setSize(1500, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a container panel with CardLayout to switch between screens
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        // Add different screens (menus)
        container.add(new MainMenuPanel(), "MainMenu");
        container.add(new PlayMenuPanel(), "PlayMenu");
        container.add(new SettingsMenuPanel(), "SettingsMenu");
        container.add(new RecordEditorPanel(), "RecEdPanel");
        container.add(new TTTPanel(), "TTTPanel");

        // Add the container to the frame
        frame.add(container, BorderLayout.CENTER);

        // Set the initial screen to be the main menu
        cardLayout.show(container, "MainMenu");

        // Make the frame visible
        frame.setVisible(true);
    }
    
    // record saving method
    
    public void saveRecords() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("record.txt"))) {
        // Loop through all records (sets and scores)
            for (Map.Entry<String, int[]> entry : records.entrySet()) {
                String setName = entry.getKey();  // Set1, Set2, or Set3
                int[] scores = entry.getValue();  // score1, score2
            
                // Write the set name and the scores to the file
                writer.write(setName + ":" + scores[0] + "," + scores[1]);
                writer.newLine(); // Move to the next line for the next record
            }
    } catch (IOException e) {
        e.printStackTrace();
        }
    }
       
    // loading records method
       
       public void loadRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader("record.txt"))) {
        String line;
        
        // Loop through each line in the file
        while ((line = reader.readLine()) != null) {
            // Expected format: Set1:score1,score2
            String[] parts = line.split(":");
            String setName = parts[0];  // Set1, Set2, or Set3
            String[] scores = parts[1].split(",");
            int score1 = Integer.parseInt(scores[0]);
            int score2 = Integer.parseInt(scores[1]);

            // Put the set and its scores into the records map
            records.put(setName, new int[]{score1, score2});
        }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
   

    // Main menu panel
    class MainMenuPanel extends JPanel {
        private JButton playBtn, settingsBtn;
        private ImageIcon logoIcon = new ImageIcon(getClass().getResource("/com/mycompany/clubpenguints/images/clubPandaLogo.png"));
        
        // create logo jlabel
        
        JLabel logoDisplay = new JLabel(logoIcon);

        public MainMenuPanel() {
            setLayout(null);
            setBackground(new Color(112, 146, 190));

            // Create play button
            playBtn = new JButton("Play");
            playBtn.setBounds(600, 440, 300, 120);
            playBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "PlayMenu");
                }
            });

            // Create settings button
            settingsBtn = new JButton("Settings");
            settingsBtn.setBounds(600, 580, 300, 120);
            settingsBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "SettingsMenu");
                }
            });
            
            // set JLabel dimensions
            
            logoDisplay.setBounds(400, 100, logoIcon.getIconWidth(), logoIcon.getIconHeight());
            logoDisplay.setVisible(true);
            

            // Add components to the panel
            add(playBtn);
            add(settingsBtn);
            add(logoDisplay);
        }
    }

    // Play menu panel
    class PlayMenuPanel extends JPanel {
        private JButton backBtn;
        private JButton TTTBtn;

        public PlayMenuPanel() {
            setBackground(new Color(112, 146, 190));
            setLayout(null);

            // Create a back button
            backBtn = new JButton("Main Menu");
            backBtn.setBounds(600, 580, 300, 120);
            backBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "MainMenu");
                }
            });
            
            // ttt button
            
            TTTBtn = new JButton("Tic Tac Toe");
            TTTBtn.setBounds(600, 440, 300, 120);
            TTTBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "TTTPanel");
                }
            });    
            // Add the back button to the panel
            add(backBtn);
            add(TTTBtn);
        }
    }
    
    // TTT Panel /////////////////////////////////////////////
    
    class TTTPanel extends JPanel{
        private JButton backBtn, p1StartBtn, p2StartBtn, recEdBtn2;
        private JLabel statusLabel;
        private JButton[][] boardButtons = new JButton[3][3];
        private String currentPlayer = "X"; // Player 1 = X, Player 2 = O
        private boolean gameActive = false;

        public TTTPanel() {
            setBackground(new Color(112, 146, 190));
            setLayout(null);

            statusLabel = new JLabel("Who goes first?");
            statusLabel.setFont(new Font("Arial", Font.BOLD, 24));
            statusLabel.setBounds(550, 50, 400, 50);
            add(statusLabel);

            p1StartBtn = new JButton("Player 1 Starts");
            p1StartBtn.setBounds(500, 120, 200, 50);
            p1StartBtn.addActionListener(e -> startGame("X"));
            add(p1StartBtn);

            p2StartBtn = new JButton("Player 2 Starts");
            p2StartBtn.setBounds(800, 120, 200, 50);
            p2StartBtn.addActionListener(e -> startGame("O"));
            add(p2StartBtn);
            
            // to rec ed panel on win
            
            recEdBtn2 = new JButton ("Edit Records");
            recEdBtn2.setBounds(600, 600, 300, 120);
            recEdBtn2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "RecEdPanel");
                }               
            });
            add(recEdBtn2);
            recEdBtn2.setVisible(false);
            
            // Back button
            backBtn = new JButton("Back");
            backBtn.setBounds(50, 700, 200, 50);
            backBtn.addActionListener(e -> cardLayout.show(container, "PlayMenu"));
            add(backBtn);

            // Board setup (invisible until game starts)
            int startX = 500;
            int startY = 200;
            int size = 100;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    JButton button = new JButton("");
                    button.setFont(new Font("Arial", Font.BOLD, 36));
                    button.setBounds(startX + col * size, startY + row * size, size, size);
                    final int r = row;
                    final int c = col;
                    button.addActionListener(e -> handleMove(button, r, c));
                    boardButtons[row][col] = button;
                    button.setVisible(false); // hidden until game starts
                    add(button);
                }
            }
        }

        private void startGame(String firstPlayer) {
            currentPlayer = firstPlayer;
            statusLabel.setText((firstPlayer.equals("X") ? "Player 1" : "Player 2") + " starts! Game on.");
            gameActive = true;
            recEdBtn2.setVisible(false);

            // Reset board
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    boardButtons[row][col].setText("");
                    boardButtons[row][col].setEnabled(true);
                    boardButtons[row][col].setVisible(true);
                }
            }
        }

        private void handleMove(JButton button, int row, int col) {
            if (!gameActive || !button.getText().equals("")) return;

            button.setText(currentPlayer);
            button.setEnabled(false);

            if (checkWin(currentPlayer)) {
                statusLabel.setText((currentPlayer.equals("X") ? "Player 1" : "Player 2") + " wins!");
                if (currentPlayer.equals("X")){
                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                }
                gameActive = false;
                recEdBtn2.setVisible(true);
            } else if (isBoardFull()) {
                statusLabel.setText("Draw!");
                gameActive = false;
                recEdBtn2.setVisible(true);
            } else {
                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
                statusLabel.setText((currentPlayer.equals("X") ? "Player 1" : "Player 2") + "'s Turn");
            }
        }

        private boolean isBoardFull() {
            for (JButton[] row : boardButtons) {
                for (JButton b : row) {
                    if (b.getText().equals("")) return false;
                }
            }
            return true;
        }

        private boolean checkWin(String player) {
            // Rows, cols, diagonals
            for (int i = 0; i < 3; i++) {
                if (boardButtons[i][0].getText().equals(player) &&
                    boardButtons[i][1].getText().equals(player) &&
                    boardButtons[i][2].getText().equals(player)) return true; 

                if (boardButtons[0][i].getText().equals(player) &&
                    boardButtons[1][i].getText().equals(player) &&
                    boardButtons[2][i].getText().equals(player)) return true; 
                }
                if (boardButtons[0][0].getText().equals(player) &&
                    boardButtons[1][1].getText().equals(player) &&
                    boardButtons[2][2].getText().equals(player)) return true; 

                if (boardButtons[0][2].getText().equals(player) &&
                    boardButtons[1][1].getText().equals(player) &&
                    boardButtons[2][0].getText().equals(player)) return true; 

                return false;
            }
        }

    // Settings menu panel
    class SettingsMenuPanel extends JPanel {
        private JButton backBtn;
        private JButton recEdBtn;

        public SettingsMenuPanel() {
            setBackground(new Color(112, 146, 190));
            setLayout(null);

            // Create a back button
            backBtn = new JButton("Main Menu");
            backBtn.setBounds(600, 580, 300, 120);
            backBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "MainMenu");
                }
            });
            
            // create a record editor button
            
            recEdBtn = new JButton ("Edit Records");
            recEdBtn.setBounds(600, 440, 300, 120);
            recEdBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cardLayout.show(container, "RecEdPanel");
                }
            });

            // Add the back button to the panel
            add(backBtn);
            add(recEdBtn);
        }  
    }
    
    // record editor panel
        
    class RecordEditorPanel extends JPanel {
        private JButton sr1Btn, sr2Btn, sr3Btn, addP1Btn, subP1Btn, addP2Btn, subP2Btn, clearRecBtn, backBtn;
        private JLabel recDisplay;
        
        private String selectedSet = "Set One";
        
        public RecordEditorPanel() {
            setBackground(new Color(112, 146, 190));
            setLayout(null);
            initializeRecordsFile();

            // Record Selection Buttons (Set One, Set Two, Set Three)
            sr1Btn = new JButton("Set One");
            sr1Btn.setBounds(100, 100, 200, 50);
            sr1Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    selectedSet = "Set One";
                    updateRecordDisplay();  // Update display with selected record
                }
            });

            sr2Btn = new JButton("Set Two");
            sr2Btn.setBounds(100, 200, 200, 50);
            sr2Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    selectedSet = "Set Two";
                    updateRecordDisplay();  // Update display with selected record
                }
            });

            sr3Btn = new JButton("Set Three");
            sr3Btn.setBounds(100, 300, 200, 50);
            sr3Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    selectedSet = "Set Three";
                    updateRecordDisplay();  // Update display with selected record
                }
            });

            // Buttons for adding/subtracting scores
            addP1Btn = new JButton("Add Player 1");
            addP1Btn.setBounds(400, 100, 200, 50);
            addP1Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    updateScore("player1", 1);  // Increment Player 1's score
                    updateRecordDisplay();
                }
            });

            subP1Btn = new JButton("Subtract Player 1");
            subP1Btn.setBounds(400, 200, 200, 50);
            subP1Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    updateScore("player1", -1);  // Decrement Player 1's score
                    updateRecordDisplay();
                }
            });

            addP2Btn = new JButton("Add Player 2");
            addP2Btn.setBounds(400, 300, 200, 50);
            addP2Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    updateScore("player2", 1);  // Increment Player 2's score
                    updateRecordDisplay();
                }
            });

            subP2Btn = new JButton("Subtract Player 2");
            subP2Btn.setBounds(400, 400, 200, 50);
            subP2Btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    updateScore("player2", -1);  // Decrement Player 2's score
                    updateRecordDisplay();
                }
            });

            // Clear Record Button
            clearRecBtn = new JButton("Clear Record");
            clearRecBtn.setBounds(400, 500, 200, 50);
            clearRecBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    initializeRecordsFile();
                    records.put(selectedSet, new int[] {0, 0});  // Reset scores for selected set
                    saveRecords();  // Save the updated records to the file
                    updateRecordDisplay();  // Update display to reflect reset
                }
            });

            // Back Button to return to the previous screen
            backBtn = new JButton("Back");
            backBtn.setBounds(1000, 700, 200, 50);
            backBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    recDisplay.setText("Select a record");
                    cardLayout.show(container, "MainMenu");  // Go back to Main Menu
                }
            });

            // Display label for showing selected set score
            recDisplay = new JLabel("Select a record");/////////////////////////// heres the issue, ask what .put and what "records" is
            recDisplay.setBounds(100, 10, 400, 50);
            recDisplay.setFont(new Font("Arial", Font.PLAIN, 24));
            recDisplay.setForeground(Color.BLACK);

            // Add components to the panel
            add(sr1Btn);
            add(sr2Btn);
            add(sr3Btn);
            add(addP1Btn);
            add(subP1Btn);
            add(addP2Btn);
            add(subP2Btn);
            add(clearRecBtn);
            add(backBtn);
            add(recDisplay);
        }

        // Update the displayed score for the selected set
        private void updateRecordDisplay() {
            int[] scores = records.getOrDefault(selectedSet, new int[] {0, 0});  // Default to [0, 0] if no record exists
            recDisplay.setText(selectedSet + ": " + scores[0] + " - " + scores[1]);
        }

        // Method to update the score for a player and save the data
        private void updateScore(String player, int change) {
            initializeRecordsFile();
            int[] scores = records.getOrDefault(selectedSet, new int[2]);  // Default to [0, 0] if no record exists
            if (player.equals("player1")) {
                scores[0] += change;  // Increment or decrement Player 1's score
            } else if (player.equals("player2")) {
                scores[1] += change;  // Increment or decrement Player 2's score
            }
            records.put(selectedSet, scores);  // Update the record in the map
            saveRecords();  // Save the updated records to the file
            updateRecordDisplay();  // Update the display to reflect the new scores
        }        
    }
    
    
}

// change bg to green/ bamboo
// make or import games
// make new menus
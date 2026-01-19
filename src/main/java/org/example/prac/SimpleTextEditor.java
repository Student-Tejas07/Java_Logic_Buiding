package org.example.prac;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleTextEditor extends Frame implements ActionListener {

    TextArea textArea;
    Label statusBar;

    MenuItem newFile, openFile, saveFile, exitApp;
    MenuItem fontIncrease, fontDecrease, themeToggle;

    FileDialog fileDialog;
    boolean darkTheme = false;
    int fontSize = 14;

    SimpleTextEditor() {

        setTitle("Simple Text Editor - AWT");
        setSize(600, 500);
        setLayout(new BorderLayout());

        textArea = new TextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, fontSize));
        add(textArea, BorderLayout.CENTER);

        statusBar = new Label("Ready");
        add(statusBar, BorderLayout.SOUTH);

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        newFile = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
        openFile = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
        saveFile = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
        exitApp = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_E));

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(exitApp);

        Menu viewMenu = new Menu("View");
        fontIncrease = new MenuItem("Increase Font");
        fontDecrease = new MenuItem("Decrease Font");
        themeToggle = new MenuItem("Toggle Theme");

        viewMenu.add(fontIncrease);
        viewMenu.add(fontDecrease);
        viewMenu.add(themeToggle);

        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        setMenuBar(menuBar);

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exitApp.addActionListener(this);
        fontIncrease.addActionListener(this);
        fontDecrease.addActionListener(this);
        themeToggle.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newFile) {
            textArea.setText("");
            statusBar.setText("New file created");
        }

        if (e.getSource() == openFile) {
            fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
            fileDialog.setVisible(true);

            if (fileDialog.getFile() != null) {
                try {
                    BufferedReader br = new BufferedReader(
                            new FileReader(fileDialog.getDirectory() + fileDialog.getFile()));

                    textArea.setText("");
                    String line;
                    while ((line = br.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                    br.close();
                    statusBar.setText("File opened successfully");
                } catch (Exception ex) {
                    statusBar.setText("Error opening file");
                }
            }
        }

        if (e.getSource() == saveFile) {
            fileDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
            fileDialog.setVisible(true);

            if (fileDialog.getFile() != null) {
                try {
                    BufferedWriter bw = new BufferedWriter(
                            new FileWriter(fileDialog.getDirectory() + fileDialog.getFile()));

                    bw.write(textArea.getText());
                    bw.close();
                    statusBar.setText("File saved successfully");
                } catch (Exception ex) {
                    statusBar.setText("Error saving file");
                }
            }
        }

        if (e.getSource() == exitApp) {
            dispose();
        }

        if (e.getSource() == fontIncrease) {
            fontSize += 2;
            textArea.setFont(new Font("Arial", Font.PLAIN, fontSize));
            statusBar.setText("Font size increased");
        }

        if (e.getSource() == fontDecrease) {
            fontSize -= 2;
            textArea.setFont(new Font("Arial", Font.PLAIN, fontSize));
            statusBar.setText("Font size decreased");
        }

        if (e.getSource() == themeToggle) {
            if (!darkTheme) {
                textArea.setBackground(Color.BLACK);
                textArea.setForeground(Color.WHITE);
                darkTheme = true;
                statusBar.setText("Dark theme enabled");
            } else {
                textArea.setBackground(Color.WHITE);
                textArea.setForeground(Color.BLACK);
                darkTheme = false;
                statusBar.setText("Light theme enabled");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleTextEditor();
    }
}




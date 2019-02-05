package ShootingGame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
 
public class Buttons extends game_Frame {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
 
    public Buttons() {
        prepareGUI();
    }
 
    public static void main(String[] args) {
        Buttons awtControlDemo = new Buttons();
        awtControlDemo.showButton();
    }
    
	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);

		th = new Thread(this);
		th.start();
	}

 
    private void prepareGUI() {

        mainFrame = new Frame("AHG223 Game");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
 
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("Level Select");
 
        statusLabel = new Label();
        statusLabel.setText("Please select Level");
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
 
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
 
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
 
    void showButton() {
 
        Button Lv1 = new Button("Level 1");
        Button Lv2 = new Button("Level 2");
        Button Lv3 = new Button("Level 3");
 
        Lv1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

        		start();
        		game_Score = 0;
        		player_Hitpoint = 10;
        		player_Speed = 20; 
        		missile_Speed = 20; 
        		fire_Speed = 20; 
        		enemy_speed = 7;
        		
            }
        });
 
        Lv2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

        		start();
            	game_Score = 0;
        		player_Hitpoint = 5;
        		player_Speed = 20;
        		missile_Speed = 11;
        		fire_Speed = 15; 
        		enemy_speed = 15;
        		
            }
        });
 
        Lv3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

        		start();
            	game_Score = 0;
        		player_Hitpoint = 3;
        		player_Speed = 20; 
        		missile_Speed = 9; 
        		fire_Speed = 10; 
        		enemy_speed = 30;
        		
            }
        });
 
        controlPanel.add(Lv1);
        controlPanel.add(Lv2);
        controlPanel.add(Lv3);
 
        mainFrame.setVisible(true);
 
    }
}

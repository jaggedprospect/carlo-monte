package views;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel{

    private boolean isVisible; 
    
    public GameView(boolean isVisible){
        this.isVisible = isVisible;
        fpsLabel = new JLabel();

        init();
    }

    private void init(){
        getPreferredSize();
        setBackground(new Color(135, 50, 60));
        setVisible(isVisible);

        fpsLabel.setForeground(Color.white);
        add(fpsLabel);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}

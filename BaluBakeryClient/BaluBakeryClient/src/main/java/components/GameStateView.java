package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GameStateView extends JPanel {
    JButton bakingButton;
    public GameStateView() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(400,450));
        this.setVisible(true);
        this.setBackground(new Color(89, 120, 51)); // Calmer and colder cyan color

        this.bakingButton=new JButton("BAKE!");
        bakingButton.addActionListener(this::bakeAction);
        bakingButton.setBackground(new Color(129, 146, 57));
        bakingButton.setForeground(Color.green);
        bakingButton.setPreferredSize(new Dimension(125, 140));
        bakingButton.setFont(bakingButton.getFont().deriveFont(16f));

        add(bakingButton);
    }

    private void bakeAction(ActionEvent a) {

    }
}

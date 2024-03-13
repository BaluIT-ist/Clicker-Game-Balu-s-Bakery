package components;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GameStateView extends JPanel {
    public GameStateView() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(400,450));
        this.setVisible(true);
    }
}

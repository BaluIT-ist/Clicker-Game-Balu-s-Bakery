package components;
import com.sun.java.accessibility.util.GUIInitializedListener;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class GameView extends JFrame {
    public GameView() {
        super();
        GameStateView panel = new GameStateView();
        add(panel);
        this.setSize(new Dimension(1000,600));
        this.setVisible(true);
    }
}

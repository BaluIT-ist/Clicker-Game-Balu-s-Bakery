package components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Arrays;

@SuppressWarnings("serial")
public class GameStateView extends JPanel {

    public GameStateView() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(400,450));
        this.setVisible(true);
        this.setBackground(new Color(89, 120, 51)); // Calmer and colder cyan color

        JPanel panelBakeButton= new JPanel(new BorderLayout());
        panelBakeButton.setBackground(new Color(0,0,0,0));
        panelBakeButton.setPreferredSize(new Dimension(300,300));
        panelBakeButton.add(createBakingButton(), BorderLayout.SOUTH);
        add(panelBakeButton);


        JPanel panelSpacing=new JPanel();
        panelSpacing.setBackground(new Color(0,0,0,0));
        panelSpacing.setPreferredSize(new Dimension(400,500));
        panelSpacing.add(panelBakeButton,BorderLayout.CENTER);
        add(panelSpacing);



    }


    private JButton createBakingButton()
    {
        try {
            Image image = ImageIO.read(new File("src/main/resources/Cakes/Cookie.png"));

            JButton bakingButton=new JButton(new ImageIcon(image));
            bakingButton.addActionListener(this::bakeAction);
            bakingButton.setBackground(new Color(0, 0, 0,0));

            return bakingButton;

        } catch(Exception e) {
            System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
        }

        return null;

    }


    private void bakeAction(ActionEvent a) {

        System.out.println("You just baked a cookie!");

    }
}

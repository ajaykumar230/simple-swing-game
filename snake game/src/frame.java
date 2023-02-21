import javax.swing.*;

public class frame extends JFrame {
    frame(){
        //addind the panel component to the frame
        this.add(new panel());
        //setting the tittle of the window
        this.setTitle("Snakegame");
        // ensuring uniform experience by fixing the bounds of the window
        this.setResizable(false);
        //layout manner will size the window according to the display
        this.pack();
        this.setVisible(true);
    }
}

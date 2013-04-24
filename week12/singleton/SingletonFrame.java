package week12.singleton;

import javax.swing.*;

public class SingletonFrame extends JFrame {
    private static SingletonFrame myInstance;

    // the constructor
    private SingletonFrame() {
        this.setSize(400, 100);

        this.setTitle("Singleton Frame. Timestamp:" +
            System.currentTimeMillis());

        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public static SingletonFrame getInstance() {
        if (myInstance == null)
            myInstance = new SingletonFrame();

        return myInstance;
    }

}

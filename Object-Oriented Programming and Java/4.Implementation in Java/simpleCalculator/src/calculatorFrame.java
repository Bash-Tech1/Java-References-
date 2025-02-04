import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class CalculatorFrame extends Frame implements ActionListener {
    calculatorEngine engine;
    TextField display;

    // Window Listener to close application
    WindowListener listener = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    };

    // Constructor
    CalculatorFrame(calculatorEngine e) {
        super("Calculator");
        engine = e;

        // Creating Layout Panels
        Panel top = new Panel();
        Panel bottom = new Panel();
        top.add(display = new TextField(20));

        bottom.setLayout(new GridLayout(5, 5));

        // Adding Buttons
        String[] buttons = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "C", "0", "=", "/",
                "^","!"
        };

        for (String label : buttons) {
            Button b = new Button(label);
            b.addActionListener(this);
            bottom.add(b);
        }

        // Setting Frame Layout
        setLayout(new BorderLayout());
        add("North", top);
        add("South", bottom);
        addWindowListener(listener);

        setSize(200, 200);  // Set a slightly larger size
        setResizable(false); // Prevent window resizing
        setVisible(true);    // Make window visible
    }

    String ans = "";
    // Handling Button Clicks
    public void actionPerformed(ActionEvent e) {
        char c = e.getActionCommand().charAt(0);
        switch (c) {
            case '+': engine.add(); ans += "+"; break;
            case '-': engine.subtract();ans += "-"; break;
            case '*': engine.multiply();ans +=  "*";break;
            case '/': engine.divide(); ans += "/";break;
            case '^': engine.squareOf(); ans += "^";break;
            case '!': engine.factorial(engine.getValue());ans += "!";break;
            case '=': engine.compute();ans += " = ";ans += (String.valueOf(engine.getKeep()));break;
            case 'C': engine.clear();ans = "";break;
            default:
                if (Character.isDigit(c)) {
                    engine.digit(c - '0');
                    ans += c - '0';
                }
        }
        display.setText(ans);
    }
}

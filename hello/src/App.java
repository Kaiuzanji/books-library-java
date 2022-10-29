import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String x = JOptionPane.showInputDialog(null, "Testando input");
        System.out.println("O valor inserido foi: " + x);
    }
}

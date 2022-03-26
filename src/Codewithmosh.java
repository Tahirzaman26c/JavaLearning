import com.codewithmosh.TextBox;

public class Codewithmosh {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = textBox1;

        textBox2.setText("Elooo wold");
        System.out.println(textBox1.text);
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Text extends Parser{
    String[] text = new String[1];

    public Text(String input, String[] textArr) {
        this.text = text;
    }

    public void setText(String textString) {
        int length = this.text.length +1;
        String[] tempArr = new String[length];
        System.arraycopy(this.text, 0, tempArr, 0, this.text.length);
        tempArr[length - 2] = textString;
        this.text = tempArr;
    }

}

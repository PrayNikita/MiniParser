import java.util.Arrays;

public class CheckText {
    private String input;
    private Numbers numArr;
    private Text textArr;

    public CheckText(String input, Numbers numArr, Text textArr) {
        this.input = input;
        this.numArr = numArr;
        this.textArr = textArr;
    }


    public CheckText(String input, int[] numbers) {
        this.input = input;
        this.numArr = new Numbers(numbers);
        this.textArr = new Text(input, new String[0]);
    }

    @Override
    public String toString() {
        return "CheckText{" +
                "input='" + input + '\'' +
                ", numArr=" + Arrays.toString(numArr.numbers) +
                ", textArr=" + Arrays.toString(textArr.text) +
                '}';
    }

    public static boolean checkText(String text) {
        return Numbers.isNumber(text);
    }
}

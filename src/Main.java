public class Main {
    public static void main(String[] args) {
        String input = "Hallo Test 123 für Test.";
        CheckText text = parser(input);
        System.out.println(text);
    }

    public static CheckText parser(String input) {
        int start = 0, end;
        String tempString;
        Numbers tempNumber = new Numbers(new int[1]);
        Text tempText = new Text(input, new String[1]);

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ' || input.charAt(i) == '.') {
                end = i;
                tempString = input.substring(start, end).trim();

                boolean isNumber = CheckText.checkText(tempString);

                if (isNumber) {
                    tempNumber.setNumber(tempString);
                } else {
                    tempText.setText(tempString);
                }

                start = i + 1;
            }
        }

        return new CheckText(input, tempNumber, tempText);
    }
}

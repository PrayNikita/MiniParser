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

        boolean isText = false;

        for (int i = 0; i < input.length(); i++) {

            if (!isText) {
                char ch = input.charAt(i);
                if (!Character.isDigit(ch) && input.charAt(i) != ' ' && input.charAt(i) != '.') {
                    isText = true;
                }
            }


            if (input.charAt(i) == ' ' || input.charAt(i) == '.') {
                end = i;
                tempString = input.substring(start, end).trim();


                if (isText){
                    tempText.setText(tempString);
                }else{
                    tempNumber.setNumber(tempString);
                }

                start = i + 1;
                isText = false;
            }
        }

        return new CheckText(input, tempNumber, tempText);
    }
}

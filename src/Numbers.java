public class Numbers extends Parser{
    protected int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumber(String number) {
        int intNumber = stringToInt(number);
        int length = this.numbers.length + 1;

        int[] tempArr = new int[length];

        System.arraycopy(this.numbers, 0, tempArr, 0, this.numbers.length);
        tempArr[length - 2] = intNumber;
        this.numbers = tempArr;
    }

    public static int getLength(String number) {
        return number.length();
    }

    public static int stringToInt(String number) {
        int length = getLength(number);
        int tempInt;
        int intNumber = 0;
        char tempChar;

        for (int i = 0; i < length; i++) {
            tempChar = number.charAt(i);
            tempInt = Character.getNumericValue(tempChar);

            if (length > 2) {
                intNumber *= 10;
            }
            intNumber += tempInt;
        }
        return intNumber;
    }

    public static boolean isNumber(String text) {
        for (int i = 0; i < text.length(); i++) {

        }
        return true;
    }
}

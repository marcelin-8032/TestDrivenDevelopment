package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sumString(String numbers) {
        int retValue = 0;
        String[] numbersArray = numbers.split(",|n");
//        if (numbersArray.length > 2) {
//            throw new RuntimeException("Up to 2 numbers accepts");
//        } else {
        for (String n : numbersArray) {
            if (!numbers.trim().isEmpty()) {
                retValue += Integer.parseInt(n.trim());
            }
        }

        return retValue;
    }

    public int sumString1(String numbers) {
        String delimiter = ",|n";
        String numbersWithoutDelimiter = numbers;

        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n")+1);
        }
        return sumString2(numbersWithoutDelimiter, delimiter);
    }

    private int sumString2(String numbers, String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);

        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;

    }


}

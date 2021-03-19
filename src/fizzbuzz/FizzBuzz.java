package fizzbuzz;

public class FizzBuzz {
    public String generate(int minNumber, int maxNumber) {
        return evaluateNumbers(minNumber, maxNumber);
    }

    private String evaluateNumbers(int minNumber, int maxNumber) {
        String result = "";
        while (minNumber <= maxNumber) {
            result += evaluateNumber(minNumber++);
        }
        return result;
    }

    private String evaluateNumber(int number) {
        if (number % 15 == 0)
            return "FIZZBUZZ";
        else if (number % 3 == 0)
            return "FIZZ";
        else if (number % 5 == 0)
            return "BUZZ";
        return String.valueOf(number);
    }

}

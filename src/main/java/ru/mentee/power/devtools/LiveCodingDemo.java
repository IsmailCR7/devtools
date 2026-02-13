package ru.mentee.power.devtools;

public class LiveCodingDemo {
    public static void main(String[] args){
        PrintFizzBuzz(15);
        Integer[] test1 = {null, 2, 3, 4, 5, 6};
        System.out.println("The sum of even numbers: " + sumEven(test1));
        System.out.println("The sum of odd numbers: " + sumOdd(test1));
        System.out.println("The max number of array: " + maxNum(test1));
    }
    public static void PrintFizzBuzz(int n){
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            }else {
                System.out.println(i);
            }

        }

    }
    public static int sumEven(Integer[] numbers){
        int sum = 0;
        if ( numbers == null && numbers.length == 0 ) {
            return Integer.MIN_VALUE;
        }
        for (int i =  0; i < numbers.length; i++){
            if (numbers[i] != null && numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }
        return sum;
    }
    public static int sumOdd(Integer[] numbers){
        if (numbers == null && numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != null && numbers[i] % 2 != 0){
                sum += numbers[i];
            }
        }
        return sum;
    }
    public static int maxNum(Integer[] numbers){
        int max = Integer.MIN_VALUE;
        boolean foundValid = false;

        for (int i = 0; i < numbers.length; i++) {
            // Проверяем каждый элемент на null
            if (numbers[i] != null) {
                if (!foundValid) {
                    max = numbers[i];
                    foundValid = true;
                } else if (max < numbers[i]) {
                    max = numbers[i];
                }
            }
        }

        // Если все элементы null, возвращаем MIN_VALUE
        return foundValid ? max : Integer.MIN_VALUE;
    }
}

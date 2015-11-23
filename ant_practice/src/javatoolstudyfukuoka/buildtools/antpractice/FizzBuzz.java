package javatoolstudyfukuoka.buildtools.antpractice;

import java.util.stream.IntStream;

/**
 * FizzBuzz問題
 * 
 * @author tksy
 */
public class FizzBuzz {

    /**
     * 1〜100までのFizzBuzz結果を標準出力に出力する
     * 
     * @param args 起動引数は使用しない
     */
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::fizzBuzz)
                .forEach(System.out::println);
    }
    
    /**
     * 与えられた整数に対して、FizzBuzzの結果を文字列で返却する
     * 
     * @param value 整数値
     * @return valueが3で割り切れる場合は"Fizz"
     *         valueが5で割り切れる場合は"Buzz"
     *         valueが3でも5でも割り切れる場合は"FizzBuzz"
     *         3でも5でも割り切れない場合与えられた整数をそのまま文字列で返却する
     */
    public static String fizzBuzz(int value) {
        if (value % 15 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(value);
        }
    }
}

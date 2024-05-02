package quiz1;

import java.math.BigInteger;

public class Solution {
  public String solution(String a, String b) {
    String answer = "";

    BigInteger number1 = new BigInteger(a);
    BigInteger number2 = new BigInteger(b);

    answer = number1.add(number2).toString();
    System.out.println("answer = " + answer);
    return answer;
  }
}

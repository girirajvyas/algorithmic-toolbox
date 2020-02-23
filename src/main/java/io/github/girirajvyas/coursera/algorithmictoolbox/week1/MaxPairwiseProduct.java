package io.github.girirajvyas.coursera.algorithmictoolbox.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {

  /**
   * Time Complexity: O(n^2)
   * 
   * @param numbers
   * @return
   */
  public static int findPairWithMaxProductNaive(int numbers[]) {
    int max_product = 0;

    for (int first = 0; first < numbers.length; first++) {
      for (int second = first + 1; second < numbers.length; second++) {
        if (numbers[first] * numbers[second] > max_product) {
          max_product = numbers[first] * numbers[second];
        }
      }
    }
    return max_product;

  }

  /**
   * Time Complexity: O(n^2)
   * 
   * @param numbers
   * @return
   */
  public static long findPairWithMaxProductWithCorrectDataType(long numbers[]) {
    long max_product = 0;

    for (int first = 0; first < numbers.length; first++) {
      for (int second = first + 1; second < numbers.length; second++) {
        if (numbers[first] * numbers[second] > max_product) {
          max_product = numbers[first] * numbers[second];
        }
      }
    }
    return max_product;

  }

  /**
   * 
   * Time Complexity: O(n)
   * 
   * @param numbers
   * @return
   */
  public static long findPairWithMaxProductWithCorrectDataTypeFast(long numbers[]) {
    int first_max_value_index = -1;
    int second_max_value_index = -1;

    for (int i = 0; i < numbers.length; i++) {
      if (first_max_value_index == -1 || numbers[i] > numbers[first_max_value_index]) {
        first_max_value_index = i;
      }
    }

    
    for (int i = 0; i < numbers.length; i++) {
      // Condition that does not work
      // if (second_max_value_index == -1 || (i != first_max_value_index && numbers[i] > numbers[second_max_value_index])) {
      if (i != first_max_value_index && (second_max_value_index == -1 || numbers[i] > numbers[second_max_value_index])) {
        second_max_value_index = i;
      }
    }

    return numbers[first_max_value_index] * numbers[second_max_value_index];
  }

  public static void main(String[] args) {
    FastScanner scanner = new FastScanner(System.in);
    int n = scanner.nextInt();
    long[] numbers = new long[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextLong();
    }
    System.out.println(findPairWithMaxProductWithCorrectDataTypeFast(numbers));
  }

  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new InputStreamReader(stream));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }
  }

}

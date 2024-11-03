package com.csc;

public class TriangleNumberCalculator {

  public int value(int n) {
    if (n <= 1) {
        return n;
    }
    return n + value(n - 1);
  }

  public int add(int n, int m) {
    return value(n) + value(m);
  }

  public int subtract(int n, int m) {
    return value(n) - value(m);
  }

  public static int triangularNumber(int n) {
    return n * (n + 1) / 2;
}

public static int multiply(int n, int m) {
    int tn = triangularNumber(n);
    int tm = triangularNumber(m);
    return tn * tm;
}

public static double divide(int n, int m) {
  int tn = triangularNumber(n);
  int tm = triangularNumber(m);

  return (double) tn / tm;
}

}

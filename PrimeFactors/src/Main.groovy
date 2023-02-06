class PrimeFactors {

  static factors(long number) {

    for (int i = 2; i < number; i++) {
      while (number % i == 0) {
        println(i + ' ')
        number = number / i
      }
    }
    if (number > 2) {
      print number
    }
  }


  static void main(String[] args) {

    long x = 901255
    factors(x)
  }


}
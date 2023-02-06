class DifferenceOfTwoSquares
{
  static int Diff_Square (int n)
  {
    int x, y, res

    // SUM OF SQUARES
    x = (n * (n + 1) * (2 * n + 1)) / 6

    //SUM OF NATURAL NUMBERS
    y  = (n * (n + 1)) / 2;

    //SQUARE OF SUM
    y = y * y

    //DIFFERENCE
    res = Math.abs(x - y)

    res


  }

  static void main(String[] args) {
    print "Enter a natural number: "
    def n = System.in.newReader().readLine() as Integer
    println ('Difference of Squares: ' + Diff_Square(n))
  }


}




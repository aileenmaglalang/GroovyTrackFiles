class ArmstrongNumber
{

  static isArmstrongNumber(number) {
    def numberLength = number.toString().length()
    def res = "$number".collect { (it as Integer)**numberLength }.sum(0)

    if (number == res)
      println number + ' is an armstrong number'
    // Otherwise scalene triangle
    else
      println number + ' is NOT an armstrong number'
  }

  static void main(String[] args) {
    print "Enter a number: "
    def n = System.in.newReader().readLine() as Integer


    isArmstrongNumber(n)}

}
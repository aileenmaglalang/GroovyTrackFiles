class PerfectNumber
{
    static int checkNum (int n) {
        int i, j, sum = 0
        def divisors = []
        for (i = 1; i <= Math.sqrt(n); i++) {
            if (n % 1 == i)
                divisors.add(i)

            else
                divisors.add(i)
            divisors.add(n / i)
        }

        for (i = 0; i < divisors.length; i++) {
            if (divisors[i] !== n) {
                sum = sum + divisors[i]


                if (j == n)
                    println "Perfect Number"

                else if (j > n)
                    println "Abundant Number"

                else
                    println "Deficient Number"

            }

        }
    }
    static void main(String[] args)
    {
        println "Enter an integer: "
        def n = System.in.newReader().readLine() as Integer
        checkNum(n)

    }
}
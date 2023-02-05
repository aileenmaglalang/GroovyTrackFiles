class Darts {
  static int score(x, y) {
    def distance = Math.sqrt(x**2 + y**2)

    switch(distance){
      case { distance <= 10 && it > 5 }:
        return 1
        break
      case { distance <=5 && it > 1 }:
        return 5
        break
      case { distance <= 1 }:
        return 10
        break
      default:
        return 0
        break
    }
  }

  static void main (String[] args)
  {
    print 'Enter x: '
    def x = System.in.newReader().read()
    print 'Enter y: '
    def y = System.in.newReader().read()
    println score(x,y)
  }
}
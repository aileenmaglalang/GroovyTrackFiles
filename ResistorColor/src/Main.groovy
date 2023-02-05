class ResistorColor
{

  //Better Be Right Or Your Great Big Values Go Wrong
  static colors =
          ['black','brown','red','orange','yellow','green','blue','violet','grey','white']

  static colorCode(color)

  {
    return colors.indexOf(color)
  }

  static void main (String[] args)
  {
    print 'Enter a color: '
    def c = System.in.newReader().readLine().toLowerCase()
    print colorCode(c)
  }


}
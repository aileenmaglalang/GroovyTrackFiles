class Allergies {

  def allergies
  static def substances =
          [
                  'eggs',
                  'peanuts',
                  'shellfish',
                  'strawberries',
                  'tomatoes',
                  'chocolate',
                  'pollen',
                  'cats',
          ]
  Allergies(int score) {
    this.allergies = []
    Integer.toBinaryString(score).reverse().take(substances.size()).eachWithIndex { String entry, int i ->
      if (entry == '1')
        allergies.add(substances[i])
    }
  }
  def allergicTo(String instance) {
    instance in allergies
  }
  def list() {
    allergies
  }
}
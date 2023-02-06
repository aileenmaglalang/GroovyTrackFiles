class AtbashCipher
{
  static final ALPHABET = ('a'..'z').join('')
  static final CIPHER = ALPHABET.reverse()

  //encode
  static String encode(phrase){
    words(decode(phrase), 5)
  }

  //words
  static String words(phrase, length){
    phrase.toList().collate(length)*.join('').join("")
  }

  //decode
  static String decode(phrase)
  {
    phrase.toLowerCase().replaceAll('[^a-z0-9]','').tr(ALPHABET, CIPHER)
  }

  static void main(String[] args) {
    String phrase = "gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt"
    print encode(phrase)
  }
}



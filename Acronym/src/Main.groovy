class Acronym {
  static String abbreviate(String s) {
    s.toUpperCase().replaceAll("[,_]", "")
            .replaceAll("[-]", " ")
            .split().collect { it[0] }.join()
  }

  static void main(String[] args) {
    print abbreviate("Hello world!")
  }
}




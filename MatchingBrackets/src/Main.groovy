class MatchingBrackets {
  static Map brackets = [']': '[', ')': '(', '}': '{']
  static boolean isPaired(String value) {
    def stack = []
    for(ch in value) {
      if(ch in brackets.values()) {
        stack << ch
      }

      else if(brackets[ch]) {
        if(stack && stack.last() == brackets[ch]) {
          stack.removeLast()
        } else {
          stack << ch
          break
        }
      }
    }
    !stack
  }


  static void main(String[] args) {
    print isPaired('[[')
  }
}






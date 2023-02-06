class HighScores {
  static List<Integer> scores
  HighScores(List<Integer> scores) {
    this.scores = scores
  }
  static int latest() {
    scores.last()
  }

  static int personalBest() {
    scores.max()
  }
  static def personalTopThree() {
    scores.sort(false, {-it}).take(3)
  }

  static void main(String[] args) {
    List<Integer> scores = [10, 30, 90, 30, 100, 20, 10, 0, 30, 40, 40, 70, 70]
    HighScores a = new HighScores(scores)
    println a.latest()
    println a.personalBest()
    println a.personalTopThree()
  }










  //    println latest(a)
  //    println personalBest(a)
  //    println personalTopThree(a)

}
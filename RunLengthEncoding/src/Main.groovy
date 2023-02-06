class RunLengthEncoding

{
  static encode(input)
  {
    input.replaceAll(/(\D)\1+/) { group, letter ->
      (group.length() > 1) ? "${group.length()}$letter": letter

    }
  }

  static decode(input)
  {
    input.replaceAll(/(\d+)(\D)/){all, count, letter -> letter * (count as int)}

  }



  static void main(String[] args) {
    def input = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"
    println encode(input)

    println decode(input)
  }
}



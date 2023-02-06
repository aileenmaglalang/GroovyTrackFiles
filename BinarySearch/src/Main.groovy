class BinarySearch {

  List data =  [1, 3, 4, 6, 8, 9, 11]
  // You may assume for this exercise that the input data is sorted in ascending order.

  BinarySearch(List data) {
    this.data = data
  }

  int indexOf(item) {
    if (data == []) { return -1 }
    int lower = 0
    int higher = data.size()
    int index = (int) (data.size() / 2)
    while (true){
      if (lower > higher){
        return -1
      }
      if (data[index] < item){
        lower = index + 1
      }
      if (data[index] > item){
        higher = index - 1
      }
      if (data[index] == item){
        return index
      }
      index = (int) (lower + (higher - lower) / 2)
    }
    return index
  }

  static void main (String [] args)
  {
    indexOf(6)


  }
}
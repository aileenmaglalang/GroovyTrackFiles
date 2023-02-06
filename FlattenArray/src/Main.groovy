/*
FLATTEN ARRAY
Take a nested list and return a single flattened list with all values except nil/null.
The challenge is to write a function that accepts an arbitrarily-deep nested list-like structure and returns a flattened structure without any nil/null values.
For example:
input: [1,[2,3,null,4],[null],5]
output: [1,2,3,4,5]

**/


class FlattenArray {
  static List flatten(ary)
  {
    println ary.flatten() - null
  }

  static void main(String[] args)
  {
    def a =  [null, [[[null]]], null, null, [[null, null], null], null]
    // Function call
    flatten(a)
  }

  static void mai
}
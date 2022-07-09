object question3 extends App {
  var a: Int = 2;
  var b: Int = 3;
  var c: Int = 4;
  var d: Int = 5;
  var k: Float = 4.3f;

// println( --b * a + c *d--); // -- is not valid

//  println(a++); // ++ is not valid

  var g = 4.0f; // brought forward from last question
  println(-2 * (g - k) + c); // 4.6000004 due to rounding error

//  println (c=c++); // ++ is not valid

//  println (c=++c*a++); //++ is not valid

}

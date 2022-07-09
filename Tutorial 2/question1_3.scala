object question1_3 extends App {
// multiple assignmentsin the form a = b = c = 10 aren't allowed in scala for variables
  var (k, i, j) = (2, 2, 2);
  var (m, n) = (5, 5);
  var f = 12.0f;
  var g = 4.0f;
  var c = 'X';

  println(k + 12 * m);
  println(m / j);
  println(n % j);
  println(m / j * j);
  println(f + 10 * 5 + g);
//   println(++i * n); // ++ is not valid

// Continued in other file since it redeclares c and k
}

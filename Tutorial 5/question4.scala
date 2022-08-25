object question4 extends App {

  def evenOrOdd(n: Int): String = n match {
    case 0            => "Even";
    case 1            => "Odd";
    case x if (x < 0) => evenOrOdd(-n);
    case _            => evenOrOdd(n - 2);
  }

  // For demonstration
  printf("Enter a number : ");
  var x = scala.io.StdIn.readInt();
  printf("%d is %s", x, evenOrOdd(x));

}

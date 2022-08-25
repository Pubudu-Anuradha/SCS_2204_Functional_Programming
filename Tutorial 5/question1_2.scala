object question1_2 extends App {

  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0            => a;
      case x if (x > a) => gcd(b, a);
      case _            => gcd(b, a % b);
    }
  }

  def prime(n: Int, d: Int = 2): Boolean = {
    n match {
      case x if (x < 2)         => false;
      case x if (x == d)        => true;
      case x if (gcd(d, n) > 1) => false;
      case _                    => prime(n, d + 1);
    }
  }

  // For Demonstration of question 1
  printf("Enter a number : ");
  var x = scala.io.StdIn.readInt();
  x match {
    case x if (prime(x)) => printf("%d is a Prime\n", x);
    case _               => printf("%d is Not a prime\n", x);
  }

  def primeSeq(n: Int): Any = n match {
    case x if (x > 0 && prime(x)) => {
      primeSeq(n - 1);
      printf("%d ", n);
    }
    case x if (x > 0) => primeSeq(n - 1);
    case _            => return;
  }

  // For Demonstration of question 2
  printf("Enter a number for prime sequence: ");
  var n = scala.io.StdIn.readInt();
  printf("Series of the prime numbers until %d : ", n);
  primeSeq(n);
  printf("\n");

}

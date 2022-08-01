object question2 {
  def main(args: Array[String]) = {
    if (args.isEmpty) {
      // No command line arguments. get input from command line input
      printf("Enter a number : ");
      val x: Int = scala.io.StdIn.readInt();

      x match {
        case x if x <= 0     => println("Negative/Zero");
        case x if x % 2 == 0 => println("Even Number is Given");
        case _               => println("Odd Number is given");
      }
    } else {
      // Get input from command line arguments
      val x: Int = args(0).toInt;

      x match {
        case x if x <= 0     => println("Negative/Zero");
        case x if x % 2 == 0 => println("Even Number is Given");
        case _               => println("Odd Number is given");
      }

    }
  }
}

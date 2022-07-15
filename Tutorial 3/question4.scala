object question4 extends App {
  def discount(coverPrice: Double): Double = coverPrice * .4;

  def discountedCost(noOfCopies: Int, coverPrice: Double): Double = {
    noOfCopies.asInstanceOf[Double] * (coverPrice - discount(coverPrice));
  }

  def shippingCost(noOfCopies: Int): Double =
    (noOfCopies.asInstanceOf[Double]) match {
      case x if x <= 50 => x * 3.0
      case y            => (y - 50.0) * .75 + 150.0;
    }

  def totalWholesaleCost(noOfCopies: Int, coverPrice: Double): Double = {
    discountedCost(noOfCopies, coverPrice) + shippingCost(noOfCopies);
  }

  val coverPrice: Double = 24.95;
  val copies: Int = 60;
  printf(
    "Total wholesale cost for %d books of Rs. %.2f cover price is : %.2f\n",
    copies,
    coverPrice,
    totalWholesaleCost(copies, coverPrice)
  );
}

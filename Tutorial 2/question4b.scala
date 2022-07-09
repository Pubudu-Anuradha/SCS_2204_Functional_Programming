object question4b extends App {

  def attendants(ticketPrice: Double): Int =
    120 + (((15 - ticketPrice.asInstanceOf[Int]) / 5) * 20);

  def performanceCost(ticketPrice: Double): Double =
    500.0 + attendants(ticketPrice) * 3.0;

  def profit(ticketPrice: Double): Double =
    attendants(ticketPrice) * ticketPrice - performanceCost(ticketPrice);

  for (i <- 0 to 9) {
    val ticketPrice = i * 5.0;
    printf(
      "Ticket Price : %4.2f | attendants : %3d | performanceCost : %4.2f | profit : %4.2f\n",
      ticketPrice,
      attendants(ticketPrice),
      performanceCost(ticketPrice),
      profit(ticketPrice)
    )
  }
//   printf("\nMost profit is available when ticket price is Rs. 25.00\n");

}

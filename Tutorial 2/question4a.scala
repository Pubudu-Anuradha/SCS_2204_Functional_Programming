object question4a extends App {

  def normalHoursSalary(hours: Int): Double = hours * 250.0;

  def otHoursSalary(hours: Int): Double = hours * 85.0;

  def tax(salary: Double): Double = salary * 0.12;

  def takeHomeSalary(normalHours: Int, otHours: Int) = {
    val salary = (normalHoursSalary(normalHours) + otHoursSalary(otHours));
    salary - tax(salary);
  }

  val nh = 40;
  val ot = 30;
  printf(
    "Take home salary after working %d normal and %d ot hours = Rs. %.2f",
    nh,
    ot,
    takeHomeSalary(nh, ot)
  );

}

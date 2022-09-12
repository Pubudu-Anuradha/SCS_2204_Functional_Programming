import scala.compiletime.testing.Error.apply

object helper {
  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0            => a;
      case x if (x > a) => gcd(b, a);
      case _            => gcd(b, a % b);
    }
  }
}

case class Rational(num: Int, den: Int) {
  if (den == 0) {
    throw Error("0 Denominator detected");
  }

  def numer: Int = num;

  def denom: Int = den;

  override def toString(): String = {
    if ((numer < 0 && denom > 0) || (numer > 0 && denom < 0)) {
      s"-${numer.abs}/${denom.abs}";
    } else {
      s"${numer.abs}/${denom.abs}";
    }
  }

  def neg: Rational = new Rational(-1 * numer, denom).simplify

  def +(that: Rational) = {
    new Rational(
      this.denom * that.numer + that.denom * this.numer,
      this.denom * that.denom
    ).simplify
  }

  def -(that: Rational) = {
    new Rational(
      this.denom * that.numer - that.denom * this.numer,
      this.denom * that.denom
    ).simplify
  }

  def simplify: Rational = {
    var a = numer.abs;
    var b = denom.abs;
    var gcd = helper.gcd(a, b);
    while (gcd != 1) {
      a = a / gcd;
      b = b / gcd;
      gcd = helper.gcd(a, b);
    }
    ((numer < 0 && denom > 0) || (numer > 0 && denom < 0)) match {
      case true  => Rational(-1 * a, b);
      case false => Rational(a, b);
    }
  }
}

object rationals extends App {
  println("Question 1");
  println("------------------------");

  var r1: Rational = Rational(1, 2);
  var r2: Rational = Rational(-3, 7);

  println(s"var r1 = $r1");
  println(s"r1.neg = ${r1.neg}");
  println(s"var r2 = $r2");
  println(s"r2.neg = ${r2.neg}");

  println("========================");
  println();

  println("Question 2");
  println("------------------------");

  var x: Rational = Rational(3, 4);
  var y: Rational = Rational(5, 8);
  var z: Rational = Rational(2, 7);

  println(s"x = $x");
  println(s"y = $y");
  println(s"z = $z");
  println(s"x - y - z = $x - $y - $z = ${x - y - z}")

  println("========================");
}

case class Account(_id: Int, bal: Double) {
  def id: Int = _id;

  var balance = bal;

  def addBal(amount: Double): Any = {
    balance += amount;
  }

  def subBal(amount: Double): Any = {
    balance -= amount;
  }

  def getBal: Double = balance;

  def transfer(amount: Double, toAccount: Account): Any = {
    this.subBal(amount);
    toAccount.addBal(amount);
  }

  override def toString(): String = s"$id : $balance"
}

class Bank(accs: List[Account]) {
  var accounts: List[Account] = accs;

  def print(): Any = {
    accounts.map(x => {
      println(x);
    });
  }

  def negAccounts(): List[Account] = accounts.filter(x => x.bal < 0.0)

  def allBal: Double = {
    var sum: Double = 0.0;
    accounts.map(x => sum += x.bal);
    sum
  };

  def allBalAfterInterest: Double = {
    var sum: Double = 0.0;
    accounts.map(x =>
      x match {
        case a if (a.bal >= 0) => sum += (a.bal + a.bal * .05);
        case b                 => sum += (b.bal + b.bal * .1);
      }
    )
    sum
  }
}

object bankAccounts extends App {
  println("Question 3")
  println("--------------------")

  var a1 = Account(1, 20000.0)
  var a2 = Account(2, 50000.0)

  println(s"account 1 : $a1")
  println(s"account 2 : $a2")

  println("Transferring 10000 from 2 to 1")
  a2.transfer(10000.0, a1);
  println(s"account 1 : $a1")
  println(s"account 2 : $a2")

  println("====================")

  println()
  println("Question 4")
  println("--------------------")

  var bank: Bank = Bank(
    List[Account](
      Account(1, 10000.0),
      Account(2, 1000.0),
      Account(3, 100.0),
      Account(4, -10000.0),
      Account(5, -100.0),
      Account(6, 0.0),
      Account(7, 100000.0),
      Account(8, 150000.0),
      Account(9, 105500.0),
      Account(10, 20000.0)
    )
  )

  println("Example Bank Accounts")
  bank.print()

  println("--------------------")
  println("4.1")

  println("Accounts with negative balance")
  bank.negAccounts().map(x => println(x))

  println("--------------------")
  println("4.2")

  println(s"Sum of balances of all Accounts = ${bank.allBal}");

  println("--------------------")
  println("4.3")

  println(
    s"Sum of balances of all Accounts  after applying interest= ${bank.allBalAfterInterest}"
  );

  println("====================")
}

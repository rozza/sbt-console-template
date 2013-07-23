import com.example.Bank

import org.specs2.mutable._


class BankSpec extends Specification {
  sequential

  lazy val bank = new Bank

  "My Custom Bank" should {
    "should start with zero balance" in {
      bank.balance must beEqualTo(0.0)
    }

    "should allow deposits" in {
      bank.deposit(100.0)
      bank.balance must beEqualTo(100.0)
    }

    "should allow withdrawals" in {
      bank.withdraw(50.0)
      bank.balance must beEqualTo(50.0)
    }

    "should not allow account to be overdrawn" in {
      bank.withdraw(60.0) must throwA[IllegalArgumentException]
    }
  }
}

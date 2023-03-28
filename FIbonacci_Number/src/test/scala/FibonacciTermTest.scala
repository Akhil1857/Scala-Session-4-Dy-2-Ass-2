import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FibonacciTermTest extends AnyFlatSpec with Matchers {
  "FibonacciNumber" should "Return the 10 term of the fibonacci series" in {
    val fibonacciTerm = new FibonacciTerm
    val fibonacciSeriesTerm = fibonacciTerm.fibonacci(10)
    fibonacciSeriesTerm shouldBe (55)
  }

  it should "Return the 15 term of the Fibonacci Series" in {
    val fibonacciTerm = new FibonacciTerm
    val fibonacciSeriesTerm = fibonacciTerm.fibonacci(15)
    fibonacciSeriesTerm shouldBe (610)
  }

  it should "Return the Error" in {
    val fibonacciTerm = new FibonacciTerm

    val thrown = intercept[IllegalArgumentException] {
      fibonacciTerm.fibonacci(-15)
    }
    thrown.getMessage === "Please Enter Positive Number"
  }

}

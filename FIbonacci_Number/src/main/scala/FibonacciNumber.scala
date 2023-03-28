import scala.annotation.tailrec

class FibonacciTerm {
  // Calculates the Nth term of Fibonacci Series
  def fibonacci(term: Int): Int = {

    try {
      if (term < 0) throw new IllegalArgumentException

      @tailrec //Calculates the nth Term of Fibonacci Series and return it using Tail Recursion
      def fibonacciTermCalculator(term: Int, previousNumber: Int, currentNumber: Int): Int = {
        if (term == 0) previousNumber

        else fibonacciTermCalculator(term - 1, previousNumber = currentNumber, currentNumber = previousNumber + currentNumber)
      }
      //TailRecursion call
      fibonacciTermCalculator(term, 0, 1)
    }

  }

}

object FibonacciNumber extends App {

  private val fibonacciObject = new FibonacciTerm()
  private val result = fibonacciObject.fibonacci(10)
  print(result) // prints the final result
}

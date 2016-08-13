
import scala.math.sqrt

object Prog {
    def main(args: Array[String]) = {
        println("we are in main")
        val a = 1
        println(a)
        val list = (1 to 600851475143).toList
      
        val odd_list = for (i <- list if i % 2 == 1) yield i
        println(odd_list)        
        val prime_list = for (j <- odd_list if isPrime(j) == true) yield j
        println(prime_list)
    }
    
    def isPrime(number: Int) = {
        //println("in isPrime")
        val sq_num: Int = sqrt(number).toInt
        //println(sq_num)
        //make a list of numbers to check mod against
        val primes_31 = List(2,3,5,7,11,13,17,19,23,29,31)
        //println(primes_31)
        val prime_list_for_num = for (i <- primes_31 if i <= sq_num) yield i     
        val div_result = for (j <- prime_list_for_num if number % j == 0) yield j
        div_result.isEmpty

    }
}

//Prog.isPrime(Int)
//Prog.main(Array[String]())
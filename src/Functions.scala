import scala.collection.mutable.ArrayBuffer

class Functions {


  def main(args: Array[String]){

    def pabel_test(num1: Int = 1, num2: Int = 1): Unit = {
      return num1 + num2; // return here is optional  because it outputs the last line of code in the function
    }

    println("Sum :  " + pabel_test(5, 4));
    println("Sum :  " + pabel_test(num2 = 5, num1 = 4));


    //Unit is required because nothing is returned
    def sayHi(): Unit = {
      println("This is a test!");
    }

    //this returns an integer and takes a variable number of inputs
    def getSum(args: Int*): Int = {
      var sum : Int = 0;
      for (num <- args) {
        sum += num;
      }
      sum;
    }

    println("This is the sum: " + getSum(522, 2652, 262662));

    //define factorial

    def factorial(num: BigInt): BigInt = {
      if (num <= 1) return 1
      else
        return num * factorial(num -1);
    }

    println("Factorial of 4  =  " + factorial(4));

    //array should be used for fixed data sizes and arrayBuffer should be used when the number of
    //content is variable.

    val fields = Array("bob", "test");

    fields(0) = "now"
    val friends  = ArrayBuffer[String]()
    friends.insert(0, "Phil")

    friends += "Mark"
    friends ++= Array("Susy", "meat")

    var t = String : " "; //ininitial value is empty
    friends.insert(1, "Interesting", "Life");

    friends.remove(1, 2) // remove two elements starting from the second index

    friends.foreach(println); // print the friends

    //multi diemnsional arrays

    var table = Array.ofDim[Int](10,10);

    for (i <-  0 to 9) {
      for (j <- 0 to 9) {
        (table)(i)(j)  = i * j;
        printf("%d : %d = %d", table(i)(j));
      }
    }

    //print the sum of the table
    println("Sum : " + table.sum);
    println(" Min : " + table.min);
    println("max : " + table.max);

    val sortedNums  = table.sum.sortWith(_ >_); // sort in descending

    //get indexes and convert to coma seperated string

    println(sortedNums.deep.mkString(", "));





  }

}

import scala.math._

//class DemoScala {
//
//  var name = "DEREK"; //the value can chage
//
//  val test2 = 40; // the value doesn't change so val is a constant
//
//  //date types // Byte, Boolean, Char, Short, Int , Long, Float, Double : just as in java
//   var test  = random * (2).toInt;
//   var test1  = log(2725672);
//
//
//  //if statements return values
//
//  println("This is pretty cool!");
//}



import scala.io.StdIn.{readLine, readInt} //for readline or read int
import scala.math._ //import all math modules
import scala.collection.mutable.ArrayBuffer // for using array buffers
import java.io.PrintWriter; //print to a file
import scala.io.Source; //read from a file


object DemoScala {

  def main(args: Array[String]) {

    var i  = 0;

    while (i <= 10) {
      println(i);
      i += i;
    }

    do {
      println(i);
      i  += 1;
    }while ( i <= 20);


    for (i <- 1 to 10) {
      println(i);
    }

    val letters ="ssjfjhsjgshjgfsjh";

    //used for ooping through arrays
    for (i <-  0 until letters.length) {
      println(i);
    }

    //used for ooping through arrays
    val aList  = List(1, 2, 3, 4, 5);
    for (i <-  aList) {
      println("List item =" + i);
    }

    //create a list of even numbers
    val evenList  = for { i <- 1 to 20 if (i % 2 ) == 0 } yield i  ;

    for (i <- evenList) {println(i)};

    for ( i <- 1 to 5 ; j <- 6 to 10 ) {
      println("i  + " i); //print's  and increments i and prints the values of the second loop
      println("j  + " j);
    }


    def printPrimes(){
      val primeList = List(1,2 3, 5, 11);
      for ( i <- primeList ) {

        //break statement
        if ( i == 7) return ;

        //continue statement
        if ( i != 1) println(i);
      }
    }

    //execute a function in scala
    printPrimes


    //input vs output in scala

    var guess = 0;

    do {
      print("Guess a number ");
      guess  = readLine.toInt;

    } while (guess != 15);
    printf("You printed the secret number %d ! \n", 15);

    val name = "Philip"
    val age = 20
    val weight = 175.9

    println("Hello $name"); //prints variable
    //computes age within the println function and prints out value of weight
    println(f"I am an ${age + 1} and weigh $weight.2f");

    //when using printf
    // %c for chars, %s for strings, %d for any digit

    //RIGHT JUSTIFY AND LEFT JUSTIFY
    printf("%5d' \n"); //right justify
    printf("%-5d' \n"); //left justify
    printf("%05d' \n"); //add 0s
    printf("%05f \n", 3.156244242); //print 5 decimal places


    var randSent = "I am a dragon fly."

    println("String length" + randSent.length);
    println("String length" + randSent.concat("testing !"));

    //connvert to an array
    val testing = randSent.toArray;
    for (i <- testing) {println(i)};


  }


}


import java.io.PrintWriter

import scala.io.Source

class FileIO {

  def main(args: Array[String]): Unit = {
    println("This is a file io ]\n");

    val writer = new PrintWriter("test.txt");
    writer.write("Pabel is learning!  \n");
    writer.close();

    val textFromFile = Source.fromFile("test.txt", "UTF-8");

    val lineIterator = textFromFile.getlines()
    for (line <-  lineIterator ) {
      println(line)
    }

    textFromFile.close()


    // try catch

    def divideNums(num1: Int, num2: Int) = try {

      num1/num2
    } catch {
      case ex : java.lang.ArithmeticException  => "Can't diovide by zero"
    } finally {
      //we could clean up
    }

  }
}
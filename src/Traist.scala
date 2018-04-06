import scala.math._ //import all math modules




//no static variable or static classes exis but we can create it
//final classes cannot be inherited
object Traits {

  trait Flyable {
    def fly:String
  }

  trait BulletProof {
    def hitByBullet : String

    def richochet(startSpeed: Double) : String =  {
      "The bullet richoochet at the speed of %.1f ft/sec".format(startSpeed * 0.75)
    }
  }

  class SuperHero(val name: String) extends Flyable with BulletProof {
     def fly  = "%s flys through the air".format(this.name)

     def hitByBullet = " The bullet bounces off os %s ".format(this.name)

  }

  def main(args: Array[String]): Unit = {


    var superMan = new SuperHero("Superman");

    println(superMan.fly)
    println(superMan.hitByBullet)
    println(superMan.richochet(2500))


    // higher order functions
    val log10Func  = log10 _
    println(log10Func(1000))

    List(1000.0, 100000.0).map(log10Func).foreach(println;
    List(1, 2, 3, 4, 5).map( (x : Int ) => x * 50).foreach(println);
    List(1, 2, 3, 4, 5).filter(_ %2 ==  0).foreach(println);


    def times3(num: Int) = num * 3
    def times4(num: Int) = num * 4

    def multIt(function : (Int) => Double, num: Int) ={
      function(num);
    }

    printf("This is a test : %s ", multIt(times3, 100))

    // a closure is a function that relies aon a variable defined outside of the function


    //file io




  }

}
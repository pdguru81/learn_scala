


//no static variable or static classes exis but we can create it
//final classes cannot be inherited
object Classes {

  //using a default constructor
  class Animal(var name: String, var sound: String) {

    //part of the default consetructor and is called each time the animal object is created
    this.setName(name)
    def getName() : String = name; //objects to return
    def getSound: String = sound ; // objects to return

    var id = Animal.newIdNum;


//    protected  var name = "No Name"
//    private var testing = "test";
//    public var accessible = "access";

    def setName(str: String) {
      if ( !(name.matches(".*\\d+.*"))) //only non-digits allowed
        this.name = name;
      else
        this.name = "No name"
    }

    def setSound(sound: String){
      this.sound = sound;
    }

    //other constructors if only name is passed
    def this (name: String) {
      this("No name", "No Sound")

      this.setName(name);
    }


    //if nothing is passed
    def this () {
      this("No name", "No Sound")
    }


    //override to string
    override def toString: String = {
      return "%s id = %s".format(this.name, this.id)
    }

  }

  //a companriona object for the above class
  object Animal {
    private var idNumber = 0;
    private def newIdNum =  { idNumber += 3};
  }


  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound ) {
    def this(name: String, sound: String) {
      this("No Name", sound, "No growl");

      //if a name is passed then lets set it
      this.setName(name);
    }

    def this(name:String) {
      this("No name", "no Sound", "no Grow")
      this.setName(name);
    }

    //if nothing is passed
    def this() {
      this("No name", "no Sound", "no Grow")
    }

    override def toString(): String  = {
        return "name=%s sound=%s growl=%s".format(this.name, this.sound, this.growl)
    }



  }


  abstract class Mammal(val name: String) {
    var moveSpeed : Double

    def move : String

  }

  class Wolf(name:String) extends Mammal(name) {
    var moveSpeed = 5.0
    def move = "Thi wold runs at the speed of ligh!"
  }


  def main(args: Array[String]): Unit = {

    var rover = new Animal
    rover.setName("Rover")
    rover.setSound("Rwoof!")
    printf("Name %s and sound %s ", rover.getName, rover.getSound)


    var whiskers = new Animal("whiskers", "tests")
    println(s"${whiskers.getName} has  id ${whiskers.getSound}")
    println(whiskers.toString)

    val fang = new Wolf("Fang");
    fang.moveSpeed = 8.0

  }

}
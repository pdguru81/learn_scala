class Testing {

  def main(args: Array[String]): Unit = {
    val employees = Map("Manager" -> "Bob-Smith", "Sec" -> "Mr Danger") //immutable map

    if (employees.contains("Manager")) println("Manager! ");

    val changeaBleMaps = collection.mutable.Map(100 -> "Paul smoth", 101 -> "Testing mehn!")
    print("ttest 1 : %s \n", changeaBleMaps(100));

    //can add to the mutable maps
    changeaBleMaps(104) =   "Terry the rap man";

    for ( (k, v) <- changeaBleMaps) {
      println("this is the key %d : value %s \n", k, v);
    }

    //tuples

    var tuple = (109, 20, "This is pretty cool", 10.25)
    print("%s owes us $%.2f \n", tuple._2, tuple._3)

    //loop through a tutple
    tuple.productIterator.foreach( i => println(i));

    //print the tuple as a string
    println(tuple.toString());

  }
}
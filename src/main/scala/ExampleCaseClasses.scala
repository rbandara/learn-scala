import scala.util.Random

object ExampleCaseClasses {

  case class Employee(name : String , age :Int)

  def main (args : Array[String]): Unit = {
    println("Hello World")

    val NUM_EMPLOYEES = 20
    val firstNames = List("sunil", "kamal")
    val lastNames = List("bandara", "rathnayaka")

    val employees =  (0 until NUM_EMPLOYEES) map {i =>
      val firstName = Random.shuffle(firstNames).head
      val lastName = Random.shuffle(lastNames).head
      val fullName = s"$lastName $firstName"
      val age = 20 + Random.nextInt(20)
      Employee(fullName,age)
    }

    employees foreach println

    val hasBandara = """(bandara).*""".r
    for (e <- employees) {
      e match {
        case Employee(hasBandara(x), age) => println("Found a Bandara")
        case _ =>
      }

    }
  }
}


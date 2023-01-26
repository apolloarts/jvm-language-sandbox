package helloscala.basic

object HelloSingleton {
  private var counter: Int = 0
  val label: String = "CounterLabel"

  def increment(): Unit = {
    counter += 1
  }

  def get: Int = counter

  def main(args: Array[String]): Unit = {
    assert(HelloSingleton.get == 0)
    println(HelloSingleton.get)
    assert(HelloSingleton.label == "CounterLabel")
    HelloSingleton.increment()
    assert(HelloSingleton.get == 1)
    println(HelloSingleton.get)
    assert(HelloSingleton.label == "CounterLabel")
  }
}
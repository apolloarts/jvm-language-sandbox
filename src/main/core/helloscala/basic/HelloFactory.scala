package helloscala.basic

object HelloFactory extends App {
  val operationFactory: OperationFactory = new SimpleOperationFactory
  val addOperation = operationFactory.getOperation("ADD")

  println(addOperation.calculate(5, 3))
}

sealed trait Operation {
  def calculate(a: Int, b: Int): Int
}

class Addition extends Operation {
  override def calculate(a: Int, b: Int): Int = a + b
}

class Division extends Operation {
  override def calculate(a: Int, b: Int): Int = a / b
}

trait OperationFactory {
  def getOperation(criteria: String): Operation
}

class SimpleOperationFactory extends OperationFactory {
  def getOperation(criteria: String): Operation = criteria match {
    case "add" | "ADD" => new Addition
    case "divide" | "DIVIDE" => new Division
    case _ => new Addition
  }
}

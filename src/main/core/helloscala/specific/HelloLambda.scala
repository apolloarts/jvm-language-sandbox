package helloscala.specific

object HelloLambda extends App {
  def transform[A](n: Int)(fun: Int => A): A = fun(n)

  assert(HelloLambda.transform(123)(_.toBinaryString.length) == 7)
}

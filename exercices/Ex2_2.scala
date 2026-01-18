object Ex2_2 {
  def ordered(a: Int, b: Int): Boolean = {
    a <= b
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val values: Array[Int] = Array(1, 2, 3)

    val result = isSorted[Int](values, ordered)
    printf("Is sorted: %b", result)
  }
}

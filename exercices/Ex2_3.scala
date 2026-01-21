object Ex2_3 {
    def curry[A,B,C](f: (a: A, b: B) => C): A => (B => C) = {
        (a: A) => (b: B) => f(a, b)
    }

    def main(args: Array[String]): Unit = {
        curry[Int, Int, Int]((a: Int, b: Int) => 1)
    }
}

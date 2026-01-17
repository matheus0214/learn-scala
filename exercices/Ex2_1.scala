object Ex2_1 {
    def fib(n: Int): Int = {
        def go(n: Int, previous: Int, next_term: Int): Int = {
            if (n <= 1) previous
            else go(n - 1, next_term, previous + next_term)
        }

        go(n, 0, 1)
    }

    def main(args: Array[String]): Unit =
        println(fib(3))
}
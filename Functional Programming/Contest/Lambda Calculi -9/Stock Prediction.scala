object Solution {
    def main(args: Array[String]) {
      val n = io.StdIn.readInt()
      val stock = io.StdIn.readLine().split(' ').toArray.map(_.toInt)
      val numQ = io.StdIn.readInt()
            
      def sol(d: Int, m: Int) = {
        val target = stock(d)
        def searchLeft(p: Int): Int =
          if (p < 0 || bound(stock(p))) d - p + 1
          else searchLeft(p - 1)
        def searchRight(p: Int): Int =
          if (p >= n || bound(stock(p))) p - d - 1
          else searchRight(p + 1)
        def bound(price: Int) =
          price < target || price - target > m
        searchLeft(d - 1) + searchRight(d + 1) - 1
     }
        
     for (i <- 1 to numQ) {
       val q = io.StdIn.readLine().split(' ').toArray.map(_.toInt)
       println(sol(q(0), q(1)))
     }
   }
}
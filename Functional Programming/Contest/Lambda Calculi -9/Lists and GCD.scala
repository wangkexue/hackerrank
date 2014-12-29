object Solution {

    def main(args: Array[String]) {
        val n = io.StdIn.readInt()
            
        def readList(n: Int) =
          for (i <- (0 until n)) yield io.StdIn.readLine.split(' ').toList.map(_.toInt)
        def createListOfMap(lists: List[List[Int]]) =
            for (list <- lists) yield list2Map(list)
        def list2Map(list: List[Int]): Map[Int, Int] =
            if (list == Nil) Map()
            else createMap(list take 2) ++ list2Map(list drop 2)
        def createMap(num2: List[Int]): Map[Int, Int] = num2 match {
            case prime :: npower => Map(prime -> npower.head)
        }
        
        val listOfMap = createListOfMap(readList(n).toList)
        //println(listOfMap)
        def gcd (list1: Map[Int, Int], list2: Map[Int, Int]): Map[Int, Int] = {
            def gcdInternal (list1: List[Pair[Int, Int]], list2: Map[Int, Int]): Map[Int, Int] = {
              if (list1 == Nil) Map()
              else {
                val pair = list1.head
                val prime = pair._1
                val npower = pair._2
                if ((list2 get prime) != None) Map(prime -> math.min(npower, list2(prime))) ++ gcdInternal(list1.tail, list2)
                else gcdInternal(list1.tail, list2)
                  }
            }
            gcdInternal(list1.toList, list2)
        }
        
        def gcdList(lists: List[Map[Int, Int]]): Map[Int, Int] = 
            lists reduceLeft ((x,y) => gcd(x, y))
        
        val rst = gcdList(listOfMap).toList.sortBy(_._1)
        printOut(rst)
        
        def printOut(rst: List[Pair[Int, Int]]): Any =
            if (rst == Nil) print("\n")
            else {
              val pair = rst.head
              print(pair._1 + " " + pair._2 + " ")
              printOut(rst.tail)
          }
        
    }
}
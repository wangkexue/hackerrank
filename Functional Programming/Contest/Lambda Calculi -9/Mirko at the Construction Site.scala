/** brute-force solution */
object Solution {

    def main(args: Array[String]) {
       val nq = io.StdIn.readLine().split(' ').toArray.map(_.toInt)
       val buildFloors = io.StdIn.readLine().split(' ').toSeq.map(_.toInt)
       val buildSpeed = io.StdIn.readLine().split(' ').toSeq.map(_.toInt)
       
       def sol(d: Int): Int = {
           def updateFloor() =
               for (i <- 0 until nq(0)) 
                   yield buildFloors(i) + d * buildSpeed(i)     
           updateFloor().zipWithIndex.maxBy(r => (r._1, r._2))._2 + 1
       }

       for (i <- 1 to nq(1)) {
           val d = io.StdIn.readInt()
           println(sol(d))
       }
    }
}

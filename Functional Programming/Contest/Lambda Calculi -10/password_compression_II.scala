import scala.util.matching.Regex
object Solution {

    def main(args: Array[String]) {
        val pat = """(^\d+)(.+)""".r
        println(io.StdIn.readLine().split(' ').map({
          case pat(pos, word) => {
                val p = pos.toInt
                if (p >= word.length)
                    ' '
                else
                    word.charAt(p)
          }  
        }) mkString)
    }
 }

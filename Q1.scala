import scala.io.StdIn.readLine
object Q1 {
  def main(args: Array[String]): Unit = {
    val capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val simple ="abcdefghijklmnopqrstuvwxyz"
    println("Enter the text ")
    val num=readLine()
    val encrypt=(c:Char,key:Int,d:String)=>d((d.indexOf(c)+key)%d.size)
    val decrypt=(c:Char,key:Int,d:String)=>d((d.indexOf(c)-key)%d.size)
    val count=num.size
    var text=""
    var i=1
    while(i <= count){
      if(num.charAt(i-1)==num.charAt(i-1).toUpper) {
        text=text+encrypt(num.charAt(i - 1), 5, capital)

      }else{
        text=text+encrypt(num.charAt(i - 1), 5, simple)

      }
      i=i+1

    }
    var j=1
    var text1=""
    println(text)
    while(j <= count){
      if(text.charAt(j-1)==text.charAt(j-1).toUpper) {
        text1=text1+decrypt(text.charAt(j - 1), 5, capital)

      }else{
        text1=text1+decrypt(text.charAt(j - 1), 5, simple)

      }
      j=j+1


  }
    println(text1)

}
}

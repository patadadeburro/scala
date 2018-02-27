

object obj_fun {
  def f_3_6( n: Int ) : Boolean =
  {
    if (n == 3 || n == 6)
    {
      return true
    }
    else
    {
      return false
    }
    
  }
  
  def f ( n: Int ) : Boolean = 
  { 
    n == 3 || n == 6 
  }
  
  
  
   def main( args: Array[String] )
  {
     var n = 3
     var a = ( n: Int ) => n == 3 || n == 6
     //val b = this.f_3_6(n)
     //val b = this.f(n)
     
     val b = a( n ) 
     
     println( b )
     
    println( "obj 3. end." )
  }
}
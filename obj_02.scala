

object boj_02 {
  def main( args: Array[String] )
  {
    val s = "a, b,"
    
    // the null value is omited. 
    // output: Array( "a", "b"  )
    //val a = s.split( "," ).map( _.trim() )
    
    
    // the null value is considered a space
    // output. Array( "a", "b", "" )
    val a = s.split( ",", -1 ).map( _.trim() )
    
    for ( i <- a)
    {
      println( i );
    }
    
    println( "end of loop." )
    
    var a2 = a.map( s1 => if ( s1.isEmpty() ) 0 else s1  )
    println( a2.mkString( "***" ) )
    
    
    val s1 : String = "hello";
    /*
    var x = if ( s1.isEmpty() ) 0 else 1
   
    
    if ( s1.isEmpty() )
    {
      x = 0
    }
    else
    {
      x = 1
    }
    println( x ) 
    */
    
    
  }  
}
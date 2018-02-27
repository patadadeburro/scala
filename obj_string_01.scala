

object obj_string_01 {

  def main( args: Array[String] )
  {
    println( "hello world" );
    
    val a1 = Array(1, 2, 3);
    println( a1.mkString( "," ) );

    val a2 = Array( "A", "B", "C" );
    println( a2.mkString( ", " ) );

    println( a2 );

    println( a2(0)  );
    
    println( "it is working" );
    
    val s = "hello friends"
    val d = 13
    val f = 3.141516
    println( s"here are some values: $s $d $f " )  
    
    println( "the values are: %s %d %f".format( s, d, f )   )
    
    
  }  
  
}
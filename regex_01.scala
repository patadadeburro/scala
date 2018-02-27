

object regex_01 {
  
  def p01(){
    val reg1 = """(\d+)\s(\w{3})(,)\s(\d{4})""".r // 11 Jan, 2015 
    val reg2 = """(\d+)(U)(\d+)(U)(\d{4})""".r    // 6/17/2014 
    val reg3 = """(\d+)(-)(\d+)(-)(\d{4})""".r    //  22-08-2013 
    val reg4 = """(\w{3})\s(\d+)(,)\s(\d{4})""".r // Jan 11, 2015

    val s = "Christopher|Jan 11, 2015|5"

    /*
    Kapil|11 Jan, 2015|5
    Thomas|6/17/2014|5
    John|22-08-2013|5
    Mithun|2013|5
    Jitendra||5
		*/
    
    val is_match = reg1.pattern.matcher( s.trim).matches
    
    println( "match pattern: %b ".format( is_match ) )
    
    
  }
  
  def main( args: Array[ String ] ){
    this.p01()
    
  }
}
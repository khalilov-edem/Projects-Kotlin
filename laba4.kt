/*1*/
fun main(args: Array<String>){
    class Person{
        var name: String="Lenur"
        var age: Int=18
    }
    val Per: Person=Person()
    println(Per.name)
    println(Per.age)
}
/*2*/set
fun main(args: Array<String>){
    class Person{
        var name: String="Lenur"
        set(value){
            if(name.length>2){
                field = "Lenur"
            }
        }
        var age: Int=1
        val info:String
            get()="$name"
    }
    val i: Person=Person()
    i.name = "q"
    println(i.name)
}
/*2*/get
fun main(args: Array<String>){
    class Person{
        var name: String="Lenur"
        set(value){
            if(name.length>2){
                field = "Lenur"
            }
        }
        var age: Int=1
        var info:String = "Lenur"
            get(){
              return "LENUR"
            } 
    }
    val i: Person=Person()
    i.name = "q"
    println(i.name)
    println(i.info)
}
/*3*/
fun main(args: Array<String>){
    class Gate(mSwing: Int, IN: Int, OUT: Int, Closed: Int){
        val IN = 1
        val OUT = -1
        val CLOSED = 0
        var mSwing: Int = 0

        fun getSwingDirection(): Int = mSwing
        fun setSwing(direction: Int): Boolean
        {
            if (direction == IN  direction == OUT  direction == CLOSED)
            {
                mSwing = direction
                return true
            } 
            return false
        }
        fun open(direction: Int): Boolean
        {
            if (direction == IN || direction == OUT)
            {
                setSwing(direction)
                return true
            } 
            return false
        }
        fun close()
        {
            mSwing = CLOSED
        }
        fun thru(count: Int): Int
        {
            if (count == IN) return count
            if (count == OUT) return -count
            if (count == CLOSED) return 0
            return 0
        }
        override fun toString(): String
        {
            if (mSwing == CLOSED) return "This gate is closed"
            if (mSwing == IN) return "This gate is open and swings to enter the pen only"
            if (mSwing == OUT) return "This gate is open and swings to exit the pen only"
            return "This gate has an invalid swing direction"
        }
    }
    val a = Gate()
    println(a.toString())
}
package Struggles

class Application(val name: String) {

    fun run(arg: Array<String>) {
        println(this.name)

        for(element in arg){
            println(element)
        }
    }
}

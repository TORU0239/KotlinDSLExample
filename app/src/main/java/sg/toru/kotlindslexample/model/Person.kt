package sg.toru.kotlindslexample.model

data class Person(var firstName:String = "",
                  var lastName:String = "",
                  var nationality:String = "",
                  var city:String = "",
                  var address:Address = Address())

data class Address(var street1:String = "",
                   var street2:String = "",
                   var blockName:String = "",
                   var unitNumber:String = "",
                   var postalCode:String = "")


fun person2(block:(Person)->Unit):Person {
    val p = Person()
    block(p)
    return p
}

fun person(block:Person.()->Unit):Person = Person().apply {
    block()
}

fun Person.address(block:Address.()->Unit){
    address = Address().apply(block)
}
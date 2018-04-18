import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS
import javax.print.attribute.IntegerSyntax

fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}


fun main(args: Array<String>) {
    println("Hola Mundo !!!")
    println(sumarDosNumeros(1, 2))
    var nombre: String? = "Adrian"
    var edad: Int = 29
    val edadActual = 28
    var casado = false
    casado = true
    //duck typing

    //edadActual = 29

    //When es como un Switch
    when (casado) {
        true -> {
            println("esta casado")
        }
        null -> {
            println("Aun no esta asignado")
        }
        else -> {
            println("No esta casado")
        }
    }


    val superHeroe = if (casado) {

        "SuperMandarina"

    } else {
        "Superman"
    }

    //templade Strings
    println("SuperHeroe: $superHeroe")


    var christian = Persona(Integer(22), "christian")
    println(christian.toString())

    /*var christian2 = PersonaDos(Integer(22), "christian", "1721962072", true)
    println(christian2.toString())*/

    var christian3 = PersonaTres(Integer(23), "Christian")


}


class Persona {
    lateinit var edadActual: Integer
    var nNombre: String

    // constructor(edad: Any) {}
    // ctrl + a
    // ctrl + alt + L

    constructor(edad: Integer, nombre: String) {
        iniciar(edad)
        nNombre = nombre
    }

    fun iniciar(edad: Integer) {
        edadActual = edad
    }
    override fun toString():String{
        return "La edad actual es  $edadActual y el nombre es $nNombre"
    }
}

class PersonaDos(edad: Integer, nombre: String) {
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null
    var nCasado: Boolean? = null

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2) {
        nCedula = cedula

    }

    constructor(edad3: Integer, nombre3: String, cedula: String, casado: Boolean) : this(edad3, nombre3) {
        nCedula = cedula
        nCasado = casado

    }

   /* override fun toSring():String{
        return "La Edad es: $nEdad  el nombre es: $nCedula,  la cedula es: $nCedula , estado civil: $nCasado"
    }*/

}


class PersonaTres(edad: Integer, nombre: String) {
    lateinit var nEdad: Integer
    var nNombre = nombre

    init {
        //escribir codigo despues del constructor
        iniciar(edad)
    }

    fun iniciar(edad: Integer) {
        nEdad = edad
    }
    override fun toString():String{
        return "la edad es: $nEdad, el nombre es: $nNombre"
    }
}


open class Figura(nombre: String) {
    val nNombre = nombre
}

class Cuadrado(nombre: String, valorLado: Integer)
    : Figura(nombre) {
    var nValorLado = valorLado
}



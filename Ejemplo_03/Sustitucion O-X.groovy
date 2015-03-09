/**
 * Created by MartinN on 09/03/2015.
 */

def sentencia = "Esto es Otro ejemplo practico"
def x = ""

sentencia.each{
    if (it == "o" | it == "O") {
        x += "x"
        sentencia = sentencia.replaceFirst("($it)") { it[0] = x }
     }
}

println sentencia

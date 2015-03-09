def before = System.currentTimeMillis()


def esPrimo = {
    n -> if(n==2) return true
    if(n%2==0) return false
    raiz = Math.sqrt(n)
    for(i=3; i<=raiz; i+=2) if(n%i==0) return false
    return true
}

listaPrimos = []
100.times {
 if(esPrimo(it)) listaPrimos.add it
}
def after = System.currentTimeMillis()

println listaPrimos
println "Tomó ${after-before} ms"
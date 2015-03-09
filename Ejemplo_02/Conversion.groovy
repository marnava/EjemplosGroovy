/**
 * Created by MartinN on 07/03/2015.
 */
import javax.swing.JOptionPane

def Romanos(int numero) {
    def unidades = [ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" ]
    def decenas = [ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" ]
    def centenas = [ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" ]
    def miles = [ "", "M", "MM", "MMM" ]

    int a, b, c, d
    String a1, b1, c1, d1
    a = numero / 1000
    b = (numero % 1000) / 100
    c = ((numero % 1000) % 100) / 10
    d = ((numero % 1000) % 100) % 10

    a1 = miles[a]
    b1 = centenas[b]
    c1 = decenas[c]
    d1 = unidades[d]

    return (a1+b1+c1+d1)
}

//println Romanos(3720)


def Arabigos(String num){
    def Rom = [' ','I','V','X','L','C','D','M']
    def valor = [0,1,5,10,50,100,500,1000]

    int ant = 0
    int suma = 0
    char letra = ' '

    for (int i = 0; i < num.length(); i++) {
        letra = num.charAt(i)
        for (int j = 0; j < Rom.size(); j++) {
            if (letra == Rom[j]) {
                suma = suma + valor[j]
                if (ant < valor[j]) {
                    suma = suma - ant * 2
                    ant = valor[j]
                } else {
                    ant = valor[j]
                }
            }
        }
    }
        return suma
}

//println Arabigos("DCLI")
/*
Scanner teclado = new Scanner(System.in)
print("Ingresar el valor a convertir a romanos: ")
int cant = teclado.nextInt()
println Romanos(cant)

print("Ingresar el valor a convertir a decimal: ")
String roma = teclado.next()
println Arabigos(roma)
*/

int cant = Integer.parseInt( JOptionPane.showInputDialog(
        null,"Introduzca un numero para convertir a romano",
        "Romano",
        JOptionPane.QUESTION_MESSAGE) )

JOptionPane.showMessageDialog(
        null,"La conversión es " + Romanos(cant),
        "Romano",
        JOptionPane.INFORMATION_MESSAGE)

String roma = ( JOptionPane.showInputDialog(
        null,"Introduzca un numero para convertir a decimal",
        "Decimal",
        JOptionPane.QUESTION_MESSAGE) )

JOptionPane.showMessageDialog(
        null,"La conversión es " + Arabigos(roma),
        "Decimal",
        JOptionPane.INFORMATION_MESSAGE)
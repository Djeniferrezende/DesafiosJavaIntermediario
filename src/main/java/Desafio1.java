import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    /*Desafio
Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experiências e aprendizados com seus amigos.

Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.

Entrada
Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado.

Saída
Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas em ordem crescente da letra inicial.


Exemplo de Entrada	Exemplo de Saída
abcdef abc abc abc
.	a. abc abc abc
1
a. = abcdef*/

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite uma frase");
            String texto = sc.nextLine();


            int total = 0;
            String[] textoSeparado = texto.split(" ");
            List<String> itemList = new ArrayList();
            String[] var6 = textoSeparado;
            int var7 = textoSeparado.length;

            int var8;
            String palavraSub;
            for(var8 = 0; var8 < var7; ++var8) {
                palavraSub = var6[var8];
                if (palavraSub.length() > 3) {
                    ++total;
                    itemList.add(palavraSub.charAt(0) + ".");
                } else if (palavraSub.length() < 3) {
                    itemList.add(palavraSub);
                } else if (palavraSub.contains(".")) {
                    break;
                }
            }

            System.out.println(String.join(" ", itemList));
            System.out.println(total);
            var6 = textoSeparado;
            var7 = textoSeparado.length;

            for(var8 = 0; var8 < var7; ++var8) {
                palavraSub = var6[var8];
                if (palavraSub.length() > 3) {
                    PrintStream var10000 = System.out;
                    char var10001 = palavraSub.charAt(0);
                    var10000.println(var10001 + ".=" + palavraSub);
                }
            }

        }
    }


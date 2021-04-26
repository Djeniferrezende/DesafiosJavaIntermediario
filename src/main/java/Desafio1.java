import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

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


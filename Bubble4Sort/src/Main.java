import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    //Alunos: Pedro Bueno e Alberto Neto

    static BufferedReader buff;

    public static void main(String[] args) throws IOException {

        ArrayList<String> saida = new ArrayList<String>();

        String print;
        buff = new BufferedReader(new InputStreamReader(System.in));
        int[] numeros;

        boolean t = true;
        while (t){
            print = "";
            String entrada = buff.readLine();


            String[] splitar = entrada.split(" ");

            int nElementos = Integer.parseInt(splitar[0]);

            int nTurnos = Integer.parseInt(splitar[1]);

            if(nElementos == 0 && nTurnos == 0){
                t = false;
                break;
            }

            entrada = buff.readLine();
            splitar = entrada.split(" ");
            numeros = new int[nElementos];
            int vezes;
            int count;
            for(count = 0; count < nTurnos; count++){
                vezes = Integer.parseInt(splitar[count]);

                while (numeros[vezes] != 0){
                    vezes++;

                }

                numeros[vezes] = count + 1;

            }
            count++;
            //System.out.println("Numeros p printar:");
            for(int i = 0; i < numeros.length; i++){
                if(numeros[i] == 0){
                    numeros[i] = count;
                    count++;
                }

                print = print + numeros[i] + " ";

            }
            saida.add(print);
        }
        for(int i = 0; i< saida.size(); i++){
            System.out.println(saida.get(i));
        }
    }
}

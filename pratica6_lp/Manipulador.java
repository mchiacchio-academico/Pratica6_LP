package pratica6_lp;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Manipulador {
    private static BufferedWriter write;
    private static BufferedReader reader;
    private static ArrayList<String> projetoSocial;
    private static String nameFile;

    public static void CriarArquivo(String namePath) throws IOException {
        File dir = new File("C:\\ArquivosTxtJava/", namePath + ".txt");
        dir.createNewFile();
        System.out.println("Arquivo criado com sucesso");
        nameFile = String.valueOf(dir);
    }

    public static void Writer(String titulo, String objetivo, String endereco, String dataInicio, String status) throws IOException {
        write = new BufferedWriter(new FileWriter(nameFile));
        projetoSocial = new ArrayList<>();
        projetoSocial.add("\n Titulo do projeto: " + titulo + " \nObjetivo: " + objetivo + " \nEndereço: " + endereco + " \nData de inicio: " + dataInicio + "\nStatus: " + status+"\n");
        write.append(Arrays.toString(projetoSocial.toArray()));
        write.close();
    }

    public static void Reading(String namePath) throws IOException {
        String dir = "C:\\ArquivosTxtJava/" +namePath+ ".txt";
        reader = new BufferedReader(new FileReader(dir));
        String line = "";
        while (true) {
            if (line != null) {
                System.out.println(line);
            } else
                break;
            line = reader.readLine();
        }
        reader.close();
    }
}

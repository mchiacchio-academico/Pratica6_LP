package pratica6_lp;

import java.io.IOException;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) throws IOException {
        int menu = 0;
        String  namePath, arquivo, caminho, titulo, objetivo, endereco, dataInicio, status;;
        Scanner ler = new Scanner(System.in);
        while (menu != 4) {
            System.out.println("------------ MENU ------------");
            System.out.println("1 - Defina o nome do arquivo: ");
            System.out.println("2 - Cadastre o projeto: ");
            System.out.println("3 - Abrir arquivo");
            System.out.println("4 - Sair");
            System.out.println("----------------------------------------------");
            System.out.println("Escolha uma opção de [1-4]: ");
            System.out.println("----------------------------------------------");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("----------- Defina o nome do arquivo ----------");
                    System.out.println("Escreva o nome do arquivo: ");
                    namePath = ler.next();
                    Manipulador.CriarArquivo(namePath);
                    break;
                case 2:
                    System.out.println("-------------- Cadastre o projeto -----------");
                    System.out.println("Informe o titulo: ");
                    titulo=ler.next();
                    System.out.println("Informe o objetivo: ");
                    objetivo=ler.next();
                    System.out.println("Informe o endereço: ");
                    endereco=ler.next();
                    System.out.println("Informe a data de inicio: ");
                    dataInicio=ler.next();
                    System.out.println("Informe o status do projeto: ");
                    status=ler.next();
                    Manipulador.Writer(titulo,objetivo,endereco,dataInicio,status);
                    break;
                case 3:

                    System.out.println("Escreva o nome do arquivo que voce deseja abrir: ");
                    namePath = ler.next();
                    Manipulador.Reading(namePath);
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }
    }
}
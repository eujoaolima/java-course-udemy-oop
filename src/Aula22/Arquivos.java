//package Aula22;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class Arquivos {
//    public static void main(String[] args) throws IOException {
//// Trabalhando com arquivos
//
//        File file = new File("C:\\Users\\condf\\OneDrive\\Área de Trabalho\\java-course-udemy\\curso-java-oop\\src\\batata.txt");
//
//        Scanner r = null;
//
//        try {
//            r = new Scanner(file);
//            while (r.hasNextLine()) {
//                System.out.println(r.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Erro: " + e.getMessage());
//        } finally {
//            if (r!= null) {
//                r.close();
//            }
//        }
//    }
//
//// FileReader e BufferedReader
//
//        String path = "C:\\Users\\condf\\OneDrive\\Área de Trabalho\\java-course-udemy\\curso-java-oop\\src\\batata.txt";
//
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//            String linha = br.readLine();
//            while (linha != null) {
//                System.out.println(linha);
//                linha = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro: " + e.getMessage());
//        } finally {
//            if (fr!= null) {
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    System.out.println("Erro: " + e.getMessage());
//                }
//            }
//            if (br!= null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    System.out.println("Erro: " + e.getMessage());
//                }
//            }
//        }
//
//// Bloco try-with-Resources
//
//        String path = "C:\\Users\\condf\\OneDrive\\Área de Trabalho\\java-course-udemy\\curso-java-oop\\src\\batata.txt";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String linha = br.readLine();
//            while (linha != null) {
//                System.out.println(linha);
//                linha = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//// FileWriter e BufferedWriter
//
//        String[] lines = new String[] {
//                "Batata",
//                "Batata",
//                "Batata"
//        };
//
//        String path = "C:\\Users\\condf\\OneDrive\\Área de Trabalho\\java-course-udemy\\curso-java-oop\\src\\batata.txt";
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//            for (String line : lines) {
//                bw.write(line);
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String linha = br.readLine();
//            while (linha != null) {
//                System.out.println(linha);
//                linha = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//
//// Manipulando pastas com o File
//
//        Scanner r = new Scanner(System.in);
//
//        System.out.println("Digite o caminho da pasta: ");
//        String strPath = r.nextLine();
//
//        File path = new File(strPath);
//
//        File[] folders = path.listFiles(File::isDirectory);
//        System.out.println("Folders: ");
//        for (File folder : folders) {
//            System.out.println(folder);
//        }
//
//        File[] files = path.listFiles(File::isFile);
//        System.out.println("Folders: ");
//        for (File file : files) {
//            System.out.println(file);
//        }
//
//        r.close();
//
//// Informações do caminho do arquivo
//
//        Scanner r = new Scanner(System.in);
//
//        System.out.println("Digite o caminho da pasta: ");
//        String strPath = r.nextLine();
//
//        File path = new File(strPath);
//
//        System.out.println("getName: " + path.getName());
//        System.out.println("getParent: " + path.getParent());
//
//        r.close();
//    }
//}
//

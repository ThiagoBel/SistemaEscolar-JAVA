import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        String[] nomes = {"Thiago"};
        int[] idades = {14};
        int[] series = {9};
        String[] cursos = {"Javascript, C++, Java, Python"};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Nota final\n[2] Registro de aluno\n[3] Sair");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
                continue;
            }
            int valor = scanner.nextInt();

            switch (valor) {
                case 1:
                    System.out.print("Digite a primeira nota: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida! A nota deve ser um número decimal.");
                        scanner.next();
                        continue;
                    }
                    double av1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida! A nota deve ser um número decimal.");
                        scanner.next();
                        continue;
                    }
                    double av2 = scanner.nextDouble();
                    System.out.print("Digite a terceira nota: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida! A nota deve ser um número decimal.");
                        scanner.next();
                        continue;
                    }
                    double av3 = scanner.nextDouble();

                    double rs = (av1 + av2 + av3) / 3;

                    System.out.println("Nota final: " + rs);

                    if (rs >= 7 && rs < 11) {
                        System.out.println("Passado!");
                    } else if (rs < 7) {
                        System.out.println("Não passado!");
                    } else {
                        System.out.println("Erro!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno: ");
                    scanner.nextLine();

                    String pos = scanner.nextLine();

                    boolean controlar = false;

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i].equalsIgnoreCase(pos)) {
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Idade: " + idades[i]);
                            System.out.println("Serie: " + series[i]);
                            System.out.println("Curso: " + cursos[i]);

                            controlar = true;
                            break;
                        }
                    }

                    if (!controlar) {
                        System.out.println("Pessoa nao encontrada!");
                    }
                    break;
                case 3:
                    System.out.println("Certeza?\n[1] Sim\n[2] Não");
                    int cr = scanner.nextInt();

                    if (cr == 1) {
                        scanner.close();
                        return;
                    }
                default:
                    System.out.println("Erro!");
            }
        }
    }
}
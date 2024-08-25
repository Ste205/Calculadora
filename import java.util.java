import java.util.Scanner;

class Numero {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

public class Calc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equalsIgnoreCase("S")) {
            System.out.printf("%nDigite o Valor 1: ");
            n1.setValor(scan.nextInt());

            System.out.printf("Digite o Valor 2: ");
            n2.setValor(scan.nextInt());

            System.out.println("Escolha a operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    res.setValor(n1.getValor() + n2.getValor());
                    System.out.printf("A soma de %d com %d é igual a %d%n", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                case 2:
                    res.setValor(n1.getValor() - n2.getValor());
                    System.out.printf("A subtração de %d com %d é igual a %d%n", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                case 3:
                    res.setValor(n1.getValor() * n2.getValor());
                    System.out.printf("A multiplicação de %d com %d é igual a %d%n", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                case 4:
                    if (n2.getValor() != 0) {
                        double resultado = (double) n1.getValor() / n2.getValor();
                        System.out.printf("A divisão de %d com %d é igual a %.2f%n", n1.getValor(), n2.getValor(), resultado);
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.printf("%nDeseja realizar outra operação? (S/N) ");
            opc = scan.next();
            System.out.printf("%n%n%n");
        }

        scan.close();
    }
}


}
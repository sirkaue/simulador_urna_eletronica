import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        int votacao = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        String senhaDigitada1;
        String senha1 = "987654321";
        String senhaDigitada2;
        String senha2 = "123456789";
        int votacaoTotal;

        do {
            System.out.println("*URNA ELETRÔNICA*");
            System.out.println("Digite para: ");
            System.out.println("[1]. Abrir votação.");
            System.out.println("[2]. Totalizar e finalizar votação.");
            System.out.println("[3]. Zerar votos da urna.");
            System.out.println("[4]. Sair.");
            menu = input.nextInt();
            System.out.println();

            do {
                if (menu == 1) {
                    System.out.println("Para votar, digite o número do seu candidato: ");
                    System.out.println("Para cancelar digite '0' ");
                    System.out.println("[11]. Candidato 1");
                    System.out.println("[22]. Candidato 2");
                    System.out.println("[33]. Candidato 3");
                    votacao = input.nextInt();
                    if (votacao == 11) {
                        voto1++;
                        System.out.println("VOTO COMPUTADO!");
                        System.out.println();
                    } else if (votacao == 22) {
                        voto2++;
                        System.out.println("VOTO COMPUTADO!");
                        System.out.println();
                    } else if (votacao == 33) {
                        voto3++;
                        System.out.println("VOTO COMPUTADO!");
                        System.out.println();
                    } else if (votacao == 0) {
                        System.out.println("VOTAÇÃO ENCERRADA!");
                        System.out.println();
                    } else {
                        System.out.println("*OPÇÃO INVÁLIDA!*");
                        System.out.println();
                    }
                }

                if (menu == 2) {
                    System.out.println("Digite a senha para prosseguir");
                    senhaDigitada1 = input.next();
                    if (senhaDigitada1.equals(senha1)) {
                        votacaoTotal = voto1 + voto2 + voto3;
                        System.out.println("Votos Totalizados: " + votacaoTotal);
                        System.out.println("Candidato 1: " + voto1);
                        System.out.println("Candidato 2: " + voto2);
                        System.out.println("Candidato 3: " + voto3);
                        System.out.println();
                        menu = 4;
                    } else {
                        System.out.println("*SENHA ERRADA, DIGITE NOVAMENTE!*");
                        System.out.println();
                    }
                }
                
                if (menu == 3) {
                    System.out.println("Digite a senha para prosseguir");
                    senhaDigitada2 = input.next();
                    if (senhaDigitada2.equals(senha2)) {
                        voto1 = 0;
                        voto2 = 0;
                        voto3 = 0;
                        System.out.println("Votações foram RESETADAS");
                        System.out.println();
                    } else {
                        System.out.println("*SENHA ERRADA, DIGITE NOVAMENTE!*");
                        System.out.println();
                    }
                }
            } while (votacao != 0);
        } while (menu != 4);
    }
}
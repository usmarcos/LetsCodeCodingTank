package aula01;

import java.util.Scanner;

public class Exercicio09 {

    public void calculaSalarioLiquido(Scanner sc) {
        // variaveis
        float salario = 0;
        float media = 0;
        int meses = 0;
        int opcao = 0;
        float inss = 0f;
        float aliquotaInss = 0.075f;
        float ferias = 0f;
        float percentual = 0.33f;
        float salarioLiquido = 0f;
        // logica
        System.out.println("-----Calculo do salario liquido anual-----");
        System.out.println("Informe o salario mensal: ");
        salario = sc.nextFloat();
        System.out.println("Informe a quantidade de meses trabalhados: ");
        meses = sc.nextInt();
        //calcular salario mensal com ou sem decimo
        while (opcao != 1 && opcao != 2) {
            System.out.println("Recebeu decimo terceiro?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    media = ((meses + 1) * salario) / 12;
                    break;
                }
                case 2: {
                    media = (meses * salario) / 12;
                    break;
                }
                default:
                    System.out.println("Valor incorreto, favor escolha uma das opoees.");
                    break;
            }
        }
        //calculo inss
        inss = media * aliquotaInss;
        //calculo terco de ferias
        ferias = salario * percentual;
        //calculo salario liquido anual
        salarioLiquido = (media+ferias) - inss;
        //saida
        System.out.printf("O salario liquido do empregado e: R$ %.2f", salarioLiquido);

    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa = new Pessoa();

        Scanner ler = new Scanner(System.in);
        int opc = 1;
        while(opc != 3)
        {
            System.out.println("1 - Cadastrar uma pessoa");
            System.out.println("2 - Buscar uma pessoa");
            System.out.println("3 - Sair");
            opc = ler.nextInt();
            switch (opc){
                case 1:
                    pessoa = cadastrar();
                    pessoas.add(pessoa);
                    break;

                case 2:
                    exibir(pessoas);

                case 3:
                    break;

                default:
                    System.out.println("Opção invalida1");
            }
        }


    }

    public static Pessoa cadastrar(){

        Scanner ler = new Scanner(System.in);
        String nome;
        String rua;
        int idade;
        int numero;
        int opc = 1;

        List<Endereco> enderecos = new ArrayList<>();
        System.out.println("Digite o nome");
        nome = ler.next();
        System.out.println("Digite a idade");
        idade = ler.nextInt();
        while(opc != 2)
        {
            System.out.println("Digite a rua do endereço");
            rua = ler.next();
            System.out.println("Digite o numero do endereço");
            numero = ler.nextInt();
            enderecos.add(new Endereco(numero,rua));
            System.out.println("Adicionar mais um endereço? 1-Sim  2-Não");
            opc = ler.nextInt();
        }


        return new Pessoa(nome,idade,enderecos);
    }

    public static void exibir(List<Pessoa> pessoas)
    {
        String nome;
        boolean achou = false;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome");
        nome = ler.next();

        for(Pessoa i : pessoas)
        {
            if(i.getNome().equals(nome))
            {
                System.out.println("Nome: " + i.getNome() + " - Idade: " + i.getIdade());
                for (Endereco j : i.getEnderecos()) {
                    System.out.println("Numero: " + j.getNumero() + " - Rua: " + j.getRua());
                }
                achou = true;
                break;
            }
        }
        if(!achou)
        {
            System.out.println("Nome não encontrado");
        }
    }
}
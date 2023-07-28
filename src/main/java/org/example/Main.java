package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        System.out.println(nomes);


        Scanner ler = new Scanner(System.in);
        String nome;

        for(int i=0;i<3;i++)
        {
            nome = ler.next();
            nomes.add(nome);
        }
        ler.close();

        System.out.println(nomes);
        System.out.println(nomes.size());

        Pessoa lucas = new Pessoa("Lucas",19);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(lucas);

        System.out.println(pessoas.get(0).getNome());

        pessoas.add(new Pessoa("Gabriel", 26));*/

        List<Pessoa> pessoas = new ArrayList<>();

        Scanner ler = new Scanner(System.in);
        String nome;
        String rua;
        int idade;
        int numero;
        int opc;
        for(int i=0;i<3;i++)
        {
            List<Endereco> enderecos = new ArrayList<>();
            opc = 1;
            System.out.println("Digite o nome");
            nome = ler.next();
            System.out.println("Digite a idade");
            idade = ler.nextInt();
            while(opc == 1)
            {
                System.out.println("Digite a rua do endereço");
                rua = ler.next();
                System.out.println("Digite o numero do endereço");
                numero = ler.nextInt();
                enderecos.add(new Endereco(numero,rua));
                System.out.println("Adicionar mais um endereço? 1-Sim  2-Não");
                opc = ler.nextInt();
            }
            pessoas.add(new Pessoa(nome,idade,enderecos));


        }

        for(Pessoa i : pessoas)
        {
            System.out.println("Nome: " + i.getNome() + " - Idade: " + i.getIdade());
            for(Endereco j : i.getEnderecos())
            {
                System.out.println("Numero: " + j.getNumero() + " - Rua: " + j.getRua());
            }
        }
    }
}
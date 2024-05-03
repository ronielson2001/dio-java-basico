package edu.ronielson.primeiraSeman;

public class Operadores {
    public  static void main(String[] args) {
        String nome1 = "Ronielson";
        String nome2 = "Ronielson";

        System.out.println(nome1 == nome2);
        
        int n1 = 1;
        int n2 = 2; 

        boolean simNao = n1 == n2;

        if(n1 < n2){
            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numero1 é igual a numero 2? " + simNao);

        simNao = n1 != n2;
        System.out.println("numero1 é diferente do numero 2? " + simNao);

        simNao = n1 > n2;
        System.out.println("numero1 é diferente do numero 2? " + simNao);
    }

}

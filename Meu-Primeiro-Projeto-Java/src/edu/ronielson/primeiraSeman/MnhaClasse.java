package edu.ronielson.primeiraSeman;
public class MnhaClasse {
    public static void main (String [] args) {
       String primeiroNome = " Ronielson";
       String segundoNome = " Coelho";

       String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

       System.out.println(nomeCompleto);
    
    } public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Método" + primeiroNome.concat("").concat(segundoNome);
    }

}

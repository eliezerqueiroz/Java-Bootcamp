public class Operators {
    public static void main(String[] args){
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

        // ComparacaoAvancada.java
        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

    }
}

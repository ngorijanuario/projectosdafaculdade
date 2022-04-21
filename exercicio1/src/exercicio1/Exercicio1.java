
package exercicio1;
import java.util.*;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double f1, f2;
        int b = 1;
        //Crindo array de alunos
        int[] numerodealunos = new int [3];
        String[] nomedoalunos = new String [3];
        Double[] notadoalunos = new Double [3];
        String[] situacao = new String [3];
        //usando a estrutura for para pedir o nome e a frequencia do aluno
        for(int n=0; n<numerodealunos.length; n++){
            System.out.println("Digite "+(b+n)+"º aluno: ");
            nomedoalunos[n] = entrada.next();
            System.out.println("1ª Frequencia: ");
            f1 = entrada.nextDouble();
            System.out.println("2ª Frequencia");
            f2 = entrada.nextDouble();
            System.out.println("====================");
            notadoalunos[n] = (f1+f2)/2;
            
            //Criando as condições validação
            if(notadoalunos[n]>=12){
                situacao[n] = "Aprovado com "+notadoalunos[n];
            }
            else if(notadoalunos[n]<12 && notadoalunos[n]>7){
                situacao[n] = "Vai Para o Exame com "+notadoalunos[n];
            }
            else{
                situacao[n] = "Vai para o Recurso com "+notadoalunos[n];
            }
        }
        //Usando a estrutura for para mostrar resultados obtidos pelos alunos
        for(int g=0; g<numerodealunos.length;g ++){
            //Listar alunos
            System.out.println("====================");
            System.out.println("Nome: "+nomedoalunos[g]);
            System.out.println("Nota: "+notadoalunos[g]);
            System.out.println("Situação: "+situacao[g]);
        }
    }
    
}
//Fim do algoritmo 
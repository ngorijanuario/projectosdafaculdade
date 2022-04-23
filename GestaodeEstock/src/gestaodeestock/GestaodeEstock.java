package gestaodeestock;
//importar biblioteca do scanner
import java.util.*;
public class GestaodeEstock {
    // @autor Ngori Januário
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        Declaração de variáveis
        pacotesMaca = Quantidade inicial de maçãs
        pacotesBatata = Quantidade inicial de batatas
        Opcoes = Opções do menu diario
        resultado = resultado da compra
        percentagemMaca = Percentagens de Maças
        percentagemBatata = Percentagens de Batatas
        Opcao2 = Resposta do usuario para terminar o programa
        rotina = Variavel que controla o ciclo do programa
        pacotes = numer de pacotes que o cliente irá solicitar
        */
        int pacotesMaca, pacotesBatata, Opcoes,resultado = 1, resultado1 = 1, percentagemMaca = 0, percentagemBatata = 0;
        String opcao2;
        boolean rotina=true;
        // Apresentando as informações do programa na tela
        System.out.println("========= Bem vindo ao programa ==========");
        System.out.print("Stocks incial de Maçã: ");
        pacotesMaca = entrada.nextInt();
        System.out.print("Stocks incial de Batatas Fritas: ");
        pacotesBatata = entrada.nextInt();
        System.out.println("==========================================");
        System.out.println("Total de produtos no Stock: "+(pacotesMaca+pacotesBatata));
        // riar o menu diario com o ciclo de repeticão do while
       do{
        System.out.println("============== Menu diario ===============");
        System.out.println("1- Vender maça\n2- Vender Batatas Fritas\n3- Terminar Vendas");
        System.out.println("==========================================");
        // pedir a opção ao Tony
        System.out.print("Escolha uma das opcoes: ");
        Opcoes = entrada.nextInt();
        //Utilizando a estrutura de condição switch
        switch (Opcoes){
            case 1:
                System.out.println("Vendas de Pacotes de Maças");
                int pacotes;
                System.out.print("Quantos pacotes: ");
                pacotes = entrada.nextInt();
                if (pacotesMaca < pacotes && resultado !=0){
                    System.out.println("Não temos "+pacotes+" pacotes, mas temos "+pacotesMaca+" pacotes de maças");
                    System.out.print("Digite 'S' pra fazer a venda e 'N' para cancelar a venda\nResposta: ");
                    opcao2=entrada.next();
                    switch (opcao2){
                        case "S":
                            System.out.println("========= Facturação De Vendas ===========");
                            percentagemMaca=(pacotesMaca*100)/pacotesMaca;
                            System.out.println("Vendeu "+ percentagemMaca+"%");
                            System.out.println("Vendeu "+pacotesMaca+" pacotes de maças");
                            pacotesMaca=0;
                            break;
                        case "N":
                            System.out.println("Venda cancelada");
                            break;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                }
                else if(pacotesMaca >= pacotes && resultado !=0){
                    System.out.println("Vendeu "+pacotes+" pacotes de maças");
                    resultado=pacotesMaca-pacotes;
                    System.out.println("Sobrou "+resultado);
                    System.out.println("========= Facturação De Vendas ===========");
                    percentagemMaca=(pacotes*100)/pacotesMaca;
                    System.out.println("Vendeu "+ percentagemMaca+"%");
                    pacotesMaca=resultado;
                }
                else{
                    System.out.println("Já não temos pacotes disponiveis de Maças.");
                }
                break;
            case 2:
                System.out.println("Vendas de Pacotes de batatas");
                System.out.print("Quantos pacotes: ");
                pacotes = entrada.nextInt();
                if (pacotesBatata < pacotes && resultado1 !=0){
                System.out.println("Não temos "+pacotes+" pacotes, mas temos "+pacotesBatata+" pacotes de batatas");
                System.out.print("Digite 'S' pra fazer a venda e 'N' para cancelar a venda\nResposta: ");
                opcao2=entrada.next();
                switch (opcao2){
                    case "S":
                        System.out.println("========= Facturação De Vendas ===========");
                        percentagemBatata=(pacotesBatata*100)/pacotesBatata;
                        System.out.println("Vendeu "+ percentagemBatata+"% do Sotck atual");
                        System.out.println("Vendeu "+pacotesBatata+" pacotes de batatas");
                        pacotesBatata=0;
                        break;
                    case "N":
                        System.out.println("Venda cancelada");
                        break;
                    default:
                        System.out.println("Opção invalida");
                        break;
                }
                } else if(pacotesBatata >= pacotes && resultado1 !=0){
                    System.out.println("Vendeu "+pacotes+" pacotes de maças");
                    resultado1=pacotesBatata-pacotes;
                    System.out.println("Sobrou "+resultado1);
                    System.out.println("========= Facturação De Vendas ===========");
                    percentagemBatata=(pacotes*100)/pacotesBatata;
                    System.out.println("Vendeu "+ percentagemBatata+"% Do Sotck atual");
                    pacotesBatata=resultado1;
                }
                else{
                    System.out.println("Já não temos pacotes disponiveis de Maças.");
                }
                break;
            case 3:
                System.out.println("========= Terminou o programa ============");
                break;
            default:
                System.out.println("'"+Opcoes+"' não é uma opção valida.");
                break;
        }
        System.out.print("Digite 'S' pra continuar e 'N' para terminar\nResposta: ");
        String cont;
        cont=entrada.next();
        switch(cont){
            case "S":
                rotina = true;
                break;
            case "N":
                rotina = false;
                break;
            default:
                rotina = true;
                break;
        }
       } while(rotina!=false);
       System.out.println("========== Relatorio De Vendas ============");
       System.out.println("| Vendeu "+ percentagemMaca+"% dos pacotes de Maças Do Sotck   |");
       System.out.println("| Vendeu "+ percentagemBatata+"% dos pacotes de Batatas Do Sotck |");
       System.out.println("| Total de pacotes de Maças: "+pacotesMaca+" pacotes     |");
       System.out.println("| Total de pacotes de Batatas "+pacotesBatata+" pacotes    |");
       System.out.println("| Total de produtos no Stock: "+(pacotesMaca+pacotesBatata)+" pacotes    |");
       System.out.println("===========================================");
    }
    
}

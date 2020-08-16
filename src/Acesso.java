import java.sql.SQLOutput;
import java.util.Scanner;

public class Acesso {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite seu primeiro nome: "); //usado para que o usuario veja a mensagem
        String primeiroNome = scanner.nextLine(); //criei a variavel primeiro nome pra salvar os dados digitados pelo usuario
        System.out.print("Digite seu último nome: ");
        String ultimoNome = scanner.nextLine();
        String senha = ""; //criando a variável senha
        String login = primeiroNome.charAt(0) + "_" + ultimoNome; //criação de variavel string chamada "login", onde pego a variavel primeiro nome e uso o charAt() na posição 0 para poegar a primeira letra, depois somo com "_" e com a variavel ultimo nome
        System.out.println("Login: " + login); //mostrando p o usuario o login criado que esta armazenado na variavel "login"

        Boolean repete = false; //variavel booleana onde para auxiliar na estrutura de repetição (para iniciar um laço derepetição)
        while (repete == false) { //estrutura de repetição "enquanto/while" que vai se repetir até que a variavel "repete" se toner True
            System.out.println("Crie uma senha: ");
            senha = scanner.nextLine(); // recebendo dados digitados na variavel senha
            if (senha.length()>7) {//condição de tamanho contagem a partir de 0, lenght = quantidade de caracteres
                if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){ //expressão para criação de regras de login ou senha
                    System.out.println("Senha cadastrada com sucesso");
                    repete = true; //para interromper o laço de repetição
                } else { //caso não entre na condição do if (regras de caracteres) vai emitir essa mensagem de aviso
                    System.out.println("A senha deve conter pelo meno uma letra maiuscula e uma miniscula.");
                    System.out.println("No mínimo um caracter especial entre -, ! e @");
                    System .out.println("No mínimo um número.");
                }
            } else { //referente a regra de contagem
                System.out.println("A senha deve conter no mínimo 8 caracteres.");

            }
        }

        Boolean acesso = false;
        while (acesso == false) {
            System.out.print("Digite seu usuário: ");
            String usuario = scanner.nextLine();
            if (usuario.equals(login)){
                System.out.print("Digite sua senha: ");
                String cSenha = scanner.nextLine();
                if (cSenha.equals(senha)){
                    System.out.println("Login efetuado com sucesso.");
                    acesso = true;

                } else {
                    System.out.println("Senha inválida.");
                    System.out.println("Tente novamente.");
                }
            } else {
                System.out.println("Login inválido.");
                System.out.println("Digite novamente.");
            }
        }
    }
}

package taskmanager.ui;

import java.util.Scanner;
import taskmanager.manager.TaskManager;
import taskmanager.model.Task;


public class Menu {

    Scanner captura = new Scanner(System.in);
    TaskManager manager = new TaskManager();
    
    private int nextId = 1;

   public void mostrarMenu(){

    int opcao = 0;

    do{
System.out.println("Menu do Usuário");

System.out.println("1. Mostrar tarefas");
System.out.println("2. Adicionar uma nova tarefa");
System.out.println("3. Atualizar tarefa existente");
System.out.println("4. Remover tarefa");
System.out.println("0. Sair");

System.out.println("O que deseja fazer hoje? ");
opcao = captura.nextInt();
captura.nextLine();
    

switch (opcao) {
    case 1 ->
        manager.mostrarTasks();
        
    case 2 -> {
   System.out.println("Digite o nome da sua tarefa: ");
   String titulo = captura.nextLine();
   
   System.out.println("Qual descrição da sua tarefa? ");
   String descricao = captura.nextLine();

   System.out.println("Sua tarefa está concluída? (True/False) ");
   Boolean status = captura.nextBoolean();

   manager.adicionarTask(nextId, titulo, descricao, status);
   nextId++;
   
    }

   case 3 -> {
    System.out.println("Qual id da tarefa que vc gostaria de mudar?  ");
    int idAtualizado = captura.nextInt();

    System.out.println("Ok. E o que gostaria de mudar? \n 1. Titulo. \n 2. Descricao \n 3. Status \n 0. Sair");
    int atualizacao = captura.nextInt();
    captura.nextLine();

    Task tarefaAtual = manager.buscarPorId(idAtualizado);

    if (tarefaAtual == null) {
    System.out.println("Tarefa não encontrada!");
    break;
    }

    String tituloAtualizado = tarefaAtual.getTitulo();
    String descricaoAtualizada = tarefaAtual.getDescricao();
    Boolean statusAtualizado = tarefaAtual.isStatus();


    switch (atualizacao) {
        case 1 -> {
            System.out.println("Qual o nome novo da tarefa? ");
             tituloAtualizado = captura.nextLine();
             manager.atualizarTasks(idAtualizado, tituloAtualizado, descricaoAtualizada, statusAtualizado);
        }
        case 2 -> {
            System.out.println("Qual a descrição nova da tarefa? ");
            descricaoAtualizada = captura.nextLine();
            manager.atualizarTasks(idAtualizado, tituloAtualizado, descricaoAtualizada, statusAtualizado);
        }
        case 3 -> {
            System.out.println("É true ou false que sua tarefa foi concluída? ");
             statusAtualizado = captura.nextBoolean();
             captura.nextLine();
             manager.atualizarTasks(idAtualizado, tituloAtualizado, descricaoAtualizada, statusAtualizado);
        }
       case 0 -> {
        System.out.println("Saindo...");
       }
       default -> {
        System.out.println("Opcao Invalida...");
       }
    }
    
}

    case 4 -> {
        System.out.println("Qual id da task que você gostaria de remover? ");
        int idRemovido = captura.nextInt();

        Task tarefa = manager.buscarPorId(idRemovido);

        if(tarefa == null){
            System.out.println("Tarefa não encontrada.");
            break;

        }
        System.out.println("Tem certeza que gostaria de remover esta tarefa? (true/false)");
        Boolean confirmacao = captura.nextBoolean();

        if(confirmacao == true){
            manager.removerTasks(idRemovido);
            System.out.println("A tarefa " + tarefa.getTitulo() + " foi removida.");

        } else { 
            System.out.println("Sua tarefa não será removida.");
        }


    }
}   
    
    } while (opcao != 0);




   }

    

   }

    




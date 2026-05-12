package taskmanager.manager;

import java.util.ArrayList;
import taskmanager.model.Task;

public class TaskManager {
   private ArrayList<Task> lista;
    
   public Task buscarPorId(int id){
    for (Task task : lista){
        if (task.getId() == id){
            return task;
        }
        

    }
    return null;
   }

    public TaskManager() {
        this.lista = new ArrayList<>();

    }

   public ArrayList<Task> getLista() {
    return lista;
   }

   public void setLista(ArrayList<Task> lista) {
    this.lista = lista;
   }

   public void adicionarTask(int id, String titulo, String descricao, boolean status){
    Task tarefa = new Task(id, titulo, descricao, status);

    lista.add(tarefa);
}
public void mostrarTasks(){
    for (Task t : lista){
       System.out.println("Tarefa: " + t.getTitulo() + " Status: " + t.isStatus());
        
    }
}

       public void removerTasks(int id) { 
    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).getId() == id) {
            lista.remove(i);
            return;
        }
    }
}

       


public void atualizarTasks(int id, String titulo, String descricao, boolean status){
    for (Task t : lista){
    if (t.getId() == id){
        t.setTitulo(titulo);
        t.setDescricao(descricao);
        t.setStatus(status);
        break;
}
}
        
       }
}


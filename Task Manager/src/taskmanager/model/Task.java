package taskmanager.model;

public class Task {
    
     private String titulo;
        private boolean status;
        private String descricao;
        private int id;

    public Task(int id, String titulo, String descricao, boolean status) {
        this.descricao = descricao;
        this.id = id;
        this.titulo = titulo;
        this.status = false;
    }
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public boolean isStatus() {
            return status;
        }
        public void setStatus(boolean status) {
            this.status = status;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        



    


}

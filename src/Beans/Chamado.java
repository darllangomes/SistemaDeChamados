
package Beans;

import java.time.LocalDate;

public class Chamado {
    private String categoria;
    private String prioridade;
    private int Id;
    private Suporte suporte;
    private Cliente cliente;
    private LocalDate data;
    private String descricao;
    private String titulo;
    
    public Chamado(){
        
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public int getId() {
        return Id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Suporte getSuporte() {
        return suporte;
    }

    public void setSuporte(Suporte suporte) {
        this.suporte = suporte;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
    
    
}

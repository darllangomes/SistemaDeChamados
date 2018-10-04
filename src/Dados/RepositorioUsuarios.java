/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Beans.Chamado;
import Beans.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Darllan Gomes
 */
public class RepositorioUsuarios {
    
    ArrayList<Usuario> usuarios;
    
    public RepositorioUsuarios(int tamanho) {
        this.usuarios = new ArrayList<Usuario>(tamanho);
    }
    
    public void cadastrarChamado(Usuario u) {
       
            usuarios.add(u);
       
    }
    
    public ArrayList<Usuario> procurar(String cpf) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

        for (Usuario usuario : usuarios) {
            if(usuario.getCpf().equals(cpf)){
                listaUsuarios.add(usuario);
            }
         
        }
         return listaUsuarios;
    }
    
    public void remover(String cpf) {
        Usuario u;
      for(int i=0; i<usuarios.size();i++){
        if(cpf != null && this.usuarios.get(i).getCpf().equals(cpf) ){
           u=this.usuarios.get(i);
           usuarios.remove(u);
        }
      }
        
    }
    
    
    //serve para pegar todas as informações do repositório
     public ArrayList<Usuario> getDados() {
        return this.usuarios;
    }
    
}

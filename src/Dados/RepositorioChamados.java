
package Dados;

import Beans.Chamado;
import java.time.LocalDate;
import java.util.ArrayList;


public class RepositorioChamados {
    ArrayList<Chamado> chamados;
    
    public RepositorioChamados(int tamanho) {
        this.chamados = new ArrayList<Chamado>(tamanho);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    //vou criar os Exceptions
    //desconsiderei os Exceptions por enquanto
    //ainda é necessário realizar a verificação
    //para saber se o chamado existe no repositorio
    
    
    public void cadastrarChamado(Chamado c) {
       
            chamados.add(c);
       
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Chamado> procurar(LocalDate d) {
        ArrayList<Chamado> listaChamados = new ArrayList<Chamado>();

        for (Chamado chamado : chamados) {
            chamado.getData().equals(d);
            listaChamados.add(chamado);
        }
         return listaChamados;
    }
    
    
    public void remover(Chamado c) {
        chamados.remove(c);
    }
    
    
    //serve para pegar todas as informações do repositório
     public ArrayList<Chamado> getDados() {
        return this.chamados;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Beans.Chamado;
import Dados.RepositorioChamados;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Darllan Gomes
 */
public class ControladorChamados {
    
private RepositorioChamados repositorio;
    
    public void cadastrar(Chamado c) {
        if (c != null) {
            repositorio.cadastrarChamado(c);
        }
    }
    
    //vai realizar a procura com base na data
    //por enquanto vai usar o método LocalDate.now()
    
    public ArrayList<Chamado> procurar(LocalDate d) {
        return this.repositorio.procurar(d);
    }
    
}
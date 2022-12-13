package com.algaworks.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.model.Cliente;

public class ConsultaJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		List<Cliente> listaCliente = em.createQuery("From Cliente", Cliente.class).getResultList();
		
		for(Cliente cliente : listaCliente) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Sexo: " + cliente.getSexo());
			System.out.println("Profissão: " + cliente.getProfissao());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("------------------");
			
		}
		
		
	}

}

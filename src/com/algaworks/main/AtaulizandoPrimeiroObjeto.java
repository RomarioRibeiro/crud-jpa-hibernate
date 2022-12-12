package com.algaworks.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.model.Cliente;

public class AtaulizandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1L);
		em.getTransaction().begin();
		cliente.setIdade(29);
		em.getTransaction().commit();
		
		System.out.println("Cliente Alterado com sucesso!");
		
	}

}

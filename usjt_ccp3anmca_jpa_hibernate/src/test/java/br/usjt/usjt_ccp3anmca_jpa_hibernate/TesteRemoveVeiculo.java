package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Veiculo;

public class TesteRemoveVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = manager.find(Veiculo.class, 1L);
		manager.remove(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}

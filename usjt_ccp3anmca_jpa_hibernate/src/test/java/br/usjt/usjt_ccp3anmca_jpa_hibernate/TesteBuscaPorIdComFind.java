package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Veiculo;

public class TesteBuscaPorIdComFind {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}
}

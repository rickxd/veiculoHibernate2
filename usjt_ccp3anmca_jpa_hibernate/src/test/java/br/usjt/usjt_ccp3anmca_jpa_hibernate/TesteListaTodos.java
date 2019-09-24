package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Veiculo;

public class TesteListaTodos {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List<Veiculo> veiculos = query.getResultList();
		for (Veiculo v : veiculos) {
			System.out.println(v);
		}
		manager.close();
		JPAUtil.close();
	}
}

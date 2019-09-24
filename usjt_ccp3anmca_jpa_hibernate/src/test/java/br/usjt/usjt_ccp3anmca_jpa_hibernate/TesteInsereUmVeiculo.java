package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.Veiculo;

public class TesteInsereUmVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = new Veiculo();
		v.setMarca("Chevrolet");
		v.setModelo("Celta");
		v.setCor("Preto");
		v.setAnoDeFabricacao("2010");
		v.setRendimento(2.0);
		v.setTanque(40.0);
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}

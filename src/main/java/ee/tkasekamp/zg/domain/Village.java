package ee.tkasekamp.zg.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private int population;
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Resource> storage;
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Resource> production;

	public Village(String name, int population) {
		super();
		this.name = name;
		this.population = population;
		this.storage = new HashSet<Resource>();
		this.production = new HashSet<Resource>();
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Resource> getStorage() {
		return storage;
	}

	public Set<Resource> getProduction() {
		return production;
	}

}

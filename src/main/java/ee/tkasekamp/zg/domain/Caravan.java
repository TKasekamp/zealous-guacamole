package ee.tkasekamp.zg.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Caravan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Village from;
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Village to;
	@Column
	private int daysTravelled;
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	private Resource resource;

	protected Caravan() {

	}

	public Caravan(Village from, Village to) {
		super();
		this.from = from;
		this.to = to;
		daysTravelled = 0;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Resource getResource() {
		return resource;
	}

	public int getDaysTravelled() {
		return daysTravelled;
	}

	public void setDaysTravelled(int daysTravelled) {
		this.daysTravelled = daysTravelled;
	}

	public Village getFrom() {
		return from;
	}

	public Village getTo() {
		return to;
	}

}

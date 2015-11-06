package ee.tkasekamp.zg.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Day implements Serializable {
	private static final long serialVersionUID = 1L;
	// This is basically a hack to always find that one object
	@Id
	private String name = "Day";
	@Column
	private int day = 0;

	public void increment() {
		day++;
	}

	public void reset() {
		day = 0;
	}

	public int getDay() {
		return day;
	}

}

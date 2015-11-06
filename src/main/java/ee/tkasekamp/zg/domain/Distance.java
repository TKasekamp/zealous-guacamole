package ee.tkasekamp.zg.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Distance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int villageId;
	@Column
	private int distTo1;
	@Column
	private int distTo2;
	@Column
	private int distTo3;
	@Column
	private int distTo4;

	public Distance(Village village, int distTo1, int distTo2, int distTo3,
			int distTo4) {
		super();
		this.villageId = village.getId();
		this.distTo1 = distTo1;
		this.distTo2 = distTo2;
		this.distTo3 = distTo3;
		this.distTo4 = distTo4;
	}

	public int getId() {
		return villageId;
	}

	public int getDistTo1() {
		return distTo1;
	}

	public int getDistTo2() {
		return distTo2;
	}

	public int getDistTo3() {
		return distTo3;
	}

	public int getDistTo4() {
		return distTo4;
	}

}

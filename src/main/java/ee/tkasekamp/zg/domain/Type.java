package ee.tkasekamp.zg.domain;

public enum Type {
	FOOD("Food");
	private final String name;

	Type(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

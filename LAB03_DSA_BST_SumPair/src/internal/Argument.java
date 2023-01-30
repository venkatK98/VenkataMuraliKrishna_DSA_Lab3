package internal;

public class Argument {

	private String name;
	private Object object;

	public Argument(String name, Object object) {

		this.name = name;
		this.object = object;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String toString() {

		StringBuilder contents = new StringBuilder();

		contents.append(String.format("[%s -> %s] ", name, object));

		return contents.toString();
	}
}
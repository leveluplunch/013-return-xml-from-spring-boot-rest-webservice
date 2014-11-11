package demo;

public class AgencyResource {
	
	private Integer id;
	private String name;
	private String EIN;
	
	public AgencyResource(Integer id, String name, String eIN) {
		super();
		this.id = id;
		this.name = name;
		EIN = eIN;
	}
	
	@Override
	public String toString() {
		return "Agency [id=" + id + ", name=" + name + ", EIN=" + EIN + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEIN() {
		return EIN;
	}
	public void setEIN(String eIN) {
		EIN = eIN;
	}
	
	

}
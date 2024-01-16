package firstspringjavapackage;

import org.springframework.stereotype.Component;

@Component
public class MobileLab {

	private String name = "hello";
	private String Address = "Huma U MEgdal";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Lab [name=" + name + ", Address=" + Address + "]";
	}

}

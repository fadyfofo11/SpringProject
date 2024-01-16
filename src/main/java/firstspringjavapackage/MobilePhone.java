package firstspringjavapackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MobilePhone {

	private String manifacturer;
	private String model;
	private double screenSize;
	@Autowired
	private MobileLab mobLab;

	public MobilePhone(String manifacturer, String model, double screenSize) {
		super();
		this.manifacturer = manifacturer;
		this.model = model;
		this.screenSize = screenSize;
	}

	public String getManifacturer() {
		return manifacturer;
	}

	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "MobilePhone [manifacturer=" + manifacturer + ", model=" + model + ", screenSize=" + screenSize + " "
				+ mobLab + "]";
	}

}

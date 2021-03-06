package telran.imagga.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.ToString;

@Getter

public class BackgroundColor {
	@JsonAlias({"closest_palette_color_parent"})
	String colorParent;
	@JsonAlias({"closest_palette_color"})
	String color;
	Double percent;
	
	@Override
	public String toString() {
		return color + "\t\t" + colorParent + "\t\t" + percent;
	}

}

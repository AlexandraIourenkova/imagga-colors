package telran.imagga.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ForegroundColors {
	String closest_palette_color;
	String closest_palette_color_parent;
	double percent;
}
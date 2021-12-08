package telran.imagga.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Color {
	BackgroundColor[] background_colors;
	BackgroundColor[] image_colors;
	BackgroundColor[] foreground_colors;

	@JsonIgnore
	public List<BackgroundColor> getListOfColors() {
		List<BackgroundColor> res = new ArrayList<>(Arrays.asList(image_colors));
		res.addAll(Arrays.asList(foreground_colors));
		res.addAll(Arrays.asList(background_colors));
		return res;

	}
}
package flowers;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    RED("#F00"), YELLOW("#ffff00"), BLUE("00F");

    private String rgb;

    Color(String rgb) {
        this.rgb = rgb;
    }
}

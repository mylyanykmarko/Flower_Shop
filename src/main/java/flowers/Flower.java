package flowers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flower {
    private FlowerType type;
    private Color color;
    private float price;
    private FlowerSpec spec;
    private Odor odor;
}

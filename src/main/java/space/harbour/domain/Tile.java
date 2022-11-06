package space.harbour.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tile {
    char value;

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

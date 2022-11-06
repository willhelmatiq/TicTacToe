package space.harbour;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import space.harbour.domain.Board;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    String name;
    char aChar;

    public void makeAMove(Board board, int row, int column) {
        board.getBoardValues()[row-1][column-1].setValue(this.aChar);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getXShouldStartAs0() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int x = PlayerCharacter.getX();
        assertEquals(0, x);


    }

    @Test
    void getYShouldStartAs0() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int x = PlayerCharacter.getY();
        assertEquals(0, x);
    }

    @Test
    void wShouldMoveUp() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "W";
        PlayerCharacter.move(movement);
        int resultY = PlayerCharacter.getY();
        assertEquals(1, resultY);

    }

    @Test
    void wShouldMoveLeft() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "A";
        PlayerCharacter.move(movement);
        int resultY = PlayerCharacter.getY();
        assertEquals(-1, resultY);

    }

    @Test
    void wShouldMoveDown() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "S";
        PlayerCharacter.move(movement);
        int resultX = PlayerCharacter.getX();
        assertEquals(-1, resultX);
    }

    @Test
    void wShouldMoveRight() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        String movement = "D";
        PlayerCharacter.move(movement);
        int resultX = PlayerCharacter.getX();
        assertEquals(1, resultX);


    }

}
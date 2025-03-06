package es.fpalanturing.studentify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import es.fpalanturing.studentify.model.Health;

@SpringBootTest
public class HealthTests {
    private Health health;
    @BeforeEach
    void PrepareHealth() {
        health = new Health("SUCCESS", "API is healthy");
    }

    @Test
    void testGetMessage() {

        // AAA
        // Arrange

        String expectedMessage = "API is healthy";
        
        // Act
        String actualMessage = health.getMessage();
        // Assert
        assertEquals(expectedMessage, actualMessage);

    }

    @Test
    void testGetStatus() {
        // AAA
        // Arrange
        String expectedStatus = "SUCCESS";
        // Act
        String actualStatus = health.getStatus();
        // Assert
        assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void testGetTimestamp() {

    }

    @Test
    void testSetMessage() {

        // AAA
        String expectedMessage = "ERROR";
        // Act
        health.setMessage(expectedMessage);
        //Assert
        assertEquals(expectedMessage, health.getMessage());
        


    }

    @Test
    void testSetStatus() {

    }
}

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;
import org.testfx.matcher.control.TextMatchers;


import java.util.Objects;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ApplicationExtension.class)
class CalculatorTest {

  @Start
  public void start (Stage stage) throws Exception {
    Parent mainNode = FXMLLoader.load(Objects.requireNonNull(Calculator.class.getResource("calculator.fxml")));
    stage.setScene(new Scene(mainNode));
    stage.show();
    stage.toFront();
  }

  @BeforeAll
  public static void setUp () throws Exception {
  }

  @AfterAll
  public static void tearDown () throws Exception {
    FxToolkit.hideStage();
  }

  @Test
  public void testTypeNumber(){
    final FxRobot fxRobot = new FxRobot();
    fxRobot.clickOn("#btn1");
    fxRobot.clickOn("#btn2");
    fxRobot.clickOn("#btn3");
    fxRobot.clickOn("#btn4");
    fxRobot.clickOn("#btn5");
    fxRobot.clickOn("#btn6");
    fxRobot.clickOn("#btn7");
    fxRobot.clickOn("#btn8");
    fxRobot.clickOn("#btn9");
    fxRobot.clickOn("#btn0");
    FxAssert.verifyThat("#numberDisplayText", TextMatchers.hasText("1234567890"));
  }

  @Test
  public void testAddition(){
    final FxRobot fxRobot = new FxRobot();
    fxRobot.clickOn("#btn1");
    fxRobot.clickOn("#btn2");
    fxRobot.clickOn("#btnAdd");
    fxRobot.clickOn("#btn3");
    fxRobot.clickOn("#btn4");
    fxRobot.clickOn("#btnEquals");
    FxAssert.verifyThat("#numberDisplayText", TextMatchers.hasText("46"));
  }

  @Test
  public void testClear(){
    final FxRobot fxRobot = new FxRobot();
    fxRobot.clickOn("#btn1");
    fxRobot.clickOn("#btn2");
    fxRobot.clickOn("#btn3");
    fxRobot.clickOn("#btn4");
    fxRobot.clickOn("#btnC");
    FxAssert.verifyThat("#numberDisplayText", TextMatchers.hasText(""));
  }


  

}
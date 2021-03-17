import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;



public class SceneSelectGameTimed
{
    
    private Label myLabelSelectGame_1       = new Label("Select Game");
    private Scene selectGameScene;
    private Stage localStage;
    
    public SceneSelectGameTimed(Stage stage)
    {
        selectGameScene = makeSceneSelectGame();
        localStage = stage;
    }
    
    public Scene getScene()
    {
        return selectGameScene;
    }
        
    
    
    public Scene makeSceneSelectGame()
    {
        // Implement the layout of this scene/screen
        Button buttonToMainMenu = new Button("Back");
        Button buttonToTimedModeGame = new Button("Timed Mode");
        Button buttonToSpeedModeGame  = new Button("Speed Mode");
        
        
        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        buttonToMainMenu.setOnAction(this::buttonClickToMainMenu);
        buttonToTimedModeGame.setOnAction(this::buttonClickToTimeModeGame);
        buttonToSpeedModeGame.setOnAction(this::buttonClickToSpeedModeGame);
;
        
        // Add the button and label into the pane
        pane.add(myLabelSelectGame_1, 0, 0);
        pane.add(buttonToMainMenu, 1, 0);
        pane.add(buttonToTimedModeGame, 1, 1);
        pane.add(buttonToSpeedModeGame, 1, 2);        
        
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 500,400);
        return scene;
    }
        
    private void buttonClickToMainMenu(ActionEvent event)
    {
       localStage.setTitle("Main Menu");
       localStage.setScene(SceneMgr.getScene(SceneMgr.IDX_MAINMENU));
       localStage.show();

    }
    
    private void buttonClickToTimeModeGame(ActionEvent event)
    {
       localStage.setTitle("Timed Mode Game");
       localStage.setScene(SceneMgr.getScene(SceneMgr.IDX_READYSTARTTIMED));
       localStage.show();

    }   
    
    private void buttonClickToSpeedModeGame(ActionEvent event)
    {
       localStage.setTitle("Speed Mode Game");
       localStage.setScene(SceneMgr.getScene(SceneMgr.IDX_READYSTARTSPEED));
       localStage.show();

    }    
    
}

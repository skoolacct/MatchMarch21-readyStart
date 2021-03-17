/*
 * SceneMaker
 *
 * Testbed to try out new Scene designs
 *
 */



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SceneMaker extends Application
{
    /*
     * Scenes we need for this application
     */
    private Scene sceneMainMenu;
    private Scene sceneTopScore;
    //private Scene sceneTopScoreSpeed;
    //private Scene sceneTopScoreTimed;
    private Scene sceneSelectGame;
    private Scene sceneSpeedGame;
    private Scene sceneTimedGame;
    private Scene sceneBbye;
    private Scene sceneReadyStartTimed;
    private Scene sceneReadyStartSpeed;
    
    private TopScoreMgr topScoreMgr;
    
    //StateEvntTransitionEntry[] mainMenuStateTable;
    
    
 
    @Override
    public void start(Stage stage) throws Exception
    {

        doActualStuff(stage);
    }
    
    public void doActualStuff(Stage stage)
    {
       topScoreMgr = new TopScoreMgr();       
       topScoreMgr.initializeTopScoreLists();

       topScoreMgr.testModifySpeedList();
       topScoreMgr.testModifyTimedList();
       
       
        /*
         * Create Scenes ahead of time
         */
        // Main menu
       SceneMainMenu sceneObjMainMenu = new SceneMainMenu(stage);
       sceneMainMenu = sceneObjMainMenu.getScene();
       
       // Top score menu
       SceneTopScoreMenu sceneObjTopScoreMenu = new SceneTopScoreMenu(stage);
       sceneTopScore = sceneObjTopScoreMenu.getScene();
       
       // Top score speed
       //SceneTopScoreSpeed sceneObjTopScoreSpeed = new SceneTopScoreSpeed(stage);
       //sceneTopScoreSpeed = sceneObjTopScoreSpeed.getScene();
       
       // Top score timed
       //SceneTopScoreTimed sceneObjTopScoreTimed = new SceneTopScoreTimed(stage);
       //sceneTopScoreTimed = sceneObjTopScoreTimed.getScene();
       
       // Select game
       SceneSelectGameTimed sceneObjSelectGame = new SceneSelectGameTimed(stage);
       sceneSelectGame = sceneObjSelectGame.getScene();
        
        // Game, speed mode
       SceneGameSpeed sceneObjGameSpeed = new SceneGameSpeed(stage);
       sceneSpeedGame = sceneObjGameSpeed.getScene();

       // Game, timed mode
       SceneGameTimed sceneObjGameTimed = new SceneGameTimed(stage);
       sceneTimedGame = sceneObjGameTimed.getScene();
       
       // B'bye screen upon exit
       SceneBbye sceneObjBbye = new SceneBbye(stage);
       sceneBbye = sceneObjBbye.getScene();

       // ReadyStart before timed gameplay
       SceneReadyStartTimed sceneObjReadyStartTimed = new SceneReadyStartTimed(stage);
       sceneReadyStartTimed = sceneObjReadyStartTimed.getScene();

       // ReadyStart before speed gameplay
        SceneReadyStartSpeed sceneObjReadyStartSpeed = new SceneReadyStartSpeed(stage);
        sceneReadyStartSpeed = sceneObjReadyStartSpeed.getScene();
     
       
       SceneMgr.setScene(SceneMgr.IDX_MAINMENU,         sceneMainMenu);
       SceneMgr.setScene(SceneMgr.IDX_MAINMENU,         sceneMainMenu);
       SceneMgr.setScene(SceneMgr.IDX_TOPSCOREMENU,     sceneTopScore);
       //SceneMgr.setScene(SceneMgr.IDX_TOPSCORESPEED,    sceneTopScoreSpeed);
       //SceneMgr.setScene(SceneMgr.IDX_TOPSCORETIMED,    sceneTopScoreTimed);
       SceneMgr.setScene(SceneMgr.IDX_SELECTGAME,       sceneSelectGame);
       SceneMgr.setScene(SceneMgr.IDX_GAMESPEED,        sceneSpeedGame);
       SceneMgr.setScene(SceneMgr.IDX_GAMETIMED,        sceneTimedGame);
       SceneMgr.setScene(SceneMgr.IDX_BBYE,             sceneBbye);
       SceneMgr.setScene(SceneMgr.IDX_READYSTARTTIMED, sceneReadyStartTimed);
       SceneMgr.setScene(SceneMgr.IDX_READYSTARTSPEED, sceneReadyStartSpeed);
       

        // Set the title and scene for the first screen to be visible
        stage.setTitle("Main Menu");
        stage.setScene(sceneMainMenu);

        // Show the Stage (window)
        stage.show();
    }
  
}

package helloscalafxml

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafxml.core.{NoDependencyResolver, FXMLView}

object HelloStageDemo extends JFXApp {

  //Load my FirstScene.fxml, created with "Scene Builder 2.0"
  
  //Download "Scene Builder see readme.md"  
  val root = FXMLView(getClass.getResource("FirstScene.fxml"), NoDependencyResolver)
  
  //Frame
  stage = new JFXApp.PrimaryStage {
    //Frame Title
    title.value = "Hello ScalaFXML"
    //Show FirstScene.fxml
    scene = new Scene(root)
  }
}
package helloScalaFX

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafxml.core.{NoDependencyResolver, FXMLView}

object HelloStageDemo extends JFXApp {

  //Load my FirstScene.fxml, created with "Scene Builder 2.0"
  
  //Download "Scene Builder 2.0"
  //http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html  
  val root = FXMLView(getClass.getResource("FirstScene.fxml"), NoDependencyResolver)
  
  //Frame
  stage = new JFXApp.PrimaryStage {
    //Frame Title
    title.value = "Hello ScalaFX"
    //Show FirstScene.fxml
    scene = new Scene(root)
  }
}
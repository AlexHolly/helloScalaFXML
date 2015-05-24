package helloScalaFX

import scalafx.scene.control._
import scalafxml.core.macros._
import scalafx.event.ActionEvent

//I am a sfxml controller file
@sfxml
//FirstScene.fxml passes objects to this class
class FirstSceneController(private val pushMeButton: Button,
           private val outLabel: Label) {

  //pushMeButton On Action Event
  def onButtonDown(event: ActionEvent) {
    outLabel.text = "HelloScalaFX"
  }
}
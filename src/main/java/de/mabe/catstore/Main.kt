package de.mabe.catstore

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage


fun main(args: Array<String>) {
  Main().start(args)
}

class Main : Application() {
  fun start(args: Array<String>) {
    Application.launch(*args)
  }

  override fun start(primaryStage: Stage) {
    val root = FXMLLoader.load<Parent>(javaClass.getResource("sample.fxml"))
    primaryStage.title = "Hello World"
    primaryStage.scene = Scene(root, 300.0, 275.0)
    primaryStage.show()
  }

}

package MUA

/**
 * Created by kaneko on 2015/09/02.
 */

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Test extends Application{
  override def start(primaryStage: Stage): Unit ={

    primaryStage.setTitle("test")

    val root = new StackPane
    root.getChildren.add(new Label("Hello World"))

    primaryStage.setScene(new Scene(root,300,300))
    primaryStage.show
  }
}


package de.mabe.catstore

import javax.swing.JFrame
import javax.swing.JLabel


fun main() {
  JFrame.setDefaultLookAndFeelDecorated(true)

  val frame = JFrame("HelloWorldSwing")
  frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

  frame.contentPane.add(JLabel("Hiiii"))

  frame.pack()
  frame.isVisible = true
}


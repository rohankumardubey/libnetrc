package org.libnetrc

import scala.util.parsing.input.Position

/** Error description */
case class Error(pos: Position, msg: String = "No error") extends Exception {
  override def toString: String = s"at [${pos.line},${pos.column}]: $msg"
}

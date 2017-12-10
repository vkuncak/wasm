package scalawasm

import scalawasm.ast.{Opcode, Tree}

package object text {
  object TextTree extends Tree {
    type Variable = Either[Int, String]
  }

  object TextOpcode extends Opcode {
    type Variable = Either[Int, String]
  }
}
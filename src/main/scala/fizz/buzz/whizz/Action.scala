package fizz.buzz.whizz

object Action {
  type Action = Int => String

  def to(word: String): Action = _ => word
  def nop: Action = _.toString
}

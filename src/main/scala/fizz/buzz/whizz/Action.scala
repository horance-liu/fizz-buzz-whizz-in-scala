package fizz.buzz.whizz

object Action {
  def to(word: String): Int => String = _ => word
}

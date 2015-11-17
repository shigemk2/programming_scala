final class Fixed {
  def doSomething = "Fixed did something!"
}
// illegal inheritance from final class Fixed
class Changeable1 extends Fixed // エラー

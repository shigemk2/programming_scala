package observer
trait Subject {
  type Observer = { def receiveUpdate(subject: Any) }
  private var observers = List[Observer]()
  def addObserver(observer:Observer) = observers ::= observer
  // こういうふうに書くこともできる
  // def addObserver(observer:Observer) = observers = observer :: observers
  def notifyObservers = observers foreach (_.receiveUpdate(this))
}

trait Logger {
  def log(message: String): Unit
}
trait Service {
  val logger: Logger

  def run = {
    logger.log("Starting " + getClass.getSimpleName + ":")
    doRun
  }

  protected def doRun: Boolean
}

object MyService1 extends Service {
  class MyService1Logger extends Logger {
    def log(message: String) = println("1: " + message)
  }
  override val logger = new MyService1Logger
  def doRun = true

  def main(args: Array[String]): Unit = {
    println(doRun)
    logger.log("hogehoge")
  }
}

object MyService2 extends Service {
  class MyService2Logger extends Logger {
    def log(message: String) = println("2: " + message)
  }
  override val logger = new MyService2Logger
  def doRun = true
  def main(args: Array[String]): Unit = {
    println(doRun)
    logger.log("hogehoge")
  }
}

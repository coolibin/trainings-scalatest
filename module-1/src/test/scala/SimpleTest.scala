import com.typesafe.scalalogging.LazyLogging

class SimpleTest
  extends org.scalatest.funsuite.AnyFunSuite
    with LazyLogging {

  test("Simple test") {
    logger.info("Running Simple test")
    assert(1 == 1)
  }
}

import org.scalatest.FunSuite

/**
 * Provides a service as described.
 *
 * This is further documentation of what we're documenting.
 * Here are more details about how it works and what it does.
 */
class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(0) === 0)
  }
}
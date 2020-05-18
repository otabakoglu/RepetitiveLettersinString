
import junit.framework.Assert.assertEquals
import org.junit.Test
class TestForStars {

    private val data1 = "abbcccaaeeeeb bfffffca ccab"
    private val data2 = "gbbc  aeeeeb bfaaf fvvffca ccab"

    @Test
    fun evaluatesExpressionWithData1N9() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc(data1, 9)
        assertEquals("abbcccaaeeeeb bfffffca ccab", result)
    }

    @Test
    fun evaluatesExpressionWithData1N5() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc(data1, 5)
        assertEquals("abbcccaaeeeeb b*****ca ccab", result)
    }

    @Test
    fun evaluatesExpressionWithData1N4() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc(data1, 4)
        assertEquals("abbcccaa****b b*****ca ccab", result)
    }

    @Test
    fun evaluatesExpressionWithData1N2() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc(data1, 2)
        assertEquals("a***********b b*****ca **ab", result)
    }

    @Test
    fun evaluatesExpressionIsEmpty() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc("", 9)
        assertEquals("", result)
    }

    @Test
    fun evaluatesExpressionWithData2N2() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc(data2, 2)
        assertEquals("g**c  a****b bf**f f****ca **ab", result)
    }

    @Test
    fun evaluatesExpressionWithData2N3() {
        val calculator = RepetitiveLettersinString()
        val result: String = calculator.calc(data2, 3)
        assertEquals("gbbc  a****b bfaaf fvvffca ccab", result)
    }

}
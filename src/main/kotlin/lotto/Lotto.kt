package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
    }

    fun getNumbers(): List<Int> = numbers

    fun getSortedNumbers(): List<Int> = numbers.sorted()
}

fun List<Lotto>.toNumberList(): List<List<Int>> = this.map { it.getSortedNumbers() }

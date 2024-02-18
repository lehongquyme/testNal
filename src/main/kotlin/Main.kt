import java.util.regex.Pattern

fun main(args: Array<String>) {
    print("Nhập chuỗi chữ cái Latin: ")
    val inputString = readln()?: ""
    println("Số lượng các chữ cái Tiếng Việt có thể tạo thành là: ${countVietnameseLetters(inputString)}")
}
fun countVietnameseLetters(inputString: String): Int {
    val vietnamesePattern = Pattern.compile("(aw|aa|dd|ee|oo|ow|w)")
    val matcher = vietnamesePattern.matcher(inputString)
    var count = 0
    while (matcher.find()) {
        count++
    }
    return count
}
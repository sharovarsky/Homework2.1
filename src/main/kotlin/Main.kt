fun main() {
    println("Сколько лайков?")
    val likes = readLine()?.toInt()
    println("Понравилось ${likes?.let { LikesCalc.getPeopleString(it) }}")
}
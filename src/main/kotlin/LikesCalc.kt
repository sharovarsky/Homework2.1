class LikesCalc {
    companion object {
        fun getPeopleString(likes: Int): String {
            return when {
                likes.mod(100) == 11 -> "$likes людям"
                likes.mod(10) == 1 -> "$likes человеку"
                else -> "$likes людям"
            }
        }
    }
}
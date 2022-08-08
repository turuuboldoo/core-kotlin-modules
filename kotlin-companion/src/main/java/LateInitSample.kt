class LateInitSample {
    companion object {
        lateinit var password: String
        lateinit var userName: String

        fun setData(pair: Pair<String, String>) {
            password = pair.first
            userName = pair.second
        }
    }
}
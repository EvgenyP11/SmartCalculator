class Pumpkin(val type: String, val isForHalloween: Boolean) {

    // create function addCandle()

    inner class Candle {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
    }
}
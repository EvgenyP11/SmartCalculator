fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    for ((k, v) in currentMap) {
         if (currentMap.containsValue(value)) currentMap.remove(k)
    }
    return currentMap

}
static void main(String[] args) {
    def mixedList = [1, "hello", 1, "world", "hello", true, false, true]
    println checkNumberOfDuplicate(mixedList)

    /**
     * the same result without creating a Map
     */
    println mixedList.countBy {it}

}

def static checkNumberOfDuplicate(list) {
    list.inject([:]) { map, element ->
        map[element] = (map[element] ?: 0) + 1
        map
    }
}

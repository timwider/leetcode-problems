class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        var currentElementIndex = 0
        var innerCounter = 1
        
        var indexOne = 0
        var indexTwo = 0
        
        var found = false
        
        for (outerNum in (0..nums.size - 2)) {
           
            for (innerNum in innerCounter..nums.size - 1) {
                if (nums[outerNum] + nums[innerNum] == target) {
                    indexOne = outerNum
                    indexTwo = innerNum
                    found = true
                    break
                }
            }
            if (!found) {
             innerCounter++
            } else break
        }
        
        val answer: IntArray = intArrayOf(indexOne, indexTwo)
        return answer
    }
}

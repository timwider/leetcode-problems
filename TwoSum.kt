class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var innerCounter = 1
        for (outerNum in (0 until nums.size - 2)) {
            for (innerNum in innerCounter..nums.size - 1) {
                if (nums[outerNum] + nums[innerNum] == target) return intArrayOf(outerNum, innerNum)
            }
            innerCounter++
        }
        return intArrayOf()
    }
}

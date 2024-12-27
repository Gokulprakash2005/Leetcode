/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakindex(mountainArr); 
        int first = binarysearch(mountainArr, target, 0, peak, true);
        if (first != -1) {
            return first;
        }
        return binarysearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    public int peakindex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid; 
            } else {
                start = mid + 1;
            }
        }
        return start; 
    }

    public int binarysearch(MountainArray mountainArr, int target, int start, int end, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid; 
            }
            if (asc) { 
                if (target > midValue) {
                    start = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            } else { 
                if (target < midValue) {
                    start = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            }
        }
        return -1; 
    }
}

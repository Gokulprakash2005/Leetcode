class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
          boolean noHorizontalOverlap = rec1[2] <= rec2[0] || rec2[2] <= rec1[0];
        boolean noVerticalOverlap = rec1[3] <= rec2[1] || rec2[3] <= rec1[1];
        return !(noHorizontalOverlap || noVerticalOverlap);
    }
}
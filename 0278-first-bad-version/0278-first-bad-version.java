/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int start=1;
      int end=n;
      int mid=0;
      while(start < end)
      {
        mid=start+((end-start)/2);
         if(isBadVersion(mid))
         {
            end=mid;
         }
         else{
            start=mid+1;
         }
      }
      if(start==end && isBadVersion(end))
      {
        return end;
      }
      return -1;
    }
}
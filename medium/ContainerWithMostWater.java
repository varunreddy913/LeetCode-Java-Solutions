class Solution {
    public int maxArea(int[] height) {
        // int l=0;
        // int r=height.length-1;
        // int area=0;
        // int max=0;
        // while(l<r){
        //     area=(r-l)*Math.min(height[l],height[r]);
        //     max=Math.max(area,max);
        //     if(height[l]==height[r]){
        //         l++;
        //         r--;
        //     }
        //     else if(height[l]<height[r]){
        //         l++;
        //     }
        //     else{
        //         r--;
        //     }
        // }
        // return max;



        int l=0;
        int r=height.length-1;
        int area=0;
        int max=0;
        while(l<r){
            int min=height[l]<height[r]?height[l]:height[r];
            //Math.min(height[l],height[r]);
            area=(r-l)*min;
            max=max>area?max:area;
            //Math.max(max,area);
            while(l<r && height[l]<=min){l++;}
            while(r>l && height[r]<=min){r--;}
        }
        return max;
    }
}
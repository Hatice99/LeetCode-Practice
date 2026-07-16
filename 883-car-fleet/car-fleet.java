class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        //store speed and position in single 2d array
        int[][] cars = new int[n][2];
        for(int i = 0; i<n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        //sort the array by position, the closest to the target
        Arrays.sort(cars, (a,b) -> Integer.compare(b[0], a[0]));

        //individuel ones
        Deque <Double> stack = new ArrayDeque<>();


        for(int[] car:cars){
            double time_to_arrive = (double)(target-car[0])/car[1];
            if(stack.isEmpty() || time_to_arrive > stack.peek()){
                stack.push(time_to_arrive);
            }
        }

        return stack.size();

        
        
    }
}
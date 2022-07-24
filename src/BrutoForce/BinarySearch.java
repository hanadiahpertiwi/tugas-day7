package BrutoForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static boolean BinarySearchOptimize(List<Integer>array, int x , int left, int right){
        if(left > right) return false;
        int mid = left + ((right -left)/2);
        if(array.get(mid) == x) return true;
        else if (x < array.get(mid)) return BinarySearchOptimize(array, x, left,mid - 1);
        else  return BinarySearchOptimize(array, x, left, right);
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>(List.of(12,15,15,19,24,32, 53, 59,60));
        Collections.sort(list);
        System.out.println("arrayy" + BinarySearchOptimize(list,5,0, list.size()));
    }

}

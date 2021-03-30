package com.company.AyoolaEtiko;
/*
All questions here are from Leetcode and AlgoExpert
All solved by Ayoola Nurudeen Etiko
 */
import java.util.List;

public class BooleanFactory {

    //Time O(n^2) space: O(1)
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrPtr = 0;
        int seqPtr = 0;
        int j, i;
        if(sequence.size() <= array.size()){
            for (i=0; i< sequence.size(); i++){
                for (j=0; j< array.size(); j++){
                    seqPtr = i;
                    arrPtr = j;
                    if (sequence.get(seqPtr).equals(array.get(arrPtr))){
                        i = seqPtr + 1;
                        if (i == sequence.size()){
                            System.out.println("subseq");
                            return true;
                        }
                    }
                }
                if (!sequence.get(seqPtr).equals(array.get(arrPtr)) || !array.contains(sequence.get(seqPtr))){
                    return false;
                }
            }
        }
        System.out.println("not in seq");
        return false;
    }
    //Time O(n) space: O(1)
    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        int arrPtr=0;
        int segPtr=0;
        while (segPtr < sequence.size() && arrPtr < array.size()){
            if(array.get(arrPtr).equals(sequence.get(segPtr))){
                segPtr++;
            }
            arrPtr++;
        }
        System.out.println("in seq");
        return segPtr == sequence.size();
    }
}

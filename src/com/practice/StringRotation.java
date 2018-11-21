package com.practice;

import java.util.Arrays;

public class StringRotation {
	public boolean checkStringRotation_OtherWay(String s1,String s2){
        boolean rotation = false;
        if(s1.length() != s2.length()) {
            System.out.println("s2 is not rotated version of s1");
        } else {
            String s3 = s1 + s1;

            if (s3.contains(s2)) {
                System.out.println("s2 is a rotated version of s1");
                rotation = true;
            } else {
                System.out.println("s2 is not rotated version of s1");
            }
        }
        return rotation;

    }
    public boolean checkStringRotation(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean rotation = false;
        if(Arrays.equals(c1, c2)){
            System.out.println("s2 is a rotated version of s1");
            rotation = true;
        }else{
            System.out.println("s2 is not rotated version of s1.");
        }
        return rotation;

    }
	
	public static void main(String[] args){
        StringRotation rotation = new StringRotation();
        rotation.checkStringRotation("checkStringRotation", "RotationcheckString");
        rotation.checkStringRotation_OtherWay("checkStringRotation", "RotationcheckString");
        //rotation.checkStringRotation_OtherWay("checkStringRotation", "StringRotationcheck");
    }
}

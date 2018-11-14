package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "incremental";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = getOutputResult(str, arrayList);
        int max = arrayList.get(0).length();
        String result = arrayList.get(0);
        for(int i = 1; i < arrayList.size(); i++){
            if(arrayList.get(i).length() > max){
                max = arrayList.get(i).length();
                result = arrayList.get(i);
            }
        }
        System.out.println(result);
    }

    public static ArrayList<String> getOutputResult(String str, ArrayList<String> arrayList){

        for(int i = 0; i < str.length(); i++){
            String strTemp = "";
            strTemp = strTemp.concat(String.valueOf(str.charAt(i)));
            String strResult = strTemp;
            int max = str.charAt(i);
            for (int j = i+1; j < str.length(); j++){
                if((int)str.charAt(j) > max){
                    max = str.charAt(j);
                    strResult = strResult.concat(String.valueOf(str.charAt(j)));
                    for(int k = j+1; k < str.length(); k++) {
                        if((int)str.charAt(k) > max){
                            max = str.charAt(k);
                            strResult = strResult.concat(String.valueOf(str.charAt(k)));
                        }
                    }
                }
            }
            arrayList.add(strResult);
        }
        for(int i = 0; i < arrayList.size(); i++){
            for(int j = 1; j < arrayList.size(); j++){
                if(arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                }
            }
        }
        return arrayList;
    }
}
package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
	ListFactory manipulateList = new ListFactory();

	int extraCandiesOne = 3;
	int extraCandiesTwo = 1;
	int extraCandiesThree = 10;

	int candyArrayOne[] = {2,3,5,1,3};
	int candyArrayTwo[] = {4,2,1,1,2};
	int candyArrayThree[] = {12,1,12};

    manipulateList.kidsWithCandies(candyArrayOne, extraCandiesOne);
    manipulateList.kidsWithCandies(candyArrayTwo, extraCandiesTwo);
    manipulateList.kidsWithCandies(candyArrayThree, extraCandiesThree);


    }
}

# Fisher's Coding Challenges

Welcome to my coding challenges!
- To get started, fork the repository and clone your fork.
- Then, you can try solving one of the challenges.
- When you're ready, push your solution and submit a PR!
I've set up an Action that will see if your code passes all the tests.

## Challenge 1
Bob is always very hungry.
When given a choice,
he will always choose the restaurant with the largest portion size.

Write a function that will help Bob find his favorite restaurant:
given a 2D array such that each element of the outer array is
an array representing the portion sizes of a restaurant's entrees (in grams),
return the index of the array with greatest average portion size.
Bob enjoys choice, so in the case of a tie,
return the index of the array with the greater number of entrees.

Example input:
```
{
   {555, 472, 472, 520},
   {347, 430, 396, 385, 390, 395},
   {200, 205, 210, 215, 230, 230, 240, 215}
}
```

Example ouput:
```
0
```

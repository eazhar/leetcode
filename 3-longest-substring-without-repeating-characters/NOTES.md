​String methods
for each letter in the string
if the current longest substring not contained (use Contain()), append it, and keep track of max of previous seen vs. new current
if it is contained, find index of (use indexOf()) where that character starts + 1, and create a sub a substring to the end, append new character, and keep track of max of previous seen vs. new current

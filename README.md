# dp_longest_length_common_subsuquence
Return longest string and length of LCS from two strings using dynamic programming

<img src="https://latex.codecogs.com/gif.latex?f(i,0)&space;=&space;f(0,j)&space;=&space;0" title="f(i,0) = f(0,j) = 0" />
<img src="https://latex.codecogs.com/gif.latex?f(i,j)&space;=&space;max(f(i-1,&space;j),&space;f(i,j-1))\;&space;if&space;A_i\neq&space;B_j" title="f(i,j) = max(f(i-1, j), f(i,j-1))\; if A_i\neq B_j" />
<img src="https://latex.codecogs.com/gif.latex?f(i,j)&space;=&space;f(i-1,&space;j)&plus;1\;&space;if&space;A_i&space;=&space;B_j" title="f(i,j) = f(i-1, j)+1\; if A_i = B_j" />
<img src="https://latex.codecogs.com/gif.latex?TimeComplexity:&space;O(NM)" title="TimeComplexity: O(NM)" />
where N is the length of String N <br>
M is the length of String M

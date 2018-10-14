### Examples 

### Summary
------

Asymptotic Notations 

| Notation | bound |
|----------| -------|
| Big O | Upper Bound/Worst Case|
| Big Omega | Lower Bound/ Best Case|
| Big Theta | Average Bound/Average Case |



### Big O Notation 

in O(n),  ```n --> infinity```

* in example assume  k < n

```
1 < logk(n) .. < log3(n) < log2(n) < k_root(n) ..  < 3_root(n)  < sqrt_root(n)  < n < nlogk(n) < n^2 < n^3 ..< n^k... < 2^n < 3^n ...< n^n

```

![Sample Functions](https://raw.githubusercontent.com/nileshsalpe/master-algorithm-interviews/master/docs/assets/big_o_graph.png)



#### Recursive 
-------

Template for exmaple 

```
function(n) { 

 // base case 
 if (n > 0)
    return 0 

// recursion call
   return <<RECURSION_CALL>>
 }
```

| RECURSION_CALL |comment |O(N)
|--------------------------------------------------|--------------------------|---------------|
| `function(n-1) ` | f(n) = f(n-1) + k , f(0) = 0 |  O(n)|
| `function(n-1) + function(n-2)` | f(n) = [f(n-1 + f(n-2)] +k , f(0) = 0 |  O(2^n)|
| `for(i 1 to n) + function(n-1) ` | f(n) = [ f(n-1 + f(n-2)+ ..f(n-n)] +k  , f(0) = 0  |  O(n^n)|




#### Non-Recursive 
-------

* for loop here could be while/if-while/do-while/for loop etc depends on language symantics 


| scenario |comment |O(N)
|--------------------------------------------------|--------------------------|---------------|
| `for(int i = 0; i < n ; i = i +k)` | n/k * O(n) | O(n) | 
| `for(int i = n; i > 0 ; i = i - k)` | n/k * O(n) | O(n) | 
| `for(int i = 0; i < n ; i = i +k){} for(int j = 0; j < n ; j = j + k){} ` | n/k * O(n) | O(n) | 
| `for(int i = 0; i < n ; i = i +k) { for(int j = 0; j < n ; j =j + k) }` | n/k * n/K * O(n^2) |O(n^2) | 
| `for(int i = 1; i*i..k-times < n ; i = i+k)` | k_root(n) | k_root(n) |
| `for(int i = 1; i < n ; i = i*k)` | logk(n) |logk(n) |
| `for(int i = n; i > 1 ; i = i/k)` |logk(n) | logk(n) |




Recursive functions 

----

- O(n) = n
```
 function1(n){
  # base condition
  # recursion
  function1(n-1)
  }

```

- O(n) = log2(n)
```
 function1(n){
  # base condition
  # recursion
  function1(n/2)
  }

```

- O(n) = 2^n
```
 function1(n){
  # base condition
  # recursion
  function1(n-1) + function1(n-2)
  }

```

- O(n) = 3^n
```
 function1(n){
  # base condition
  # recursion
  function1(n-1) + function1(n-2)+ function1(n-3)
  }

```

- O(n) = n^n
```
 function1(n){
  # base condition
  # recursion inside loop
  for( i=0; i<n; i++)
     function1(n-1)
  }

```


Non-Recursive functions 

----

- O(n) = n
```
for(i=0; i<n; i++){
 // O(1) statement
 }
```

- O(n) = n/k *O(n)
```
for(i=0; i<n; i= i+k){
 // O(1) statement
 }
```



Independent loops add number of times they run and take max

- O(n) = n
```
for(i=0; i<n; i++){
 // O(1) statement
 }
 
 for( j =0; j< m; j++){
 // O(1) statement
 }
```


Nested loops multiple by number of times they run
f(x) * g(x)

- O(n) = n^2
```
for(i=0; i<n; i++){

  for(j=0; j<n; j++){
 // O(1) statement
  }
}
```

Take worst case in case of  conditional if-else branches

- O(n) = n^2
```
for(i=0; i<n; i++){

 if(n == k){
   return
  } else {
    for(j=0; j<n; j++){
 // O(1) statement
  }
  }
}
```

- O(n) = log2(n)
```
for(i=0; i<n; i= i*2){
 // O(1) statement
 }
```

- O(n) = logk(n)
```
for(i=0; i<n; i= i*k){
 // O(1) statement
 }
```

- O(n) = log2(n)
```
for(i=n; i>1; i=i/2){
 // O(1) statement
 }
```

- O(n) = logk(n)
```
for(i=n; i>1; i=i/k){
 // O(1) statement
 }
```

Independent loop feed from one function to another f(g(x))

- O(n) = log2log2(n)
```
log(n)

for(i = 0; i < n; i=i*2){
 // O(1) statement
 }
 
 loglog(n)
 
 for( j = 0; j < n; j = j*2){
 // O(1) statement
 }
```


- O(n) = nlog2(n)
```
// n
for(i = 0; i < n; i=i*2){

// log(n)
  for( j = 0; j < n; j = j*2){
  // nlog(n)
 // O(1) statement
 }
 }
 
```




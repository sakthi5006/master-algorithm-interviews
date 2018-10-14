
Algorithm questions 
----

- Asked under time pressure like (solve in 30 min and come up with production quality)

### The algorithm should be 

- Well defined inputs/out-puts, ask interview what he wants clearly
- Validations of inputs [ask for valid inputs limitation which forms your boundry conditions]
- Definiteness [it gives what is asked it not random, for same input returns same output]
- Finiteness [Make sure there not infinite loops - mostly based on boundary conditions]
- Effectiveness [No redudant use of space or cpu]


### Simple steps to follow, create these columns on dash-board

-----

| Paraphrase Problem Statement | Assumptions | Code | Test  | Optimize |
|------------------------------|-------------|------|-------|----------|
| Rewrite problem in your own words as you can understand more |<ul><li>*Before starting, Ask right Questions*</li><li>Ask implicit assumptions </li><li>Make explicit assumption and state it</li><li> Have consensus on limitations fo design</li></ul>|<ul><li>Come up with at least three possible solutions and choose best based on time-space trade-offs </li><li> Write clean code</li><li>recursion vs iteration</li><li>efficient loops, conditions, if any and Consider Edge Conditions</li><li>Pay attention on conditions where code enters infinite loop</li></ul>|<ul><li> Unit test </li><li>Test happy scenarios</li><li>Test boundary conditions </li></ul>  | <ul><li>Always time-space trade-off</li><li>Choose right data-structure, use auxiliary structures if needed </li> <li>Network bandwidth</li><li>Power consumption in case of mobile devices</li><li>space/memory - CPU register/Main memory/file system/network </li><li>Try to improve the big O for time and space</li></ul> |




### Assumptions
-----

Examples- 
- If your problem boils down to data structure?
- Think through problem and limitations of data structure in terms of lookup/updates/deletes/reads/memory/use of multiple data-structures etc.
- What is SLA ? Or think of time complexity and memory complexity of selected data structure? does it fits into requirements?


##### Heap/Priority Queue
- Is this max/min heap?
- What is the max size allowed?
- Can we speed up with other data structures like Map lookup?


##### Map data structure 
 - Does it accept duplicate keys?
 - What is the total number of key-values does it fit in memory?
 - Do we need look up by values?
 - What is the efficient hash function needed?
 - Is this sorted Map? What kind of comparator needed to sort? Natural order or custom order?
 
#### Graph data structures 
- Does it contain  cycles?
- Does DSF/BSF fits for needed SLA?
- What is size of the graph?
- It is edge relationship/links or vertex relationship?



#### Interviewer should look for 
-----

- Asking the right questions 
- Lateral thinking [give three options/solutions based on constraints like memory, real time, near real time or batch responses]
- Ability to come up with edge cases and handle it in code
- Ability to write code 
- Multiple approaches? Does he select best after stating the limitations of each one? 

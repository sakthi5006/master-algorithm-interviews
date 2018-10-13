
Algorithm questions 

- Asked under time pressure like (solve in 30 min and come up with production quality)



|Paraphrase Problem Statement | Assumptions | Code | Test  | Optimize |
|------------------------------|-------------|------|-------|----------|
| Rewrite problem in your own words as you can understand more | Ask implicit assumptions | Write clean code | Unit test  | caching |
||Make explicit assumption and state it| | |recursion vs iteration | Test happy scenarios 
|| *Ask right Questions* |Clear loops, with exit on redundant things|||
||  |Do not mess with indexes while looping/consider and conditions|||
|| Consider Edge Conditions |If conditions||memory utilization|
||  |Conditions when it might enter an infinite loop|||
|| Come up with at least 3 approaches and choose the best fit  ||||




### Assumptions

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
- Asking the right questions 
- Lateral thinking [give three options/solutions based on constraints like memory, real time, near real time or batch responses]
- Ability to come up with edge cases and handle it in code
- Ability to write code 
- Multiple approaches? Does he select best after stating the limitations of each one? 

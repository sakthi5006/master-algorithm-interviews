
Algorithm questions 

- Asked under time presssure like (solve in 30 min and come up with production quality)



|Paraphrase Problem Statement | Assumptions | Code | Test  | Optimize |
|------------------------------|-------------|------|-------|----------|
| Rewrite problem in your own words as you can understand more | Ask implicit assumptions | Write clean code | Unit test  | caching |
||Make explicit assumption and state it| | |recursion vs iteration | Test happy scenarios 
|| Ask Questions |Clear loops, with exit on redudant things|||
|| Ask Questions |Do not mess with indexes while looping/consider end conditions|||
|| Consider Edge Conditions |If conditions||memory utilization|
||  |Conditions when it might enter infinite loop||memory utilization|
|| Come up with at least 3 appraoches and choose best fit  ||||




### Assumptions

Examples - 
- If your problem boils down to data structure ?
- Think through problem and limitations of data structure in terms of lookup/updates/deletes/reads/memory/use of multiple data-structures etc.
- What is SLA ? or think of time complexity and memory comlpexity of selected data structure ? does it fits in requirements ?


##### Heap/Priorioty Queue
- is this max/min heap?
- What is max size allowed ?
- Can we speed up with other data structures like Map lookup?


##### Map data structure 
 - Does it accept duplicate keys?
 - What is total number of key-values does it fits in memory ?
 - Do we need look up by values ?
 - What is efficient hash function needed ?
 - Is this sorted Map? what kind of comparator needed to sort ? narutal order or custom order?
 
#### Graph data structures 
- Does it contains  cycles ?
- does DSF/BSF fits for needed SLA?
- What is size of graph ?
- It is edge relationship/links or vertex relationship ?



#### Intervierer should look for 
- Asking right questions 
- Lateral thinking [give three options/solutions based on contraints like memory, real time , near realtime or batch responses]
- Ability to come up with edge cases and handle it in code
- Able to write code 
- Multiple approaches? Do he select best after stating limitations of each one ? 


#### Essential Classes for coding without editor 

#### Template Classes

```
        //Iterate over List/Set
        final List<String> items = new ArrayList();

        for(String item: items){
         // process single item
         }

```

```
       // Iterate over Map

        final Map<String, String> map = new HashMap();

        for(Map.Entry<String,String> entry: map.entrySet()){
            // process single item
        }

```


```
        // Driver class
        class MyClass {

            public static void main(String[] args) {
                // your code
            }

        }

```

```

        // Some business interfece
        interface MyService {

            void do(
            String arg);

        }

```

```

        // Some business logic 
        interface MyServiceImpl implements MyService {

            void do(final String arg )throws SomeKindOfRuntimeException

            {
                // Validate args 
                // Execute logic
                // Log Progress
                // Return value or Handle exception or release resources  try catch finally 
            }

        }

```

```

        // Do Test Driven Development TDD
        // Mock and inject all dependencies 

        class MyServiceImplTest {

            @Test
            public void testHappyDo() {
            }

            @Test
            public void testFailureDo() {
            }

            @Test
            public void testEdgeCasesDo() {
            }

        }

```

### Single Threaded Systems

- [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
- java.lang.System
- java.lang.Object
- [Array] (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- java.util.List 
- java.util.LinkedList
- java.util.Map `Dictionary or SymbolTable`
- java.util.Set
- java.util.PriorityQueue `Max Heap/Min Heap`
- java.io.File
- java.util.regex.Pattern
- java.util.Comparator
- java.lang.Comparable
- java.util.TreeSet `Ordered set`
- java.util.TreeMap `Ordered key map`

### Multi Threaded Systems

#### Low Level Concurrency Objects

- java.lang.Thread `run, start, join, sleep, yield`
- java.lang.Runnable
- keyword synchronized `block or for entire method`
- keyword volatile `light-weight synchronization and thread visibility`

#### High Level Concurrency Objects
- [java.util.concurrent.BlockingQueue](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html)
- java.util.concurrent.locks.Lock
- java.util.concurrent.executors
- java.util.concurrent.atomic


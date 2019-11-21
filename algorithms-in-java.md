
#### Essential Classes for coding without editor 

#### Template Classes

```
        // Iterate over array
 
        final String[] items = new String[10];

        for(int i=0; i< items.length; i++){
         // process single item
         System.out.println("Sum of x+y = " + i);
        }

```


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

            void do(String arg);

        }

```

```

        // Some business logic 
        class MyServiceImpl implements MyService {

            void do(final String arg )throws SomeKindOfRuntimeException

            {
                // Validate args 
                // Execute logic
                // Log Progress or metrics
                // Return value or Handle exception or release resources  try catch finally 
            }

        }
        
        // If used as key in hash map or set etc.
        
        class MyModel  {
          String fName;
          String lName;
          int  age;
          
          @Override
          public boolean equals(Object o) {
                if (o == this)
                    return true;
                if (!(o instanceof MyModel))
                    return false;
                    
                MyModel other = (MyModel)o;
                
                boolean fNameEquals = (this.fName == null && other.fName == null)
                  || (this.fName != null && this.fName.equals(other.fName));
                  
                 boolean lNameEquals = (this.lName == null && other.lName == null)
                  || (this.lName != null && this.lName.equals(other.lName));
                  
               return  this.age == other.this &&  fNameEquals && lNameEquals;
            }
            
        @Override
        public final int hashCode() {
        
            int result = 17;
            
            if (fname != null) {
                result = 31 * result + fname.hashCode();
            }
            
            if (lname != null) {
                result = 31 * result + lname.hashCode();
            }
            
            result = 31 * result + age;
            
            return result;
            }

         }


```

```

        // Do Test Driven Development TDD
        // Mock and inject all dependencies 
        // If lot of data consider parameterized test using TestNG

        class MyServiceImplTest {

            @Test
            public void testHappyDo() {
            }

            @Test(expected = SomeKindOfRuntimeException.class)
            public void testFailureDo() {
            }

            @Test
            public void testEdgeCasesDo() {
            }

        }

```

#### Arrays 

```
 int[] arr = new int[10];
 
 int[] arr = new int[] {1,3,4,5,6,7,8};
 
 Arrays.stream(arr).forEach(e -> System.out.println(e));
 
 int size = arr.length;
 
 for(int i=0; i< arr.length; i++){
     // process one item
  }
  
  for(int i=arr.length-1; i >= 0 ; i--){
      // process one item
  }
  
  
  int i =0;
  while( i < arr.length) {
  
    i++;
   }
   
  int i = 0;
  int j =  arr.length;
  while( i < j) {
  
    i++;
    j--;
   }
   
   int[][] matrix = int[3][3];
   
   int[][] matrix = new int[][] {
        {1,2, 3},
        {4,5, 6},
        {7, 8, 9},
        {10,11, 12},
     };
   
    Arrays.stream(matrix).forEach(
      arr2 -> {
        System.out.println("");
        Arrays.stream(arr2).forEach(x -> System.out.print(" " + x));
  });

int col = matrix[0].length;
int row = matrix.length;

for(int i =0; i < row; i ++) {
        for(int i =0; i < col; i ++) {
            // print matrix[row][col]
        }
}

// Half 
for(int i =0; i < row; i ++) {
        for(int i = 0; i < row; i ++) {
            if( i>= j) {
            // print
            }
            
        }
}

 
```


#### Strings 

```
String s1 = "abc";
String s2 = new String("abc");
String s3 = new String(char[] {'a', 'b', 'c'});

char[] c1 = s1.toCharArray();

int size = s1.length();

char c2 = 'A';


String s1 = "abc";
s1.substring(0,s1.length()); // same as S1 "abc"
s1.substring(1); // "bc"
s1.substring(2); // "c"
s1.substring(1,2); // "b"
s1.substring(1,3); // "bc"



```

### Single Threaded Systems

- [String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
- java.lang.System
- java.lang.Object
- [Array] (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- java.util.List 
- java.util.LinkedList `As stack - (pop, push, peek)  +  (queue - offer, poll, peek) `
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
- [java.util.concurrent.BlockingQueue](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html) `Producer + Consumer queue based pattern`
- java.util.concurrent.locks.Lock `Explicit locks Reentrant, ReadWrite`
- java.util.concurrent.executors `Single, Cached, Scheduled `
- java.util.concurrent.atomic `Make updates to primitives by multiple threads`
- Concurrent Collections `Atomic operations on collections put/get/add etc`


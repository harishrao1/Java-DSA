
Stack<Integer> stack = new Stack();
for(int i = 0;i< 10;i++){
  
  // pushing element from the top of the stack
  stack.push(arr[i]);
  
  // removing 
  
  stack.remove(arr[i]);
  
  stack.pop() // remove the top of the element in stack
  
  stack.peek(); // return the top element in the stack without removing
  
  stack.isEmpty(); // size of stack returns true or false
  
  stack.search();

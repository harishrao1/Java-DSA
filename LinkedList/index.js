

// it looks like this
const list = {
    head: {
        value: 6
        next: {
            value: 10                                             
            next: {
                value: 12
                next: {
                    value: 3
                    next: null	
                    }
                }
            }
        }
    }
};


//------ Implementation-----
  
// contains 2 items 
//   data and 
//   pointer to next Node
class ListNode {
    constructor(data) {
        this.data = data
        this.next = null                
    }
}

let List = new LinkedList()


Insert()

1.inserting at the beginning 
2.inserting at the end
3.Insering at a Random position

  
LinkedList.prototype,insertAtBeginning = function(data){
  
  
  let newNode = new Node(data);
  
  // make next of newNode as head
  newNode.next = this.head; 
    
  
    this.head = newNode;    
    
  return this.head;
}

// Insert at the end

function atEnd(data){
  
  let newNode = new LinkedList(data);
  
//   if haed is null add the make the head as newNode and return
  if(head === null){
    this.head = newNode;
    return this.head;
  }
  
//   else Traverse till we get null and update tails pointer if we get null then add to tail,next
  let tail = this.head;
  while(tail.next !== null){
    tail = tail.next;
  }
  tail.next = newNode;
  return this.head;
  
  
  
  
  
  
  
  
  
  
  

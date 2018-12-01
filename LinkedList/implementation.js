class Node {
    constructor(data = null) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = new Node();
    }

    append(item) {
        let current =  this.head;
        let newNode = new Node(item);
        while(current['next'] !== null) {
            current = current['next'];
        }
        current['next'] = newNode;
        return true;
        
    }

    appendAt(position, item) {
        let counter = 0;
        let newNode = new Node();
        let currentNode =  this.head;
        while(current['next'] !== null) {
            if(counter === position) {
                newNode['next'] = current['next'];
                current['next'] = newNode;
                return true;
            }
            current = current['next'];
            counter++;
        }
        return false;
    }

    removeByValue(item) {
        let current = this.head;
        while(current !== null) {
            let previous = current;
            current = current['next'];
            if(current['data'] === item) {
                previous['next'] = current['next'];
                return true;
            }
        }
        return false;
    }

    removeAt(position) {
        let counter = 0;
        let current = this.head;
        while(current['next'] !== null) {
            let previous = current;
            current = current['next'];
            if(counter === position) {
                previous['next'] = current['next'];
                return true;
            }
            counter++;
        }
        return false;
    }

    //TODO
    reverse() {}

    //TODO
    swap() {}

    //TODO
    isEmpty() {}

    display() {
        let current = this.head['next'];
        let elements = []; 
        while(current !== null) {
            elements.push(current['data']);
            current = current['next'];
        }
        console.log( elements.join(" ") );
    }

    returnPosition(item) {
        let current = this.head['next'];
        let counter = 0;
        while(current !== null) {
            if(item === current['data']) {
                return counter;
            }
            current = current['next'];
            counter++;
        }
        return false;
    }
}

let linkedList1 = new LinkedList();
[1,2,3,4,5,6,7,8,9].map((item) => {
    linkedList1.append(item);
});
console.log("=============== before appending 10 ============ ");
linkedList1.display();

linkedList1.append(10);
console.log("=============== after appending 10 ============ ");
linkedList1.display();

linkedList1.removeByValue(4);
console.log("=============== after deleting 4 value ============ ");
linkedList1.display();

linkedList1.removeAt(8);
console.log("=============== after deleting at position 8 (0 indexed) ============ ");
linkedList1.display();


console.log("=============== return position (0 indexed) ============ ");
console.log( linkedList1.returnPosition(9) );
//linkedList1.display();


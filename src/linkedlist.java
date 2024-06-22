class HelloWorld {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(new Person(1,"Gobi"));
        linkedList.insert(new Person(2,"Gokul"));
        linkedList.insert(new Person(3,"Dhaksith"));
        linkedList.insert(new Person(4,"Vijay"));
        linkedList.insert(new Person(5,"Hyna"));
        linkedList.insert(new Person(6,"Kamalesh"));

        Node currentNode = linkedList.getFirst();


        while(currentNode != null){
            System.out.println(currentNode.currentData.name);
            currentNode = currentNode.nextData;
        }

        System.out.println("**After deleting Dahskith***");

        linkedList.delete(new Person(3,"Dhaksith"));

        currentNode = linkedList.getFirst();


        while(currentNode != null){
            System.out.println(currentNode.currentData.name);
            currentNode = currentNode.nextData;
        }

    }


    public static class Person{
        int id;
        String name;

        public Person(int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static class Node{
        Person currentData;
        Node nextData;

        public Node(Person currentData){
            this.currentData = currentData;
        }

    }


    public static class LinkedList{
        Node head;
        Node tail;

        public Node getFirst(){
            return head;
        }


        public void insert(Person person){
            if(head == null && tail == null ){
                head = new Node(person);
                tail = head;
            }else{
                tail.nextData = new Node(person);
                tail = tail.nextData;
            }
        }

        public void delete(Person person){
            Node currentNode = head;
            Node previousNode = null;
            while(true){
                if(person.id == currentNode.currentData.id){
                    previousNode.nextData = currentNode.nextData;
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.nextData;
            }
        }
    }
}
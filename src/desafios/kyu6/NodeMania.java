package desafios.kyu6;

/*

This kata is about singly-linked lists. A linked list is an ordered set of data elements, each containing a link to its
successor (and sometimes its predecessor, known as a double linked list). You are you to implement an algorithm to find
the kth to last element.

        k will be an integer greater than or equal to 1.

        Example
        For example given the following linked list: a -> b -> c -> d

        if k = 1 then d should be returned
        if k = 2 then c should be returned
        if k = 3 then b should be returned
        if k = 4 then a should be returned
        if k exceeds the length of the list then None(Python) or null(Java, JavaScript) should be returned
        Each item in the linked list is a Node containing two fields:

        data - the value of the node
        next - pointing to the next node in the list, or to a null reference (null/NULL/None, depending on your language)
         for the last Node.
        An empty list is represented as a null reference.
 */


public class NodeMania {

// Abaixo está a resposta, mas o CodeWar utiliza uma classe interna chamada Node para o exercicio. sendo assim, não
// tenho escolha a não ser comentar;

    /*
        public static Integer searchKFromEnd(Node linkedList, int k){
        List<Integer> list = new ArrayList<Integer>();

        while (linkedList != null) {
            list.add(linkedList.data);
            linkedList = linkedList.next;
        }

        int len = list.size();
        return len < k ? null : list.get(len - k);
    }
     */
}
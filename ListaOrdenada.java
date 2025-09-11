package FatosHistoricos;

public class ListaOrdenada {
    Node head;
    int tamanho;
    Void add(FatoHistorico fato) {
        Node newNode = new Node();
        newNode.fato = fato;
        if (head == null) {
            this.head = newNode;
            tamanho++;
            return;
        }
        Node anterior= null;
        node.current = this.cabeca;
        while(fato.ano> current.fato.ano){
            if(anterior = = null) 
            anterior = head;
        
        } else {
            anterior = anterior.next;
            current = current.next;   
        }
        anterior.next = newNode;
        newNode.next = current;
        tamanho++;

    }

    
    
}

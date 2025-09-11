package FatosHistoricos;

public class ListaSimples {
    Node head;
    Void add(FatoHistorico fato){
        Node newNode = new Node();
        newNode.fato = fato;
        if(this.cabeca == null){
            this.cabeca = newNode;
            this.cauda = newNode;
            tamanho++;
        }
        this.cauda.next = newNode;
        tamanho++;
        }

        Node remover(){
            if(tamanho  == 0){
                return null;
                this.head = this.head.next;
                tamanho--;
                return temp;
            }
        }
    
}

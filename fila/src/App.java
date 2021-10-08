public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
    
         fila.inserir(1);
         fila.inserir(2);
         fila.inserir(3);
         fila.inserir(4);
         fila.inserir(5);

         while(!fila.vazia()){
             int elemento = fila.remover();
             System.out.print(elemento +"     ");
         }
    }
}

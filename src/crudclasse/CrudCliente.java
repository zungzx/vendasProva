package crudclasse;



import redis.clients.jedis.Jedis; 
import classmodelos.ClienteJava;
import java.util.Scanner;


public class CrudCliente {
    
    
    ClienteJava client = new ClienteJava();
    
    Scanner scan = new Scanner(System.in);
    
    Jedis jecliente = new Jedis("localhost"); 
    
    
    public void adicionarCliente(){
        System.out.print("Digite a chave :: -- ");
        client.setChave(scan.next());
        System.out.print("Digite o nome  :: -- ");
        client.setNome(scan.next());
        jecliente.set(client.getChave() , client.getNome());
    }
    public void mostrarCliente(){
        System.out.print("Digite a chave para mostrar :: -- ");
        client.setChave(scan.next());
        System.out.println("A Chave "+ client.getChave() +" É do cliente "+ jecliente.get(client.getChave()));
    }
    public void updateCliente(){
        System.out.print("Digite a chava que deseja alterar  :: -- ");
        client.setChave(scan.next());
        System.out.println("Digite o nome que deseja alterar :: -- ");
        client.setNome(scan.next());
        jecliente.set(client.getChave() , client.getNome());
    }
    public void deleteCliente(){
        System.out.println("Digite a Chave que deseja deletar :: -- ");
        client.setChave(scan.next());
        
        jecliente.del(client.getChave());
    }

    
    
    
}

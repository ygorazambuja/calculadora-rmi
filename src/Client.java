import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        try {
            HelloService service = (HelloService) Naming.lookup("rmi://localhost:5099/calc");

            System.out.println(service.echo("Aplicação CalculadoraRMI"));

            double array[] = {5, 5, 5};
            System.out.println(service.soma(array));

            System.out.println(service.subtracao(array));
            System.out.println(service.multiplicao(array));
            System.out.println(service.divisao(array));

        }catch (Exception e){

        }


    }
}

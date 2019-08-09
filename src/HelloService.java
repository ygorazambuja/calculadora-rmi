import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    String echo(String input) throws RemoteException;

    Double soma(double numeros[]) throws RemoteException;
    Double subtracao(double numeros[]) throws  RemoteException;
    Double multiplicao(double numeros[]) throws RemoteException;
    Double divisao(double numeros[]) throws  RemoteException;
}

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements HelloService {

    public Servidor() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(5099);
            registry.rebind("calc", new Servidor());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String echo(String input) throws RemoteException {
        return input;
    }

    @Override
    public Double soma(double[] numeros) throws RemoteException {
        double resultadoFinal = 0;
        for (double numero : numeros) {
            resultadoFinal += numero;
        }
        return resultadoFinal;
    }


    @Override
    public Double subtracao(double[] numeros) throws RemoteException {
        double resultadoFinal = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultadoFinal -= numeros[i];
        }
        return resultadoFinal;
    }

    @Override
    public Double multiplicao(double[] numeros) throws RemoteException {
        double resultadoFinal = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultadoFinal *= numeros[i];
        }
        return resultadoFinal;
    }

    @Override
    public Double divisao(double[] numeros) throws RemoteException {
        double resultadoFinal = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultadoFinal /= numeros[i];
        }
        return resultadoFinal;
    }

}

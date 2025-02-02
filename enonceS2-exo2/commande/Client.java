package commande;

public class Client {
	private int numeroClient;
	private boolean clientFidele;
	
	public Client(int numeroClient, boolean clientFidele) {
		this.numeroClient = numeroClient;
		this.clientFidele = clientFidele;
	}

	public boolean isClientFidele() {
		return clientFidele;
	}
}

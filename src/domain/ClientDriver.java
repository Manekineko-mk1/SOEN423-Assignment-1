package domain;

public class ClientDriver
{

	public static void main(String[] args) throws Exception
	{
		String firstName1 = "Ka Man";
		String lastName1 = "Tsang";		
		String address1 = "Rue HelloWorld";
		String phoneNum1 = "514-123-1234";
		String clientNumber1 = "BCC1234";
		BranchID branch1 = BranchID.BC;
		
		Client client1 = new Client(firstName1, lastName1, address1, phoneNum1, clientNumber1, branch1);
	}
}

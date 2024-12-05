package week3.day1;

public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection db= new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeUpdate();

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection Established");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Connection Terminated");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Updated");
		
	}

}

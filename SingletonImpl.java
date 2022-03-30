package enc;

public class SingletonImpl implements Cloneable{
	private static volatile SingletonImpl singletonImpl;

	private SingletonImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static SingletonImpl getInstance(){
		
		if(singletonImpl == null){
		synchronized (SingletonImpl.class) {
			
			if(singletonImpl == null){
				singletonImpl = new SingletonImpl();
			}
			}
		}
		
		return singletonImpl;
		
	}
	

	

}

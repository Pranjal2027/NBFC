package Invoice_Services;



public class clientkeyprovider 
{
private static clientkeyprovider INSTANCE = new clientkeyprovider();
	
    private String clientkey = null;
    
    clientkeyprovider() {  
    	
    
    }
    
    public static clientkeyprovider getInstance() {
        return INSTANCE;
    }
    
    public boolean hasKey() {
    	return this.clientkey != null;
    }
    
    public String getKey() {
    	return clientkey;
    }
    
    public void setKey(String clientkey) {
    	this.clientkey = clientkey;
    }
}

import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.service.PackerService;


public class Runner {
	
	private static PackerService pack;
	
	
	
	public static void main(String[] args) {
	        String path = args[0];
	        
	
	     
	    
	    Item item=new Item();
	    item.setPath(path);
	
	     pack.zip(item);     
	      
	        
	    }
}

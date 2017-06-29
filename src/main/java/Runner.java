import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.service.PackerService;
import com.gsmggk.mypacker.service.impl.PackerServiceImpl;


public class Runner {
	
	
	
	
	
	public static void main(String[] args) {
	        String path = args[0];
	        
	
	     
	    
	    Item item=new Item();
	    item.setPath(path);
	
	   PackerServiceImpl pack=new PackerServiceImpl();
	   pack.pack(item);
			
	      
	        
	    }
}

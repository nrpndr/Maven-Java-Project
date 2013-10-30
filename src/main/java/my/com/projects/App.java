package my.com.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app = new App();
    	System.out.println("App says :"+app.sayHello());
    }
    
    public String sayHello(){
    	return "Hello";
    }
}

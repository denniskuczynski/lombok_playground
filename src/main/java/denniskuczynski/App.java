package denniskuczynski;

import lombok.ToString;

/**
 * Hello world!
 *
 */
@ToString
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" + new App().toString());
    }
}

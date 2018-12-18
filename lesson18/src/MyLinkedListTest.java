import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MyLinkedListTest {
MyLinkedList<String> list;
    @Before
    public void setUp(){
        list = new MyLinkedList<>();
        list.add("в");
        list.add("моей");
        list.add("голове");
        list.add("только");
        list.add("единорожки");
    }

    @Test
    public void testContains(){
        assertTrue(list.contains("единорожки"));
    }

}

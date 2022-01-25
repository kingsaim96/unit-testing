package chapter3;

import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class HashMapTest {

    private final String key = "Test";
    private final String value = "Pass";
    private final String overrideValue = "Fail";
    private final String magic = "Magic";
    private Map<String, String> hashMap;

    @Before
    public void setup(){
        hashMap = new HashMap<String, String>();
    }

    @Test
    public void verifyHashMapInsertionAndRetrieval(){
        hashMap.put(key,value);
        assertEquals(value, hashMap.get(key));
    }

    @Test
    public void updateOldValueByKey(){
        hashMap.put(key, overrideValue);
        assertEquals(overrideValue, hashMap.get(key));
    }

    @Test
    public void verifyClear(){
        hashMap.put(key, value);
        hashMap.clear();
        assertTrue(hashMap.size() == 0);
    }

    @Test
    public void insertNullKey(){
        hashMap.put(null, magic);
        assertEquals(magic, hashMap.get(null));
    }

}

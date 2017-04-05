package frog.couchbase.sdk;

import com.couchbase.client.java.Bucket;
import org.junit.Test;

/**
 * Created by heesu on 2017-04-06.
 */
public class CouchbaseClientTest {

    @Test
    public void couchbaseClientTest() {
        CouchbaseClient couchbaseClient = new CouchbaseClient();
        Bucket bucket = couchbaseClient.getBucket();

        System.out.println(bucket);
    }
}
package frog.couchbase.sdk;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;

/**
 * Created by heesu on 2017-04-06.
 */
public class CouchbaseClient {

    private String node = "127.0.0.1";
    private String bucketName = "beer-sample";

    public Bucket getBucket() {
        Cluster cluster = CouchbaseCluster.create(node);
        Bucket beerBucket = cluster.openBucket(bucketName);
        return beerBucket;
    }
}

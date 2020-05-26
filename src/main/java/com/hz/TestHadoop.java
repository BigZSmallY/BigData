package com.hz;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;


public class TestHadoop {

    public static void main(String[] args) throws IOException, InterruptedException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://h01:9000");
        conf.set("user.name", "root");
        conf.set("dfs.client.use.datanode.hostname","true");

        FileSystem fs = FileSystem.get(conf);
        fs.mkdirs(new Path("/user4"));
        fs.create(new Path("/user4/test5.txt"));
    }

}

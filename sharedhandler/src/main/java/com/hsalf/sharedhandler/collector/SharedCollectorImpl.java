package com.hsalf.sharedhandler.collector;

/**
 * Created by sujith on 19/2/17.
 */
public class SharedCollectorImpl implements SharedCollector {

    private static final String TAG = "SharedCollectorImpl";

    private SharedCollectorImpl() {

    }

    public static SharedCollector newInstance() {
        return new SharedCollectorImpl();
    }

}

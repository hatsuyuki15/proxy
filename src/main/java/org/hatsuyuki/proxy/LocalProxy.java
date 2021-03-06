package org.hatsuyuki.proxy;

import org.jsoup.Connection;

/**
 * Created by Hatsuyuki on 12/27/2016.
 */
public class LocalProxy extends Proxy {
    private Pipeline pipeline;

    public LocalProxy() {
        this.pipeline = new LocalRequester();
    }

    public LocalProxy(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public Response request(Request request) throws Exception {
        return pipeline.forward(request);
    }
}

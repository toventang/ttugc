package org.apache.http.conn.params;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.routing.HttpRoute;

public final class ConnPerRouteBean implements ConnPerRoute {
    private volatile int defaultMax;
    private final ConcurrentHashMap<HttpRoute, Integer> maxPerHostMap;

    static {
        Covode.recordClassIndex(106430);
    }

    public ConnPerRouteBean() {
        this(2);
    }

    public final String toString() {
        return this.maxPerHostMap.toString();
    }

    public ConnPerRouteBean(int i) {
        this.maxPerHostMap = new ConcurrentHashMap<>();
        setDefaultMaxPerRoute(i);
    }

    public final void setDefaultMaxPerRoute(int i) {
        if (i > 0) {
            this.defaultMax = i;
            return;
        }
        throw new IllegalArgumentException("The maximum must be greater than 0.");
    }
}

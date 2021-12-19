package org.apache.http.conn.routing;

import com.bytedance.covode.number.Covode;

public interface RouteInfo {
    static {
        Covode.recordClassIndex(106433);
    }

    public enum LayerType {
        PLAIN,
        LAYERED;

        static {
            Covode.recordClassIndex(106434);
        }
    }

    public enum TunnelType {
        PLAIN,
        TUNNELLED;

        static {
            Covode.recordClassIndex(106435);
        }
    }
}

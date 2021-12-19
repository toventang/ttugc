package org.apache.http.params;

import com.bytedance.covode.number.Covode;

public final class HttpConnectionParams {
    static {
        Covode.recordClassIndex(106474);
    }

    public static void setSocketBufferSize(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.socket.buffer-size", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setStaleCheckingEnabled(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.connection.stalecheck", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setTcpNoDelay(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.tcp.nodelay", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}

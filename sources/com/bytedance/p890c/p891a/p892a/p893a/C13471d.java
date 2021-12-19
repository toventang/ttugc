package com.bytedance.p890c.p891a.p892a.p893a;

import com.bytedance.covode.number.Covode;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.c.a.a.a.d */
public final class C13471d {
    static {
        Covode.recordClassIndex(15479);
    }

    /* renamed from: a */
    public static boolean m24226a(Throwable th) {
        if (th == null) {
            return false;
        }
        if (!(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException) && !(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof NoRouteToHostException) && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof SSLHandshakeException)) {
            return false;
        }
        return true;
    }
}

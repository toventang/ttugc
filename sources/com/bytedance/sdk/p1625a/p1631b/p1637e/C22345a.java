package com.bytedance.sdk.p1625a.p1631b.p1637e;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1631b.p1632a.AbstractC22333a;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.sdk.a.b.e.a */
public final class C22345a {
    static {
        Covode.recordClassIndex(26161);
    }

    /* renamed from: a */
    public static int m42060a(AbstractC22333a aVar, Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            return -13;
        }
        if (th instanceof SocketTimeoutException) {
            i = -14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    return -21;
                }
                if (!(th instanceof IOException)) {
                    if (th instanceof SSLHandshakeException) {
                        return -21;
                    }
                    if (th instanceof UnknownHostException) {
                        return -16;
                    }
                    return -1;
                }
            }
            i = -15;
        }
        if (aVar == null || aVar.mo36677a()) {
            return i;
        }
        return -12;
    }
}

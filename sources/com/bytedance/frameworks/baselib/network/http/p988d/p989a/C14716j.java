package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90057i;
import okhttp3.AbstractC90191p;
import okhttp3.C90197r;
import okhttp3.EnumC90211z;
import okhttp3.Request;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.j */
public class C14716j extends AbstractC90191p {

    /* renamed from: a */
    private final C14717k f35789a;

    /* renamed from: b */
    private final AbstractC90191p f35790b;

    /* renamed from: c */
    private final String f35791c = C14716j.class.getSimpleName();

    static {
        Covode.recordClassIndex(16813);
    }

    @Override // okhttp3.AbstractC90191p
    public void callEnd(AbstractC90049e eVar) {
        super.callEnd(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.callEnd(eVar);
        }
        this.f35789a.f35829p = System.currentTimeMillis();
        this.f35789a.f35802K = EnumC14707d.IDLE;
        this.f35789a.f35805N = EnumC14727p.SUCCESS;
    }

    @Override // okhttp3.AbstractC90191p
    public void callStart(AbstractC90049e eVar) {
        super.callStart(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.callStart(eVar);
        }
        this.f35789a.f35814a = System.currentTimeMillis();
        this.f35789a.f35805N = EnumC14727p.IO_PENDING;
    }

    @Override // okhttp3.AbstractC90191p
    public void requestBodyStart(AbstractC90049e eVar) {
        super.requestBodyStart(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.requestBodyStart(eVar);
        }
        this.f35789a.f35823j = System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public void requestHeadersStart(AbstractC90049e eVar) {
        super.requestHeadersStart(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.requestHeadersStart(eVar);
        }
        this.f35789a.f35802K = EnumC14707d.SENDING_REQUEST;
        this.f35789a.f35821h = System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public void responseBodyStart(AbstractC90049e eVar) {
        super.responseBodyStart(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.responseBodyStart(eVar);
        }
        this.f35789a.f35802K = EnumC14707d.READING_RESPONSE;
        this.f35789a.f35827n = System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public void responseHeadersStart(AbstractC90049e eVar) {
        super.responseHeadersStart(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.responseHeadersStart(eVar);
        }
        this.f35789a.f35825l = System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public void secureConnectStart(AbstractC90049e eVar) {
        super.secureConnectStart(eVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.secureConnectStart(eVar);
        }
        this.f35789a.f35819f = System.currentTimeMillis();
        this.f35789a.f35802K = EnumC14707d.SSL_HANDSHAKE;
    }

    /* renamed from: a */
    private static int m26943a(IOException iOException) {
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return -104;
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if ((iOException instanceof ProtocolException) || (iOException instanceof HttpRetryException) || (iOException instanceof UnknownServiceException) || !"java.io.IOException: Exception in connect".equals(iOException.getMessage())) {
            return -1;
        }
        return -15;
    }

    public C14716j(AbstractC90191p pVar, C14717k kVar) {
        this.f35790b = pVar;
        this.f35789a = kVar;
    }

    @Override // okhttp3.AbstractC90191p
    public void connectionReleased(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionReleased(eVar, iVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.connectionReleased(eVar, iVar);
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void dnsStart(AbstractC90049e eVar, String str) {
        super.dnsStart(eVar, str);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.dnsStart(eVar, str);
        }
        this.f35789a.f35815b = System.currentTimeMillis();
        this.f35789a.f35802K = EnumC14707d.RESOLVING_HOST;
    }

    @Override // okhttp3.AbstractC90191p
    public void requestBodyEnd(AbstractC90049e eVar, long j) {
        super.requestBodyEnd(eVar, j);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.requestBodyEnd(eVar, j);
        }
        this.f35789a.f35824k = System.currentTimeMillis();
        this.f35789a.f35837x = j;
    }

    @Override // okhttp3.AbstractC90191p
    public void responseBodyEnd(AbstractC90049e eVar, long j) {
        super.responseBodyEnd(eVar, j);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.responseBodyEnd(eVar, j);
        }
        this.f35789a.f35828o = System.currentTimeMillis();
        this.f35789a.f35792A = j;
    }

    @Override // okhttp3.AbstractC90191p
    public void secureConnectEnd(AbstractC90049e eVar, C90197r rVar) {
        super.secureConnectEnd(eVar, rVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.secureConnectEnd(eVar, rVar);
        }
        this.f35789a.f35820g = System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public void callFailed(AbstractC90049e eVar, IOException iOException) {
        super.callFailed(eVar, iOException);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.callFailed(eVar, iOException);
        }
        this.f35789a.f35829p = System.currentTimeMillis();
        this.f35789a.f35802K = EnumC14707d.IDLE;
        if ("Canceled".equals(iOException.getMessage())) {
            this.f35789a.f35805N = EnumC14727p.CANCELED;
        } else {
            this.f35789a.f35805N = EnumC14727p.FAILED;
        }
        this.f35789a.f35804M = m26943a(iOException);
    }

    @Override // okhttp3.AbstractC90191p
    public void requestHeadersEnd(AbstractC90049e eVar, Request request) {
        super.requestHeadersEnd(eVar, request);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.requestHeadersEnd(eVar, request);
        }
        this.f35789a.f35822i = System.currentTimeMillis();
        if (request != null) {
            this.f35789a.f35838y = request.headers();
        }
        this.f35789a.f35802K = EnumC14707d.WAITING_FOR_RESPONSE;
    }

    @Override // okhttp3.AbstractC90191p
    public void connectionAcquired(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionAcquired(eVar, iVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.connectionAcquired(eVar, iVar);
        }
        if (iVar != null) {
            if (!(iVar.mo144779b() == null || iVar.mo144779b().getInetAddress() == null || iVar.mo144779b().getInetAddress().getHostAddress() == null)) {
                this.f35789a.f35796E = iVar.mo144779b().getInetAddress().getHostAddress();
            }
            this.f35789a.f35797F = iVar.mo144779b();
        }
        this.f35789a.f35830q = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    @Override // okhttp3.AbstractC90191p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void responseHeadersEnd(okhttp3.AbstractC90049e r6, okhttp3.C90029ac r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14716j.responseHeadersEnd(okhttp3.e, okhttp3.ac):void");
    }

    @Override // okhttp3.AbstractC90191p
    public void connectStart(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.connectStart(eVar, inetSocketAddress, proxy);
        }
        this.f35789a.f35817d = System.currentTimeMillis();
        this.f35789a.f35802K = EnumC14707d.CONNECTING;
    }

    @Override // okhttp3.AbstractC90191p
    public void dnsEnd(AbstractC90049e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.dnsEnd(eVar, str, list);
        }
        this.f35789a.f35816c = System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public void connectEnd(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar) {
        super.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        }
        this.f35789a.f35818e = System.currentTimeMillis();
        if (proxy != null) {
            this.f35789a.f35833t = proxy.type();
        }
    }

    @Override // okhttp3.AbstractC90191p
    public void connectFailed(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        AbstractC90191p pVar = this.f35790b;
        if (pVar != null) {
            pVar.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        }
        if (inetSocketAddress != null) {
            this.f35789a.f35832s.add(new Pair<>(inetSocketAddress, Integer.valueOf(m26943a(iOException))));
        }
    }
}

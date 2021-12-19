package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.aa */
final class C87286aa extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f197842a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f197843b = ProxySelector.getDefault();

    /* renamed from: c */
    private final String f197844c;

    /* renamed from: d */
    private final int f197845d;

    static {
        Covode.recordClassIndex(103182);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("URI can't be null");
        } else if (!this.f197844c.equalsIgnoreCase(uri.getHost()) || this.f197845d != uri.getPort()) {
            return this.f197843b.select(uri);
        } else {
            return f197842a;
        }
    }

    C87286aa(String str, int i) {
        this.f197844c = str;
        this.f197845d = i;
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f197843b.connectFailed(uri, socketAddress, iOException);
    }
}

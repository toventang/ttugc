package com.squareup.p2075a.p2076a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29228k;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: com.squareup.a.a.a */
public final class C29099a {

    /* renamed from: a */
    public boolean f68793a;

    /* renamed from: b */
    public boolean f68794b;

    /* renamed from: c */
    private final List<C29228k> f68795c;

    /* renamed from: d */
    private int f68796d;

    static {
        Covode.recordClassIndex(35448);
    }

    public C29099a(List<C29228k> list) {
        this.f68795c = list;
    }

    /* renamed from: b */
    private boolean m58081b(SSLSocket sSLSocket) {
        for (int i = this.f68796d; i < this.f68795c.size(); i++) {
            if (this.f68795c.get(i).mo50962a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C29228k mo50754a(SSLSocket sSLSocket) {
        int size = this.f68795c.size();
        for (int i = this.f68796d; i < size; i++) {
            C29228k kVar = this.f68795c.get(i);
            if (kVar.mo50962a(sSLSocket)) {
                this.f68796d = i + 1;
                this.f68793a = m58081b(sSLSocket);
                AbstractC29190d.f69140b.mo50911a(kVar, sSLSocket, this.f68794b);
                return kVar;
            }
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f68794b + ", modes=" + this.f68795c + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}

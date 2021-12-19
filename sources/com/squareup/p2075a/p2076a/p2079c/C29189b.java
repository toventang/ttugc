package com.squareup.p2075a.p2076a.p2079c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.AbstractC29225i;
import com.squareup.p2075a.C29234o;
import com.squareup.p2075a.C29237q;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import com.squareup.p2075a.C29252z;
import com.squareup.p2075a.EnumC29245u;
import com.squareup.p2075a.p2076a.C29200h;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2077a.C29104d;
import com.squareup.p2075a.p2076a.p2078b.C29159e;
import com.squareup.p2075a.p2076a.p2078b.C29176k;
import com.squareup.p2075a.p2076a.p2078b.C29185s;
import com.squareup.p2075a.p2076a.p2080d.AbstractC29196f;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;

/* renamed from: com.squareup.a.a.c.b */
public final class C29189b implements AbstractC29225i {

    /* renamed from: m */
    private static SSLSocketFactory f69125m;

    /* renamed from: n */
    private static AbstractC29196f f69126n;

    /* renamed from: a */
    public final C29252z f69127a;

    /* renamed from: b */
    public Socket f69128b;

    /* renamed from: c */
    public C29234o f69129c;

    /* renamed from: d */
    public volatile C29104d f69130d;

    /* renamed from: e */
    public int f69131e;

    /* renamed from: f */
    public AbstractC89426h f69132f;

    /* renamed from: g */
    public AbstractC89425g f69133g;

    /* renamed from: h */
    public final List<Reference<C29185s>> f69134h = new ArrayList();

    /* renamed from: i */
    public boolean f69135i;

    /* renamed from: j */
    public long f69136j = Long.MAX_VALUE;

    /* renamed from: k */
    private Socket f69137k;

    /* renamed from: l */
    private EnumC29245u f69138l;

    static {
        Covode.recordClassIndex(35538);
    }

    @Override // com.squareup.p2075a.AbstractC29225i
    /* renamed from: a */
    public final C29252z mo50904a() {
        return this.f69127a;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Connection{").append(this.f69127a.f69371a.f68782a.f69286d).append(":").append(this.f69127a.f69371a.f68782a.f69287e).append(", proxy=").append(this.f69127a.f69372b).append(" hostAddress=").append(this.f69127a.f69373c).append(" cipherSuite=");
        C29234o oVar = this.f69129c;
        if (oVar != null) {
            str = oVar.f69277a;
        } else {
            str = "none";
        }
        return append.append(str).append(" protocol=").append(this.f69138l).append('}').toString();
    }

    public C29189b(C29252z zVar) {
        this.f69127a = zVar;
    }

    /* renamed from: a */
    private static synchronized AbstractC29196f m58369a(SSLSocketFactory sSLSocketFactory) {
        AbstractC29196f fVar;
        synchronized (C29189b.class) {
            MethodCollector.m26663i(1082);
            if (sSLSocketFactory != f69125m) {
                f69126n = C29200h.f69158a.mo50932a(C29200h.f69158a.mo50933a(sSLSocketFactory));
                f69125m = sSLSocketFactory;
            }
            fVar = f69126n;
            MethodCollector.m26664o(1082);
        }
        return fVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo50906a(boolean z) {
        if (this.f69128b.isClosed() || this.f69128b.isInputShutdown() || this.f69128b.isOutputShutdown()) {
            return false;
        }
        if (this.f69130d == null && z) {
            try {
                int soTimeout = this.f69128b.getSoTimeout();
                try {
                    this.f69128b.setSoTimeout(1);
                    if (this.f69132f.mo143815e()) {
                        this.f69128b.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f69128b.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f69128b.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m58370a(int i, int i2) {
        C29246v a = new C29246v.C29247a().mo51022a(this.f69127a.f69371a.f68782a).mo51024a("Host", C29206j.m58431a(this.f69127a.f69371a.f68782a)).mo51024a("Proxy-Connection", "Keep-Alive").mo51024a("User-Agent", "okhttp/2.7.5").mo51025a();
        C29237q qVar = a.f69338a;
        String str = "CONNECT " + qVar.f69286d + ":" + qVar.f69287e + " HTTP/1.1";
        do {
            C29159e eVar = new C29159e(null, this.f69132f, this.f69133g);
            this.f69132f.timeout().mo143784a((long) i, TimeUnit.MILLISECONDS);
            this.f69133g.timeout().mo143784a((long) i2, TimeUnit.MILLISECONDS);
            eVar.mo50864a(a.f69340c, str);
            eVar.mo50866b();
            C29249x.C29250a c = eVar.mo50867c();
            c.f69361a = a;
            C29249x a2 = c.mo51038a();
            long a3 = C29176k.m58320a(a2.f69355f);
            if (a3 == -1) {
                a3 = 0;
            }
            AbstractC89408aa a4 = eVar.mo50860a(a3);
            C29206j.m58442a(a4, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a4.close();
            int i3 = a2.f69352c;
            if (i3 != 200) {
                if (i3 == 407) {
                    a = C29176k.m58322a(this.f69127a.f69371a.f68785d, a2, this.f69127a.f69372b);
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + a2.f69352c);
                }
            } else if (!this.f69132f.mo68846a().mo143815e() || !this.f69133g.mo68846a().mo143815e()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (a != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a2 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a8 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50905a(int r14, int r15, int r16, java.util.List<com.squareup.p2075a.C29228k> r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 667
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2079c.C29189b.mo50905a(int, int, int, java.util.List, boolean):void");
    }
}

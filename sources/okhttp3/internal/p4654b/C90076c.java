package okhttp3.internal.p4654b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90057i;
import okhttp3.AbstractC90191p;
import okhttp3.C90017a;
import okhttp3.C90034ae;
import okhttp3.C90180j;
import okhttp3.C90197r;
import okhttp3.C90200t;
import okhttp3.EnumC90211z;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.p4657e.C90118g;
import okhttp3.internal.p4657e.C90138i;
import okhttp3.internal.p4657e.EnumC90109b;
import okhttp3.internal.p4659g.C90160f;
import okhttp3.internal.p4661i.C90165d;
import okhttp3.internal.p4662j.C90167a;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.b.c */
public final class C90076c extends C90118g.AbstractC90128c implements AbstractC90057i {

    /* renamed from: a */
    public final C90034ae f204401a;

    /* renamed from: b */
    public Socket f204402b;

    /* renamed from: c */
    public Socket f204403c;

    /* renamed from: d */
    public C90197r f204404d;

    /* renamed from: e */
    C90118g f204405e;

    /* renamed from: f */
    AbstractC89426h f204406f;

    /* renamed from: g */
    AbstractC89425g f204407g;

    /* renamed from: h */
    public boolean f204408h;

    /* renamed from: i */
    public int f204409i;

    /* renamed from: j */
    public int f204410j = 1;

    /* renamed from: k */
    public final List<Reference<C90082g>> f204411k = new ArrayList();

    /* renamed from: l */
    public long f204412l = Long.MAX_VALUE;

    /* renamed from: n */
    private final C90180j f204413n;

    /* renamed from: o */
    private EnumC90211z f204414o;

    static {
        Covode.recordClassIndex(106248);
    }

    @Override // okhttp3.AbstractC90057i
    /* renamed from: a */
    public final C90034ae mo144778a() {
        return this.f204401a;
    }

    @Override // okhttp3.AbstractC90057i
    /* renamed from: b */
    public final Socket mo144779b() {
        return this.f204403c;
    }

    @Override // okhttp3.AbstractC90057i
    /* renamed from: c */
    public final EnumC90211z mo144780c() {
        return this.f204414o;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo144822a(boolean z) {
        if (this.f204403c.isClosed() || this.f204403c.isInputShutdown() || this.f204403c.isOutputShutdown()) {
            return false;
        }
        C90118g gVar = this.f204405e;
        if (gVar != null) {
            return gVar.mo144888b(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f204403c.getSoTimeout();
                try {
                    this.f204403c.setSoTimeout(1);
                    if (this.f204406f.mo143815e()) {
                        this.f204403c.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f204403c.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f204403c.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo144823d() {
        if (this.f204405e != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        StringBuilder append = new StringBuilder("Connection{").append(this.f204401a.f204137a.f204069a.f204861d).append(":").append(this.f204401a.f204137a.f204069a.f204862e).append(", proxy=").append(this.f204401a.f204138b).append(" hostAddress=").append(this.f204401a.f204139c).append(" cipherSuite=");
        C90197r rVar = this.f204404d;
        if (rVar != null) {
            obj = rVar.f204852b;
        } else {
            obj = "none";
        }
        return append.append(obj).append(" protocol=").append(this.f204414o).append('}').toString();
    }

    @Override // okhttp3.internal.p4657e.C90118g.AbstractC90128c
    /* renamed from: a */
    public final void mo144819a(C90138i iVar) {
        iVar.mo144904a(EnumC90109b.REFUSED_STREAM);
    }

    /* renamed from: a */
    public final C90167a.AbstractC90174e mo144816a(final C90082g gVar) {
        return new C90167a.AbstractC90174e(this.f204406f, this.f204407g) {
            /* class okhttp3.internal.p4654b.C90076c.C900771 */

            static {
                Covode.recordClassIndex(106249);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                C90082g gVar = gVar;
                gVar.mo144840a(true, gVar.mo144836a(), -1, null);
            }
        };
    }

    @Override // okhttp3.internal.p4657e.C90118g.AbstractC90128c
    /* renamed from: a */
    public final void mo144818a(C90118g gVar) {
        MethodCollector.m26663i(5567);
        synchronized (this.f204413n) {
            try {
                this.f204410j = gVar.mo144875a();
            } finally {
                MethodCollector.m26664o(5567);
            }
        }
    }

    /* renamed from: a */
    private void m156364a(int i) {
        this.f204403c.setSoTimeout(0);
        C90118g.C90126a a = new C90118g.C90126a().mo144891a(this.f204403c, this.f204401a.f204137a.f204069a.f204861d, this.f204406f, this.f204407g);
        a.f204620e = this;
        a.f204623h = i;
        C90118g a2 = a.mo144892a();
        this.f204405e = a2;
        a2.mo144889c();
    }

    /* renamed from: a */
    public final boolean mo144821a(C90200t tVar) {
        if (tVar.f204862e != this.f204401a.f204137a.f204069a.f204862e) {
            return false;
        }
        if (tVar.f204861d.equals(this.f204401a.f204137a.f204069a.f204861d)) {
            return true;
        }
        if (this.f204404d == null || !C90165d.m156698a(tVar.f204861d, (X509Certificate) this.f204404d.f204853c.get(0))) {
            return false;
        }
        return true;
    }

    public C90076c(C90180j jVar, C90034ae aeVar) {
        this.f204413n = jVar;
        this.f204401a = aeVar;
    }

    /* renamed from: a */
    public final boolean mo144820a(C90017a aVar, C90034ae aeVar) {
        if (this.f204411k.size() >= this.f204410j || this.f204408h || !AbstractC90058a.f204330a.mo144791a(this.f204401a.f204137a, aVar)) {
            return false;
        }
        if (aVar.f204069a.f204861d.equals(this.f204401a.f204137a.f204069a.f204861d)) {
            return true;
        }
        if (this.f204405e == null || aeVar == null || aeVar.f204138b.type() != Proxy.Type.DIRECT || this.f204401a.f204138b.type() != Proxy.Type.DIRECT || !this.f204401a.f204139c.equals(aeVar.f204139c) || aeVar.f204137a.f204078j != C90165d.f204723a || !mo144821a(aVar.f204069a)) {
            return false;
        }
        try {
            aVar.f204079k.mo144768a(aVar.f204069a.f204861d, this.f204404d.f204853c);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m156366a(int i, int i2, AbstractC90049e eVar, AbstractC90191p pVar) {
        Socket socket;
        Proxy proxy = this.f204401a.f204138b;
        C90017a aVar = this.f204401a.f204137a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = aVar.f204071c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f204402b = socket;
        pVar.connectStart(eVar, this.f204401a.f204139c, proxy);
        this.f204402b.setSoTimeout(i2);
        try {
            C90160f.f204720c.mo144948a(this.f204402b, this.f204401a.f204139c, i);
            try {
                this.f204406f = C89436q.m155160a(C89436q.m155166b(this.f204402b));
                this.f204407g = C89436q.m155159a(C89436q.m155164a(this.f204402b));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f204401a.f204139c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [okhttp3.y, okhttp3.internal.b.g] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m156365a(int r16, int r17, int r18, okhttp3.AbstractC90049e r19, okhttp3.AbstractC90191p r20) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4654b.C90076c.m156365a(int, int, int, okhttp3.e, okhttp3.p):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r17.f204410j = r17.f204405e.mo144875a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0282, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0283, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0288, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0289, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0290, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0291, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0296, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0297, code lost:
        r1 = new okhttp3.internal.p4654b.C90079e(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0037, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (r17.f204401a.f204137a.f204077i != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r17.f204401a.f204137a.f204073e.contains(okhttp3.EnumC90211z.H2_PRIOR_KNOWLEDGE) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r17.f204403c = r17.f204402b;
        r17.f204414o = okhttp3.EnumC90211z.H2_PRIOR_KNOWLEDGE;
        m156364a(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r24.connectEnd(r23, r17.f204401a.f204139c, r17.f204401a.f204138b, r17.f204414o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (r17.f204402b == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (r17.f204401a.mo144737a() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        if (r17.f204402b == null) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r17.f204405e == null) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r3 = r17.f204413n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r17.f204403c = r17.f204402b;
        r17.f204414o = okhttp3.EnumC90211z.HTTP_1_1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        r24.secureConnectStart(r23);
        r11 = r17.f204401a.f204137a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r8 = (javax.net.ssl.SSLSocket) r11.f204077i.createSocket(r17.f204402b, r11.f204069a.f204861d, r11.f204069a.f204862e, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r12 = r3.mo144815a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r12.f204805f == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        okhttp3.internal.p4659g.C90160f.f204720c.mo144949a(r8, r11.f204069a.f204861d, r11.f204073e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        r8.startHandshake();
        r13 = r8.getSession();
        r9 = okhttp3.C90197r.m156768a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ed, code lost:
        if (r11.f204078j.verify(r11.f204069a.f204861d, r13) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        r6 = r9.f204853c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (r6.isEmpty() != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        r7 = (java.security.cert.X509Certificate) r6.get(0);
        r12 = new java.lang.StringBuilder("Hostname ").append(r11.f204069a.f204861d).append(" not verified:\n    certificate: ").append(okhttp3.C90052g.m156298a((java.security.cert.Certificate) r7)).append("\n    DN: ").append(r7.getSubjectDN().getName()).append("\n    subjectAltNames: ");
        r11 = okhttp3.internal.p4661i.C90165d.m156696a(r7, 7);
        r9 = okhttp3.internal.p4661i.C90165d.m156696a(r7, 2);
        r7 = new java.util.ArrayList(r11.size() + r9.size());
        r7.addAll(r11);
        r7.addAll(r9);
        r10 = new javax.net.ssl.SSLPeerUnverifiedException(r12.append(r7).toString());
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0162, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0163, code lost:
        r11.f204079k.mo144768a(r11.f204069a.f204861d, r9.f204853c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0170, code lost:
        if (r12.f204805f == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0172, code lost:
        r6 = okhttp3.internal.p4659g.C90160f.f204720c.mo144943a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0178, code lost:
        r17.f204403c = r8;
        r17.f204406f = p4632k.C89436q.m155160a(p4632k.C89436q.m155166b(r8));
        r17.f204407g = p4632k.C89436q.m155159a(p4632k.C89436q.m155164a(r17.f204403c));
        r17.f204404d = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0193, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0195, code lost:
        if (r6 == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0197, code lost:
        r0 = okhttp3.EnumC90211z.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        r0 = okhttp3.EnumC90211z.HTTP_1_1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019e, code lost:
        r17.f204414o = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a0, code lost:
        okhttp3.internal.p4659g.C90160f.f204720c.mo144962b(r8);
        r24.secureConnectEnd(r23, r17.f204404d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ae, code lost:
        if (r17.f204414o != okhttp3.EnumC90211z.HTTP_2) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b0, code lost:
        m156364a(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b5, code lost:
        r7 = new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + r11.f204069a.f204861d + " not verified (no certificates)");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d8, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d9, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01db, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01dc, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01de, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01df, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e4, code lost:
        if (okhttp3.internal.C90084c.m156417a(r7) == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e6, code lost:
        r6 = new java.io.IOException(r7);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f0, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f1, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f6, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f7, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f8, code lost:
        if (r8 != null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fa, code lost:
        okhttp3.internal.p4659g.C90160f.f204720c.mo144962b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ff, code lost:
        okhttp3.internal.C90084c.m156416a((java.net.Socket) r8);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0207, code lost:
        throw r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02a9 A[EDGE_INSN: B:135:0x02a9->B:117:0x02a9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e6 A[Catch:{ all -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f1 A[Catch:{ all -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x023b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144817a(int r18, int r19, int r20, int r21, boolean r22, okhttp3.AbstractC90049e r23, okhttp3.AbstractC90191p r24) {
        /*
        // Method dump skipped, instructions count: 769
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4654b.C90076c.mo144817a(int, int, int, int, boolean, okhttp3.e, okhttp3.p):void");
    }
}

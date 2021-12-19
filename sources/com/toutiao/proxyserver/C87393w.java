package com.toutiao.proxyserver;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.C87403y;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.net.C87363e;
import com.toutiao.proxyserver.p4489a.C87284a;
import com.toutiao.proxyserver.p4491c.C87299a;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4492d.C87308a;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.toutiao.proxyserver.w */
public final class C87393w extends AbstractC87275a {

    /* renamed from: m */
    private final Socket f198138m;

    /* renamed from: n */
    private final AbstractC87400c f198139n;

    /* renamed from: o */
    private final ExecutorService f198140o;

    /* renamed from: p */
    private volatile C87343i f198141p;

    /* renamed from: q */
    private boolean f198142q;

    /* renamed from: r */
    private volatile boolean f198143r = true;

    /* renamed from: com.toutiao.proxyserver.w$c */
    public interface AbstractC87400c {
        static {
            Covode.recordClassIndex(103297);
        }

        /* renamed from: a */
        void mo141439a(C87393w wVar);

        /* renamed from: b */
        void mo141440b(C87393w wVar);
    }

    static {
        Covode.recordClassIndex(103290);
    }

    /* renamed from: com.toutiao.proxyserver.w$a */
    static final class C87398a {

        /* renamed from: a */
        AbstractC87294b f198155a;

        /* renamed from: b */
        C87301c f198156b;

        /* renamed from: c */
        ExecutorService f198157c;

        /* renamed from: d */
        Socket f198158d;

        /* renamed from: e */
        AbstractC87400c f198159e;

        static {
            Covode.recordClassIndex(103295);
        }

        C87398a() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.toutiao.proxyserver.ad$a */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: com.toutiao.proxyserver.ad$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022f, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0232, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0234, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0236, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0237, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0239, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023c, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023f, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "OtherException: " + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r2), r26.f197793g);
        r5 = new com.toutiao.proxyserver.C87348j(0, "OtherException", r2);
        r26.f197797k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0267, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0268, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x026a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026c, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "RandomAccessFileWrapper" + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r3), r26.f197793g);
        r26.f198143r = r2;
        r5 = new com.toutiao.proxyserver.C87348j(4, "RandomAccessFileWrapper.FileException", r3);
        com.toutiao.proxyserver.C87383u.m151660a(4, " RandomAccessFileWrapper.FileException：" + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r3), r26.f197793g);
        r26.f197797k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ad, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ae, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b0, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b1, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02be, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "IOException: " + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r2), r26.f197793g);
        r5 = new com.toutiao.proxyserver.C87348j(r9, "IOException", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e6, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0330, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0334, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0336, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0337, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0338, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "CancelException: " + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r2), r26.f197793g);
        com.toutiao.proxyserver.C87383u.m151660a(r10, "Task was cancel.", r26.f197793g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0357, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0358, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0359, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "ContentLengthNotMatchException: " + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r3), r26.f197793g);
        r26.f198142q = true;
        com.toutiao.proxyserver.C87383u.m151660a(5, " ContentLengthNotMatchException: " + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r3), r26.f197793g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x038e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0390, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "SocketWriteException: " + com.toutiao.proxyserver.p4493e.C87312c.m151522a(r2), r26.f197793g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03a9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a0, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a4, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01aa, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ac, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ae, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01af, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b1, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        if (com.toutiao.proxyserver.C87383u.f198089i != null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e5, code lost:
        com.toutiao.proxyserver.C87383u.f198089i.mo124030a(r10, "flush error.", r27.f198161b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f3, code lost:
        r2 = false;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fa, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fd, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        com.toutiao.proxyserver.p4493e.C87312c.m151526d("TAG_PROXY_ProxyTask", "flush error" + r2.toString(), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0219, code lost:
        throw new com.toutiao.proxyserver.C87287ab(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021c, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0221, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0225, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0227, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0228, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022b, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x023e A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:32:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026a A[ExcHandler: a (e com.toutiao.proxyserver.x$a), Splitter:B:32:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0334 A[ExcHandler: e (e com.toutiao.proxyserver.e), PHI: r10 
      PHI: (r10v2 int) = (r10v4 int), (r10v4 int), (r10v4 int), (r10v6 int), (r10v10 int), (r10v10 int) binds: [B:72:0x01d9, B:86:0x0211, B:73:?, B:69:0x01c4, B:54:0x0192, B:55:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0336 A[ExcHandler: e (e com.toutiao.proxyserver.e), Splitter:B:41:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0358 A[ExcHandler: f (r3v0 'e' com.toutiao.proxyserver.f A[CUSTOM_DECLARE]), Splitter:B:41:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x038f A[ExcHandler: ab (r2v4 'e' com.toutiao.proxyserver.ab A[CUSTOM_DECLARE]), Splitter:B:18:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC, Splitter:B:23:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01aa A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:38:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ac A[ExcHandler: a (e com.toutiao.proxyserver.x$a), Splitter:B:38:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ae A[ExcHandler: IOException (e java.io.IOException), Splitter:B:38:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b7 A[ExcHandler: z (e com.toutiao.proxyserver.z), Splitter:B:32:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ef A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:50:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2 A[ExcHandler: a (e com.toutiao.proxyserver.x$a), Splitter:B:50:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01fa A[ExcHandler: z (e com.toutiao.proxyserver.z), Splitter:B:50:0x0172] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m151679a(com.toutiao.proxyserver.C87393w.C87399b r27) {
        /*
        // Method dump skipped, instructions count: 1008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C87393w.m151679a(com.toutiao.proxyserver.w$b):boolean");
    }

    @Override // com.toutiao.proxyserver.AbstractC87275a
    /* renamed from: a */
    public final void mo141290a() {
        super.mo141290a();
        m151683m();
    }

    /* renamed from: l */
    private void m151682l() {
        if (!C87383u.f198078C) {
            return;
        }
        if (C87370s.f198038a == 1) {
            C87371t.m151640a().mo141418c();
        } else {
            C87371t.m151640a().mo141411a(mo141307g(), this.f197794h);
        }
    }

    /* renamed from: n */
    private boolean m151684n() {
        if (this.f197795i == null || this.f197795i.f198167c == null) {
            return false;
        }
        return TextUtils.equals(this.f197795i.f198167c.f198176i, "music");
    }

    /* renamed from: m */
    private void m151683m() {
        C87343i iVar = this.f198141p;
        this.f198141p = null;
        if (iVar != null) {
            iVar.mo141290a();
            C87312c.m151525c("TAG_PROXY_ProxyTask", "cancel fetch task, " + C87312c.m151522a(new RuntimeException()), this.f197793g);
        }
    }

    public final void run() {
        C87399b k = m151681k();
        if (k != null) {
            AbstractC87400c cVar = this.f198139n;
            if (cVar != null) {
                cVar.mo141439a(this);
            }
            try {
                this.f197787a.mo141328b(this.f197794h);
                try {
                    m151679a(k);
                } catch (C87309e e) {
                    C87312c.m151526d("TAG_PROXY_ProxyTask", C87312c.m151522a(e), this.f197793g);
                }
                if (this.f198142q) {
                    this.f197787a.mo141330d(this.f197793g);
                }
                this.f197787a.mo141329c(this.f197794h);
                mo141290a();
                C87328b.m151555a(this.f198138m);
                C87312c.m151526d("TAG_PROXY_ProxyTask", "close socket vid: " + this.f197793g + ", " + k.f198162c, null);
                AbstractC87400c cVar2 = this.f198139n;
                if (cVar2 != null) {
                    cVar2.mo141440b(this);
                }
            } catch (C87308a unused) {
                C87328b.m151555a(this.f198138m);
                AbstractC87400c cVar3 = this.f198139n;
                if (cVar3 != null) {
                    cVar3.mo141440b(this);
                }
            }
        }
    }

    /* renamed from: k */
    private C87399b m151681k() {
        AbstractC87294b bVar;
        try {
            this.f197795i = C87403y.m151695a(this.f198138m.getInputStream());
            C87403y.C87404a aVar = this.f197795i.f198167c;
            String a = C87383u.m151658a(aVar.f198169b, aVar.f198170c, aVar.f198175h, aVar.f198176i);
            C87312c.m151523a("TAG_PROXY_ProxyTask", "auth-------rece>" + this.f197795i.f198167c.f198171d, null);
            C87312c.m151523a("TAG_PROXY_ProxyTask", "auth-------base>".concat(String.valueOf(a)), null);
            if (!a.equals(aVar.f198171d)) {
                C87312c.m151526d("TAG_PROXY_ProxyTask", "Illegal url. Extra:" + this.f197795i.f198167c, null);
                return null;
            }
            C87312c.m151523a("TAG_PROXY_ProxyTask", "-----legal------", null);
            OutputStream outputStream = this.f198138m.getOutputStream();
            if (m151684n()) {
                bVar = C87383u.f198083c;
                this.f197795i.f198166b.add(new C87360c("cache_scene", "music"));
                C87284a.C87285a.f197841a.f197840b.incrementAndGet();
                if (C87284a.C87285a.f197841a.f197840b.get() > C87383u.f198102v) {
                    return null;
                }
            } else if (this.f197795i.f198167c.f198168a == 1) {
                bVar = C87383u.f198081a;
            } else {
                bVar = C87383u.f198082b;
            }
            if (bVar == null) {
                C87312c.m151526d("TAG_PROXY_ProxyTask", "cache is null", this.f197793g);
                return null;
            }
            this.f197787a = bVar;
            this.f197793g = this.f197795i.f198167c.f198169b;
            this.f197794h = this.f197795i.f198167c.f198170c;
            this.f197796j = new C87289ad(this.f197795i.f198167c.f198175h);
            this.f197791e = this.f197795i.f198166b;
            C87312c.m151524b("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.f197795i.toString(), this.f197793g);
            return new C87399b(outputStream, this.f197795i.f198167c.f198172e, this.f197793g);
        } catch (IOException e) {
            C87328b.m151555a(this.f198138m);
            C87312c.m151526d("TAG_PROXY_ProxyTask", C87312c.m151522a(e), this.f197793g);
            return null;
        } catch (C87403y.C87406c e2) {
            C87328b.m151555a(this.f198138m);
            C87312c.m151526d("TAG_PROXY_ProxyTask", C87312c.m151522a(e2), this.f197793g);
            return null;
        }
    }

    C87393w(C87398a aVar) {
        super(aVar.f198155a, aVar.f198156b);
        this.f198140o = aVar.f198157c;
        this.f198138m = aVar.f198158d;
        this.f198139n = aVar.f198159e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.w$b */
    public static class C87399b {

        /* renamed from: a */
        final OutputStream f198160a;

        /* renamed from: b */
        final String f198161b;

        /* renamed from: c */
        public int f198162c;

        /* renamed from: d */
        public boolean f198163d;

        static {
            Covode.recordClassIndex(103296);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141450a(byte[] bArr, int i) {
            MethodCollector.m26663i(9698);
            if (!this.f198163d) {
                try {
                    this.f198160a.write(bArr, 0, i);
                    this.f198163d = true;
                    MethodCollector.m26664o(9698);
                } catch (IOException e) {
                    if (C87383u.f198089i != null) {
                        C87383u.f198089i.mo124030a(-1, "Write header to player error.", this.f198161b);
                    }
                    C87287ab abVar = new C87287ab(e);
                    MethodCollector.m26664o(9698);
                    throw abVar;
                }
            } else {
                MethodCollector.m26664o(9698);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo141451b(byte[] bArr, int i) {
            MethodCollector.m26663i(9848);
            try {
                this.f198160a.write(bArr, 0, i);
                this.f198162c += i;
                MethodCollector.m26664o(9848);
            } catch (IOException e) {
                if (C87383u.f198089i != null) {
                    C87383u.f198089i.mo124030a(-1, "Write data to player error.", this.f198161b);
                }
                C87312c.m151526d("TAG_PROXY_ProxyTask", "writeData error" + e.toString(), null);
                C87287ab abVar = new C87287ab(e);
                MethodCollector.m26664o(9848);
                throw abVar;
            }
        }

        C87399b(OutputStream outputStream, int i, String str) {
            this.f198160a = outputStream;
            this.f198162c = i;
            this.f198161b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0429, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x042c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x042d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x042f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0430, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d1 A[Catch:{ IOException -> 0x045b, Exception -> 0x0458, all -> 0x0455 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d3 A[Catch:{ IOException -> 0x045b, Exception -> 0x0458, all -> 0x0455 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02df A[LOOP:0: B:108:0x02df->B:131:0x034e, LOOP_START, PHI: r11 r12 
      PHI: (r11v2 com.toutiao.proxyserver.x) = (r11v1 com.toutiao.proxyserver.x), (r11v3 com.toutiao.proxyserver.x) binds: [B:107:0x02dd, B:131:0x034e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v11 com.toutiao.proxyserver.d) = (r12v9 com.toutiao.proxyserver.d), (r12v12 com.toutiao.proxyserver.d) binds: [B:107:0x02dd, B:131:0x034e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:108:0x02df] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03a1 A[Catch:{ IOException -> 0x042f, Exception -> 0x042c, all -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03a3 A[Catch:{ IOException -> 0x042f, Exception -> 0x042c, all -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0409 A[SYNTHETIC, Splitter:B:159:0x0409] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0429 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:141:0x0369] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x048e A[Catch:{ all -> 0x04d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x051e A[SYNTHETIC, Splitter:B:250:0x051e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151677a(com.toutiao.proxyserver.C87393w.C87399b r30, java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 1319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C87393w.m151677a(com.toutiao.proxyserver.w$b, java.lang.String):void");
    }

    /* renamed from: a */
    private byte[] m151680a(C87299a aVar, C87399b bVar, String str) {
        if (aVar != null) {
            C87312c.m151524b("TAG_PROXY_ProxyTask", "get header from db", this.f197793g);
            return C87328b.m151546a(aVar, bVar.f198162c).getBytes(C87328b.f197937a);
        }
        C87363e a = mo141289a(str, 0, -1, "HEAD");
        C87328b.m151551a(a, false, false);
        C87299a a2 = C87328b.m151545a(a, this.f197788b, this.f197794h, this.f197795i.f198167c.f198168a);
        C87312c.m151525c("TAG_PROXY_ProxyTask", "get header from network", this.f197793g);
        return C87328b.m151546a(a2, bVar.f198162c).getBytes(C87328b.f197937a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x031f A[SYNTHETIC, Splitter:B:109:0x031f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151676a(com.toutiao.proxyserver.p4491c.C87299a r25, java.io.File r26, com.toutiao.proxyserver.C87393w.C87399b r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 843
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C87393w.m151676a(com.toutiao.proxyserver.c.a, java.io.File, com.toutiao.proxyserver.w$b, java.lang.String):void");
    }

    /* renamed from: a */
    private void m151678a(final boolean z, final int i, final int i2, final int i3, final int i4) {
        final AbstractC87366o oVar = C87383u.f198087g;
        if (oVar != null) {
            C87328b.m151562b(new Runnable() {
                /* class com.toutiao.proxyserver.C87393w.RunnableC873941 */

                static {
                    Covode.recordClassIndex(103291);
                }

                public final void run() {
                    AbstractC87366o oVar = oVar;
                    C87393w.this.mo141307g();
                    C87403y yVar = C87393w.this.f197795i;
                    C87403y yVar2 = C87393w.this.f197795i;
                    oVar.mo124033a();
                }
            });
        }
    }
}

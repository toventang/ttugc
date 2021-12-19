package com.facebook.imagepipeline.p1885j;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24083b;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.C24114j;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imageutils.C24656a;
import com.facebook.imageutils.C24660c;
import com.facebook.imageutils.C24661d;
import com.facebook.imageutils.C24662e;
import com.facebook.imageutils.C24664g;
import com.facebook.imageutils.C24666h;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;
import com.facebook.p1870h.C24316d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.j.e */
public class C24456e implements Closeable {

    /* renamed from: a */
    public final C24117a<AbstractC24111h> f58094a;

    /* renamed from: b */
    public final AbstractC24093k<FileInputStream> f58095b;

    /* renamed from: c */
    public C24314c f58096c;

    /* renamed from: d */
    public int f58097d;

    /* renamed from: e */
    public int f58098e;

    /* renamed from: f */
    public int f58099f;

    /* renamed from: g */
    public int f58100g;

    /* renamed from: h */
    public int f58101h;

    /* renamed from: i */
    public int f58102i;

    /* renamed from: j */
    public C24360a f58103j;

    /* renamed from: k */
    private ColorSpace f58104k;

    static {
        Covode.recordClassIndex(28599);
    }

    /* renamed from: l */
    private ColorSpace m46684l() {
        m46685m();
        return this.f58104k;
    }

    /* renamed from: c */
    public final C24314c mo40303c() {
        m46685m();
        return this.f58096c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C24117a.m45712c(this.f58094a);
    }

    /* renamed from: e */
    public final int mo40306e() {
        m46685m();
        return this.f58098e;
    }

    /* renamed from: f */
    public final int mo40307f() {
        m46685m();
        return this.f58099f;
    }

    /* renamed from: g */
    public final int mo40308g() {
        m46685m();
        return this.f58100g;
    }

    /* renamed from: m */
    private void m46685m() {
        if (this.f58099f < 0 || this.f58100g < 0) {
            mo40311j();
        }
    }

    /* renamed from: d */
    public final int mo40305d() {
        m46685m();
        return this.f58097d;
    }

    /* renamed from: n */
    private Pair<Integer, Integer> m46686n() {
        Pair<Integer, Integer> a = C24666h.m47182a(mo40301b());
        if (a != null) {
            this.f58099f = ((Integer) a.first).intValue();
            this.f58100g = ((Integer) a.second).intValue();
        }
        return a;
    }

    /* renamed from: h */
    public final int mo40309h() {
        C24117a<AbstractC24111h> aVar = this.f58094a;
        if (aVar == null || aVar.mo39695a() == null) {
            return this.f58102i;
        }
        return this.f58094a.mo39695a().mo39673a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.p1885j.C24456e m46683k() {
        /*
            r3 = this;
            com.facebook.common.d.k<java.io.FileInputStream> r0 = r3.f58095b
            if (r0 == 0) goto L_0x0011
            com.facebook.imagepipeline.j.e r0 = new com.facebook.imagepipeline.j.e
            com.facebook.common.d.k<java.io.FileInputStream> r2 = r3.f58095b
            int r1 = r3.f58102i
            r0.<init>(r2, r1)
        L_0x000d:
            r0.mo40302b(r3)
        L_0x0010:
            return r0
        L_0x0011:
            com.facebook.common.h.a<com.facebook.common.g.h> r0 = r3.f58094a
            com.facebook.common.h.a r1 = com.facebook.common.p1836h.C24117a.m45711b(r0)
            if (r1 != 0) goto L_0x0020
            r0 = 0
        L_0x001a:
            com.facebook.common.p1836h.C24117a.m45712c(r1)
            if (r0 == 0) goto L_0x0010
            goto L_0x000d
        L_0x0020:
            com.facebook.imagepipeline.j.e r0 = new com.facebook.imagepipeline.j.e     // Catch:{ all -> 0x0026 }
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x001a
        L_0x0026:
            r0 = move-exception
            com.facebook.common.p1836h.C24117a.m45712c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1885j.C24456e.m46683k():com.facebook.imagepipeline.j.e");
    }

    /* renamed from: p */
    private C24661d m46688p() {
        Throwable th;
        try {
            InputStream b = mo40301b();
            try {
                C24661d b2 = C24656a.m47173b(b);
                this.f58104k = b2.f58585b;
                Pair<Integer, Integer> pair = b2.f58584a;
                if (pair != null) {
                    this.f58099f = ((Integer) pair.first).intValue();
                    this.f58100g = ((Integer) pair.second).intValue();
                }
                if (b != null) {
                    try {
                        b.close();
                    } catch (IOException unused) {
                    }
                }
                return b2;
            } catch (Throwable th2) {
                th = th2;
                if (b != null) {
                    try {
                        b.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo40300a() {
        MethodCollector.m26663i(3260);
        if (!C24117a.m45710a((C24117a<?>) this.f58094a)) {
            if (this.f58095b == null) {
                MethodCollector.m26664o(3260);
                return false;
            }
        }
        MethodCollector.m26664o(3260);
        return true;
    }

    /* renamed from: b */
    public final InputStream mo40301b() {
        AbstractC24093k<FileInputStream> kVar = this.f58095b;
        if (kVar != null) {
            return kVar.mo34217b();
        }
        C24117a b = C24117a.m45711b(this.f58094a);
        if (b == null) {
            return null;
        }
        try {
            return new C24114j((AbstractC24111h) b.mo39695a());
        } finally {
            C24117a.m45712c(b);
        }
    }

    /* renamed from: o */
    private Pair<Integer, Integer> m46687o() {
        MethodCollector.m26663i(3297);
        InputStream b = mo40301b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = b.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int[] a = C24660c.m47178a(byteArray, byteArray.length);
            if (a != null) {
                this.f58099f = a[0];
                this.f58100g = a[1];
                this.f58097d = a[2];
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(a[0]), Integer.valueOf(a[1]));
                try {
                    C24083b.m45599a(byteArrayOutputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                MethodCollector.m26664o(3297);
                return pair;
            }
            try {
                C24083b.m45599a(byteArrayOutputStream);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            MethodCollector.m26664o(3297);
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            C24083b.m45599a(byteArrayOutputStream);
        } catch (Throwable th) {
            try {
                C24083b.m45599a(byteArrayOutputStream);
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            MethodCollector.m26664o(3297);
            throw th;
        }
    }

    /* renamed from: i */
    public final String mo40310i() {
        C24117a b = C24117a.m45711b(this.f58094a);
        if (b == null) {
            return "";
        }
        int min = Math.min(mo40309h(), 10);
        byte[] bArr = new byte[min];
        try {
            AbstractC24111h hVar = (AbstractC24111h) b.mo39695a();
            if (hVar == null) {
                return "";
            }
            hVar.mo39674a(0, bArr, 0, min);
            b.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i = 0; i < min; i++) {
                sb.append(C1764a.m5928a("%02X", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } finally {
            b.close();
        }
    }

    /* renamed from: j */
    public final void mo40311j() {
        Pair<Integer, Integer> pair;
        C24314c a = C24316d.m46270a(mo40301b());
        this.f58096c = a;
        if (C24313b.m46264a(a)) {
            pair = m46686n();
        } else if (C24313b.m46266c(a)) {
            pair = m46687o();
        } else {
            pair = m46688p().f58584a;
        }
        if (a == C24313b.f57651a && this.f58097d == -1) {
            if (pair != null) {
                int a2 = C24662e.m47179a(mo40301b());
                this.f58098e = a2;
                this.f58097d = C24664g.m47181a(a2);
            }
        } else if (a == C24313b.f57661k && this.f58097d == -1) {
            int a3 = HeifExifUtil.m47168a(mo40301b());
            this.f58098e = a3;
            this.f58097d = C24664g.m47181a(a3);
        } else {
            this.f58097d = 0;
        }
    }

    /* renamed from: d */
    public static void m46681d(C24456e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    /* renamed from: a */
    public static C24456e m46679a(C24456e eVar) {
        if (eVar != null) {
            return eVar.m46683k();
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m46680c(C24456e eVar) {
        if (eVar.f58097d < 0 || eVar.f58099f < 0 || eVar.f58100g < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m46682e(C24456e eVar) {
        if (eVar == null || !eVar.mo40300a()) {
            return false;
        }
        return true;
    }

    private C24456e(AbstractC24093k<FileInputStream> kVar) {
        this.f58096c = C24314c.f57663a;
        this.f58097d = -1;
        this.f58099f = -1;
        this.f58100g = -1;
        this.f58101h = 1;
        this.f58102i = -1;
        C24091i.m45617a(kVar);
        this.f58094a = null;
        this.f58095b = kVar;
    }

    public C24456e(C24117a<AbstractC24111h> aVar) {
        this.f58096c = C24314c.f57663a;
        this.f58097d = -1;
        this.f58099f = -1;
        this.f58100g = -1;
        this.f58101h = 1;
        this.f58102i = -1;
        C24091i.m45620a(C24117a.m45710a((C24117a<?>) aVar));
        this.f58094a = aVar.clone();
        this.f58095b = null;
    }

    /* renamed from: b */
    public final void mo40302b(C24456e eVar) {
        this.f58096c = eVar.mo40303c();
        this.f58099f = eVar.mo40307f();
        this.f58100g = eVar.mo40308g();
        this.f58097d = eVar.mo40305d();
        this.f58098e = eVar.mo40306e();
        this.f58101h = eVar.f58101h;
        this.f58102i = eVar.mo40309h();
        this.f58103j = eVar.f58103j;
        this.f58104k = eVar.m46684l();
    }

    private C24456e(AbstractC24093k<FileInputStream> kVar, int i) {
        this(kVar);
        this.f58102i = i;
    }
}

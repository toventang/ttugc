package com.squareup.p2081b;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

/* renamed from: com.squareup.b.m */
public final class C29290m implements AbstractC29274d {

    /* renamed from: b */
    final LinkedHashMap<String, Bitmap> f69487b;

    /* renamed from: c */
    private final int f69488c;

    /* renamed from: d */
    private int f69489d;

    /* renamed from: e */
    private int f69490e;

    /* renamed from: f */
    private int f69491f;

    /* renamed from: g */
    private int f69492g;

    /* renamed from: h */
    private int f69493h;

    static {
        Covode.recordClassIndex(35639);
    }

    @Override // com.squareup.p2081b.AbstractC29274d
    /* renamed from: a */
    public final synchronized int mo51074a() {
        int i;
        MethodCollector.m26663i(10737);
        i = this.f69489d;
        MethodCollector.m26664o(10737);
        return i;
    }

    @Override // com.squareup.p2081b.AbstractC29274d
    /* renamed from: b */
    public final synchronized int mo51077b() {
        int i;
        MethodCollector.m26663i(10884);
        i = this.f69488c;
        MethodCollector.m26664o(10884);
        return i;
    }

    private C29290m(int i) {
        if (i > 0) {
            this.f69488c = i;
            this.f69487b = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29290m(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r3 = com.squareup.p2081b.C29262ae.m58604a(r5, r0)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.flags
            r2 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0029
            r1 = 1
        L_0x0014:
            int r0 = r3.getMemoryClass()
            if (r1 == 0) goto L_0x0022
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 11
            int r0 = r3.getLargeMemoryClass()
        L_0x0022:
            int r0 = r0 * r2
            int r0 = r0 / 7
            r4.<init>(r0)
            return
        L_0x0029:
            r1 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.C29290m.<init>(android.content.Context):void");
    }

    @Override // com.squareup.p2081b.AbstractC29274d
    /* renamed from: a */
    public final Bitmap mo51075a(String str) {
        MethodCollector.m26663i(10426);
        if (str != null) {
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f69487b.get(str);
                    if (bitmap != null) {
                        this.f69492g++;
                        return bitmap;
                    }
                    this.f69493h++;
                    MethodCollector.m26664o(10426);
                    return null;
                } finally {
                    MethodCollector.m26664o(10426);
                }
            }
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.m26664o(10426);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m58671a(int r5) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.C29290m.m58671a(int):void");
    }

    @Override // com.squareup.p2081b.AbstractC29274d
    /* renamed from: a */
    public final void mo51076a(String str, Bitmap bitmap) {
        MethodCollector.m26663i(10590);
        if (str == null || bitmap == null) {
            NullPointerException nullPointerException = new NullPointerException("key == null || bitmap == null");
            MethodCollector.m26664o(10590);
            throw nullPointerException;
        }
        synchronized (this) {
            try {
                this.f69490e++;
                this.f69489d += C29262ae.m58600a(bitmap);
                Bitmap put = this.f69487b.put(str, bitmap);
                if (put != null) {
                    this.f69489d -= C29262ae.m58600a(put);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(10590);
                throw th;
            }
        }
        m58671a(this.f69488c);
        MethodCollector.m26664o(10590);
    }
}

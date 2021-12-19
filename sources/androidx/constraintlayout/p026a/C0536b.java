package androidx.constraintlayout.p026a;

import androidx.constraintlayout.p026a.C0539e;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.constraintlayout.a.b */
public class C0536b implements C0539e.AbstractC0540a {

    /* renamed from: a */
    C0545h f2127a;

    /* renamed from: b */
    public float f2128b;

    /* renamed from: c */
    boolean f2129c;

    /* renamed from: d */
    public final C0510a f2130d;

    /* renamed from: e */
    public boolean f2131e;

    static {
        Covode.recordClassIndex(603);
    }

    @Override // androidx.constraintlayout.p026a.C0539e.AbstractC0540a
    /* renamed from: b */
    public final C0545h mo2362b() {
        return this.f2127a;
    }

    @Override // androidx.constraintlayout.p026a.C0539e.AbstractC0540a
    /* renamed from: a */
    public final void mo2357a() {
        this.f2130d.mo2266a();
        this.f2127a = null;
        this.f2128b = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.C0536b.toString():java.lang.String");
    }

    @Override // androidx.constraintlayout.p026a.C0539e.AbstractC0540a
    /* renamed from: a */
    public final C0545h mo2356a(boolean[] zArr) {
        return this.f2130d.mo2265a(zArr, (C0545h) null);
    }

    public C0536b(C0537c cVar) {
        this.f2130d = new C0510a(this, cVar);
    }

    @Override // androidx.constraintlayout.p026a.C0539e.AbstractC0540a
    /* renamed from: c */
    public void mo2364c(C0545h hVar) {
        float f = 1.0f;
        if (hVar.f2193e != 1) {
            if (hVar.f2193e == 2) {
                f = 1000.0f;
            } else if (hVar.f2193e == 3) {
                f = 1000000.0f;
            } else if (hVar.f2193e == 4) {
                f = 1.0E9f;
            } else if (hVar.f2193e == 5) {
                f = 1.0E12f;
            }
        }
        this.f2130d.mo2269a(hVar, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2363b(C0545h hVar) {
        C0545h hVar2 = this.f2127a;
        if (hVar2 != null) {
            this.f2130d.mo2269a(hVar2, -1.0f);
            this.f2127a = null;
        }
        float a = this.f2130d.mo2263a(hVar, true) * -1.0f;
        this.f2127a = hVar;
        if (a != 1.0f) {
            this.f2128b /= a;
            C0510a aVar = this.f2130d;
            int i = aVar.f1940g;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f1934a) {
                float[] fArr = aVar.f1939f;
                fArr[i] = fArr[i] / a;
                i = aVar.f1938e[i];
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.p026a.C0539e.AbstractC0540a
    /* renamed from: a */
    public final void mo2358a(C0539e.AbstractC0540a aVar) {
        if (aVar instanceof C0536b) {
            C0536b bVar = (C0536b) aVar;
            this.f2127a = null;
            this.f2130d.mo2266a();
            for (int i = 0; i < bVar.f2130d.f1934a; i++) {
                this.f2130d.mo2270a(bVar.f2130d.mo2264a(i), bVar.f2130d.mo2271b(i), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo2359a(C0545h hVar) {
        C0510a aVar = this.f2130d;
        if (aVar.f1940g != -1) {
            int i = aVar.f1940g;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f1934a) {
                if (aVar.f1937d[i] == hVar.f2191c) {
                    return true;
                }
                i = aVar.f1938e[i];
                i2++;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C0536b mo2353a(C0539e eVar, int i) {
        this.f2130d.mo2269a(eVar.mo2366a(i), 1.0f);
        this.f2130d.mo2269a(eVar.mo2366a(i), -1.0f);
        return this;
    }

    /* renamed from: a */
    public final C0536b mo2354a(C0545h hVar, C0545h hVar2, C0545h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2128b = (float) i;
        }
        if (!z) {
            this.f2130d.mo2269a(hVar, -1.0f);
            this.f2130d.mo2269a(hVar2, 1.0f);
            this.f2130d.mo2269a(hVar3, 1.0f);
        } else {
            this.f2130d.mo2269a(hVar, 1.0f);
            this.f2130d.mo2269a(hVar2, -1.0f);
            this.f2130d.mo2269a(hVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0536b mo2360b(C0545h hVar, C0545h hVar2, C0545h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2128b = (float) i;
        }
        if (!z) {
            this.f2130d.mo2269a(hVar, -1.0f);
            this.f2130d.mo2269a(hVar2, 1.0f);
            this.f2130d.mo2269a(hVar3, -1.0f);
        } else {
            this.f2130d.mo2269a(hVar, 1.0f);
            this.f2130d.mo2269a(hVar2, -1.0f);
            this.f2130d.mo2269a(hVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0536b mo2361b(C0545h hVar, C0545h hVar2, C0545h hVar3, C0545h hVar4, float f) {
        this.f2130d.mo2269a(hVar3, 0.5f);
        this.f2130d.mo2269a(hVar4, 0.5f);
        this.f2130d.mo2269a(hVar, -0.5f);
        this.f2130d.mo2269a(hVar2, -0.5f);
        this.f2128b = -f;
        return this;
    }

    /* renamed from: a */
    public final C0536b mo2355a(C0545h hVar, C0545h hVar2, C0545h hVar3, C0545h hVar4, float f) {
        this.f2130d.mo2269a(hVar, -1.0f);
        this.f2130d.mo2269a(hVar2, 1.0f);
        this.f2130d.mo2269a(hVar3, f);
        this.f2130d.mo2269a(hVar4, -f);
        return this;
    }
}

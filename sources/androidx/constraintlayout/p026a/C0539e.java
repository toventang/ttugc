package androidx.constraintlayout.p026a;

import androidx.constraintlayout.p026a.C0545h;
import androidx.constraintlayout.p026a.p027a.C0515e;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.a.e */
public final class C0539e {

    /* renamed from: h */
    public static C0541f f2135h;

    /* renamed from: i */
    private static int f2136i = 1000;

    /* renamed from: a */
    public int f2137a;

    /* renamed from: b */
    public AbstractC0540a f2138b;

    /* renamed from: c */
    public C0536b[] f2139c = new C0536b[32];

    /* renamed from: d */
    public boolean f2140d;

    /* renamed from: e */
    int f2141e = 1;

    /* renamed from: f */
    public int f2142f;

    /* renamed from: g */
    public final C0537c f2143g;

    /* renamed from: j */
    private HashMap<String, C0545h> f2144j;

    /* renamed from: k */
    private int f2145k = 32;

    /* renamed from: l */
    private int f2146l = 32;

    /* renamed from: m */
    private boolean[] f2147m = new boolean[32];

    /* renamed from: n */
    private int f2148n = 32;

    /* renamed from: o */
    private C0545h[] f2149o = new C0545h[f2136i];

    /* renamed from: p */
    private int f2150p;

    /* renamed from: q */
    private C0536b[] f2151q = new C0536b[32];

    /* renamed from: r */
    private final AbstractC0540a f2152r;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.e$a */
    public interface AbstractC0540a {
        static {
            Covode.recordClassIndex(607);
        }

        /* renamed from: a */
        C0545h mo2356a(boolean[] zArr);

        /* renamed from: a */
        void mo2357a();

        /* renamed from: a */
        void mo2358a(AbstractC0540a aVar);

        /* renamed from: b */
        C0545h mo2362b();

        /* renamed from: c */
        void mo2364c(C0545h hVar);
    }

    /* renamed from: a */
    public final void mo2374a(C0545h hVar, C0545h hVar2, int i, int i2) {
        C0536b b = mo2376b();
        C0545h c = mo2379c();
        c.f2193e = 0;
        b.mo2354a(hVar, hVar2, c, i);
        if (i2 != 6) {
            mo2370a(b, (int) (b.f2130d.mo2272b(c) * -1.0f), i2);
        }
        mo2369a(b);
    }

    /* renamed from: a */
    public final void mo2373a(C0545h hVar, C0545h hVar2, int i, float f, C0545h hVar3, C0545h hVar4, int i2, int i3) {
        C0536b b = mo2376b();
        if (hVar2 == hVar3) {
            b.f2130d.mo2269a(hVar, 1.0f);
            b.f2130d.mo2269a(hVar4, 1.0f);
            b.f2130d.mo2269a(hVar2, -2.0f);
        } else if (f == 0.5f) {
            b.f2130d.mo2269a(hVar, 1.0f);
            b.f2130d.mo2269a(hVar2, -1.0f);
            b.f2130d.mo2269a(hVar3, -1.0f);
            b.f2130d.mo2269a(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                b.f2128b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            b.f2130d.mo2269a(hVar, -1.0f);
            b.f2130d.mo2269a(hVar2, 1.0f);
            b.f2128b = (float) i;
        } else if (f >= 1.0f) {
            b.f2130d.mo2269a(hVar3, -1.0f);
            b.f2130d.mo2269a(hVar4, 1.0f);
            b.f2128b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            b.f2130d.mo2269a(hVar, f2 * 1.0f);
            b.f2130d.mo2269a(hVar2, f2 * -1.0f);
            b.f2130d.mo2269a(hVar3, -1.0f * f);
            b.f2130d.mo2269a(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                b.f2128b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        if (i3 != 6) {
            b.mo2353a(this, i3);
        }
        mo2369a(b);
    }

    /* renamed from: a */
    public final void mo2372a(C0545h hVar, int i) {
        int i2 = hVar.f2192d;
        if (hVar.f2192d != -1) {
            C0536b bVar = this.f2139c[i2];
            if (bVar.f2131e) {
                bVar.f2128b = (float) i;
            } else if (bVar.f2130d.f1934a == 0) {
                bVar.f2131e = true;
                bVar.f2128b = (float) i;
            } else {
                C0536b b = mo2376b();
                if (i < 0) {
                    b.f2128b = (float) (i * -1);
                    b.f2130d.mo2269a(hVar, 1.0f);
                } else {
                    b.f2128b = (float) i;
                    b.f2130d.mo2269a(hVar, -1.0f);
                }
                mo2369a(b);
            }
        } else {
            C0536b b2 = mo2376b();
            b2.f2127a = hVar;
            float f = (float) i;
            hVar.f2194f = f;
            b2.f2128b = f;
            b2.f2131e = true;
            mo2369a(b2);
        }
    }

    static {
        Covode.recordClassIndex(606);
    }

    /* renamed from: f */
    private void m2042f() {
        int i = 0;
        while (true) {
            C0536b[] bVarArr = this.f2139c;
            if (i < bVarArr.length) {
                C0536b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f2143g.f2132a.mo2384a(bVar);
                }
                this.f2139c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo2380d() {
        for (int i = 0; i < this.f2142f; i++) {
            C0536b bVar = this.f2139c[i];
            bVar.f2127a.f2194f = bVar.f2128b;
        }
    }

    public C0539e() {
        m2042f();
        C0537c cVar = new C0537c();
        this.f2143g = cVar;
        this.f2138b = new C0538d(cVar);
        this.f2152r = new C0536b(cVar);
    }

    /* renamed from: b */
    public final C0536b mo2376b() {
        C0536b a = this.f2143g.f2132a.mo2382a();
        if (a == null) {
            a = new C0536b(this.f2143g);
        } else {
            a.f2127a = null;
            a.f2130d.mo2266a();
            a.f2128b = 0.0f;
            a.f2131e = false;
        }
        C0545h.f2185a++;
        return a;
    }

    /* renamed from: e */
    private void m2041e() {
        int i = this.f2145k * 2;
        this.f2145k = i;
        this.f2139c = (C0536b[]) Arrays.copyOf(this.f2139c, i);
        C0537c cVar = this.f2143g;
        cVar.f2134c = (C0545h[]) Arrays.copyOf(cVar.f2134c, this.f2145k);
        int i2 = this.f2145k;
        this.f2147m = new boolean[i2];
        this.f2146l = i2;
        this.f2148n = i2;
        C0541f fVar = f2135h;
        if (fVar != null) {
            fVar.f2160d++;
            C0541f fVar2 = f2135h;
            fVar2.f2172p = Math.max(fVar2.f2172p, (long) this.f2145k);
            C0541f fVar3 = f2135h;
            fVar3.f2156D = fVar3.f2172p;
        }
    }

    /* renamed from: c */
    public final C0545h mo2379c() {
        C0541f fVar = f2135h;
        if (fVar != null) {
            fVar.f2170n++;
        }
        if (this.f2141e + 1 >= this.f2146l) {
            m2041e();
        }
        C0545h a = m2036a(C0545h.EnumC0546a.SLACK);
        int i = this.f2137a + 1;
        this.f2137a = i;
        this.f2141e++;
        a.f2191c = i;
        this.f2143g.f2134c[this.f2137a] = a;
        return a;
    }

    /* renamed from: a */
    public final void mo2368a() {
        for (int i = 0; i < this.f2143g.f2134c.length; i++) {
            C0545h hVar = this.f2143g.f2134c[i];
            if (hVar != null) {
                hVar.mo2385a();
            }
        }
        this.f2143g.f2133b.mo2383a(this.f2149o, this.f2150p);
        this.f2150p = 0;
        Arrays.fill(this.f2143g.f2134c, (Object) null);
        HashMap<String, C0545h> hashMap = this.f2144j;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2137a = 0;
        this.f2138b.mo2357a();
        this.f2141e = 1;
        for (int i2 = 0; i2 < this.f2142f; i2++) {
            this.f2139c[i2].f2129c = false;
        }
        m2042f();
        this.f2142f = 0;
    }

    /* renamed from: b */
    public static int m2038b(Object obj) {
        C0545h hVar = ((C0515e) obj).f1974j;
        if (hVar != null) {
            return (int) (hVar.f2194f + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private final void m2039b(C0536b bVar) {
        if (this.f2142f > 0) {
            bVar.f2130d.mo2268a(bVar, this.f2139c);
            if (bVar.f2130d.f1934a == 0) {
                bVar.f2131e = true;
            }
        }
    }

    /* renamed from: a */
    private C0545h m2036a(C0545h.EnumC0546a aVar) {
        C0545h a = this.f2143g.f2133b.mo2382a();
        if (a == null) {
            a = new C0545h(aVar);
            a.f2196h = aVar;
        } else {
            a.mo2385a();
            a.f2196h = aVar;
        }
        int i = this.f2150p;
        int i2 = f2136i;
        if (i >= i2) {
            int i3 = i2 * 2;
            f2136i = i3;
            this.f2149o = (C0545h[]) Arrays.copyOf(this.f2149o, i3);
        }
        C0545h[] hVarArr = this.f2149o;
        int i4 = this.f2150p;
        this.f2150p = i4 + 1;
        hVarArr[i4] = a;
        return a;
    }

    /* renamed from: c */
    private final void m2040c(C0536b bVar) {
        if (this.f2139c[this.f2142f] != null) {
            this.f2143g.f2132a.mo2384a(this.f2139c[this.f2142f]);
        }
        this.f2139c[this.f2142f] = bVar;
        bVar.f2127a.f2192d = this.f2142f;
        this.f2142f++;
        bVar.f2127a.mo2388c(bVar);
    }

    /* renamed from: a */
    public final C0545h mo2366a(int i) {
        C0541f fVar = f2135h;
        if (fVar != null) {
            fVar.f2169m++;
        }
        if (this.f2141e + 1 >= this.f2146l) {
            m2041e();
        }
        C0545h a = m2036a(C0545h.EnumC0546a.ERROR);
        int i2 = this.f2137a + 1;
        this.f2137a = i2;
        this.f2141e++;
        a.f2191c = i2;
        a.f2193e = i;
        this.f2143g.f2134c[this.f2137a] = a;
        this.f2138b.mo2364c(a);
        return a;
    }

    /* renamed from: b */
    private final int m2037b(AbstractC0540a aVar) {
        C0541f fVar = f2135h;
        if (fVar != null) {
            fVar.f2164h++;
        }
        for (int i = 0; i < this.f2141e; i++) {
            this.f2147m[i] = false;
        }
        int i2 = 0;
        while (true) {
            C0541f fVar2 = f2135h;
            if (fVar2 != null) {
                fVar2.f2165i++;
            }
            i2++;
            if (i2 >= this.f2141e * 2) {
                return i2;
            }
            if (aVar.mo2362b() != null) {
                this.f2147m[aVar.mo2362b().f2191c] = true;
            }
            C0545h a = aVar.mo2356a(this.f2147m);
            if (a == null || this.f2147m[a.f2191c]) {
                return i2;
            }
            this.f2147m[a.f2191c] = true;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < this.f2142f; i4++) {
                C0536b bVar = this.f2139c[i4];
                if (bVar.f2127a.f2196h != C0545h.EnumC0546a.UNRESTRICTED && !bVar.f2131e && bVar.mo2359a(a)) {
                    float b = bVar.f2130d.mo2272b(a);
                    if (b < 0.0f) {
                        float f2 = (-bVar.f2128b) / b;
                        if (f2 < f) {
                            i3 = i4;
                            f = f2;
                        }
                    }
                }
            }
            if (i3 < 0) {
                break;
            }
            C0536b bVar2 = this.f2139c[i3];
            bVar2.f2127a.f2192d = -1;
            C0541f fVar3 = f2135h;
            if (fVar3 != null) {
                fVar3.f2166j++;
            }
            bVar2.mo2363b(a);
            bVar2.f2127a.f2192d = i3;
            bVar2.f2127a.mo2388c(bVar2);
        }
        return i2;
    }

    /* renamed from: a */
    public final C0545h mo2367a(Object obj) {
        C0545h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2141e + 1 >= this.f2146l) {
            m2041e();
        }
        if (obj instanceof C0515e) {
            C0515e eVar = (C0515e) obj;
            hVar = eVar.f1974j;
            if (hVar == null) {
                eVar.mo2280a();
                hVar = eVar.f1974j;
            }
            if (hVar.f2191c == -1 || hVar.f2191c > this.f2137a || this.f2143g.f2134c[hVar.f2191c] == null) {
                if (hVar.f2191c != -1) {
                    hVar.mo2385a();
                }
                int i = this.f2137a + 1;
                this.f2137a = i;
                this.f2141e++;
                hVar.f2191c = i;
                hVar.f2196h = C0545h.EnumC0546a.UNRESTRICTED;
                this.f2143g.f2134c[this.f2137a] = hVar;
            }
        }
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x00a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2369a(androidx.constraintlayout.p026a.C0536b r18) {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.C0539e.mo2369a(androidx.constraintlayout.a.b):void");
    }

    /* renamed from: a */
    public final void mo2371a(AbstractC0540a aVar) {
        C0541f fVar = f2135h;
        long j = 1;
        if (fVar != null) {
            fVar.f2176t++;
            C0541f fVar2 = f2135h;
            fVar2.f2177u = Math.max(fVar2.f2177u, (long) this.f2141e);
            C0541f fVar3 = f2135h;
            fVar3.f2178v = Math.max(fVar3.f2178v, (long) this.f2142f);
        }
        m2039b((C0536b) aVar);
        int i = 0;
        while (true) {
            float f = 0.0f;
            int i2 = 1;
            if (i >= this.f2142f) {
                break;
            } else if (this.f2139c[i].f2127a.f2196h == C0545h.EnumC0546a.UNRESTRICTED || this.f2139c[i].f2128b >= 0.0f) {
                i++;
            } else {
                boolean z = false;
                int i3 = 0;
                do {
                    C0541f fVar4 = f2135h;
                    if (fVar4 != null) {
                        fVar4.f2167k += j;
                    }
                    i3 += i2;
                    float f2 = Float.MAX_VALUE;
                    int i4 = 0;
                    int i5 = -1;
                    int i6 = -1;
                    int i7 = 0;
                    while (i4 < this.f2142f) {
                        C0536b bVar = this.f2139c[i4];
                        if (bVar.f2127a.f2196h != C0545h.EnumC0546a.UNRESTRICTED && !bVar.f2131e && bVar.f2128b < f) {
                            int i8 = 1;
                            while (i8 < this.f2141e) {
                                C0545h hVar = this.f2143g.f2134c[i8];
                                float b = bVar.f2130d.mo2272b(hVar);
                                if (b > f) {
                                    int i9 = 0;
                                    do {
                                        float f3 = hVar.f2195g[i9] / b;
                                        if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                            i6 = i8;
                                            f2 = f3;
                                            i7 = i9;
                                            i5 = i4;
                                        }
                                        i9++;
                                    } while (i9 < 7);
                                }
                                i8++;
                                f = 0.0f;
                            }
                        }
                        i4++;
                        f = 0.0f;
                    }
                    if (i5 != -1) {
                        C0536b bVar2 = this.f2139c[i5];
                        bVar2.f2127a.f2192d = -1;
                        C0541f fVar5 = f2135h;
                        if (fVar5 != null) {
                            fVar5.f2166j++;
                        }
                        bVar2.mo2363b(this.f2143g.f2134c[i6]);
                        bVar2.f2127a.f2192d = i5;
                        bVar2.f2127a.mo2388c(bVar2);
                    } else {
                        z = true;
                    }
                    if (i3 > this.f2141e / 2) {
                        break;
                    }
                    j = 1;
                    f = 0.0f;
                    i2 = 1;
                } while (!z);
            }
        }
        m2037b(aVar);
        mo2380d();
    }

    /* renamed from: a */
    public final void mo2370a(C0536b bVar, int i, int i2) {
        bVar.f2130d.mo2269a(mo2366a(i2), (float) i);
    }

    /* renamed from: b */
    public final void mo2377b(C0545h hVar, C0545h hVar2, int i, int i2) {
        C0536b b = mo2376b();
        C0545h c = mo2379c();
        c.f2193e = 0;
        b.mo2360b(hVar, hVar2, c, i);
        if (i2 != 6) {
            mo2370a(b, (int) (b.f2130d.mo2272b(c) * -1.0f), i2);
        }
        mo2369a(b);
    }

    /* renamed from: c */
    public final C0536b mo2378c(C0545h hVar, C0545h hVar2, int i, int i2) {
        C0536b b = mo2376b();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            b.f2128b = (float) i;
        }
        if (!z) {
            b.f2130d.mo2269a(hVar, -1.0f);
            b.f2130d.mo2269a(hVar2, 1.0f);
        } else {
            b.f2130d.mo2269a(hVar, 1.0f);
            b.f2130d.mo2269a(hVar2, -1.0f);
        }
        if (i2 != 6) {
            b.mo2353a(this, i2);
        }
        mo2369a(b);
        return b;
    }

    /* renamed from: a */
    public final void mo2375a(C0545h hVar, C0545h hVar2, C0545h hVar3, C0545h hVar4, float f) {
        C0536b b = mo2376b();
        b.mo2355a(hVar, hVar2, hVar3, hVar4, f);
        mo2369a(b);
    }
}

package androidx.constraintlayout.p026a.p027a;

import androidx.constraintlayout.p026a.p027a.C0515e;
import androidx.constraintlayout.p026a.p027a.C0520f;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.constraintlayout.a.a.a */
public final class C0511a {
    static {
        Covode.recordClassIndex(578);
    }

    /* renamed from: a */
    public static boolean m1911a(C0520f fVar, C0524h hVar, List<C0524h> list, boolean z) {
        if (fVar == null) {
            return true;
        }
        fVar.f2017am = false;
        C0523g gVar = (C0523g) fVar.f1987H;
        if (fVar.f2045t == null) {
            fVar.f2016al = true;
            hVar.f2077a.add(fVar);
            fVar.f2045t = hVar;
            if (fVar.f2048w.f1968d == null && fVar.f2050y.f1968d == null && fVar.f2049x.f1968d == null && fVar.f2051z.f1968d == null && fVar.f1980A.f1968d == null && fVar.f1983D.f1968d == null) {
                m1909a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (!(fVar.f2049x.f1968d == null || fVar.f2051z.f1968d == null)) {
                gVar.mo2324x();
                if (z) {
                    m1909a(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.f2049x.f1968d.f1966b == fVar.f1987H && fVar.f2051z.f1968d.f1966b == fVar.f1987H)) {
                    m1909a(gVar, fVar, hVar);
                }
            }
            if (!(fVar.f2048w.f1968d == null || fVar.f2050y.f1968d == null)) {
                gVar.mo2323w();
                if (z) {
                    m1909a(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.f2048w.f1968d.f1966b == fVar.f1987H && fVar.f2050y.f1968d.f1966b == fVar.f1987H)) {
                    m1909a(gVar, fVar, hVar);
                }
            }
            if (((fVar.mo2323w() == C0520f.EnumC0522a.MATCH_CONSTRAINT) ^ (fVar.mo2324x() == C0520f.EnumC0522a.MATCH_CONSTRAINT)) && fVar.f1990K != 0.0f) {
                m1904a(fVar);
            } else if (fVar.mo2323w() == C0520f.EnumC0522a.MATCH_CONSTRAINT || fVar.mo2324x() == C0520f.EnumC0522a.MATCH_CONSTRAINT) {
                m1909a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (((fVar.f2048w.f1968d == null && fVar.f2050y.f1968d == null) || ((fVar.f2048w.f1968d != null && fVar.f2048w.f1968d.f1966b == fVar.f1987H && fVar.f2050y.f1968d == null) || ((fVar.f2050y.f1968d != null && fVar.f2050y.f1968d.f1966b == fVar.f1987H && fVar.f2048w.f1968d == null) || (fVar.f2048w.f1968d != null && fVar.f2048w.f1968d.f1966b == fVar.f1987H && fVar.f2050y.f1968d != null && fVar.f2050y.f1968d.f1966b == fVar.f1987H)))) && fVar.f1983D.f1968d == null && !(fVar instanceof C0525i) && !(fVar instanceof C0527j)) {
                hVar.f2082f.add(fVar);
            }
            if (((fVar.f2049x.f1968d == null && fVar.f2051z.f1968d == null) || ((fVar.f2049x.f1968d != null && fVar.f2049x.f1968d.f1966b == fVar.f1987H && fVar.f2051z.f1968d == null) || ((fVar.f2051z.f1968d != null && fVar.f2051z.f1968d.f1966b == fVar.f1987H && fVar.f2049x.f1968d == null) || (fVar.f2049x.f1968d != null && fVar.f2049x.f1968d.f1966b == fVar.f1987H && fVar.f2051z.f1968d != null && fVar.f2051z.f1968d.f1966b == fVar.f1987H)))) && fVar.f1983D.f1968d == null && fVar.f1980A.f1968d == null && !(fVar instanceof C0525i) && !(fVar instanceof C0527j)) {
                hVar.f2083g.add(fVar);
            }
            if (fVar instanceof C0527j) {
                m1909a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
                C0527j jVar = (C0527j) fVar;
                for (int i = 0; i < jVar.f2098ay; i++) {
                    if (!m1911a(jVar.f2097ax[i], hVar, list, z)) {
                        return false;
                    }
                }
            }
            int length = fVar.f1984E.length;
            for (int i2 = 0; i2 < length; i2++) {
                C0515e eVar = fVar.f1984E[i2];
                if (!(eVar.f1968d == null || eVar.f1968d.f1966b == fVar.f1987H)) {
                    if (eVar.f1967c == C0515e.EnumC0519c.CENTER) {
                        m1909a(gVar, fVar, hVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        C0530m mVar = eVar.f1965a;
                        if (!(eVar.f1968d == null || eVar.f1968d.f1968d == eVar)) {
                            eVar.f1968d.f1965a.mo2348a(mVar);
                        }
                    }
                    if (!m1911a(eVar.f1968d.f1966b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (fVar.f2045t != hVar) {
            hVar.f2077a.addAll(fVar.f2045t.f2077a);
            hVar.f2082f.addAll(fVar.f2045t.f2082f);
            hVar.f2083g.addAll(fVar.f2045t.f2083g);
            if (!fVar.f2045t.f2080d) {
                hVar.f2080d = false;
            }
            list.remove(fVar.f2045t);
            for (C0520f fVar2 : fVar.f2045t.f2077a) {
                fVar2.f2045t = hVar;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m1908a(C0523g gVar) {
        gVar.f2061aF.clear();
        gVar.f2061aF.add(0, new C0524h(gVar.f2126aQ));
    }

    /* renamed from: a */
    private static int m1904a(C0520f fVar) {
        float k;
        float l;
        if (fVar.mo2323w() == C0520f.EnumC0522a.MATCH_CONSTRAINT) {
            if (fVar.f1991L == 0) {
                l = ((float) fVar.mo2311l()) * fVar.f1990K;
            } else {
                l = ((float) fVar.mo2311l()) / fVar.f1990K;
            }
            int i = (int) l;
            fVar.mo2296c(i);
            return i;
        } else if (fVar.mo2324x() != C0520f.EnumC0522a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (fVar.f1991L == 1) {
                k = ((float) fVar.mo2310k()) * fVar.f1990K;
            } else {
                k = ((float) fVar.mo2310k()) / fVar.f1990K;
            }
            int i2 = (int) k;
            fVar.mo2298d(i2);
            return i2;
        }
    }

    /* renamed from: a */
    private static int m1905a(C0520f fVar, int i) {
        float f;
        int i2 = i * 2;
        C0515e eVar = fVar.f1984E[i2];
        C0515e eVar2 = fVar.f1984E[i2 + 1];
        if (eVar.f1968d == null || eVar.f1968d.f1966b != fVar.f1987H || eVar2.f1968d == null || eVar2.f1968d.f1966b != fVar.f1987H) {
            return 0;
        }
        int b = fVar.f1987H.mo2292b(i);
        if (i == 0) {
            f = fVar.f2007ac;
        } else {
            f = fVar.f2008ad;
        }
        return (int) (((float) (((b - eVar.mo2282b()) - eVar2.mo2282b()) - fVar.mo2292b(i))) * f);
    }

    /* renamed from: a */
    public static int m1907a(C0524h hVar, int i) {
        List<C0520f> list;
        boolean z;
        int i2 = i * 2;
        if (i == 0) {
            list = hVar.f2082f;
        } else if (i == 1) {
            list = hVar.f2083g;
        } else {
            list = null;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0520f fVar = list.get(i4);
            int i5 = i2 + 1;
            if (fVar.f1984E[i5].f1968d == null || !(fVar.f1984E[i2].f1968d == null || fVar.f1984E[i5].f1968d == null)) {
                z = true;
            } else {
                z = false;
            }
            i3 = Math.max(i3, m1906a(fVar, i, z, 0));
        }
        hVar.f2081e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static void m1909a(C0523g gVar, C0520f fVar, C0524h hVar) {
        hVar.f2080d = false;
        gVar.f2068aM = false;
        fVar.f2016al = false;
    }

    /* renamed from: a */
    public static void m1910a(List<C0524h> list, int i, int i2) {
        HashSet<C0520f> hashSet;
        int i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0524h hVar = list.get(i4);
            if (i == 0) {
                hashSet = hVar.f2084h;
            } else if (i == 1) {
                hashSet = hVar.f2085i;
            } else {
                hashSet = null;
            }
            for (C0520f fVar : hashSet) {
                if (fVar.f2016al) {
                    int i5 = i * 2;
                    C0515e eVar = fVar.f1984E[i5];
                    C0515e eVar2 = fVar.f1984E[i5 + 1];
                    if (eVar.f1968d != null && eVar2.f1968d != null) {
                        C0528k.m1995a(fVar, i, m1905a(fVar, i) + eVar.mo2282b());
                    } else if (fVar.f1990K == 0.0f || fVar.mo2305g(i) != C0520f.EnumC0522a.MATCH_CONSTRAINT) {
                        if (i == 0) {
                            i3 = fVar.f1994O;
                        } else if (i == 1) {
                            i3 = fVar.f1995P;
                        } else {
                            i3 = 0;
                        }
                        int i6 = i2 - i3;
                        int b = i6 - fVar.mo2292b(i);
                        fVar.mo2288a(b, i6, i);
                        C0528k.m1995a(fVar, i, b);
                    } else {
                        int a = m1904a(fVar);
                        int i7 = (int) fVar.f1984E[i5].f1965a.f2105f;
                        eVar2.f1965a.f2104e = eVar.f1965a;
                        eVar2.f1965a.f2105f = (float) a;
                        eVar2.f1965a.f2115i = 1;
                        fVar.mo2288a(i7, i7 + a, i);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static int m1906a(C0520f fVar, int i, boolean z, int i2) {
        boolean z2;
        int l;
        int i3;
        int i4;
        int i5;
        int i6;
        int l2;
        int l3;
        int i7;
        int i8;
        C0520f fVar2;
        int i9 = i2;
        int i10 = 0;
        if (!fVar.f2016al) {
            return 0;
        }
        if (fVar.f1980A.f1968d == null || i != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            l = fVar.f2002W;
            i3 = fVar.mo2311l() - fVar.f2002W;
            i5 = i * 2;
            i4 = i5 + 1;
        } else {
            l = fVar.mo2311l() - fVar.f2002W;
            i3 = fVar.f2002W;
            i4 = i * 2;
            i5 = i4 + 1;
        }
        if (fVar.f1984E[i4].f1968d == null || fVar.f1984E[i5].f1968d != null) {
            i6 = 1;
        } else {
            i6 = -1;
            i4 = i5;
            i5 = i4;
        }
        if (z2) {
            i9 -= l;
        }
        int b = (fVar.f1984E[i5].mo2282b() * i6) + m1905a(fVar, i);
        int i11 = i9 + b;
        if (i == 0) {
            l2 = fVar.mo2310k();
        } else {
            l2 = fVar.mo2311l();
        }
        int i12 = l2 * i6;
        Iterator it = fVar.f1984E[i5].f1965a.f2114h.iterator();
        while (it.hasNext()) {
            i10 = Math.max(i10, m1906a(((C0530m) ((C0532o) it.next())).f2100a.f1966b, i, z, i11));
        }
        Iterator it2 = fVar.f1984E[i4].f1965a.f2114h.iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            i13 = Math.max(i13, m1906a(((C0530m) ((C0532o) it2.next())).f2100a.f1966b, i, z, i12 + i11));
        }
        if (z2) {
            i10 -= l;
            i7 = i13 + i3;
        } else {
            if (i == 0) {
                l3 = fVar.mo2310k();
            } else {
                l3 = fVar.mo2311l();
            }
            i7 = i13 + (l3 * i6);
        }
        int i14 = 1;
        if (i == 1) {
            Iterator it3 = fVar.f1980A.f1965a.f2114h.iterator();
            i8 = 0;
            while (it3.hasNext()) {
                C0530m mVar = (C0530m) ((C0532o) it3.next());
                if (i6 == i14) {
                    i8 = Math.max(i8, m1906a(mVar.f2100a.f1966b, i, z, l + i11));
                } else {
                    i8 = Math.max(i8, m1906a(mVar.f2100a.f1966b, i, z, (i3 * i6) + i11));
                }
                i14 = 1;
            }
            if (fVar.f1980A.f1965a.f2114h.size() > 0 && !z2) {
                if (i6 == 1) {
                    i8 += l;
                } else {
                    i8 -= i3;
                }
            }
        } else {
            i8 = 0;
        }
        int max = b + Math.max(i10, Math.max(i7, i8));
        int i15 = i12 + i11;
        if (i6 == -1) {
            i15 = i11;
            i11 = i15;
        }
        if (z) {
            C0528k.m1995a(fVar, i, i11);
            fVar.mo2288a(i11, i15, i);
        } else {
            fVar.f2045t.mo2333a(fVar, i);
            fVar.mo2299d(i11, i);
        }
        if (fVar.mo2305g(i) == C0520f.EnumC0522a.MATCH_CONSTRAINT && fVar.f1990K != 0.0f) {
            fVar.f2045t.mo2333a(fVar, i);
        }
        if (fVar.f1984E[i5].f1968d != null && fVar.f1984E[i4].f1968d != null && fVar.f1984E[i5].f1968d.f1966b == (fVar2 = fVar.f1987H) && fVar.f1984E[i4].f1968d.f1966b == fVar2) {
            fVar.f2045t.mo2333a(fVar, i);
        }
        return max;
    }
}

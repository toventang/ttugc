package androidx.constraintlayout.p026a.p027a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.constraintlayout.a.a.h */
public final class C0524h {

    /* renamed from: a */
    public List<C0520f> f2077a;

    /* renamed from: b */
    int f2078b = -1;

    /* renamed from: c */
    int f2079c = -1;

    /* renamed from: d */
    public boolean f2080d;

    /* renamed from: e */
    public final int[] f2081e = {-1, -1};

    /* renamed from: f */
    List<C0520f> f2082f = new ArrayList();

    /* renamed from: g */
    List<C0520f> f2083g = new ArrayList();

    /* renamed from: h */
    HashSet<C0520f> f2084h = new HashSet<>();

    /* renamed from: i */
    HashSet<C0520f> f2085i = new HashSet<>();

    /* renamed from: j */
    List<C0520f> f2086j = new ArrayList();

    /* renamed from: k */
    List<C0520f> f2087k = new ArrayList();

    static {
        Covode.recordClassIndex(591);
    }

    C0524h(List<C0520f> list) {
        this.f2077a = list;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2332a(androidx.constraintlayout.p026a.p027a.C0520f r8) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p026a.p027a.C0524h.mo2332a(androidx.constraintlayout.a.a.f):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2333a(C0520f fVar, int i) {
        if (i == 0) {
            this.f2084h.add(fVar);
        } else if (i == 1) {
            this.f2085i.add(fVar);
        }
    }

    public C0524h(List<C0520f> list, byte b) {
        this.f2077a = list;
        this.f2080d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2334a(ArrayList<C0520f> arrayList, C0520f fVar) {
        C0520f fVar2;
        if (!fVar.f2018an) {
            arrayList.add(fVar);
            fVar.f2018an = true;
            if (!fVar.mo2307h()) {
                if (fVar instanceof C0527j) {
                    C0527j jVar = (C0527j) fVar;
                    int i = jVar.f2098ay;
                    for (int i2 = 0; i2 < i; i2++) {
                        mo2334a(arrayList, jVar.f2097ax[i2]);
                    }
                }
                int length = fVar.f1984E.length;
                for (int i3 = 0; i3 < length; i3++) {
                    C0515e eVar = fVar.f1984E[i3].f1968d;
                    if (!(eVar == null || (fVar2 = eVar.f1966b) == fVar.f1987H)) {
                        mo2334a(arrayList, fVar2);
                    }
                }
            }
        }
    }
}

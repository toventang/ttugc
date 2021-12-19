package com.airbnb.lottie.p093a.p094a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2031o;
import com.airbnb.lottie.p099e.AbstractC2105f;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p100a.C2059l;
import com.airbnb.lottie.p099e.p101b.AbstractC2064b;
import com.airbnb.lottie.p099e.p101b.C2079n;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.d */
public final class C1994d implements AbstractC1995e, AbstractC2004m, AbstractC2012a.AbstractC2013a, AbstractC2105f {

    /* renamed from: a */
    private final Matrix f5954a;

    /* renamed from: b */
    private final Path f5955b;

    /* renamed from: c */
    private final RectF f5956c;

    /* renamed from: d */
    private final String f5957d;

    /* renamed from: e */
    private final List<AbstractC1993c> f5958e;

    /* renamed from: f */
    private final C2122g f5959f;

    /* renamed from: g */
    private List<AbstractC2004m> f5960g;

    /* renamed from: h */
    private C2031o f5961h;

    static {
        Covode.recordClassIndex(2189);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f5957d;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f5959f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Matrix mo5905d() {
        C2031o oVar = this.f5961h;
        if (oVar != null) {
            return oVar.mo5927a();
        }
        this.f5954a.reset();
        return this.f5954a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List<AbstractC2004m> mo5904c() {
        if (this.f5960g == null) {
            this.f5960g = new ArrayList();
            for (int i = 0; i < this.f5958e.size(); i++) {
                AbstractC1993c cVar = this.f5958e.get(i);
                if (cVar instanceof AbstractC2004m) {
                    this.f5960g.add(cVar);
                }
            }
        }
        return this.f5960g;
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
        this.f5954a.reset();
        C2031o oVar = this.f5961h;
        if (oVar != null) {
            this.f5954a.set(oVar.mo5927a());
        }
        this.f5955b.reset();
        for (int size = this.f5958e.size() - 1; size >= 0; size--) {
            AbstractC1993c cVar = this.f5958e.get(size);
            if (cVar instanceof AbstractC2004m) {
                this.f5955b.addPath(((AbstractC2004m) cVar).mo5906e(), this.f5954a);
            }
        }
        return this.f5955b;
    }

    /* renamed from: a */
    private static C2059l m6316a(List<AbstractC2064b> list) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC2064b bVar = list.get(i);
            if (bVar instanceof C2059l) {
                return (C2059l) bVar;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        C2031o oVar = this.f5961h;
        if (oVar != null) {
            oVar.mo5931a(t, cVar);
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        this.f5954a.set(matrix);
        C2031o oVar = this.f5961h;
        if (oVar != null) {
            this.f5954a.preConcat(oVar.mo5927a());
        }
        this.f5956c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f5958e.size() - 1; size >= 0; size--) {
            AbstractC1993c cVar = this.f5958e.get(size);
            if (cVar instanceof AbstractC1995e) {
                AbstractC1995e eVar = (AbstractC1995e) cVar;
                eVar.mo5897a(this.f5956c, this.f5954a);
                if (C2144d.C2145a.f6479a) {
                    eVar.mo5897a(this.f5956c, this.f5954a);
                    rectF.union(this.f5956c);
                } else if (rectF.isEmpty()) {
                    rectF.set(this.f5956c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f5956c.left), Math.min(rectF.top, this.f5956c.top), Math.max(rectF.right, this.f5956c.right), Math.max(rectF.bottom, this.f5956c.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f5958e.size());
        arrayList.addAll(list);
        for (int size = this.f5958e.size() - 1; size >= 0; size--) {
            AbstractC1993c cVar = this.f5958e.get(size);
            cVar.mo5900a(arrayList, this.f5958e.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public C1994d(C2122g gVar, AbstractC2088a aVar, C2079n nVar) {
        this(gVar, aVar, nVar.f6243a, m6317a(gVar, aVar, nVar.f6244b), m6316a(nVar.f6244b));
    }

    /* renamed from: a */
    private static List<AbstractC1993c> m6317a(C2122g gVar, AbstractC2088a aVar, List<AbstractC2064b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AbstractC1993c a = list.get(i).mo5951a(gVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        this.f5954a.set(matrix);
        C2031o oVar = this.f5961h;
        if (oVar != null) {
            this.f5954a.preConcat(oVar.mo5927a());
            i = (int) ((((((float) this.f5961h.f6101e.mo5918f().intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.f5958e.size() - 1; size >= 0; size--) {
            AbstractC1993c cVar = this.f5958e.get(size);
            if (cVar instanceof AbstractC1995e) {
                ((AbstractC1995e) cVar).mo5896a(canvas, this.f5954a, i);
            }
        }
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        if (eVar.mo5978a(this.f5957d, i)) {
            if (!"__container".equals(this.f5957d)) {
                eVar2 = eVar2.mo5977a(this.f5957d);
                if (eVar.mo5980c(this.f5957d, i)) {
                    list.add(eVar2.mo5976a(this));
                }
            }
            if (eVar.mo5981d(this.f5957d, i)) {
                int b = i + eVar.mo5979b(this.f5957d, i);
                for (int i2 = 0; i2 < this.f5958e.size(); i2++) {
                    AbstractC1993c cVar = this.f5958e.get(i2);
                    if (cVar instanceof AbstractC2105f) {
                        ((AbstractC2105f) cVar).mo5898a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    C1994d(C2122g gVar, AbstractC2088a aVar, String str, List<AbstractC1993c> list, C2059l lVar) {
        this.f5954a = new Matrix();
        this.f5955b = new Path();
        this.f5956c = new RectF();
        this.f5957d = str;
        this.f5959f = gVar;
        this.f5958e = list;
        if (lVar != null) {
            C2031o a = lVar.mo5952a();
            this.f5961h = a;
            a.mo5930a(aVar);
            this.f5961h.mo5929a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC1993c cVar = list.get(size);
            if (cVar instanceof AbstractC2000j) {
                arrayList.add(cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((AbstractC2000j) arrayList.get(size2)).mo5907a(list.listIterator(list.size()));
        }
    }
}

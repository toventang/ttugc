package com.airbnb.lottie.p099e.p102c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.p025c.C0489d;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.c.b */
public final class C2091b extends AbstractC2088a {

    /* renamed from: h */
    private AbstractC2012a<Float, Float> f6297h;

    /* renamed from: i */
    private final List<AbstractC2088a> f6298i = new ArrayList();

    /* renamed from: j */
    private final RectF f6299j = new RectF();

    /* renamed from: k */
    private final RectF f6300k = new RectF();

    static {
        Covode.recordClassIndex(2286);
    }

    /* renamed from: com.airbnb.lottie.e.c.b$1 */
    static /* synthetic */ class C20921 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6301a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 2287(0x8ef, float:3.205E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.c.d$b[] r0 = com.airbnb.lottie.p099e.p102c.C2094d.EnumC2096b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.p099e.p102c.C2091b.C20921.f6301a = r2
                com.airbnb.lottie.e.c.d$b r0 = com.airbnb.lottie.p099e.p102c.C2094d.EnumC2096b.Add     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.p099e.p102c.C2091b.C20921.f6301a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.c.d$b r0 = com.airbnb.lottie.p099e.p102c.C2094d.EnumC2096b.Invert     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p099e.p102c.C2091b.C20921.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m6537a(RectF rectF) {
        if (C2144d.C2145a.f6479a) {
            for (int size = this.f6298i.size() - 1; size >= 0; size--) {
                this.f6299j.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f6298i.get(size).mo5967b(this.f6299j, this.f6271a);
                rectF.union(this.f6299j);
            }
            return;
        }
        this.f6299j.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size2 = this.f6298i.size() - 1; size2 >= 0; size2--) {
            this.f6298i.get(size2).mo5897a(this.f6299j, this.f6271a);
            if (rectF.isEmpty()) {
                rectF.set(this.f6299j);
            } else {
                rectF.set(Math.min(rectF.left, this.f6299j.left), Math.min(rectF.top, this.f6299j.top), Math.max(rectF.right, this.f6299j.right), Math.max(rectF.bottom, this.f6299j.bottom));
            }
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: a */
    public final void mo5963a(float f) {
        super.mo5963a(f);
        if (C2144d.C2145a.f6479a) {
            if (this.f6297h != null) {
                f = ((this.f6297h.mo5918f().floatValue() * this.f6273c.f6308b.f6147k) - this.f6273c.f6308b.f6145i) / (this.f6272b.f6396a.mo5945b() + 0.01f);
            }
            if (this.f6297h == null) {
                f -= this.f6273c.mo5972a();
            }
            if (this.f6273c.f6319m != 0.0f) {
                f /= this.f6273c.f6319m;
            }
            for (int size = this.f6298i.size() - 1; size >= 0; size--) {
                this.f6298i.get(size).mo5963a(f);
            }
            return;
        }
        if (this.f6297h != null) {
            f = ((float) ((long) (this.f6297h.mo5918f().floatValue() * 1000.0f))) / this.f6272b.f6396a.mo5941a();
        }
        if (this.f6273c.f6319m != 0.0f) {
            f /= this.f6273c.f6319m;
        }
        float a = f - this.f6273c.mo5972a();
        for (int size2 = this.f6298i.size() - 1; size2 >= 0; size2--) {
            this.f6298i.get(size2).mo5963a(a);
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        super.mo5897a(rectF, matrix);
        m6537a(rectF);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5967b(RectF rectF, Matrix matrix) {
        super.mo5967b(rectF, matrix);
        m6537a(rectF);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        super.mo5899a(t, cVar);
        if (t != AbstractC2206k.f6591A) {
            return;
        }
        if (cVar != null) {
            this.f6297h = new C2032p(cVar);
            if (C2144d.C2145a.f6479a) {
                this.f6297h.mo5912a(this);
            }
            mo5964a(this.f6297h);
        } else if (C2144d.C2145a.f6479a) {
            AbstractC2012a<Float, Float> aVar = this.f6297h;
            if (aVar != null) {
                aVar.mo5913a((C2204c<Float>) null);
            }
        } else {
            this.f6297h = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5966b(Canvas canvas, Matrix matrix, int i) {
        C2041d.m6462b("CompositionLayer#draw");
        canvas.save();
        this.f6300k.set(0.0f, 0.0f, (float) this.f6273c.f6320n, (float) this.f6273c.f6321o);
        matrix.mapRect(this.f6300k);
        for (int size = this.f6298i.size() - 1; size >= 0; size--) {
            if (this.f6300k.isEmpty() || canvas.clipRect(this.f6300k)) {
                this.f6298i.get(size).mo5896a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C2041d.m6463c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5969b(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        for (int i2 = 0; i2 < this.f6298i.size(); i2++) {
            this.f6298i.get(i2).mo5898a(eVar, i, list, eVar2);
        }
    }

    public C2091b(C2122g gVar, C2094d dVar, List<C2094d> list, C2044e eVar) {
        super(gVar, dVar);
        int i;
        AbstractC2088a aVar;
        C2049b bVar = dVar.f6324r;
        if (bVar != null) {
            AbstractC2012a<Float, Float> a = bVar.mo5947a();
            this.f6297h = a;
            mo5964a(a);
            this.f6297h.mo5912a(this);
        } else {
            this.f6297h = null;
        }
        C0489d dVar2 = new C0489d(eVar.f6143g.size());
        int size = list.size() - 1;
        AbstractC2088a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C2094d dVar3 = list.get(size);
            AbstractC2088a a2 = AbstractC2088a.m6511a(dVar3, gVar, eVar);
            if (a2 != null) {
                dVar2.mo2083b(a2.f6273c.f6310d, a2);
                if (aVar2 != null) {
                    aVar2.f6275e = a2;
                    aVar2 = null;
                } else {
                    this.f6298i.add(0, a2);
                    int i2 = C20921.f6301a[dVar3.f6326t.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = a2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar2.mo2080b(); i++) {
            AbstractC2088a aVar3 = (AbstractC2088a) dVar2.mo2077a(dVar2.mo2081b(i));
            if (!(aVar3 == null || (aVar = (AbstractC2088a) dVar2.mo2077a(aVar3.f6273c.f6312f)) == null)) {
                aVar3.f6276f = aVar;
            }
        }
    }
}

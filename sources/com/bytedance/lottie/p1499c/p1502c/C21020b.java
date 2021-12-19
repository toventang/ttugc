package com.bytedance.lottie.p1499c.p1502c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.c.b */
public final class C21020b extends AbstractC21017a {

    /* renamed from: g */
    private AbstractC20954a<Float, Float> f49854g;

    /* renamed from: h */
    private final List<AbstractC21017a> f49855h = new ArrayList();

    /* renamed from: i */
    private final RectF f49856i = new RectF();

    /* renamed from: j */
    private final RectF f49857j = new RectF();

    static {
        Covode.recordClassIndex(24636);
    }

    /* renamed from: com.bytedance.lottie.c.c.b$1 */
    static /* synthetic */ class C210211 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49858a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 24637(0x603d, float:3.4524E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.c.d$b[] r0 = com.bytedance.lottie.p1499c.p1502c.C21023d.EnumC21025b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.p1499c.p1502c.C21020b.C210211.f49858a = r2
                com.bytedance.lottie.c.c.d$b r0 = com.bytedance.lottie.p1499c.p1502c.C21023d.EnumC21025b.Add     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.p1499c.p1502c.C21020b.C210211.f49858a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.c.d$b r0 = com.bytedance.lottie.p1499c.p1502c.C21023d.EnumC21025b.Invert     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1499c.p1502c.C21020b.C210211.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final void mo34495a(float f) {
        super.mo34495a(f);
        if (this.f49854g != null) {
            f = ((float) ((long) (this.f49854g.mo34470d().floatValue() * 1000.0f))) / this.f49829b.f50032a.mo34559a();
        }
        if (this.f49830c.f49875m != 0.0f) {
            f /= this.f49830c.f49875m;
        }
        C21023d dVar = this.f49830c;
        float b = f - (dVar.f49876n / dVar.f49864b.mo34564b());
        for (int size = this.f49855h.size() - 1; size >= 0; size--) {
            this.f49855h.get(size).mo34495a(b);
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        super.mo34455a(t, cVar);
        if (t != AbstractC21121m.f50098w) {
            return;
        }
        if (cVar == null) {
            this.f49854g = null;
            return;
        }
        C20970p pVar = new C20970p(cVar);
        this.f49854g = pVar;
        mo34496a(pVar);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        super.mo34453a(rectF, matrix);
        this.f49856i.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f49855h.size() - 1; size >= 0; size--) {
            this.f49855h.get(size).mo34453a(this.f49856i, this.f49828a);
            if (rectF.isEmpty()) {
                rectF.set(this.f49856i);
            } else {
                rectF.set(Math.min(rectF.left, this.f49856i.left), Math.min(rectF.top, this.f49856i.top), Math.max(rectF.right, this.f49856i.right), Math.max(rectF.bottom, this.f49856i.bottom));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34498b(Canvas canvas, Matrix matrix, int i) {
        C21044e.m39621b("CompositionLayer#draw");
        canvas.save();
        this.f49857j.set(0.0f, 0.0f, (float) this.f49830c.f49877o, (float) this.f49830c.f49878p);
        matrix.mapRect(this.f49857j);
        for (int size = this.f49855h.size() - 1; size >= 0; size--) {
            if (this.f49857j.isEmpty() || canvas.clipRect(this.f49857j)) {
                this.f49855h.get(size).mo34452a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C21044e.m39622c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34499b(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        for (int i2 = 0; i2 < this.f49855h.size(); i2++) {
            this.f49855h.get(i2).mo34454a(eVar, i, list, eVar2);
        }
    }

    public C21020b(C21106i iVar, C21023d dVar, List<C21023d> list, C21088g gVar) {
        super(iVar, dVar);
        int i;
        AbstractC21017a aVar;
        C20978b bVar = dVar.f49881s;
        if (bVar != null) {
            AbstractC20954a<Float, Float> a = bVar.mo34480a();
            this.f49854g = a;
            mo34496a(a);
            this.f49854g.mo34466a(this);
        } else {
            this.f49854g = null;
        }
        C0489d dVar2 = new C0489d(gVar.f49975g.size());
        int size = list.size() - 1;
        AbstractC21017a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C21023d dVar3 = list.get(size);
            AbstractC21017a a2 = AbstractC21017a.m39556a(dVar3, iVar, gVar);
            if (a2 != null) {
                dVar2.mo2083b(a2.f49830c.f49866d, a2);
                if (aVar2 != null) {
                    aVar2.f49831d = a2;
                    aVar2 = null;
                } else {
                    this.f49855h.add(0, a2);
                    int i2 = C210211.f49858a[dVar3.f49883u.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = a2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar2.mo2080b(); i++) {
            AbstractC21017a aVar3 = (AbstractC21017a) dVar2.mo2077a(dVar2.mo2081b(i));
            if (!(aVar3 == null || (aVar = (AbstractC21017a) dVar2.mo2077a(aVar3.f49830c.f49868f)) == null)) {
                aVar3.f49832e = aVar;
            }
        }
    }
}

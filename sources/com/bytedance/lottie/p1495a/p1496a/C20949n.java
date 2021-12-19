package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C21004j;
import com.bytedance.lottie.p1499c.p1501b.C21014q;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.n */
public final class C20949n implements AbstractC20943j, AbstractC20946l, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final Path f49622a = new Path();

    /* renamed from: b */
    private final RectF f49623b = new RectF();

    /* renamed from: c */
    private final String f49624c;

    /* renamed from: d */
    private final C21106i f49625d;

    /* renamed from: e */
    private final AbstractC20954a<?, PointF> f49626e;

    /* renamed from: f */
    private final AbstractC20954a<?, PointF> f49627f;

    /* renamed from: g */
    private final AbstractC20954a<?, Float> f49628g;

    /* renamed from: h */
    private C20953r f49629h;

    /* renamed from: i */
    private boolean f49630i;

    static {
        Covode.recordClassIndex(24565);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49624c;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49630i = false;
        this.f49625d.invalidateSelf();
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        float floatValue;
        if (this.f49630i) {
            return this.f49622a;
        }
        this.f49622a.reset();
        PointF d = this.f49627f.mo34470d();
        float f = d.x / 2.0f;
        float f2 = d.y / 2.0f;
        AbstractC20954a<?, Float> aVar = this.f49628g;
        if (aVar == null) {
            floatValue = 0.0f;
        } else {
            floatValue = aVar.mo34470d().floatValue();
        }
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF d2 = this.f49626e.mo34470d();
        this.f49622a.moveTo(d2.x + f, (d2.y - f2) + floatValue);
        this.f49622a.lineTo(d2.x + f, (d2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            float f3 = floatValue * 2.0f;
            this.f49623b.set((d2.x + f) - f3, (d2.y + f2) - f3, d2.x + f, d2.y + f2);
            this.f49622a.arcTo(this.f49623b, 0.0f, 90.0f, false);
        }
        this.f49622a.lineTo((d2.x - f) + floatValue, d2.y + f2);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.f49623b.set(d2.x - f, (d2.y + f2) - f4, (d2.x - f) + f4, d2.y + f2);
            this.f49622a.arcTo(this.f49623b, 90.0f, 90.0f, false);
        }
        this.f49622a.lineTo(d2.x - f, (d2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.f49623b.set(d2.x - f, d2.y - f2, (d2.x - f) + f5, (d2.y - f2) + f5);
            this.f49622a.arcTo(this.f49623b, 180.0f, 90.0f, false);
        }
        this.f49622a.lineTo((d2.x + f) - floatValue, d2.y - f2);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.f49623b.set((d2.x + f) - f6, d2.y - f2, d2.x + f, (d2.y - f2) + f6);
            this.f49622a.arcTo(this.f49623b, 270.0f, 90.0f, false);
        }
        this.f49622a.close();
        C21087h.m39718a(this.f49622a, this.f49629h);
        this.f49630i = true;
        return this.f49622a;
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC20935b bVar = list.get(i);
            if (bVar instanceof C20953r) {
                C20953r rVar = (C20953r) bVar;
                if (rVar.f49650a == C21014q.EnumC21015a.Simultaneously) {
                    this.f49629h = rVar;
                    rVar.mo34462a(this);
                }
            }
        }
    }

    public C20949n(C21106i iVar, AbstractC21017a aVar, C21004j jVar) {
        this.f49624c = jVar.f49784a;
        this.f49625d = iVar;
        AbstractC20954a<PointF, PointF> a = jVar.f49785b.mo34480a();
        this.f49626e = a;
        AbstractC20954a<PointF, PointF> a2 = jVar.f49786c.mo34480a();
        this.f49627f = a2;
        AbstractC20954a<Float, Float> a3 = jVar.f49787d.mo34480a();
        this.f49628g = a3;
        aVar.mo34496a(a);
        aVar.mo34496a(a2);
        aVar.mo34496a(a3);
        a.mo34466a(this);
        a2.mo34466a(this);
        a3.mo34466a(this);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }
}

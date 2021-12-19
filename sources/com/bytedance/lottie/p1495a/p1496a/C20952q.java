package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1499c.p1501b.C21010p;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1506g.C21091c;

/* renamed from: com.bytedance.lottie.a.a.q */
public final class C20952q extends AbstractC20933a {

    /* renamed from: b */
    private final AbstractC21017a f49646b;

    /* renamed from: c */
    private final String f49647c;

    /* renamed from: d */
    private final AbstractC20954a<Integer, Integer> f49648d;

    /* renamed from: e */
    private AbstractC20954a<ColorFilter, ColorFilter> f49649e;

    static {
        Covode.recordClassIndex(24568);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49647c;
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20933a, com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        super.mo34455a(t, cVar);
        if (t == AbstractC21121m.f50077b) {
            this.f49648d.mo34467a(cVar);
        } else if (t != AbstractC21121m.f50099x) {
        } else {
            if (cVar == null) {
                this.f49649e = null;
                return;
            }
            C20970p pVar = new C20970p(cVar);
            this.f49649e = pVar;
            pVar.mo34466a(this);
            this.f49646b.mo34496a(this.f49648d);
        }
    }

    public C20952q(C21106i iVar, AbstractC21017a aVar, C21010p pVar) {
        super(iVar, aVar, pVar.f49811g.toPaintCap(), pVar.f49812h.toPaintJoin(), pVar.f49813i, pVar.f49809e, pVar.f49810f, pVar.f49807c, pVar.f49806b);
        this.f49646b = aVar;
        this.f49647c = pVar.f49805a;
        AbstractC20954a<Integer, Integer> a = pVar.f49808d.mo34480a();
        this.f49648d = a;
        a.mo34466a(this);
        aVar.mo34496a(a);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20933a, com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        this.f49534a.setColor(this.f49648d.mo34470d().intValue());
        if (this.f49649e != null) {
            this.f49534a.setColorFilter(this.f49649e.mo34470d());
        }
        super.mo34452a(canvas, matrix, i);
    }
}

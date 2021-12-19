package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C21007m;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.f */
public final class C20939f implements AbstractC20937d, AbstractC20943j, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final Path f49566a;

    /* renamed from: b */
    private final Paint f49567b = new Paint(1);

    /* renamed from: c */
    private final AbstractC21017a f49568c;

    /* renamed from: d */
    private final String f49569d;

    /* renamed from: e */
    private final List<AbstractC20946l> f49570e = new ArrayList();

    /* renamed from: f */
    private final AbstractC20954a<Integer, Integer> f49571f;

    /* renamed from: g */
    private final AbstractC20954a<Integer, Integer> f49572g;

    /* renamed from: h */
    private AbstractC20954a<ColorFilter, ColorFilter> f49573h;

    /* renamed from: i */
    private final C21106i f49574i;

    static {
        Covode.recordClassIndex(24555);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49569d;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49574i.invalidateSelf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC20935b bVar = list2.get(i);
            if (bVar instanceof AbstractC20946l) {
                this.f49570e.add(bVar);
            }
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        this.f49566a.reset();
        for (int i = 0; i < this.f49570e.size(); i++) {
            this.f49566a.addPath(this.f49570e.get(i).mo34460e(), matrix);
        }
        this.f49566a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        if (t == AbstractC21121m.f50076a) {
            this.f49571f.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50079d) {
            this.f49572g.mo34467a(cVar);
        } else if (t != AbstractC21121m.f50099x) {
        } else {
            if (cVar == null) {
                this.f49573h = null;
                return;
            }
            C20970p pVar = new C20970p(cVar);
            this.f49573h = pVar;
            pVar.mo34466a(this);
            this.f49568c.mo34496a(this.f49573h);
        }
    }

    public C20939f(C21106i iVar, AbstractC21017a aVar, C21007m mVar) {
        Path path = new Path();
        this.f49566a = path;
        this.f49568c = aVar;
        this.f49569d = mVar.f49796b;
        this.f49574i = iVar;
        if (mVar.f49797c == null || mVar.f49798d == null) {
            this.f49571f = null;
            this.f49572g = null;
            return;
        }
        path.setFillType(mVar.f49795a);
        AbstractC20954a<Integer, Integer> a = mVar.f49797c.mo34480a();
        this.f49571f = a;
        a.mo34466a(this);
        aVar.mo34496a(a);
        AbstractC20954a<Integer, Integer> a2 = mVar.f49798d.mo34480a();
        this.f49572g = a2;
        a2.mo34466a(this);
        aVar.mo34496a(a2);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        C21044e.m39621b("FillContent#draw");
        this.f49567b.setColor(this.f49571f.mo34470d().intValue());
        this.f49567b.setAlpha(C21084f.m39707a((int) ((((((float) i) / 255.0f) * ((float) this.f49572g.mo34470d().intValue())) / 100.0f) * 255.0f)));
        AbstractC20954a<ColorFilter, ColorFilter> aVar = this.f49573h;
        if (aVar != null) {
            this.f49567b.setColorFilter(aVar.mo34470d());
        }
        this.f49566a.reset();
        for (int i2 = 0; i2 < this.f49570e.size(); i2++) {
            this.f49566a.addPath(this.f49570e.get(i2).mo34460e(), matrix);
        }
        canvas.drawPath(this.f49566a, this.f49567b);
        C21044e.m39622c("FillContent#draw");
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }
}

package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C20994c;
import com.bytedance.lottie.p1499c.p1501b.C20995d;
import com.bytedance.lottie.p1499c.p1501b.EnumC20997f;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.g */
public final class C20940g implements AbstractC20937d, AbstractC20943j, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final String f49575a;

    /* renamed from: b */
    private final AbstractC21017a f49576b;

    /* renamed from: c */
    private final C0489d<LinearGradient> f49577c = new C0489d<>();

    /* renamed from: d */
    private final C0489d<RadialGradient> f49578d = new C0489d<>();

    /* renamed from: e */
    private final Matrix f49579e = new Matrix();

    /* renamed from: f */
    private final Path f49580f;

    /* renamed from: g */
    private final Paint f49581g;

    /* renamed from: h */
    private final RectF f49582h;

    /* renamed from: i */
    private final List<AbstractC20946l> f49583i;

    /* renamed from: j */
    private final EnumC20997f f49584j;

    /* renamed from: k */
    private final AbstractC20954a<C20994c, C20994c> f49585k;

    /* renamed from: l */
    private final AbstractC20954a<Integer, Integer> f49586l;

    /* renamed from: m */
    private final AbstractC20954a<PointF, PointF> f49587m;

    /* renamed from: n */
    private final AbstractC20954a<PointF, PointF> f49588n;

    /* renamed from: o */
    private AbstractC20954a<ColorFilter, ColorFilter> f49589o;

    /* renamed from: p */
    private final C21106i f49590p;

    /* renamed from: q */
    private final int f49591q;

    static {
        Covode.recordClassIndex(24556);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49575a;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49590p.invalidateSelf();
    }

    /* renamed from: c */
    private int m39442c() {
        int i;
        int round = Math.round(this.f49587m.f49658c * ((float) this.f49591q));
        int round2 = Math.round(this.f49588n.f49658c * ((float) this.f49591q));
        int round3 = Math.round(this.f49585k.f49658c * ((float) this.f49591q));
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        if (t != AbstractC21121m.f50099x) {
            return;
        }
        if (cVar == null) {
            this.f49589o = null;
            return;
        }
        C20970p pVar = new C20970p(cVar);
        this.f49589o = pVar;
        pVar.mo34466a(this);
        this.f49576b.mo34496a(this.f49589o);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        this.f49580f.reset();
        for (int i = 0; i < this.f49583i.size(); i++) {
            this.f49580f.addPath(this.f49583i.get(i).mo34460e(), matrix);
        }
        this.f49580f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC20935b bVar = list2.get(i);
            if (bVar instanceof AbstractC20946l) {
                this.f49583i.add(bVar);
            }
        }
    }

    public C20940g(C21106i iVar, AbstractC21017a aVar, C20995d dVar) {
        Path path = new Path();
        this.f49580f = path;
        this.f49581g = new Paint(1);
        this.f49582h = new RectF();
        this.f49583i = new ArrayList();
        this.f49576b = aVar;
        this.f49575a = dVar.f49750g;
        this.f49590p = iVar;
        this.f49584j = dVar.f49744a;
        path.setFillType(dVar.f49745b);
        this.f49591q = (int) (iVar.f50032a.mo34559a() / 32.0f);
        AbstractC20954a<C20994c, C20994c> a = dVar.f49746c.mo34480a();
        this.f49585k = a;
        a.mo34466a(this);
        aVar.mo34496a(a);
        AbstractC20954a<Integer, Integer> a2 = dVar.f49747d.mo34480a();
        this.f49586l = a2;
        a2.mo34466a(this);
        aVar.mo34496a(a2);
        AbstractC20954a<PointF, PointF> a3 = dVar.f49748e.mo34480a();
        this.f49587m = a3;
        a3.mo34466a(this);
        aVar.mo34496a(a3);
        AbstractC20954a<PointF, PointF> a4 = dVar.f49749f.mo34480a();
        this.f49588n = a4;
        a4.mo34466a(this);
        aVar.mo34496a(a4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: androidx.c.d<android.graphics.RadialGradient> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: androidx.c.d<android.graphics.LinearGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        RadialGradient a;
        C21044e.m39621b("GradientFillContent#draw");
        this.f49580f.reset();
        for (int i2 = 0; i2 < this.f49583i.size(); i2++) {
            this.f49580f.addPath(this.f49583i.get(i2).mo34460e(), matrix);
        }
        this.f49580f.computeBounds(this.f49582h, false);
        if (this.f49584j == EnumC20997f.Linear) {
            long c = (long) m39442c();
            a = this.f49577c.mo2078a(c, null);
            if (a == null) {
                PointF d = this.f49587m.mo34470d();
                PointF d2 = this.f49588n.mo34470d();
                C20994c d3 = this.f49585k.mo34470d();
                a = new LinearGradient(d.x, d.y, d2.x, d2.y, d3.f49743b, d3.f49742a, Shader.TileMode.CLAMP);
                this.f49577c.mo2083b(c, a);
            }
        } else {
            long c2 = (long) m39442c();
            a = this.f49578d.mo2077a(c2);
            if (a == null) {
                PointF d4 = this.f49587m.mo34470d();
                PointF d5 = this.f49588n.mo34470d();
                C20994c d6 = this.f49585k.mo34470d();
                int[] iArr = d6.f49743b;
                float[] fArr = d6.f49742a;
                float f = d4.x;
                float f2 = d4.y;
                a = new RadialGradient(f, f2, (float) Math.hypot((double) (d5.x - f), (double) (d5.y - f2)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f49578d.mo2083b(c2, a);
            }
        }
        this.f49579e.set(matrix);
        a.setLocalMatrix(this.f49579e);
        this.f49581g.setShader(a);
        AbstractC20954a<ColorFilter, ColorFilter> aVar = this.f49589o;
        if (aVar != null) {
            this.f49581g.setColorFilter(aVar.mo34470d());
        }
        this.f49581g.setAlpha(C21084f.m39707a((int) ((((((float) i) / 255.0f) * ((float) this.f49586l.mo34470d().intValue())) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f49580f, this.f49581g);
        C21044e.m39622c("GradientFillContent#draw");
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }
}

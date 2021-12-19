package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1501b.C21014q;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.a */
public abstract class AbstractC20933a implements AbstractC20937d, AbstractC20943j, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    final Paint f49534a;

    /* renamed from: b */
    private final PathMeasure f49535b = new PathMeasure();

    /* renamed from: c */
    private final Path f49536c = new Path();

    /* renamed from: d */
    private final Path f49537d = new Path();

    /* renamed from: e */
    private final RectF f49538e = new RectF();

    /* renamed from: f */
    private final C21106i f49539f;

    /* renamed from: g */
    private final AbstractC21017a f49540g;

    /* renamed from: h */
    private final List<C20934a> f49541h = new ArrayList();

    /* renamed from: i */
    private final float[] f49542i;

    /* renamed from: j */
    private final AbstractC20954a<?, Float> f49543j;

    /* renamed from: k */
    private final AbstractC20954a<?, Integer> f49544k;

    /* renamed from: l */
    private final List<AbstractC20954a<?, Float>> f49545l;

    /* renamed from: m */
    private final AbstractC20954a<?, Float> f49546m;

    /* renamed from: n */
    private AbstractC20954a<ColorFilter, ColorFilter> f49547n;

    static {
        Covode.recordClassIndex(24549);
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49539f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.a.a.a$a */
    public static final class C20934a {

        /* renamed from: a */
        public final List<AbstractC20946l> f49548a;

        /* renamed from: b */
        public final C20953r f49549b;

        static {
            Covode.recordClassIndex(24550);
        }

        private C20934a(C20953r rVar) {
            this.f49548a = new ArrayList();
            this.f49549b = rVar;
        }

        /* synthetic */ C20934a(C20953r rVar, byte b) {
            this(rVar);
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public <T> void mo34455a(T t, C21091c<T> cVar) {
        if (t == AbstractC21121m.f50079d) {
            this.f49544k.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50086k) {
            this.f49543j.mo34467a(cVar);
        } else if (t != AbstractC21121m.f50099x) {
        } else {
            if (cVar == null) {
                this.f49547n = null;
                return;
            }
            C20970p pVar = new C20970p(cVar);
            this.f49547n = pVar;
            pVar.mo34466a(this);
            this.f49540g.mo34496a(this.f49547n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        C20934a aVar = null;
        C20953r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC20935b bVar = list.get(size);
            if (bVar instanceof C20953r) {
                C20953r rVar2 = (C20953r) bVar;
                if (rVar2.f49650a == C21014q.EnumC21015a.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.mo34462a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            AbstractC20935b bVar2 = list2.get(size2);
            if (bVar2 instanceof C20953r) {
                C20953r rVar3 = (C20953r) bVar2;
                if (rVar3.f49650a == C21014q.EnumC21015a.Individually) {
                    if (aVar != null) {
                        this.f49541h.add(aVar);
                    }
                    aVar = new C20934a(rVar3, (byte) 0);
                    rVar3.mo34462a(this);
                }
            }
            if (bVar2 instanceof AbstractC20946l) {
                if (aVar == null) {
                    aVar = new C20934a(rVar, (byte) 0);
                }
                aVar.f49548a.add(bVar2);
            }
        }
        if (aVar != null) {
            this.f49541h.add(aVar);
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        C21044e.m39621b("StrokeContent#getBounds");
        this.f49536c.reset();
        for (int i = 0; i < this.f49541h.size(); i++) {
            C20934a aVar = this.f49541h.get(i);
            for (int i2 = 0; i2 < aVar.f49548a.size(); i2++) {
                this.f49536c.addPath(aVar.f49548a.get(i2).mo34460e(), matrix);
            }
        }
        this.f49536c.computeBounds(this.f49538e, false);
        float floatValue = this.f49543j.mo34470d().floatValue();
        RectF rectF2 = this.f49538e;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, this.f49538e.top - f, this.f49538e.right + f, this.f49538e.bottom + f);
        rectF.set(this.f49538e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C21044e.m39622c("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m39406a(Canvas canvas, C20934a aVar, Matrix matrix) {
        float f;
        C21044e.m39621b("StrokeContent#applyTrimPath");
        if (aVar.f49549b == null) {
            C21044e.m39622c("StrokeContent#applyTrimPath");
            return;
        }
        this.f49536c.reset();
        for (int size = aVar.f49548a.size() - 1; size >= 0; size--) {
            this.f49536c.addPath(aVar.f49548a.get(size).mo34460e(), matrix);
        }
        this.f49535b.setPath(this.f49536c, false);
        float length = this.f49535b.getLength();
        while (this.f49535b.nextContour()) {
            length += this.f49535b.getLength();
        }
        float floatValue = (aVar.f49549b.f49653d.mo34470d().floatValue() * length) / 360.0f;
        float floatValue2 = ((aVar.f49549b.f49651b.mo34470d().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((aVar.f49549b.f49652c.mo34470d().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = aVar.f49548a.size() - 1; size2 >= 0; size2--) {
            this.f49537d.set(aVar.f49548a.get(size2).mo34460e());
            this.f49537d.transform(matrix);
            this.f49535b.setPath(this.f49537d, false);
            float length2 = this.f49535b.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    if (floatValue2 > length) {
                        f = (floatValue2 - length) / length2;
                    } else {
                        f = 0.0f;
                    }
                    f3 = Math.min(f4 / length2, 1.0f);
                    C21087h.m39717a(this.f49537d, f, f3, 0.0f);
                    canvas.drawPath(this.f49537d, this.f49534a);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    if (floatValue2 < f2) {
                        f = 0.0f;
                    } else {
                        f = (floatValue2 - f2) / length2;
                    }
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    C21087h.m39717a(this.f49537d, f, f3, 0.0f);
                    canvas.drawPath(this.f49537d, this.f49534a);
                } else {
                    canvas.drawPath(this.f49537d, this.f49534a);
                }
            }
            f2 += length2;
        }
        C21044e.m39622c("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public void mo34452a(Canvas canvas, Matrix matrix, int i) {
        C21044e.m39621b("StrokeContent#draw");
        this.f49534a.setAlpha(C21084f.m39707a((int) ((((((float) i) / 255.0f) * ((float) this.f49544k.mo34470d().intValue())) / 100.0f) * 255.0f)));
        this.f49534a.setStrokeWidth(this.f49543j.mo34470d().floatValue() * C21087h.m39716a(matrix));
        float f = 0.0f;
        if (this.f49534a.getStrokeWidth() <= 0.0f) {
            C21044e.m39622c("StrokeContent#draw");
            return;
        }
        C21044e.m39621b("StrokeContent#applyDashPattern");
        if (this.f49545l.isEmpty()) {
            C21044e.m39622c("StrokeContent#applyDashPattern");
        } else {
            float a = C21087h.m39716a(matrix);
            for (int i2 = 0; i2 < this.f49545l.size(); i2++) {
                this.f49542i[i2] = this.f49545l.get(i2).mo34470d().floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr = this.f49542i;
                    if (fArr[i2] < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.f49542i;
                    if (fArr2[i2] < 0.1f) {
                        fArr2[i2] = 0.1f;
                    }
                }
                float[] fArr3 = this.f49542i;
                fArr3[i2] = fArr3[i2] * a;
            }
            AbstractC20954a<?, Float> aVar = this.f49546m;
            if (aVar != null) {
                f = aVar.mo34470d().floatValue();
            }
            this.f49534a.setPathEffect(new DashPathEffect(this.f49542i, f));
            C21044e.m39622c("StrokeContent#applyDashPattern");
        }
        AbstractC20954a<ColorFilter, ColorFilter> aVar2 = this.f49547n;
        if (aVar2 != null) {
            this.f49534a.setColorFilter(aVar2.mo34470d());
        }
        for (int i3 = 0; i3 < this.f49541h.size(); i3++) {
            C20934a aVar3 = this.f49541h.get(i3);
            if (aVar3.f49549b != null) {
                m39406a(canvas, aVar3, matrix);
            } else {
                C21044e.m39621b("StrokeContent#buildPath");
                this.f49536c.reset();
                for (int size = aVar3.f49548a.size() - 1; size >= 0; size--) {
                    this.f49536c.addPath(aVar3.f49548a.get(size).mo34460e(), matrix);
                }
                C21044e.m39622c("StrokeContent#buildPath");
                C21044e.m39621b("StrokeContent#drawPath");
                canvas.drawPath(this.f49536c, this.f49534a);
                C21044e.m39622c("StrokeContent#drawPath");
            }
        }
        C21044e.m39622c("StrokeContent#draw");
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }

    AbstractC20933a(C21106i iVar, AbstractC21017a aVar, Paint.Cap cap, Paint.Join join, float f, C20980d dVar, C20978b bVar, List<C20978b> list, C20978b bVar2) {
        Paint paint = new Paint(1);
        this.f49534a = paint;
        this.f49539f = iVar;
        this.f49540g = aVar;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        this.f49544k = dVar.mo34480a();
        this.f49543j = bVar.mo34480a();
        if (bVar2 == null) {
            this.f49546m = null;
        } else {
            this.f49546m = bVar2.mo34480a();
        }
        this.f49545l = new ArrayList(list.size());
        this.f49542i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f49545l.add(list.get(i).mo34480a());
        }
        aVar.mo34496a(this.f49544k);
        aVar.mo34496a(this.f49543j);
        for (int i2 = 0; i2 < this.f49545l.size(); i2++) {
            aVar.mo34496a(this.f49545l.get(i2));
        }
        AbstractC20954a<?, Float> aVar2 = this.f49546m;
        if (aVar2 != null) {
            aVar.mo34496a(aVar2);
        }
        this.f49544k.mo34466a(this);
        this.f49543j.mo34466a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f49545l.get(i3).mo34466a(this);
        }
        AbstractC20954a<?, Float> aVar3 = this.f49546m;
        if (aVar3 != null) {
            aVar3.mo34466a(this);
        }
    }
}

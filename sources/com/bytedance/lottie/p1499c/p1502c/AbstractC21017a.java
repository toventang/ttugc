package com.bytedance.lottie.p1499c.p1502c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20937d;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20957c;
import com.bytedance.lottie.p1495a.p1497b.C20961g;
import com.bytedance.lottie.p1495a.p1497b.C20969o;
import com.bytedance.lottie.p1499c.AbstractC21034f;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C20998g;
import com.bytedance.lottie.p1499c.p1501b.C21006l;
import com.bytedance.lottie.p1499c.p1502c.C21023d;
import com.bytedance.lottie.p1506g.C21091c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.c.a */
public abstract class AbstractC21017a implements AbstractC20937d, AbstractC20954a.AbstractC20955a, AbstractC21034f {

    /* renamed from: a */
    final Matrix f49828a;

    /* renamed from: b */
    final C21106i f49829b;

    /* renamed from: c */
    public final C21023d f49830c;

    /* renamed from: d */
    public AbstractC21017a f49831d;

    /* renamed from: e */
    public AbstractC21017a f49832e;

    /* renamed from: f */
    final C20969o f49833f;

    /* renamed from: g */
    private final Path f49834g = new Path();

    /* renamed from: h */
    private final Matrix f49835h = new Matrix();

    /* renamed from: i */
    private final Paint f49836i;

    /* renamed from: j */
    private final Paint f49837j;

    /* renamed from: k */
    private final Paint f49838k;

    /* renamed from: l */
    private final Paint f49839l;

    /* renamed from: m */
    private final Paint f49840m;

    /* renamed from: n */
    private final RectF f49841n;

    /* renamed from: o */
    private final RectF f49842o;

    /* renamed from: p */
    private final RectF f49843p;

    /* renamed from: q */
    private final RectF f49844q;

    /* renamed from: r */
    private final String f49845r;

    /* renamed from: s */
    private C20961g f49846s;

    /* renamed from: t */
    private List<AbstractC21017a> f49847t;

    /* renamed from: u */
    private final List<AbstractC20954a<?, ?>> f49848u;

    /* renamed from: v */
    private boolean f49849v;

    static {
        Covode.recordClassIndex(24633);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo34498b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34499b(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
    }

    /* renamed from: a */
    public final void mo34497a(boolean z) {
        if (z != this.f49849v) {
            this.f49849v = z;
            this.f49829b.invalidateSelf();
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public <T> void mo34455a(T t, C21091c<T> cVar) {
        this.f49833f.mo34475a(t, cVar);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        if (eVar.mo34505a(this.f49830c.f49865c, i)) {
            if (!"__container".equals(this.f49830c.f49865c)) {
                eVar2 = eVar2.mo34504a(this.f49830c.f49865c);
                if (eVar.mo34507c(this.f49830c.f49865c, i)) {
                    list.add(eVar2.mo34503a(this));
                }
            }
            if (eVar.mo34508d(this.f49830c.f49865c, i)) {
                mo34499b(eVar, i + eVar.mo34506b(this.f49830c.f49865c, i), list, eVar2);
            }
        }
    }

    /* renamed from: c */
    private boolean m39562c() {
        if (this.f49831d != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49829b.invalidateSelf();
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49830c.f49865c;
    }

    /* renamed from: d */
    private boolean m39563d() {
        C20961g gVar = this.f49846s;
        if (gVar == null || gVar.f49672a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.c.c.a$2 */
    public static /* synthetic */ class C210192 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49852a;

        /* renamed from: b */
        static final /* synthetic */ int[] f49853b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0073 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1499c.p1502c.AbstractC21017a.C210192.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m39560b(float f) {
        this.f49829b.f50032a.f49969a.mo34627a(this.f49830c.f49865c, f);
    }

    /* renamed from: a */
    private void m39557a(Canvas canvas) {
        C21044e.m39621b("Layer#clearLayer");
        canvas.drawRect(this.f49841n.left - 1.0f, this.f49841n.top - 1.0f, this.f49841n.right + 1.0f, this.f49841n.bottom + 1.0f, this.f49840m);
        C21044e.m39622c("Layer#clearLayer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34495a(float f) {
        C20969o oVar = this.f49833f;
        oVar.f49686a.mo34465a(f);
        oVar.f49687b.mo34465a(f);
        oVar.f49688c.mo34465a(f);
        oVar.f49689d.mo34465a(f);
        oVar.f49690e.mo34465a(f);
        if (oVar.f49691f != null) {
            oVar.f49691f.mo34465a(f);
        }
        if (oVar.f49692g != null) {
            oVar.f49692g.mo34465a(f);
        }
        if (this.f49846s != null) {
            for (int i = 0; i < this.f49846s.f49672a.size(); i++) {
                this.f49846s.f49672a.get(i).mo34465a(f);
            }
        }
        if (this.f49830c.f49875m != 0.0f) {
            f /= this.f49830c.f49875m;
        }
        AbstractC21017a aVar = this.f49831d;
        if (aVar != null) {
            this.f49831d.mo34495a(aVar.f49830c.f49875m * f);
        }
        for (int i2 = 0; i2 < this.f49848u.size(); i2++) {
            this.f49848u.get(i2).mo34465a(f);
        }
    }

    /* renamed from: a */
    public final void mo34496a(AbstractC20954a<?, ?> aVar) {
        this.f49848u.add(aVar);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public void mo34453a(RectF rectF, Matrix matrix) {
        this.f49828a.set(matrix);
        this.f49828a.preConcat(this.f49833f.mo34471a());
    }

    /* renamed from: b */
    private void m39561b(RectF rectF, Matrix matrix) {
        this.f49842o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m39563d()) {
            int size = this.f49846s.f49674c.size();
            for (int i = 0; i < size; i++) {
                this.f49834g.set(this.f49846s.f49672a.get(i).mo34470d());
                this.f49834g.transform(matrix);
                int i2 = C210192.f49853b[this.f49846s.f49674c.get(i).f49766a.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    this.f49834g.computeBounds(this.f49844q, false);
                    if (i == 0) {
                        this.f49842o.set(this.f49844q);
                    } else {
                        RectF rectF2 = this.f49842o;
                        rectF2.set(Math.min(rectF2.left, this.f49844q.left), Math.min(this.f49842o.top, this.f49844q.top), Math.max(this.f49842o.right, this.f49844q.right), Math.max(this.f49842o.bottom, this.f49844q.bottom));
                    }
                } else {
                    return;
                }
            }
            rectF.set(Math.max(rectF.left, this.f49842o.left), Math.max(rectF.top, this.f49842o.top), Math.min(rectF.right, this.f49842o.right), Math.min(rectF.bottom, this.f49842o.bottom));
        }
    }

    AbstractC21017a(C21106i iVar, C21023d dVar) {
        boolean z = true;
        this.f49836i = new Paint(1);
        Paint paint = new Paint(1);
        this.f49837j = paint;
        Paint paint2 = new Paint(1);
        this.f49838k = paint2;
        Paint paint3 = new Paint(1);
        this.f49839l = paint3;
        Paint paint4 = new Paint();
        this.f49840m = paint4;
        this.f49841n = new RectF();
        this.f49842o = new RectF();
        this.f49843p = new RectF();
        this.f49844q = new RectF();
        this.f49828a = new Matrix();
        this.f49848u = new ArrayList();
        this.f49849v = true;
        this.f49829b = iVar;
        this.f49830c = dVar;
        this.f49845r = dVar.f49865c + "#draw";
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (dVar.f49883u == C21023d.EnumC21025b.Invert) {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C20969o a = dVar.f49871i.mo34484a();
        this.f49833f = a;
        a.mo34473a((AbstractC20954a.AbstractC20955a) this);
        if (dVar.f49870h != null && !dVar.f49870h.isEmpty()) {
            C20961g gVar = new C20961g(dVar.f49870h);
            this.f49846s = gVar;
            for (AbstractC20954a<C21006l, Path> aVar : gVar.f49672a) {
                aVar.mo34466a(this);
            }
            for (AbstractC20954a<?, ?> aVar2 : this.f49846s.f49673b) {
                mo34496a(aVar2);
                aVar2.mo34466a(this);
            }
        }
        if (!this.f49830c.f49882t.isEmpty()) {
            final C20957c cVar = new C20957c(this.f49830c.f49882t);
            cVar.f49657b = true;
            cVar.mo34466a(new AbstractC20954a.AbstractC20955a() {
                /* class com.bytedance.lottie.p1499c.p1502c.AbstractC21017a.C210181 */

                static {
                    Covode.recordClassIndex(24634);
                }

                @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
                /* renamed from: a */
                public final void mo34451a() {
                    boolean z;
                    AbstractC21017a aVar = AbstractC21017a.this;
                    if (((Float) cVar.mo34470d()).floatValue() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo34497a(z);
                }
            });
            mo34497a(((Float) cVar.mo34470d()).floatValue() != 1.0f ? false : z);
            mo34496a(cVar);
            return;
        }
        mo34497a(true);
    }

    /* renamed from: a */
    private static void m39559a(Canvas canvas, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, 31);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    /* renamed from: a */
    static AbstractC21017a m39556a(C21023d dVar, C21106i iVar, C21088g gVar) {
        switch (C210192.f49852a[dVar.f49867e.ordinal()]) {
            case 1:
                return new C21027f(iVar, dVar);
            case 2:
                return new C21020b(iVar, dVar, gVar.f49970b.get(dVar.f49869g), gVar);
            case 3:
                return new C21028g(iVar, dVar);
            case 4:
                return new C21022c(iVar, dVar);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new C21026e(iVar, dVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new C21029h(iVar, dVar);
            default:
                C21044e.m39620a("Unknown layer type " + dVar.f49867e);
                return null;
        }
    }

    /* renamed from: a */
    private void m39558a(Canvas canvas, Matrix matrix, C20998g.EnumC20999a aVar) {
        Paint paint;
        if (C210192.f49853b[aVar.ordinal()] != 1) {
            paint = this.f49837j;
        } else {
            paint = this.f49838k;
        }
        int size = this.f49846s.f49674c.size();
        for (int i = 0; i < size; i++) {
            if (this.f49846s.f49674c.get(i).f49766a == aVar) {
                C21044e.m39621b("Layer#drawMask");
                C21044e.m39621b("Layer#saveLayer");
                m39559a(canvas, this.f49841n, paint);
                C21044e.m39622c("Layer#saveLayer");
                m39557a(canvas);
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f49846s.f49674c.get(i2).f49766a == aVar) {
                        this.f49834g.set(this.f49846s.f49672a.get(i2).mo34470d());
                        this.f49834g.transform(matrix);
                        int alpha = this.f49836i.getAlpha();
                        this.f49836i.setAlpha((int) (((float) this.f49846s.f49673b.get(i2).mo34470d().intValue()) * 2.55f));
                        canvas.drawPath(this.f49834g, this.f49836i);
                        this.f49836i.setAlpha(alpha);
                    }
                }
                C21044e.m39621b("Layer#restoreLayer");
                canvas.restore();
                C21044e.m39622c("Layer#restoreLayer");
                C21044e.m39622c("Layer#drawMask");
                return;
            }
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d
    /* renamed from: a */
    public final void mo34452a(Canvas canvas, Matrix matrix, int i) {
        C21044e.m39621b(this.f49845r);
        if (!this.f49849v) {
            C21044e.m39622c(this.f49845r);
            return;
        }
        if (this.f49847t == null) {
            if (this.f49832e == null) {
                this.f49847t = Collections.emptyList();
            } else {
                this.f49847t = new ArrayList();
                for (AbstractC21017a aVar = this.f49832e; aVar != null; aVar = aVar.f49832e) {
                    this.f49847t.add(aVar);
                }
            }
        }
        C21044e.m39621b("Layer#parentMatrix");
        this.f49835h.reset();
        this.f49835h.set(matrix);
        for (int size = this.f49847t.size() - 1; size >= 0; size--) {
            this.f49835h.preConcat(this.f49847t.get(size).f49833f.mo34471a());
        }
        C21044e.m39622c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) this.f49833f.f49690e.mo34470d().intValue())) / 100.0f) * 255.0f);
        if (m39562c() || m39563d()) {
            C21044e.m39621b("Layer#computeBounds");
            this.f49841n.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo34453a(this.f49841n, this.f49835h);
            RectF rectF = this.f49841n;
            Matrix matrix2 = this.f49835h;
            if (m39562c() && this.f49830c.f49883u != C21023d.EnumC21025b.Invert) {
                this.f49831d.mo34453a(this.f49843p, matrix2);
                rectF.set(Math.max(rectF.left, this.f49843p.left), Math.max(rectF.top, this.f49843p.top), Math.min(rectF.right, this.f49843p.right), Math.min(rectF.bottom, this.f49843p.bottom));
            }
            this.f49835h.preConcat(this.f49833f.mo34471a());
            m39561b(this.f49841n, this.f49835h);
            this.f49841n.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            C21044e.m39622c("Layer#computeBounds");
            C21044e.m39621b("Layer#saveLayer");
            m39559a(canvas, this.f49841n, this.f49836i);
            C21044e.m39622c("Layer#saveLayer");
            m39557a(canvas);
            C21044e.m39621b("Layer#drawLayer");
            mo34498b(canvas, this.f49835h, intValue);
            C21044e.m39622c("Layer#drawLayer");
            if (m39563d()) {
                Matrix matrix3 = this.f49835h;
                m39558a(canvas, matrix3, C20998g.EnumC20999a.MaskModeAdd);
                m39558a(canvas, matrix3, C20998g.EnumC20999a.MaskModeIntersect);
                m39558a(canvas, matrix3, C20998g.EnumC20999a.MaskModeSubtract);
            }
            if (m39562c()) {
                C21044e.m39621b("Layer#drawMatte");
                C21044e.m39621b("Layer#saveLayer");
                m39559a(canvas, this.f49841n, this.f49839l);
                C21044e.m39622c("Layer#saveLayer");
                m39557a(canvas);
                this.f49831d.mo34452a(canvas, matrix, intValue);
                C21044e.m39621b("Layer#restoreLayer");
                canvas.restore();
                C21044e.m39622c("Layer#restoreLayer");
                C21044e.m39622c("Layer#drawMatte");
            }
            C21044e.m39621b("Layer#restoreLayer");
            canvas.restore();
            C21044e.m39622c("Layer#restoreLayer");
            m39560b(C21044e.m39622c(this.f49845r));
            return;
        }
        this.f49835h.preConcat(this.f49833f.mo34471a());
        C21044e.m39621b("Layer#drawLayer");
        mo34498b(canvas, this.f49835h, intValue);
        C21044e.m39622c("Layer#drawLayer");
        m39560b(C21044e.m39622c(this.f49845r));
    }
}

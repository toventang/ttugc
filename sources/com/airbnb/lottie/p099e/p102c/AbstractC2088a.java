package com.airbnb.lottie.p099e.p102c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.C1989a;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.AbstractC1995e;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2019c;
import com.airbnb.lottie.p093a.p095b.C2023g;
import com.airbnb.lottie.p093a.p095b.C2031o;
import com.airbnb.lottie.p099e.AbstractC2105f;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2069g;
import com.airbnb.lottie.p099e.p101b.C2077l;
import com.airbnb.lottie.p099e.p102c.C2094d;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.c.a */
public abstract class AbstractC2088a implements AbstractC1995e, AbstractC2012a.AbstractC2013a, AbstractC2105f {

    /* renamed from: a */
    final Matrix f6271a = new Matrix();

    /* renamed from: b */
    final C2122g f6272b;

    /* renamed from: c */
    public final C2094d f6273c;

    /* renamed from: d */
    public C2019c f6274d;

    /* renamed from: e */
    public AbstractC2088a f6275e;

    /* renamed from: f */
    public AbstractC2088a f6276f;

    /* renamed from: g */
    final C2031o f6277g;

    /* renamed from: h */
    private final Path f6278h = new Path();

    /* renamed from: i */
    private final Matrix f6279i = new Matrix();

    /* renamed from: j */
    private final Paint f6280j;

    /* renamed from: k */
    private final Paint f6281k;

    /* renamed from: l */
    private final Paint f6282l;

    /* renamed from: m */
    private final Paint f6283m;

    /* renamed from: n */
    private final Paint f6284n;

    /* renamed from: o */
    private final RectF f6285o = new RectF();

    /* renamed from: p */
    private final RectF f6286p = new RectF();

    /* renamed from: q */
    private final RectF f6287q = new RectF();

    /* renamed from: r */
    private final RectF f6288r = new RectF();

    /* renamed from: s */
    private final String f6289s;

    /* renamed from: t */
    private C2023g f6290t;

    /* renamed from: u */
    private List<AbstractC2088a> f6291u;

    /* renamed from: v */
    private final List<AbstractC2012a<?, ?>> f6292v = new ArrayList();

    /* renamed from: w */
    private boolean f6293w;

    static {
        Covode.recordClassIndex(2283);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo5966b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5969b(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
    }

    /* renamed from: a */
    public final void mo5965a(boolean z) {
        if (z != this.f6293w) {
            this.f6293w = z;
            this.f6272b.invalidateSelf();
        }
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public <T> void mo5899a(T t, C2204c<T> cVar) {
        this.f6277g.mo5931a(t, cVar);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        if (eVar.mo5978a(this.f6273c.f6309c, i)) {
            if (!"__container".equals(this.f6273c.f6309c)) {
                eVar2 = eVar2.mo5977a(this.f6273c.f6309c);
                if (eVar.mo5980c(this.f6273c.f6309c, i)) {
                    list.add(eVar2.mo5976a(this));
                }
            }
            if (eVar.mo5981d(this.f6273c.f6309c, i)) {
                mo5969b(eVar, i + eVar.mo5979b(this.f6273c.f6309c, i), list, eVar2);
            }
        }
    }

    /* renamed from: e */
    private boolean m6517e() {
        if (this.f6275e != null) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f6272b.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6273c.f6309c;
    }

    /* renamed from: f */
    private boolean m6518f() {
        C2023g gVar = this.f6290t;
        if (gVar == null || gVar.f6081a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo5970c() {
        C2094d dVar = this.f6273c;
        if (dVar == null) {
            return 0;
        }
        return dVar.f6320n;
    }

    /* renamed from: d */
    public final int mo5971d() {
        C2094d dVar = this.f6273c;
        if (dVar == null) {
            return 0;
        }
        return dVar.f6321o;
    }

    /* renamed from: g */
    private void m6519g() {
        if (this.f6291u == null) {
            if (this.f6276f == null) {
                this.f6291u = Collections.emptyList();
                return;
            }
            this.f6291u = new ArrayList();
            for (AbstractC2088a aVar = this.f6276f; aVar != null; aVar = aVar.f6276f) {
                this.f6291u.add(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e.c.a$2 */
    public static /* synthetic */ class C20902 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6295a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6296b;

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
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p099e.p102c.AbstractC2088a.C20902.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m6515b(float f) {
        this.f6272b.f6396a.f6137a.mo6142a(this.f6273c.f6309c, f);
    }

    /* renamed from: a */
    public final void mo5964a(AbstractC2012a<?, ?> aVar) {
        if (aVar != null) {
            this.f6292v.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo5968b(AbstractC2012a<?, ?> aVar) {
        this.f6292v.remove(aVar);
    }

    /* renamed from: a */
    private void m6512a(Canvas canvas) {
        C2041d.m6462b("Layer#clearLayer");
        canvas.drawRect(this.f6285o.left - 1.0f, this.f6285o.top - 1.0f, this.f6285o.right + 1.0f, this.f6285o.bottom + 1.0f, this.f6284n);
        C2041d.m6463c("Layer#clearLayer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5963a(float f) {
        C2019c cVar;
        C2031o oVar = this.f6277g;
        oVar.f6097a.mo5911a(f);
        oVar.f6098b.mo5911a(f);
        oVar.f6099c.mo5911a(f);
        oVar.f6100d.mo5911a(f);
        oVar.f6101e.mo5911a(f);
        if (oVar.f6102f != null) {
            oVar.f6102f.mo5911a(f);
        }
        if (oVar.f6103g != null) {
            oVar.f6103g.mo5911a(f);
        }
        if (this.f6290t != null) {
            for (int i = 0; i < this.f6290t.f6081a.size(); i++) {
                this.f6290t.f6081a.get(i).mo5911a(f);
            }
        }
        if (this.f6273c.f6319m != 0.0f) {
            f /= this.f6273c.f6319m;
        }
        if (C2144d.C2145a.f6479a && (cVar = this.f6274d) != null) {
            cVar.mo5911a(f / this.f6273c.f6319m);
        }
        AbstractC2088a aVar = this.f6275e;
        if (aVar != null) {
            this.f6275e.mo5963a(aVar.f6273c.f6319m * f);
        }
        for (int i2 = 0; i2 < this.f6292v.size(); i2++) {
            this.f6292v.get(i2).mo5911a(f);
        }
    }

    /* renamed from: c */
    private void m6516c(RectF rectF, Matrix matrix) {
        if (!m6517e() || this.f6273c.f6326t == C2094d.EnumC2096b.Invert) {
            return;
        }
        if (C2144d.C2145a.f6479a) {
            this.f6287q.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6275e.mo5967b(this.f6287q, matrix);
            if (!rectF.intersect(this.f6287q)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        this.f6275e.mo5897a(this.f6287q, matrix);
        rectF.set(Math.max(rectF.left, this.f6287q.left), Math.max(rectF.top, this.f6287q.top), Math.min(rectF.right, this.f6287q.right), Math.min(rectF.bottom, this.f6287q.bottom));
    }

    /* renamed from: b */
    public void mo5967b(RectF rectF, Matrix matrix) {
        this.f6285o.set(0.0f, 0.0f, 0.0f, 0.0f);
        m6519g();
        this.f6271a.set(matrix);
        List<AbstractC2088a> list = this.f6291u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f6271a.preConcat(this.f6291u.get(size).f6277g.mo5927a());
            }
        } else {
            AbstractC2088a aVar = this.f6276f;
            if (aVar != null) {
                this.f6271a.preConcat(aVar.f6277g.mo5927a());
            }
        }
        this.f6271a.preConcat(this.f6277g.mo5927a());
    }

    AbstractC2088a(C2122g gVar, C2094d dVar) {
        boolean z = true;
        this.f6293w = true;
        if (C2144d.C2145a.f6479a) {
            this.f6280j = new C1989a(1);
            this.f6281k = new C1989a(PorterDuff.Mode.DST_IN, (byte) 0);
            this.f6282l = new C1989a(PorterDuff.Mode.DST_OUT, (byte) 0);
            this.f6283m = new C1989a(1);
            this.f6284n = new C1989a(PorterDuff.Mode.CLEAR);
        } else {
            this.f6280j = new Paint(1);
            Paint paint = new Paint(1);
            this.f6281k = paint;
            Paint paint2 = new Paint(1);
            this.f6282l = paint2;
            this.f6283m = new Paint(1);
            Paint paint3 = new Paint();
            this.f6284n = paint3;
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.f6272b = gVar;
        this.f6273c = dVar;
        this.f6289s = dVar.f6309c + "#draw";
        if (dVar.f6326t == C2094d.EnumC2096b.Invert) {
            this.f6283m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f6283m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C2031o a = dVar.f6315i.mo5952a();
        this.f6277g = a;
        a.mo5929a((AbstractC2012a.AbstractC2013a) this);
        if (dVar.f6314h != null && !dVar.f6314h.isEmpty()) {
            C2023g gVar2 = new C2023g(dVar.f6314h);
            this.f6290t = gVar2;
            for (AbstractC2012a<C2077l, Path> aVar : gVar2.f6081a) {
                aVar.mo5912a(this);
            }
            for (AbstractC2012a<Integer, Integer> aVar2 : this.f6290t.f6082b) {
                mo5964a(aVar2);
                aVar2.mo5912a(this);
            }
        }
        if (!this.f6273c.f6325s.isEmpty()) {
            C2019c cVar = new C2019c(this.f6273c.f6325s);
            this.f6274d = cVar;
            cVar.f6065b = true;
            this.f6274d.mo5912a(new AbstractC2012a.AbstractC2013a() {
                /* class com.airbnb.lottie.p099e.p102c.AbstractC2088a.C20891 */

                static {
                    Covode.recordClassIndex(2284);
                }

                @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
                /* renamed from: a */
                public final void mo5895a() {
                    boolean z = true;
                    if (C2144d.C2145a.f6479a) {
                        AbstractC2088a aVar = AbstractC2088a.this;
                        if (aVar.f6274d.mo5925g() != 1.0f) {
                            z = false;
                        }
                        aVar.mo5965a(z);
                        return;
                    }
                    AbstractC2088a aVar2 = AbstractC2088a.this;
                    if (((Float) aVar2.f6274d.mo5918f()).floatValue() != 1.0f) {
                        z = false;
                    }
                    aVar2.mo5965a(z);
                }
            });
            mo5965a(((Float) this.f6274d.mo5918f()).floatValue() != 1.0f ? false : z);
            mo5964a(this.f6274d);
            return;
        }
        mo5965a(true);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public void mo5897a(RectF rectF, Matrix matrix) {
        if (C2144d.C2145a.f6479a) {
            this.f6285o.set(0.0f, 0.0f, 0.0f, 0.0f);
            m6519g();
        }
        this.f6271a.set(matrix);
        this.f6271a.preConcat(this.f6277g.mo5927a());
    }

    /* renamed from: a */
    static AbstractC2088a m6511a(C2094d dVar, C2122g gVar, C2044e eVar) {
        switch (C20902.f6295a[dVar.f6311e.ordinal()]) {
            case 1:
                return new C2098f(gVar, dVar);
            case 2:
                return new C2091b(gVar, dVar, eVar.f6138b.get(dVar.f6313g), eVar);
            case 3:
                return new C2099g(gVar, dVar);
            case 4:
                return new C2093c(gVar, dVar);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new C2097e(gVar, dVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new C2100h(gVar, dVar);
            default:
                C2041d.m6461a("Unknown layer type " + dVar.f6311e);
                return null;
        }
    }

    /* renamed from: a */
    private void m6513a(Canvas canvas, Matrix matrix, C2069g.EnumC2070a aVar) {
        Paint paint;
        if (C20902.f6296b[aVar.ordinal()] != 1) {
            paint = this.f6281k;
        } else {
            paint = this.f6282l;
        }
        int size = this.f6290t.f6083c.size();
        for (int i = 0; i < size; i++) {
            if (this.f6290t.f6083c.get(i).f6209a == aVar) {
                C2041d.m6462b("Layer#drawMask");
                C2041d.m6462b("Layer#saveLayer");
                m6514a(canvas, this.f6285o, paint, false);
                C2041d.m6463c("Layer#saveLayer");
                m6512a(canvas);
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f6290t.f6083c.get(i2).f6209a == aVar) {
                        this.f6278h.set(this.f6290t.f6081a.get(i2).mo5918f());
                        this.f6278h.transform(matrix);
                        int alpha = this.f6280j.getAlpha();
                        this.f6280j.setAlpha((int) (((float) this.f6290t.f6082b.get(i2).mo5918f().intValue()) * 2.55f));
                        canvas.drawPath(this.f6278h, this.f6280j);
                        this.f6280j.setAlpha(alpha);
                    }
                }
                C2041d.m6462b("Layer#restoreLayer");
                canvas.restore();
                C2041d.m6463c("Layer#restoreLayer");
                C2041d.m6463c("Layer#drawMask");
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        C2041d.m6462b(this.f6289s);
        if (!this.f6293w) {
            C2041d.m6463c(this.f6289s);
            return;
        }
        m6519g();
        C2041d.m6462b("Layer#parentMatrix");
        this.f6279i.reset();
        this.f6279i.set(matrix);
        int i2 = 1;
        for (int size = this.f6291u.size() - 1; size >= 0; size--) {
            this.f6279i.preConcat(this.f6291u.get(size).f6277g.mo5927a());
        }
        C2041d.m6463c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) this.f6277g.f6101e.mo5918f().intValue())) / 100.0f) * 255.0f);
        if (m6517e() || m6518f()) {
            C2041d.m6462b("Layer#computeBounds");
            this.f6285o.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo5897a(this.f6285o, this.f6279i);
            if (C2144d.C2145a.f6479a) {
                m6516c(this.f6285o, matrix);
            } else {
                m6516c(this.f6285o, this.f6279i);
            }
            this.f6279i.preConcat(this.f6277g.mo5927a());
            RectF rectF = this.f6285o;
            Matrix matrix2 = this.f6279i;
            this.f6286p.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean z = false;
            if (m6518f()) {
                int size2 = this.f6290t.f6083c.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        this.f6278h.set(this.f6290t.f6081a.get(i3).mo5918f());
                        this.f6278h.transform(matrix2);
                        int i4 = C20902.f6296b[this.f6290t.f6083c.get(i3).f6209a.ordinal()];
                        if (i4 == i2 || i4 == 2) {
                            break;
                        }
                        this.f6278h.computeBounds(this.f6288r, z);
                        if (i3 == 0) {
                            this.f6286p.set(this.f6288r);
                        } else {
                            RectF rectF2 = this.f6286p;
                            rectF2.set(Math.min(rectF2.left, this.f6288r.left), Math.min(this.f6286p.top, this.f6288r.top), Math.max(this.f6286p.right, this.f6288r.right), Math.max(this.f6286p.bottom, this.f6288r.bottom));
                        }
                        i3++;
                        i2 = 1;
                        z = false;
                    } else if (!C2144d.C2145a.f6479a) {
                        rectF.set(Math.max(rectF.left, this.f6286p.left), Math.max(rectF.top, this.f6286p.top), Math.min(rectF.right, this.f6286p.right), Math.min(rectF.bottom, this.f6286p.bottom));
                    } else if (!rectF.intersect(this.f6286p)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            if (!C2144d.C2145a.f6479a) {
                this.f6285o.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            } else if (!this.f6285o.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f6285o.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C2041d.m6463c("Layer#computeBounds");
            if (C2144d.C2145a.f6479a) {
                if (this.f6285o.width() < 1.0f || this.f6285o.height() < 1.0f) {
                    m6515b(C2041d.m6463c(this.f6289s));
                    return;
                }
                this.f6280j.setAlpha(255);
            }
            C2041d.m6462b("Layer#saveLayer");
            m6514a(canvas, this.f6285o, this.f6280j, true);
            C2041d.m6463c("Layer#saveLayer");
            m6512a(canvas);
            C2041d.m6462b("Layer#drawLayer");
            mo5966b(canvas, this.f6279i, intValue);
            C2041d.m6463c("Layer#drawLayer");
            if (m6518f()) {
                Matrix matrix3 = this.f6279i;
                m6513a(canvas, matrix3, C2069g.EnumC2070a.MaskModeAdd);
                m6513a(canvas, matrix3, C2069g.EnumC2070a.MaskModeIntersect);
                m6513a(canvas, matrix3, C2069g.EnumC2070a.MaskModeSubtract);
            }
            if (m6517e()) {
                C2041d.m6462b("Layer#drawMatte");
                C2041d.m6462b("Layer#saveLayer");
                m6514a(canvas, this.f6285o, this.f6283m, false);
                C2041d.m6463c("Layer#saveLayer");
                m6512a(canvas);
                this.f6275e.mo5896a(canvas, matrix, intValue);
                C2041d.m6462b("Layer#restoreLayer");
                canvas.restore();
                C2041d.m6463c("Layer#restoreLayer");
                C2041d.m6463c("Layer#drawMatte");
            }
            C2041d.m6462b("Layer#restoreLayer");
            canvas.restore();
            C2041d.m6463c("Layer#restoreLayer");
            m6515b(C2041d.m6463c(this.f6289s));
            return;
        }
        this.f6279i.preConcat(this.f6277g.mo5927a());
        C2041d.m6462b("Layer#drawLayer");
        mo5966b(canvas, this.f6279i, intValue);
        C2041d.m6463c("Layer#drawLayer");
        m6515b(C2041d.m6463c(this.f6289s));
    }

    /* renamed from: a */
    private static void m6514a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            if (z) {
                i = 31;
            } else {
                i = 19;
            }
            canvas.saveLayer(rectF, paint, i);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }
}

package com.airbnb.lottie.p093a.p094a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.C1989a;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2019c;
import com.airbnb.lottie.p093a.p095b.C2021e;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.a */
public abstract class AbstractC1990a implements AbstractC1995e, AbstractC2001k, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    protected final AbstractC2088a f5937a;

    /* renamed from: b */
    final Paint f5938b;

    /* renamed from: c */
    private final PathMeasure f5939c = new PathMeasure();

    /* renamed from: d */
    private final Path f5940d = new Path();

    /* renamed from: e */
    private final Path f5941e = new Path();

    /* renamed from: f */
    private final RectF f5942f = new RectF();

    /* renamed from: g */
    private final C2122g f5943g;

    /* renamed from: h */
    private final List<C1991a> f5944h = new ArrayList();

    /* renamed from: i */
    private final float[] f5945i;

    /* renamed from: j */
    private final AbstractC2012a<?, Float> f5946j;

    /* renamed from: k */
    private final AbstractC2012a<?, Integer> f5947k;

    /* renamed from: l */
    private final List<AbstractC2012a<?, Float>> f5948l;

    /* renamed from: m */
    private final AbstractC2012a<?, Float> f5949m;

    /* renamed from: n */
    private AbstractC2012a<ColorFilter, ColorFilter> f5950n;

    static {
        Covode.recordClassIndex(2185);
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f5943g.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.a.a.a$a */
    public static final class C1991a {

        /* renamed from: a */
        public final List<AbstractC2004m> f5951a;

        /* renamed from: b */
        public final C2011s f5952b;

        static {
            Covode.recordClassIndex(2186);
        }

        private C1991a(C2011s sVar) {
            this.f5951a = new ArrayList();
            this.f5952b = sVar;
        }

        /* synthetic */ C1991a(C2011s sVar, byte b) {
            this(sVar);
        }
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public <T> void mo5899a(T t, C2204c<T> cVar) {
        AbstractC2012a<ColorFilter, ColorFilter> aVar;
        if (t == AbstractC2206k.f6598d) {
            this.f5947k.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6609o) {
            this.f5946j.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6593C) {
            if (C2144d.C2145a.f6479a && (aVar = this.f5950n) != null) {
                this.f5937a.mo5968b(aVar);
            }
            if (cVar == null) {
                this.f5950n = null;
                return;
            }
            C2032p pVar = new C2032p(cVar);
            this.f5950n = pVar;
            pVar.mo5912a(this);
            this.f5937a.mo5964a(this.f5950n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        C1991a aVar = null;
        C2011s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC1993c cVar = list.get(size);
            if (cVar instanceof C2011s) {
                C2011s sVar2 = (C2011s) cVar;
                if (sVar2.f6058a == C2085q.EnumC2086a.Individually) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.mo5908a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            AbstractC1993c cVar2 = list2.get(size2);
            if (cVar2 instanceof C2011s) {
                C2011s sVar3 = (C2011s) cVar2;
                if (sVar3.f6058a == C2085q.EnumC2086a.Individually) {
                    if (aVar != null) {
                        this.f5944h.add(aVar);
                    }
                    aVar = new C1991a(sVar3, (byte) 0);
                    sVar3.mo5908a(this);
                }
            }
            if (cVar2 instanceof AbstractC2004m) {
                if (aVar == null) {
                    aVar = new C1991a(sVar, (byte) 0);
                }
                aVar.f5951a.add(cVar2);
            }
        }
        if (aVar != null) {
            this.f5944h.add(aVar);
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        float floatValue;
        C2041d.m6462b("StrokeContent#getBounds");
        this.f5940d.reset();
        for (int i = 0; i < this.f5944h.size(); i++) {
            C1991a aVar = this.f5944h.get(i);
            for (int i2 = 0; i2 < aVar.f5951a.size(); i2++) {
                this.f5940d.addPath(aVar.f5951a.get(i2).mo5906e(), matrix);
            }
        }
        this.f5940d.computeBounds(this.f5942f, false);
        if (C2144d.C2145a.f6479a) {
            floatValue = ((C2019c) this.f5946j).mo5925g();
        } else {
            floatValue = this.f5946j.mo5918f().floatValue();
        }
        RectF rectF2 = this.f5942f;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, this.f5942f.top - f, this.f5942f.right + f, this.f5942f.bottom + f);
        rectF.set(this.f5942f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C2041d.m6463c("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m6305a(Canvas canvas, C1991a aVar, Matrix matrix) {
        float f;
        C2041d.m6462b("StrokeContent#applyTrimPath");
        if (aVar.f5952b == null) {
            C2041d.m6463c("StrokeContent#applyTrimPath");
            return;
        }
        this.f5940d.reset();
        for (int size = aVar.f5951a.size() - 1; size >= 0; size--) {
            this.f5940d.addPath(aVar.f5951a.get(size).mo5906e(), matrix);
        }
        this.f5939c.setPath(this.f5940d, false);
        float length = this.f5939c.getLength();
        while (this.f5939c.nextContour()) {
            length += this.f5939c.getLength();
        }
        float floatValue = (aVar.f5952b.f6061d.mo5918f().floatValue() * length) / 360.0f;
        float floatValue2 = ((aVar.f5952b.f6059b.mo5918f().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((aVar.f5952b.f6060c.mo5918f().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = aVar.f5951a.size() - 1; size2 >= 0; size2--) {
            this.f5941e.set(aVar.f5951a.get(size2).mo5906e());
            this.f5941e.transform(matrix);
            this.f5939c.setPath(this.f5941e, false);
            float length2 = this.f5939c.getLength();
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
                    C2194g.m6796a(this.f5941e, f, f3, 0.0f);
                    canvas.drawPath(this.f5941e, this.f5938b);
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
                    C2194g.m6796a(this.f5941e, f, f3, 0.0f);
                    canvas.drawPath(this.f5941e, this.f5938b);
                } else {
                    canvas.drawPath(this.f5941e, this.f5938b);
                }
            }
            f2 += length2;
        }
        C2041d.m6463c("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public void mo5896a(Canvas canvas, Matrix matrix, int i) {
        C2041d.m6462b("StrokeContent#draw");
        float f = 0.0f;
        if (C2144d.C2145a.f6479a) {
            float[] fArr = C2194g.f6550a.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 37394.73f;
            fArr[3] = 39575.234f;
            matrix.mapPoints(fArr);
            if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
                C2041d.m6463c("StrokeContent#draw");
                return;
            }
            this.f5938b.setAlpha(C2192f.m6787a((int) ((((((float) i) / 255.0f) * ((float) ((C2021e) this.f5947k).mo5925g())) / 100.0f) * 255.0f)));
            this.f5938b.setStrokeWidth(((C2019c) this.f5946j).mo5925g() * C2194g.m6793a(matrix));
        } else {
            this.f5938b.setAlpha(C2192f.m6787a((int) ((((((float) i) / 255.0f) * ((float) this.f5947k.mo5918f().intValue())) / 100.0f) * 255.0f)));
            this.f5938b.setStrokeWidth(this.f5946j.mo5918f().floatValue() * C2194g.m6793a(matrix));
        }
        if (this.f5938b.getStrokeWidth() <= 0.0f) {
            C2041d.m6463c("StrokeContent#draw");
            return;
        }
        C2041d.m6462b("StrokeContent#applyDashPattern");
        if (this.f5948l.isEmpty()) {
            C2041d.m6463c("StrokeContent#applyDashPattern");
        } else {
            float a = C2194g.m6793a(matrix);
            for (int i2 = 0; i2 < this.f5948l.size(); i2++) {
                this.f5945i[i2] = this.f5948l.get(i2).mo5918f().floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr2 = this.f5945i;
                    if (fArr2[i2] < 1.0f) {
                        fArr2[i2] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f5945i;
                    if (fArr3[i2] < 0.1f) {
                        fArr3[i2] = 0.1f;
                    }
                }
                float[] fArr4 = this.f5945i;
                fArr4[i2] = fArr4[i2] * a;
            }
            if (C2144d.C2145a.f6479a) {
                AbstractC2012a<?, Float> aVar = this.f5949m;
                if (aVar != null) {
                    f = aVar.mo5918f().floatValue() * a;
                }
            } else {
                AbstractC2012a<?, Float> aVar2 = this.f5949m;
                if (aVar2 != null) {
                    f = aVar2.mo5918f().floatValue();
                }
            }
            this.f5938b.setPathEffect(new DashPathEffect(this.f5945i, f));
            C2041d.m6463c("StrokeContent#applyDashPattern");
        }
        AbstractC2012a<ColorFilter, ColorFilter> aVar3 = this.f5950n;
        if (aVar3 != null) {
            this.f5938b.setColorFilter(aVar3.mo5918f());
        }
        for (int i3 = 0; i3 < this.f5944h.size(); i3++) {
            C1991a aVar4 = this.f5944h.get(i3);
            if (aVar4.f5952b != null) {
                m6305a(canvas, aVar4, matrix);
            } else {
                C2041d.m6462b("StrokeContent#buildPath");
                this.f5940d.reset();
                for (int size = aVar4.f5951a.size() - 1; size >= 0; size--) {
                    this.f5940d.addPath(aVar4.f5951a.get(size).mo5906e(), matrix);
                }
                C2041d.m6463c("StrokeContent#buildPath");
                C2041d.m6462b("StrokeContent#drawPath");
                canvas.drawPath(this.f5940d, this.f5938b);
                C2041d.m6463c("StrokeContent#drawPath");
            }
        }
        C2041d.m6463c("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }

    AbstractC1990a(C2122g gVar, AbstractC2088a aVar, Paint.Cap cap, Paint.Join join, float f, C2051d dVar, C2049b bVar, List<C2049b> list, C2049b bVar2) {
        if (C2144d.C2145a.f6479a) {
            this.f5938b = new C1989a(1);
        } else {
            this.f5938b = new Paint(1);
        }
        this.f5943g = gVar;
        this.f5937a = aVar;
        this.f5938b.setStyle(Paint.Style.STROKE);
        this.f5938b.setStrokeCap(cap);
        this.f5938b.setStrokeJoin(join);
        this.f5938b.setStrokeMiter(f);
        this.f5947k = dVar.mo5947a();
        this.f5946j = bVar.mo5947a();
        if (bVar2 == null) {
            this.f5949m = null;
        } else {
            this.f5949m = bVar2.mo5947a();
        }
        this.f5948l = new ArrayList(list.size());
        this.f5945i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f5948l.add(list.get(i).mo5947a());
        }
        aVar.mo5964a(this.f5947k);
        aVar.mo5964a(this.f5946j);
        for (int i2 = 0; i2 < this.f5948l.size(); i2++) {
            aVar.mo5964a(this.f5948l.get(i2));
        }
        AbstractC2012a<?, Float> aVar2 = this.f5949m;
        if (aVar2 != null) {
            aVar.mo5964a(aVar2);
        }
        this.f5947k.mo5912a(this);
        this.f5946j.mo5912a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f5948l.get(i3).mo5912a(this);
        }
        AbstractC2012a<?, Float> aVar3 = this.f5949m;
        if (aVar3 != null) {
            aVar3.mo5912a(this);
        }
    }
}

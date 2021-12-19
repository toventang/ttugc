package com.airbnb.lottie.p093a.p094a;

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
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.C1989a;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2065c;
import com.airbnb.lottie.p099e.p101b.C2066d;
import com.airbnb.lottie.p099e.p101b.EnumC2068f;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.h */
public final class C1998h implements AbstractC1995e, AbstractC2001k, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final String f5980a;

    /* renamed from: b */
    private final AbstractC2088a f5981b;

    /* renamed from: c */
    private final C0489d<LinearGradient> f5982c = new C0489d<>();

    /* renamed from: d */
    private final C0489d<RadialGradient> f5983d = new C0489d<>();

    /* renamed from: e */
    private final Matrix f5984e = new Matrix();

    /* renamed from: f */
    private final Path f5985f;

    /* renamed from: g */
    private final Paint f5986g;

    /* renamed from: h */
    private final RectF f5987h;

    /* renamed from: i */
    private final List<AbstractC2004m> f5988i;

    /* renamed from: j */
    private final EnumC2068f f5989j;

    /* renamed from: k */
    private final AbstractC2012a<C2065c, C2065c> f5990k;

    /* renamed from: l */
    private final AbstractC2012a<Integer, Integer> f5991l;

    /* renamed from: m */
    private final AbstractC2012a<PointF, PointF> f5992m;

    /* renamed from: n */
    private final AbstractC2012a<PointF, PointF> f5993n;

    /* renamed from: o */
    private AbstractC2012a<ColorFilter, ColorFilter> f5994o;

    /* renamed from: p */
    private final C2122g f5995p;

    /* renamed from: q */
    private final int f5996q;

    static {
        Covode.recordClassIndex(2193);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f5980a;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f5995p.invalidateSelf();
    }

    /* renamed from: c */
    private int m6343c() {
        int i;
        int round = Math.round(this.f5992m.f6066c * ((float) this.f5996q));
        int round2 = Math.round(this.f5993n.f6066c * ((float) this.f5996q));
        int round3 = Math.round(this.f5990k.f6066c * ((float) this.f5996q));
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC1993c cVar = list2.get(i);
            if (cVar instanceof AbstractC2004m) {
                this.f5988i.add(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        this.f5985f.reset();
        for (int i = 0; i < this.f5988i.size(); i++) {
            this.f5985f.addPath(this.f5988i.get(i).mo5906e(), matrix);
        }
        this.f5985f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        AbstractC2012a<ColorFilter, ColorFilter> aVar;
        if (t == AbstractC2206k.f6593C) {
            if (C2144d.C2145a.f6479a && (aVar = this.f5994o) != null) {
                this.f5981b.mo5968b(aVar);
            }
            if (cVar == null) {
                this.f5994o = null;
                return;
            }
            C2032p pVar = new C2032p(cVar);
            this.f5994o = pVar;
            pVar.mo5912a(this);
            this.f5981b.mo5964a(this.f5994o);
        }
    }

    public C1998h(C2122g gVar, AbstractC2088a aVar, C2066d dVar) {
        Path path = new Path();
        this.f5985f = path;
        this.f5987h = new RectF();
        this.f5988i = new ArrayList();
        if (C2144d.C2145a.f6479a) {
            this.f5986g = new C1989a(1);
        } else {
            this.f5986g = new Paint(1);
        }
        this.f5981b = aVar;
        this.f5980a = dVar.f6193g;
        this.f5995p = gVar;
        this.f5989j = dVar.f6187a;
        path.setFillType(dVar.f6188b);
        this.f5996q = (int) (gVar.f6396a.mo5941a() / 32.0f);
        AbstractC2012a<C2065c, C2065c> a = dVar.f6189c.mo5947a();
        this.f5990k = a;
        a.mo5912a(this);
        aVar.mo5964a(a);
        AbstractC2012a<Integer, Integer> a2 = dVar.f6190d.mo5947a();
        this.f5991l = a2;
        a2.mo5912a(this);
        aVar.mo5964a(a2);
        AbstractC2012a<PointF, PointF> a3 = dVar.f6191e.mo5947a();
        this.f5992m = a3;
        a3.mo5912a(this);
        aVar.mo5964a(a3);
        AbstractC2012a<PointF, PointF> a4 = dVar.f6192f.mo5947a();
        this.f5993n = a4;
        a4.mo5912a(this);
        aVar.mo5964a(a4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: androidx.c.d<android.graphics.RadialGradient> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: androidx.c.d<android.graphics.LinearGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        RadialGradient a;
        C2041d.m6462b("GradientFillContent#draw");
        this.f5985f.reset();
        for (int i2 = 0; i2 < this.f5988i.size(); i2++) {
            this.f5985f.addPath(this.f5988i.get(i2).mo5906e(), matrix);
        }
        this.f5985f.computeBounds(this.f5987h, false);
        if (this.f5989j == EnumC2068f.Linear) {
            long c = (long) m6343c();
            a = this.f5982c.mo2078a(c, null);
            if (a == null) {
                PointF f = this.f5992m.mo5918f();
                PointF f2 = this.f5993n.mo5918f();
                C2065c f3 = this.f5990k.mo5918f();
                a = new LinearGradient(f.x, f.y, f2.x, f2.y, f3.f6186b, f3.f6185a, Shader.TileMode.CLAMP);
                this.f5982c.mo2083b(c, a);
            }
        } else {
            long c2 = (long) m6343c();
            a = this.f5983d.mo2077a(c2);
            if (a == null) {
                PointF f4 = this.f5992m.mo5918f();
                PointF f5 = this.f5993n.mo5918f();
                C2065c f6 = this.f5990k.mo5918f();
                int[] iArr = f6.f6186b;
                float[] fArr = f6.f6185a;
                float f7 = f4.x;
                float f8 = f4.y;
                a = new RadialGradient(f7, f8, (float) Math.hypot((double) (f5.x - f7), (double) (f5.y - f8)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f5983d.mo2083b(c2, a);
            }
        }
        this.f5984e.set(matrix);
        a.setLocalMatrix(this.f5984e);
        this.f5986g.setShader(a);
        AbstractC2012a<ColorFilter, ColorFilter> aVar = this.f5994o;
        if (aVar != null) {
            this.f5986g.setColorFilter(aVar.mo5918f());
        }
        this.f5986g.setAlpha(C2192f.m6787a((int) ((((((float) i) / 255.0f) * ((float) this.f5991l.mo5918f().intValue())) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f5985f, this.f5986g);
        C2041d.m6463c("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }
}

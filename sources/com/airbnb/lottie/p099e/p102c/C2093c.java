package com.airbnb.lottie.p099e.p102c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.C2152h;
import com.airbnb.lottie.p093a.C1989a;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.c.c */
public final class C2093c extends AbstractC2088a {

    /* renamed from: h */
    private final Paint f6302h;

    /* renamed from: i */
    private final Rect f6303i = new Rect();

    /* renamed from: j */
    private final Rect f6304j = new Rect();

    /* renamed from: k */
    private C2152h f6305k;

    /* renamed from: l */
    private AbstractC2012a<ColorFilter, ColorFilter> f6306l;

    static {
        Covode.recordClassIndex(2288);
    }

    /* renamed from: e */
    private Bitmap m6547e() {
        return this.f6272b.mo6003a(this.f6273c.f6313g);
    }

    /* renamed from: a */
    private int m6544a(Bitmap bitmap) {
        C2152h hVar = this.f6305k;
        if (hVar == null || !hVar.f6516h) {
            return bitmap.getWidth();
        }
        return this.f6305k.f6509a;
    }

    /* renamed from: b */
    private int m6546b(Bitmap bitmap) {
        C2152h hVar = this.f6305k;
        if (hVar == null || !hVar.f6516h) {
            return bitmap.getHeight();
        }
        return this.f6305k.f6510b;
    }

    /* renamed from: a */
    private void m6545a(RectF rectF) {
        Bitmap e = m6547e();
        if (e != null) {
            if (C2144d.C2145a.f6479a) {
                rectF.set(0.0f, 0.0f, ((float) m6544a(e)) * C2194g.m6792a(), ((float) m6546b(e)) * C2194g.m6792a());
            } else {
                rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) e.getWidth()), Math.min(rectF.bottom, (float) e.getHeight()));
            }
            this.f6271a.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        super.mo5897a(rectF, matrix);
        m6545a(rectF);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5967b(RectF rectF, Matrix matrix) {
        super.mo5967b(rectF, matrix);
        m6545a(rectF);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        super.mo5899a(t, cVar);
        if (t != AbstractC2206k.f6593C) {
            return;
        }
        if (cVar == null) {
            this.f6306l = null;
        } else {
            this.f6306l = new C2032p(cVar);
        }
    }

    C2093c(C2122g gVar, C2094d dVar) {
        super(gVar, dVar);
        if (!C2144d.C2145a.f6479a) {
            this.f6302h = new Paint(3);
        } else if (!C2144d.C2145a.f6486h || !C2144d.C2149e.f6504a) {
            this.f6302h = new C1989a(3);
        } else {
            this.f6302h = new C1989a(1);
        }
        if (dVar != null && dVar.f6308b != null && dVar.f6308b.f6139c != null) {
            this.f6305k = dVar.f6308b.f6139c.get(dVar.f6313g);
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5966b(Canvas canvas, Matrix matrix, int i) {
        Bitmap e = m6547e();
        if (e != null && !e.isRecycled()) {
            float a = C2194g.m6792a();
            this.f6302h.setAlpha(i);
            AbstractC2012a<ColorFilter, ColorFilter> aVar = this.f6306l;
            if (aVar != null) {
                this.f6302h.setColorFilter(aVar.mo5918f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f6303i.set(0, 0, e.getWidth(), e.getHeight());
            this.f6304j.set(0, 0, (int) (((float) m6544a(e)) * a), (int) (((float) m6546b(e)) * a));
            canvas.drawBitmap(e, this.f6303i, this.f6304j, this.f6302h);
            canvas.restore();
        }
    }
}

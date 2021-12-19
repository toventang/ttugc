package com.airbnb.lottie.p099e.p102c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.c.g */
public final class C2099g extends AbstractC2088a {

    /* renamed from: h */
    private final RectF f6331h = new RectF();

    /* renamed from: i */
    private final Paint f6332i;

    /* renamed from: j */
    private final float[] f6333j;

    /* renamed from: k */
    private final Path f6334k;

    /* renamed from: l */
    private final C2094d f6335l;

    /* renamed from: m */
    private AbstractC2012a<ColorFilter, ColorFilter> f6336m;

    static {
        Covode.recordClassIndex(2294);
    }

    /* renamed from: a */
    private void m6561a(RectF rectF) {
        this.f6331h.set(0.0f, 0.0f, (float) this.f6335l.f6316j, (float) this.f6335l.f6317k);
        this.f6271a.mapRect(this.f6331h);
        rectF.set(this.f6331h);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        super.mo5897a(rectF, matrix);
        m6561a(rectF);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5967b(RectF rectF, Matrix matrix) {
        super.mo5967b(rectF, matrix);
        m6561a(rectF);
    }

    C2099g(C2122g gVar, C2094d dVar) {
        super(gVar, dVar);
        Paint paint = new Paint();
        this.f6332i = paint;
        this.f6333j = new float[8];
        this.f6334k = new Path();
        this.f6335l = dVar;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(dVar.f6318l);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        super.mo5899a(t, cVar);
        if (t != AbstractC2206k.f6593C) {
            return;
        }
        if (cVar == null) {
            this.f6336m = null;
        } else {
            this.f6336m = new C2032p(cVar);
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5966b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f6335l.f6318l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) this.f6277g.f6101e.mo5918f().intValue())) / 100.0f) * 255.0f);
            this.f6332i.setAlpha(intValue);
            AbstractC2012a<ColorFilter, ColorFilter> aVar = this.f6336m;
            if (aVar != null) {
                this.f6332i.setColorFilter(aVar.mo5918f());
            }
            if (intValue > 0) {
                float[] fArr = this.f6333j;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f6335l.f6316j;
                float[] fArr2 = this.f6333j;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f6335l.f6316j;
                this.f6333j[5] = (float) this.f6335l.f6317k;
                float[] fArr3 = this.f6333j;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f6335l.f6317k;
                matrix.mapPoints(this.f6333j);
                this.f6334k.reset();
                Path path = this.f6334k;
                float[] fArr4 = this.f6333j;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f6334k;
                float[] fArr5 = this.f6333j;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f6334k;
                float[] fArr6 = this.f6333j;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f6334k;
                float[] fArr7 = this.f6333j;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f6334k;
                float[] fArr8 = this.f6333j;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f6334k.close();
                canvas.drawPath(this.f6334k, this.f6332i);
            }
        }
    }
}

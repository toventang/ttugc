package com.bytedance.lottie.p1499c.p1502c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1506g.C21091c;

/* renamed from: com.bytedance.lottie.c.c.g */
public final class C21028g extends AbstractC21017a {

    /* renamed from: g */
    private final RectF f49887g = new RectF();

    /* renamed from: h */
    private final Paint f49888h;

    /* renamed from: i */
    private final float[] f49889i;

    /* renamed from: j */
    private final Path f49890j;

    /* renamed from: k */
    private final C21023d f49891k;

    /* renamed from: l */
    private AbstractC20954a<ColorFilter, ColorFilter> f49892l;

    static {
        Covode.recordClassIndex(24644);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        super.mo34453a(rectF, matrix);
        this.f49887g.set(0.0f, 0.0f, (float) this.f49891k.f49872j, (float) this.f49891k.f49873k);
        this.f49828a.mapRect(this.f49887g);
        rectF.set(this.f49887g);
    }

    C21028g(C21106i iVar, C21023d dVar) {
        super(iVar, dVar);
        Paint paint = new Paint();
        this.f49888h = paint;
        this.f49889i = new float[8];
        this.f49890j = new Path();
        this.f49891k = dVar;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(dVar.f49874l);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        super.mo34455a(t, cVar);
        if (t != AbstractC21121m.f50099x) {
            return;
        }
        if (cVar == null) {
            this.f49892l = null;
        } else {
            this.f49892l = new C20970p(cVar);
        }
    }

    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34498b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f49891k.f49874l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) this.f49833f.f49690e.mo34470d().intValue())) / 100.0f) * 255.0f);
            this.f49888h.setAlpha(intValue);
            AbstractC20954a<ColorFilter, ColorFilter> aVar = this.f49892l;
            if (aVar != null) {
                this.f49888h.setColorFilter(aVar.mo34470d());
            }
            if (intValue > 0) {
                float[] fArr = this.f49889i;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f49891k.f49872j;
                float[] fArr2 = this.f49889i;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f49891k.f49872j;
                this.f49889i[5] = (float) this.f49891k.f49873k;
                float[] fArr3 = this.f49889i;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f49891k.f49873k;
                matrix.mapPoints(this.f49889i);
                this.f49890j.reset();
                Path path = this.f49890j;
                float[] fArr4 = this.f49889i;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f49890j;
                float[] fArr5 = this.f49889i;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f49890j;
                float[] fArr6 = this.f49889i;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f49890j;
                float[] fArr7 = this.f49889i;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f49890j;
                float[] fArr8 = this.f49889i;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f49890j.close();
                canvas.drawPath(this.f49890j, this.f49888h);
            }
        }
    }
}

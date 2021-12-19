package com.bytedance.lottie.p1499c.p1502c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20970p;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21091c;

/* renamed from: com.bytedance.lottie.c.c.c */
public final class C21022c extends AbstractC21017a {

    /* renamed from: g */
    private final Paint f49859g = new Paint(3);

    /* renamed from: h */
    private final Rect f49860h = new Rect();

    /* renamed from: i */
    private final Rect f49861i = new Rect();

    /* renamed from: j */
    private AbstractC20954a<ColorFilter, ColorFilter> f49862j;

    static {
        Covode.recordClassIndex(24638);
    }

    /* renamed from: c */
    private Bitmap m39582c() {
        return this.f49829b.mo34579a(this.f49830c.f49869g);
    }

    C21022c(C21106i iVar, C21023d dVar) {
        super(iVar, dVar);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        super.mo34455a(t, cVar);
        if (t != AbstractC21121m.f50099x) {
            return;
        }
        if (cVar == null) {
            this.f49862j = null;
        } else {
            this.f49862j = new C20970p(cVar);
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20937d, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final void mo34453a(RectF rectF, Matrix matrix) {
        super.mo34453a(rectF, matrix);
        Bitmap c = m39582c();
        if (c != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) c.getWidth()), Math.min(rectF.bottom, (float) c.getHeight()));
            this.f49828a.mapRect(rectF);
        }
    }

    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34498b(Canvas canvas, Matrix matrix, int i) {
        try {
            Bitmap c = m39582c();
            if (c == null) {
                return;
            }
            if (!c.isRecycled()) {
                float a = C21087h.m39715a();
                this.f49859g.setAlpha(i);
                AbstractC20954a<ColorFilter, ColorFilter> aVar = this.f49862j;
                if (aVar != null) {
                    this.f49859g.setColorFilter(aVar.mo34470d());
                }
                canvas.save();
                canvas.concat(matrix);
                this.f49860h.set(0, 0, c.getWidth(), c.getHeight());
                this.f49861i.set(0, 0, (int) (((float) c.getWidth()) * a), (int) (((float) c.getHeight()) * a));
                canvas.drawBitmap(c, this.f49860h, this.f49861i, this.f49859g);
                canvas.restore();
            }
        } catch (Exception unused) {
        }
    }
}

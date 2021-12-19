package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.l */
public final class C24222l extends Drawable implements AbstractC24220j {

    /* renamed from: a */
    final float[] f57385a = new float[8];

    /* renamed from: b */
    float[] f57386b;

    /* renamed from: c */
    final Paint f57387c = new Paint(1);

    /* renamed from: d */
    final Path f57388d = new Path();

    /* renamed from: e */
    final Path f57389e = new Path();

    /* renamed from: f */
    public int f57390f = 0;

    /* renamed from: g */
    private final float[] f57391g = new float[8];

    /* renamed from: h */
    private boolean f57392h = false;

    /* renamed from: i */
    private float f57393i = 0.0f;

    /* renamed from: j */
    private float f57394j = 0.0f;

    /* renamed from: k */
    private int f57395k = 0;

    /* renamed from: l */
    private boolean f57396l = false;

    /* renamed from: m */
    private final RectF f57397m = new RectF();

    /* renamed from: n */
    private int f57398n = 255;

    static {
        Covode.recordClassIndex(28353);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getAlpha() {
        return this.f57398n;
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39907a() {
        C24091i.m45621a(true, (Object) "radius should be non negative");
        Arrays.fill(this.f57391g, 0.0f);
        m45966b();
        invalidateSelf();
    }

    public final int getOpacity() {
        int a = C24215e.m45945a(this.f57390f, this.f57398n) >>> 24;
        if (a == 255) {
            return -1;
        }
        if (a == 0) {
            return -2;
        }
        return -3;
    }

    /* renamed from: b */
    private void m45966b() {
        float[] fArr;
        float f;
        float[] fArr2;
        this.f57388d.reset();
        this.f57389e.reset();
        this.f57397m.set(getBounds());
        RectF rectF = this.f57397m;
        float f2 = this.f57393i;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.f57392h) {
            this.f57389e.addCircle(this.f57397m.centerX(), this.f57397m.centerY(), Math.min(this.f57397m.width(), this.f57397m.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f57385a;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f57391g[i2] + this.f57394j) - (this.f57393i / 2.0f);
                i2++;
            }
            this.f57389e.addRoundRect(this.f57397m, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f57397m;
        float f3 = this.f57393i;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.f57394j;
        if (this.f57396l) {
            f = this.f57393i;
        } else {
            f = 0.0f;
        }
        float f5 = f4 + f;
        this.f57397m.inset(f5, f5);
        if (this.f57392h) {
            this.f57388d.addCircle(this.f57397m.centerX(), this.f57397m.centerY(), Math.min(this.f57397m.width(), this.f57397m.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f57396l) {
            if (this.f57386b == null) {
                this.f57386b = new float[8];
            }
            while (true) {
                fArr2 = this.f57386b;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f57391g[i] - this.f57393i;
                i++;
            }
            this.f57388d.addRoundRect(this.f57397m, fArr2, Path.Direction.CW);
        } else {
            this.f57388d.addRoundRect(this.f57397m, this.f57391g, Path.Direction.CW);
        }
        float f6 = -f5;
        this.f57397m.inset(f6, f6);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m45966b();
    }

    /* renamed from: a */
    public static C24222l m45965a(ColorDrawable colorDrawable) {
        return new C24222l(colorDrawable.getColor());
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: b */
    public final void mo39912b(boolean z) {
        if (this.f57396l != z) {
            this.f57396l = z;
            m45966b();
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f57398n) {
            this.f57398n = i;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39908a(float f) {
        if (this.f57394j != f) {
            this.f57394j = f;
            m45966b();
            invalidateSelf();
        }
    }

    private C24222l(int i) {
        if (this.f57390f != i) {
            this.f57390f = i;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.f57387c.setColor(C24215e.m45945a(this.f57390f, this.f57398n));
        this.f57387c.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f57388d, this.f57387c);
        if (this.f57393i != 0.0f) {
            this.f57387c.setColor(C24215e.m45945a(this.f57395k, this.f57398n));
            this.f57387c.setStyle(Paint.Style.STROKE);
            this.f57387c.setStrokeWidth(this.f57393i);
            canvas.drawPath(this.f57389e, this.f57387c);
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39910a(boolean z) {
        this.f57392h = z;
        m45966b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39911a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f57391g, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C24091i.m45621a(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f57391g, 0, 8);
        }
        m45966b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39909a(int i, float f) {
        if (this.f57395k != i) {
            this.f57395k = i;
            invalidateSelf();
        }
        if (this.f57393i != f) {
            this.f57393i = f;
            m45966b();
            invalidateSelf();
        }
    }
}

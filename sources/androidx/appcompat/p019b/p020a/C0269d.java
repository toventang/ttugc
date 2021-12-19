package androidx.appcompat.p019b.p020a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.b.a.d */
public final class C0269d extends Drawable {

    /* renamed from: i */
    private static final float f874i = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f875a;

    /* renamed from: b */
    public float f876b;

    /* renamed from: c */
    public float f877c;

    /* renamed from: d */
    public float f878d;

    /* renamed from: e */
    public float f879e;

    /* renamed from: f */
    public boolean f880f;

    /* renamed from: g */
    public float f881g;

    /* renamed from: h */
    public int f882h;

    /* renamed from: j */
    private final Path f883j;

    /* renamed from: k */
    private final int f884k;

    /* renamed from: l */
    private boolean f885l;

    /* renamed from: m */
    private float f886m;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f884k;
    }

    public final int getIntrinsicWidth() {
        return this.f884k;
    }

    static {
        Covode.recordClassIndex(303);
    }

    /* renamed from: a */
    public final void mo727a(float f) {
        if (this.f881g != f) {
            this.f881g = f;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f875a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo728a(boolean z) {
        if (this.f885l != z) {
            this.f885l = z;
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f875a.getAlpha()) {
            this.f875a.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Rect bounds = getBounds();
        int i2 = this.f882h;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? C0705a.m2507f(this) == 0 : C0705a.m2507f(this) == 1))) {
            z = true;
        }
        float f3 = this.f876b;
        float f4 = this.f877c;
        float f5 = this.f881g;
        float sqrt = ((((float) Math.sqrt((double) ((f3 * f3) * 2.0f))) - f4) * f5) + f4;
        float f6 = f4 + ((this.f878d - f4) * f5);
        float round = (float) Math.round(((this.f886m - 0.0f) * f5) + 0.0f);
        float f7 = f874i;
        float f8 = this.f881g;
        float f9 = ((f7 - 0.0f) * f8) + 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float f10 = f + ((f2 - f) * f8);
        double d = (double) sqrt;
        double d2 = (double) f9;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f883j.rewind();
        float strokeWidth = this.f879e + this.f875a.getStrokeWidth();
        float f11 = strokeWidth + (((-this.f886m) - strokeWidth) * this.f881g);
        float f12 = (-f6) / 2.0f;
        this.f883j.moveTo(f12 + round, 0.0f);
        this.f883j.rLineTo(f6 - (round * 2.0f), 0.0f);
        this.f883j.moveTo(f12, f11);
        this.f883j.rLineTo(round2, round3);
        this.f883j.moveTo(f12, -f11);
        this.f883j.rLineTo(round2, -round3);
        this.f883j.close();
        canvas.save();
        float strokeWidth2 = this.f875a.getStrokeWidth();
        float f13 = this.f879e;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) ((((float) bounds.height()) - (3.0f * strokeWidth2)) - (2.0f * f13))) / 4) * 2)) + (strokeWidth2 * 1.5f) + f13);
        if (this.f880f) {
            if (this.f885l ^ z) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(f10 * ((float) i));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f883j, this.f875a);
        canvas.restore();
    }
}

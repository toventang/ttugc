package com.google.android.material.p1959h;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.appcompat.p019b.p020a.C0268c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.h.a */
public final class C26646a extends C0268c {

    /* renamed from: b */
    static final double f63035b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    final Paint f63036c;

    /* renamed from: d */
    final Paint f63037d;

    /* renamed from: e */
    final RectF f63038e;

    /* renamed from: f */
    public float f63039f;

    /* renamed from: g */
    Path f63040g;

    /* renamed from: h */
    float f63041h;

    /* renamed from: i */
    public float f63042i;

    /* renamed from: j */
    float f63043j;

    /* renamed from: k */
    public float f63044k;

    /* renamed from: l */
    public float f63045l;

    /* renamed from: m */
    private boolean f63046m;

    /* renamed from: n */
    private final int f63047n;

    /* renamed from: o */
    private final int f63048o;

    /* renamed from: p */
    private final int f63049p;

    /* renamed from: q */
    private boolean f63050q;

    /* renamed from: r */
    private boolean f63051r;

    @Override // androidx.appcompat.p019b.p020a.C0268c
    public final int getOpacity() {
        return -3;
    }

    static {
        Covode.recordClassIndex(32097);
    }

    @Override // androidx.appcompat.p019b.p020a.C0268c
    public final void onBoundsChange(Rect rect) {
        this.f63046m = true;
    }

    /* renamed from: a */
    public final void mo44106a(float f) {
        mo44107a(f, this.f63042i);
    }

    /* renamed from: b */
    private static int m52893b(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    @Override // androidx.appcompat.p019b.p020a.C0268c
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f63036c.setAlpha(i);
        this.f63037d.setAlpha(i);
    }

    @Override // androidx.appcompat.p019b.p020a.C0268c
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m52891a(this.f63042i, this.f63039f, this.f63050q));
        int ceil2 = (int) Math.ceil((double) m52892b(this.f63042i, this.f63039f, this.f63050q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // androidx.appcompat.p019b.p020a.C0268c
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f63046m) {
            Rect bounds = getBounds();
            float f = this.f63042i * 1.5f;
            this.f63038e.set(((float) bounds.left) + this.f63042i, ((float) bounds.top) + f, ((float) bounds.right) - this.f63042i, ((float) bounds.bottom) - f);
            this.f873a.setBounds((int) this.f63038e.left, (int) this.f63038e.top, (int) this.f63038e.right, (int) this.f63038e.bottom);
            float f2 = this.f63039f;
            RectF rectF = new RectF(-f2, -f2, f2, f2);
            RectF rectF2 = new RectF(rectF);
            float f3 = this.f63043j;
            rectF2.inset(-f3, -f3);
            Path path = this.f63040g;
            if (path == null) {
                this.f63040g = new Path();
            } else {
                path.reset();
            }
            this.f63040g.setFillType(Path.FillType.EVEN_ODD);
            this.f63040g.moveTo(-this.f63039f, 0.0f);
            this.f63040g.rLineTo(-this.f63043j, 0.0f);
            this.f63040g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f63040g.arcTo(rectF, 270.0f, -90.0f, false);
            this.f63040g.close();
            float f4 = -rectF2.top;
            if (f4 > 0.0f) {
                float f5 = this.f63039f / f4;
                this.f63036c.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.f63047n, this.f63048o, this.f63049p}, new float[]{0.0f, f5, ((1.0f - f5) / 2.0f) + f5, 1.0f}, Shader.TileMode.CLAMP));
            }
            z = true;
            this.f63037d.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f63047n, this.f63048o, this.f63049p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f63037d.setAntiAlias(false);
            this.f63046m = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        canvas.rotate(this.f63045l, this.f63038e.centerX(), this.f63038e.centerY());
        float f6 = this.f63039f;
        float f7 = (-f6) - this.f63043j;
        float f8 = f6 * 2.0f;
        if (this.f63038e.width() - f8 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f63038e.height() - f8 <= 0.0f) {
            z = false;
        }
        float f9 = this.f63044k;
        float f10 = f6 / ((f9 - (0.5f * f9)) + f6);
        float f11 = f6 / ((f9 - (0.25f * f9)) + f6);
        float f12 = f6 / ((f9 - (1.0f * f9)) + f6);
        int save2 = canvas.save();
        canvas.translate(this.f63038e.left + f6, this.f63038e.top + f6);
        canvas.scale(f10, f11);
        canvas.drawPath(this.f63040g, this.f63036c);
        if (z2) {
            canvas.scale(1.0f / f10, 1.0f);
            canvas.drawRect(0.0f, f7, this.f63038e.width() - f8, -this.f63039f, this.f63037d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f63038e.right - f6, this.f63038e.bottom - f6);
        canvas.scale(f10, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f63040g, this.f63036c);
        if (z2) {
            canvas.scale(1.0f / f10, 1.0f);
            canvas.drawRect(0.0f, f7, this.f63038e.width() - f8, (-this.f63039f) + this.f63043j, this.f63037d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f63038e.left + f6, this.f63038e.bottom - f6);
        canvas.scale(f10, f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f63040g, this.f63036c);
        if (z) {
            canvas.scale(1.0f / f12, 1.0f);
            canvas.drawRect(0.0f, f7, this.f63038e.height() - f8, -this.f63039f, this.f63037d);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(this.f63038e.right - f6, this.f63038e.top + f6);
        canvas.scale(f10, f11);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f63040g, this.f63036c);
        if (z) {
            canvas.scale(1.0f / f11, 1.0f);
            canvas.drawRect(0.0f, f7, this.f63038e.height() - f8, -this.f63039f, this.f63037d);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }

    /* renamed from: a */
    public final void mo44107a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = (float) m52893b(f);
        float b2 = (float) m52893b(f2);
        if (b > b2) {
            if (!this.f63051r) {
                this.f63051r = true;
            }
            b = b2;
        }
        if (this.f63044k != b || this.f63042i != b2) {
            this.f63044k = b;
            this.f63042i = b2;
            this.f63043j = (float) Math.round(b * 1.5f);
            this.f63041h = b2;
            this.f63046m = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public static float m52891a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f63035b;
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: b */
    public static float m52892b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f63035b;
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }
}

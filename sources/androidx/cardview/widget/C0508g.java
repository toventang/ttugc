package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.g */
public final class C0508g extends Drawable {

    /* renamed from: a */
    static AbstractC0509a f1916a;

    /* renamed from: g */
    private static final double f1917g = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public float f1918b;

    /* renamed from: c */
    public float f1919c;

    /* renamed from: d */
    public float f1920d;

    /* renamed from: e */
    public ColorStateList f1921e;

    /* renamed from: f */
    boolean f1922f = true;

    /* renamed from: h */
    private final int f1923h;

    /* renamed from: i */
    private Paint f1924i;

    /* renamed from: j */
    private Paint f1925j;

    /* renamed from: k */
    private Paint f1926k;

    /* renamed from: l */
    private final RectF f1927l;

    /* renamed from: m */
    private Path f1928m;

    /* renamed from: n */
    private float f1929n;

    /* renamed from: o */
    private final int f1930o;

    /* renamed from: p */
    private final int f1931p;

    /* renamed from: q */
    private boolean f1932q = true;

    /* renamed from: r */
    private boolean f1933r;

    /* renamed from: androidx.cardview.widget.g$a */
    interface AbstractC0509a {
        static {
            Covode.recordClassIndex(576);
        }

        /* renamed from: a */
        void mo2223a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    static {
        Covode.recordClassIndex(575);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1921e;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo2250a() {
        float f = this.f1919c;
        return (Math.max(f, this.f1918b + ((float) this.f1923h) + (f / 2.0f)) * 2.0f) + ((this.f1919c + ((float) this.f1923h)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo2254b() {
        float f = this.f1919c;
        return (Math.max(f, this.f1918b + ((float) this.f1923h) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1919c * 1.5f) + ((float) this.f1923h)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2253a(boolean z) {
        this.f1932q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1922f = true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1924i.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private static int m1885a(float f) {
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.f1924i.setAlpha(i);
        this.f1925j.setAlpha(i);
        this.f1926k.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1921e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1924i.getColor() == colorForState) {
            return false;
        }
        this.f1924i.setColor(colorForState);
        this.f1922f = true;
        invalidateSelf();
        return true;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1884a(this.f1919c, this.f1918b, this.f1932q));
        int ceil2 = (int) Math.ceil((double) m1886b(this.f1919c, this.f1918b, this.f1932q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2252a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1921e = colorStateList;
        this.f1924i.setColor(colorStateList.getColorForState(getState(), this.f1921e.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f1922f) {
            Rect bounds = getBounds();
            float f = this.f1919c * 1.5f;
            this.f1927l.set(((float) bounds.left) + this.f1919c, ((float) bounds.top) + f, ((float) bounds.right) - this.f1919c, ((float) bounds.bottom) - f);
            float f2 = this.f1918b;
            RectF rectF = new RectF(-f2, -f2, f2, f2);
            RectF rectF2 = new RectF(rectF);
            float f3 = this.f1929n;
            rectF2.inset(-f3, -f3);
            Path path = this.f1928m;
            if (path == null) {
                this.f1928m = new Path();
            } else {
                path.reset();
            }
            this.f1928m.setFillType(Path.FillType.EVEN_ODD);
            this.f1928m.moveTo(-this.f1918b, 0.0f);
            this.f1928m.rLineTo(-this.f1929n, 0.0f);
            this.f1928m.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1928m.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1928m.close();
            float f4 = this.f1918b;
            float f5 = f4 / (this.f1929n + f4);
            Paint paint = this.f1925j;
            float f6 = this.f1918b + this.f1929n;
            int i = this.f1930o;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.f1931p}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f1926k;
            float f7 = this.f1918b;
            float f8 = this.f1929n;
            float f9 = (-f7) + f8;
            float f10 = (-f7) - f8;
            int i2 = this.f1930o;
            paint2.setShader(new LinearGradient(0.0f, f9, 0.0f, f10, new int[]{i2, i2, this.f1931p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1926k.setAntiAlias(false);
            this.f1922f = false;
        }
        canvas.translate(0.0f, this.f1920d / 2.0f);
        float f11 = this.f1918b;
        float f12 = (-f11) - this.f1929n;
        float f13 = f11 + ((float) this.f1923h) + (this.f1920d / 2.0f);
        float f14 = f13 * 2.0f;
        if (this.f1927l.width() - f14 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1927l.height() - f14 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        canvas.translate(this.f1927l.left + f13, this.f1927l.top + f13);
        canvas.drawPath(this.f1928m, this.f1925j);
        if (z) {
            canvas.drawRect(0.0f, f12, this.f1927l.width() - f14, -this.f1918b, this.f1926k);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f1927l.right - f13, this.f1927l.bottom - f13);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1928m, this.f1925j);
        if (z) {
            canvas.drawRect(0.0f, f12, this.f1927l.width() - f14, (-this.f1918b) + this.f1929n, this.f1926k);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f1927l.left + f13, this.f1927l.bottom - f13);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1928m, this.f1925j);
        if (z2) {
            canvas.drawRect(0.0f, f12, this.f1927l.height() - f14, -this.f1918b, this.f1926k);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f1927l.right - f13, this.f1927l.top + f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1928m, this.f1925j);
        if (z2) {
            canvas.drawRect(0.0f, f12, this.f1927l.height() - f14, -this.f1918b, this.f1926k);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1920d) / 2.0f);
        f1916a.mo2223a(canvas, this.f1927l, this.f1918b, this.f1924i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2251a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float a = (float) m1885a(f);
            float a2 = (float) m1885a(f2);
            if (a > a2) {
                if (!this.f1933r) {
                    this.f1933r = true;
                }
                a = a2;
            }
            if (this.f1920d != a || this.f1919c != a2) {
                this.f1920d = a;
                this.f1919c = a2;
                this.f1929n = (float) ((int) ((a * 1.5f) + ((float) this.f1923h) + 0.5f));
                this.f1922f = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: a */
    static float m1884a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f1917g;
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: b */
    static float m1886b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f1917g;
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    C0508g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1930o = resources.getColor(R.color.ev);
        this.f1931p = resources.getColor(R.color.eu);
        this.f1923h = resources.getDimensionPixelSize(R.dimen.e8);
        this.f1924i = new Paint(5);
        mo2252a(colorStateList);
        Paint paint = new Paint(5);
        this.f1925j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1918b = (float) ((int) (f + 0.5f));
        this.f1927l = new RectF();
        Paint paint2 = new Paint(this.f1925j);
        this.f1926k = paint2;
        paint2.setAntiAlias(false);
        mo2251a(f2, f3);
    }
}

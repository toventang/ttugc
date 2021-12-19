package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.f */
public final class C0507f extends Drawable {

    /* renamed from: a */
    public float f1905a;

    /* renamed from: b */
    public float f1906b;

    /* renamed from: c */
    public ColorStateList f1907c;

    /* renamed from: d */
    private final Paint f1908d;

    /* renamed from: e */
    private final RectF f1909e;

    /* renamed from: f */
    private final Rect f1910f;

    /* renamed from: g */
    private boolean f1911g;

    /* renamed from: h */
    private boolean f1912h = true;

    /* renamed from: i */
    private PorterDuffColorFilter f1913i;

    /* renamed from: j */
    private ColorStateList f1914j;

    /* renamed from: k */
    private PorterDuff.Mode f1915k = PorterDuff.Mode.SRC_IN;

    static {
        Covode.recordClassIndex(574);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1914j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1907c;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1910f, this.f1905a);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo2239a(rect);
    }

    public final void setAlpha(int i) {
        this.f1908d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1908d.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f1914j = colorStateList;
        this.f1913i = m1880a(colorStateList, this.f1915k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1915k = mode;
        this.f1913i = m1880a(this.f1914j, mode);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1908d;
        if (this.f1913i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1913i);
            z = true;
        }
        RectF rectF = this.f1909e;
        float f = this.f1905a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1907c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f1908d.getColor()) {
            z = true;
            this.f1908d.setColor(colorForState);
        } else {
            z = false;
        }
        ColorStateList colorStateList2 = this.f1914j;
        if (colorStateList2 == null || (mode = this.f1915k) == null) {
            return z;
        }
        this.f1913i = m1880a(colorStateList2, mode);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2238a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1907c = colorStateList;
        this.f1908d.setColor(colorStateList.getColorForState(getState(), this.f1907c.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2239a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1909e.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1910f.set(rect);
        if (this.f1911g) {
            float a = C0508g.m1884a(this.f1906b, this.f1905a, this.f1912h);
            this.f1910f.inset((int) Math.ceil((double) C0508g.m1886b(this.f1906b, this.f1905a, this.f1912h)), (int) Math.ceil((double) a));
            this.f1909e.set(this.f1910f);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1880a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    C0507f(ColorStateList colorStateList, float f) {
        this.f1905a = f;
        this.f1908d = new Paint(5);
        mo2238a(colorStateList);
        this.f1909e = new RectF();
        this.f1910f = new Rect();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2237a(float f, boolean z, boolean z2) {
        if (f != this.f1906b || this.f1911g != z || this.f1912h != z2) {
            this.f1906b = f;
            this.f1911g = z;
            this.f1912h = z2;
            mo2239a((Rect) null);
            invalidateSelf();
        }
    }
}

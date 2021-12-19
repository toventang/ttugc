package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.drawable.b */
public abstract class AbstractC0706b extends Drawable {

    /* renamed from: a */
    public final Bitmap f2782a;

    /* renamed from: b */
    public int f2783b = 119;

    /* renamed from: c */
    public final Paint f2784c = new Paint(3);

    /* renamed from: d */
    public final BitmapShader f2785d;

    /* renamed from: e */
    public float f2786e;

    /* renamed from: f */
    final Rect f2787f = new Rect();

    /* renamed from: g */
    public boolean f2788g = true;

    /* renamed from: h */
    public boolean f2789h;

    /* renamed from: i */
    private int f2790i = 160;

    /* renamed from: j */
    private final Matrix f2791j = new Matrix();

    /* renamed from: k */
    private final RectF f2792k = new RectF();

    /* renamed from: l */
    private int f2793l;

    /* renamed from: m */
    private int f2794m;

    static {
        Covode.recordClassIndex(787);
    }

    /* renamed from: b */
    private static boolean m2508b(float f) {
        return f > 0.05f;
    }

    public int getIntrinsicHeight() {
        return this.f2794m;
    }

    public int getIntrinsicWidth() {
        return this.f2793l;
    }

    public int getAlpha() {
        return this.f2784c.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f2784c.getColorFilter();
    }

    /* renamed from: b */
    public final void mo2740b() {
        this.f2786e = (float) (Math.min(this.f2794m, this.f2793l) / 2);
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f2783b != 119 || this.f2789h || (bitmap = this.f2782a) == null || bitmap.hasAlpha() || this.f2784c.getAlpha() < 255 || m2508b(this.f2786e)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2737a() {
        if (this.f2788g) {
            if (this.f2789h) {
                int min = Math.min(this.f2793l, this.f2794m);
                mo2739a(this.f2783b, min, min, getBounds(), this.f2787f);
                int min2 = Math.min(this.f2787f.width(), this.f2787f.height());
                this.f2787f.inset(Math.max(0, (this.f2787f.width() - min2) / 2), Math.max(0, (this.f2787f.height() - min2) / 2));
                this.f2786e = ((float) min2) * 0.5f;
            } else {
                mo2739a(this.f2783b, this.f2793l, this.f2794m, getBounds(), this.f2787f);
            }
            this.f2792k.set(this.f2787f);
            if (this.f2785d != null) {
                this.f2791j.setTranslate(this.f2792k.left, this.f2792k.top);
                this.f2791j.preScale(this.f2792k.width() / ((float) this.f2782a.getWidth()), this.f2792k.height() / ((float) this.f2782a.getHeight()));
                this.f2785d.setLocalMatrix(this.f2791j);
                this.f2784c.setShader(this.f2785d);
            }
            this.f2788g = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f2789h) {
            mo2740b();
        }
        this.f2788g = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2784c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f2784c.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f2784c.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setAlpha(int i) {
        if (i != this.f2784c.getAlpha()) {
            this.f2784c.setAlpha(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo2738a(float f) {
        if (this.f2786e != f) {
            this.f2789h = false;
            if (m2508b(f)) {
                this.f2784c.setShader(this.f2785d);
            } else {
                this.f2784c.setShader(null);
            }
            this.f2786e = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f2782a;
        if (bitmap != null) {
            mo2737a();
            if (this.f2784c.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f2787f, this.f2784c);
                return;
            }
            RectF rectF = this.f2792k;
            float f = this.f2786e;
            canvas.drawRoundRect(rectF, f, f, this.f2784c);
        }
    }

    AbstractC0706b(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f2790i = resources.getDisplayMetrics().densityDpi;
        }
        this.f2782a = bitmap;
        if (bitmap != null) {
            this.f2793l = bitmap.getScaledWidth(this.f2790i);
            this.f2794m = bitmap.getScaledHeight(this.f2790i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f2785d = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f2794m = -1;
        this.f2793l = -1;
        this.f2785d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2739a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }
}

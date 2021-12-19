package com.facebook.drawee.p1854e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1891p.C24644b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.drawee.e.k */
public final class C24221k extends AbstractC24226n {

    /* renamed from: A */
    private WeakReference<Bitmap> f57381A;

    /* renamed from: a */
    public final Paint f57382a;

    /* renamed from: y */
    private final Paint f57383y;

    /* renamed from: z */
    private final Bitmap f57384z;

    static {
        Covode.recordClassIndex(28352);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    /* renamed from: b */
    public final boolean mo39913b() {
        if (!super.mo39913b() || this.f57384z == null) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.f57384z;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.f57384z;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f57382a.setColorFilter(colorFilter);
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    public final void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f57382a.getAlpha()) {
            this.f57382a.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    public final void draw(Canvas canvas) {
        C24644b.m47156a();
        if (!mo39913b()) {
            super.draw(canvas);
            C24644b.m47156a();
            return;
        }
        mo39926c();
        mo39928d();
        WeakReference<Bitmap> weakReference = this.f57381A;
        if (weakReference == null || weakReference.get() != this.f57384z) {
            this.f57381A = new WeakReference<>(this.f57384z);
            this.f57382a.setFilterBitmap(true);
            Paint paint = this.f57382a;
            Bitmap bitmap = this.f57384z;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f57425g = true;
        }
        if (this.f57425g) {
            this.f57382a.getShader().setLocalMatrix(this.f57442x);
            this.f57425g = false;
        }
        int save = canvas.save();
        canvas.concat(this.f57439u);
        canvas.drawPath(this.f57424f, this.f57382a);
        if (this.f57423e > 0.0f) {
            this.f57383y.setStrokeWidth(this.f57423e);
            this.f57383y.setColor(C24215e.m45945a(this.f57426h, this.f57382a.getAlpha()));
            canvas.drawPath(this.f57427i, this.f57383y);
        }
        canvas.restoreToCount(save);
        C24644b.m47156a();
    }

    public C24221k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f57382a = paint2;
        Paint paint3 = new Paint(1);
        this.f57383y = paint3;
        this.f57384z = bitmap;
        if (Build.VERSION.SDK_INT >= 24 && (this.f57420b instanceof BitmapDrawable) && bitmap != null && bitmap.getDensity() == DisplayMetrics.DENSITY_DEVICE_STABLE) {
            ((BitmapDrawable) this.f57420b).setTargetDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        }
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }
}

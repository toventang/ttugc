package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.e.g */
public class C24217g extends Drawable implements Drawable.Callback, AbstractC24213c, AbstractC24242r, AbstractC24243s {
    private static final Matrix sTempTransform = new Matrix();
    private Drawable mCurrentDelegate;
    private final C24214d mDrawableProperties = new C24214d();
    protected AbstractC24243s mTransformCallback;

    public Drawable getCurrent() {
        return this.mCurrentDelegate;
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24213c
    public Drawable getDrawable() {
        return getCurrent();
    }

    public Drawable mutate() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    static {
        Covode.recordClassIndex(28348);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean isStateful() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24243s
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24242r
    public void setTransformCallback(AbstractC24243s sVar) {
        this.mTransformCallback = sVar;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public Drawable setCurrent(Drawable drawable) {
        Drawable currentWithoutInvalidate = setCurrentWithoutInvalidate(drawable);
        invalidateSelf();
        return currentWithoutInvalidate;
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24213c
    public Drawable setDrawable(Drawable drawable) {
        return setCurrent(drawable);
    }

    public C24217g(Drawable drawable) {
        this.mCurrentDelegate = drawable;
        C24215e.m45946a(drawable, this, this);
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void getParentTransform(Matrix matrix) {
        AbstractC24243s sVar = this.mTransformCallback;
        if (sVar != null) {
            sVar.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24243s
    public void getRootBounds(RectF rectF) {
        AbstractC24243s sVar = this.mTransformCallback;
        if (sVar != null) {
            sVar.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransformedBounds(RectF rectF) {
        Matrix matrix = sTempTransform;
        getParentTransform(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public void setAlpha(int i) {
        this.mDrawableProperties.f57358a = i;
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawableProperties.mo39870a(colorFilter);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.mDrawableProperties.mo39872a(z);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawableProperties.mo39873b(z);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    /* access modifiers changed from: protected */
    public Drawable setCurrentWithoutInvalidate(Drawable drawable) {
        Drawable drawable2 = this.mCurrentDelegate;
        C24215e.m45946a(drawable2, null, null);
        C24215e.m45946a(drawable, null, null);
        C24215e.m45948a(drawable, this.mDrawableProperties);
        C24215e.m45947a(drawable, this);
        C24215e.m45946a(drawable, this, this);
        this.mCurrentDelegate = drawable;
        return drawable2;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}

package androidx.appcompat.p019b.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.b.a.c */
public class C0268c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f873a;

    static {
        Covode.recordClassIndex(302);
    }

    public int getChangingConfigurations() {
        return this.f873a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f873a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f873a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f873a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f873a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f873a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f873a.getOpacity();
    }

    public int[] getState() {
        return this.f873a.getState();
    }

    public Region getTransparentRegion() {
        return this.f873a.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return C0705a.m2501a(this.f873a);
    }

    public boolean isStateful() {
        return this.f873a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f873a.jumpToCurrentState();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f873a.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f873a.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f873a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f873a.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f873a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0705a.m2500a(this.f873a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f873a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f873a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f873a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f873a.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return this.f873a.setState(iArr);
    }

    public void setTint(int i) {
        C0705a.m2494a(this.f873a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0705a.m2496a(this.f873a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0705a.m2499a(this.f873a, mode);
    }

    public C0268c(Drawable drawable) {
        Drawable drawable2 = this.f873a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f873a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        C0705a.m2493a(this.f873a, f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f873a.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0705a.m2495a(this.f873a, i, i2, i3, i4);
    }
}

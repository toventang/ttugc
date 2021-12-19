package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.g */
public class C0712g extends Drawable implements Drawable.Callback, AbstractC0710e, AbstractC0711f {

    /* renamed from: a */
    static final PorterDuff.Mode f2795a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0714i f2796b;

    /* renamed from: c */
    Drawable f2797c;

    /* renamed from: d */
    private int f2798d;

    /* renamed from: e */
    private PorterDuff.Mode f2799e;

    /* renamed from: f */
    private boolean f2800f;

    /* renamed from: g */
    private boolean f2801g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2758b() {
        return true;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0711f
    /* renamed from: a */
    public final Drawable mo2756a() {
        return this.f2797c;
    }

    /* renamed from: c */
    private C0714i m2519c() {
        return new C0714i(this.f2796b);
    }

    public Drawable getCurrent() {
        return this.f2797c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2797c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2797c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2797c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2797c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2797c.getOpacity();
    }

    public int[] getState() {
        return this.f2797c.getState();
    }

    public Region getTransparentRegion() {
        return this.f2797c.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.f2797c.isAutoMirrored();
    }

    public void jumpToCurrentState() {
        this.f2797c.jumpToCurrentState();
    }

    static {
        Covode.recordClassIndex(793);
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C0714i iVar = this.f2796b;
        if (iVar != null) {
            i = iVar.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f2797c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0714i iVar = this.f2796b;
        if (iVar == null || iVar.f2804b == null) {
            return null;
        }
        this.f2796b.f2803a = getChangingConfigurations();
        return this.f2796b;
    }

    public boolean isStateful() {
        C0714i iVar;
        ColorStateList colorStateList;
        if ((!mo2758b() || (iVar = this.f2796b) == null || (colorStateList = iVar.f2805c) == null || !colorStateList.isStateful()) && !this.f2797c.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f2801g && super.mutate() == this) {
            this.f2796b = m2519c();
            Drawable drawable = this.f2797c;
            if (drawable != null) {
                drawable.mutate();
            }
            C0714i iVar = this.f2796b;
            if (iVar != null) {
                Drawable drawable2 = this.f2797c;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                iVar.f2804b = constantState;
            }
            this.f2801g = true;
        }
        return this;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f2797c.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f2797c.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2797c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2797c.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f2797c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2797c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2797c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2797c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2797c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2797c.setFilterBitmap(z);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    C0712g(Drawable drawable) {
        this.f2796b = m2519c();
        mo2757a(drawable);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public void setTintList(ColorStateList colorStateList) {
        this.f2796b.f2805c = colorStateList;
        m2518a(getState());
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2796b.f2806d = mode;
        m2518a(getState());
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f2797c.setState(iArr);
        if (m2518a(iArr) || state) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2518a(int[] iArr) {
        if (!mo2758b()) {
            return false;
        }
        ColorStateList colorStateList = this.f2796b.f2805c;
        PorterDuff.Mode mode = this.f2796b.f2806d;
        if (colorStateList == null || mode == null) {
            this.f2800f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2800f && colorForState == this.f2798d && mode == this.f2799e)) {
                setColorFilter(colorForState, mode);
                this.f2798d = colorForState;
                this.f2799e = mode;
                this.f2800f = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0711f
    /* renamed from: a */
    public final void mo2757a(Drawable drawable) {
        Drawable drawable2 = this.f2797c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2797c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0714i iVar = this.f2796b;
            if (iVar != null) {
                iVar.f2804b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0712g(C0714i iVar, Resources resources) {
        this.f2796b = iVar;
        if (iVar != null && iVar.f2804b != null) {
            mo2757a(this.f2796b.f2804b.newDrawable(resources));
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f2797c.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}

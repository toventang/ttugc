package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.h */
public final class C0713h extends C0712g {

    /* renamed from: d */
    private static Method f2802d;

    static {
        Covode.recordClassIndex(794);
    }

    public final Rect getDirtyBounds() {
        return this.f2797c.getDirtyBounds();
    }

    /* renamed from: c */
    private static void m2523c() {
        if (f2802d == null) {
            try {
                f2802d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.drawable.C0712g
    /* renamed from: b */
    public final boolean mo2758b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2797c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final boolean isProjected() {
        Method method;
        if (!(this.f2797c == null || (method = f2802d) == null)) {
            try {
                return ((Boolean) method.invoke(this.f2797c, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    C0713h(Drawable drawable) {
        super(drawable);
        m2523c();
    }

    public final void getOutline(Outline outline) {
        this.f2797c.getOutline(outline);
    }

    @Override // androidx.core.graphics.drawable.C0712g
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0712g, androidx.core.graphics.drawable.AbstractC0710e
    public final void setTint(int i) {
        if (mo2758b()) {
            super.setTint(i);
        } else {
            this.f2797c.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0712g, androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintList(ColorStateList colorStateList) {
        if (mo2758b()) {
            super.setTintList(colorStateList);
        } else {
            this.f2797c.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0712g, androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo2758b()) {
            super.setTintMode(mode);
        } else {
            this.f2797c.setTintMode(mode);
        }
    }

    public final void setHotspot(float f, float f2) {
        this.f2797c.setHotspot(f, f2);
    }

    C0713h(C0714i iVar, Resources resources) {
        super(iVar, resources);
        m2523c();
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2797c.setHotspotBounds(i, i2, i3, i4);
    }
}

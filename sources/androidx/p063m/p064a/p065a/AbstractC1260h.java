package androidx.p063m.p064a.p065a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.AbstractC0710e;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.m.a.a.h */
public abstract class AbstractC1260h extends Drawable implements AbstractC0710e {

    /* renamed from: b */
    Drawable f4117b;

    static {
        Covode.recordClassIndex(1369);
    }

    AbstractC1260h() {
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int[] getState() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4117b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        return drawable.getColorFilter();
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            C0705a.m2497a(drawable, theme);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            C0705a.m2493a(drawable, f, f2);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f4117b;
        if (drawable != null) {
            C0705a.m2495a(drawable, i, i2, i3, i4);
        }
    }
}

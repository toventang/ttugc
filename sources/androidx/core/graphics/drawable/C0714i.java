package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.i */
public final class C0714i extends Drawable.ConstantState {

    /* renamed from: a */
    int f2803a;

    /* renamed from: b */
    Drawable.ConstantState f2804b;

    /* renamed from: c */
    ColorStateList f2805c;

    /* renamed from: d */
    PorterDuff.Mode f2806d = C0712g.f2795a;

    static {
        Covode.recordClassIndex(795);
    }

    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    public final int getChangingConfigurations() {
        int i;
        int i2 = this.f2803a;
        Drawable.ConstantState constantState = this.f2804b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    C0714i(C0714i iVar) {
        if (iVar != null) {
            this.f2803a = iVar.f2803a;
            this.f2804b = iVar.f2804b;
            this.f2805c = iVar.f2805c;
            this.f2806d = iVar.f2806d;
        }
    }

    public final Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0713h(this, resources);
        }
        return new C0712g(this, resources);
    }
}

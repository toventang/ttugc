package androidx.core.p037h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.u */
public interface AbstractC0791u {
    static {
        Covode.recordClassIndex(872);
    }

    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}

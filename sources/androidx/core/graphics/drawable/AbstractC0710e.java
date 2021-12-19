package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.drawable.e */
public interface AbstractC0710e {
    static {
        Covode.recordClassIndex(791);
    }

    void setTint(int i);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(PorterDuff.Mode mode);
}

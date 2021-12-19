package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.widget.j */
public interface AbstractC0826j {
    static {
        Covode.recordClassIndex(909);
    }

    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}

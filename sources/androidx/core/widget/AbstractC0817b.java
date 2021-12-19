package androidx.core.widget;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.widget.b */
public interface AbstractC0817b {

    /* renamed from: d */
    public static final boolean f3045d;

    int getAutoSizeMaxTextSize();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);

    void setAutoSizeTextTypeWithDefaults(int i);

    static {
        boolean z;
        Covode.recordClassIndex(900);
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f3045d = z;
    }
}

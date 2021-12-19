package androidx.p060l;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.f */
final class C1118f {
    static {
        Covode.recordClassIndex(1211);
    }

    /* renamed from: a */
    static <T> ObjectAnimator m3727a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C1120h(property, path), 0.0f, 1.0f);
    }
}

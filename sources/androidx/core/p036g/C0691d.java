package androidx.core.p036g;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: androidx.core.g.d */
public final class C0691d {
    static {
        Covode.recordClassIndex(770);
    }

    /* renamed from: a */
    public static int m2447a(Object... objArr) {
        int i = Build.VERSION.SDK_INT;
        return Objects.hash(objArr);
    }

    /* renamed from: a */
    public static boolean m2448a(Object obj, Object obj2) {
        int i = Build.VERSION.SDK_INT;
        return Objects.equals(obj, obj2);
    }
}

package androidx.core.p033d;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.d.h */
public final class C0655h {
    static {
        Covode.recordClassIndex(734);
    }

    /* renamed from: a */
    public static boolean m2392a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}

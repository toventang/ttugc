package androidx.core.p033d;

import android.os.Build;
import android.os.Environment;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: androidx.core.d.b */
public final class C0648b {
    static {
        Covode.recordClassIndex(727);
    }

    /* renamed from: a */
    public static String m2385a(File file) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Environment.getExternalStorageState(file);
        }
        int i = Build.VERSION.SDK_INT;
        return Environment.getStorageState(file);
    }
}

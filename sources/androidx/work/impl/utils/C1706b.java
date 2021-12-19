package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.AbstractC1600g;
import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.utils.b */
public final class C1706b {

    /* renamed from: a */
    private static final String f5510a = AbstractC1600g.m5318a("PackageManagerHelper");

    static {
        Covode.recordClassIndex(1873);
    }

    /* renamed from: a */
    public static void m5599a(Context context, Class cls, boolean z) {
        int i;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            AbstractC1600g.m5317a();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            C1764a.m5928a("%s %s", objArr);
        } catch (Exception e) {
            AbstractC1600g.m5317a();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            C1764a.m5928a("%s could not be %s", objArr2);
            new Throwable[1][0] = e;
        }
    }
}

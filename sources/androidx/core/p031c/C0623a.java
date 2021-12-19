package androidx.core.p031c;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;

/* renamed from: androidx.core.c.a */
public final class C0623a {
    static {
        Covode.recordClassIndex(701);
    }

    /* renamed from: a */
    public static boolean m2313a(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        return connectivityManager.isActiveNetworkMetered();
    }

    /* renamed from: b */
    private static NetworkInfo m2314b(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }
}

package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class IConnectivityManagerProtector {
    private static final List<String> PROTECTED_METHODS = Arrays.asList("getNetworkCapabilities", "getAllNetworks", "getLinkProperties", "getLinkPropertiesForType");
    private static boolean sIsInit;

    static {
        Covode.recordClassIndex(26603);
    }

    /* renamed from: com_bytedance_sysoptimizer_java_IConnectivityManagerProtector_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m42862x1db25d9(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public static void install(Context context) {
        if (!sIsInit && context != null) {
            sIsInit = BinderServiceWrapperProtector.install(m42862x1db25d9(context), "connectivity", PROTECTED_METHODS, "ICMP", new BinderServiceWrapperProtector.AdminResult() {
                /* class com.bytedance.sysoptimizer.java.IConnectivityManagerProtector.C227211 */

                static {
                    Covode.recordClassIndex(26604);
                }

                /* renamed from: com_bytedance_sysoptimizer_java_IConnectivityManagerProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_e */
                public static int m42863x2e576cf(String str, String str2) {
                    return 0;
                }

                @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
                public final Object getDefaultResult(Object obj, Method method, Object[] objArr) {
                    if (Build.VERSION.SDK_INT < 21) {
                        m42863x2e576cf("ICMP", "it shouldn't reach here");
                        return null;
                    }
                    String name = method.getName();
                    if (!"getNetworkCapabilities".equals(name) && !"getAllNetworks".equals(name) && !"getLinkProperties".equals(name)) {
                        return new Object();
                    }
                    return null;
                }
            });
        }
    }
}

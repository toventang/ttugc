package com.p2082ss.android.ugc.aweme.login;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.legoImp.LoginProxyImpl;

/* renamed from: com.ss.android.ugc.aweme.login.c */
public class C58957c {

    /* renamed from: a */
    public static AbstractC34542e f134195a;

    /* renamed from: b */
    private static boolean f134196b;

    static {
        Covode.recordClassIndex(69284);
    }

    /* renamed from: a */
    private static AbstractC34542e m108317a() {
        MethodCollector.m26663i(11343);
        if (f134195a != null && !f134196b) {
            synchronized (C58957c.class) {
                try {
                    if (!f134196b) {
                        f134195a = LoginProxyImpl.m105236b().mo95711a();
                        f134196b = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11343);
                    throw th;
                }
            }
        }
        AbstractC34542e eVar = f134195a;
        MethodCollector.m26664o(11343);
        return eVar;
    }

    /* renamed from: a */
    public static void m108318a(Activity activity, String str, String str2) {
        m108320a(activity, str, str2, (Bundle) null, (AbstractC34543f) null);
    }

    /* renamed from: a */
    public static void m108322a(Fragment fragment, String str, String str2) {
        m108324a(fragment, str, str2, (Bundle) null, (AbstractC34543f) null);
    }

    /* renamed from: a */
    public static void m108319a(Activity activity, String str, String str2, Bundle bundle) {
        m108320a(activity, str, str2, bundle, (AbstractC34543f) null);
    }

    /* renamed from: a */
    public static void m108321a(Activity activity, String str, String str2, AbstractC34543f fVar) {
        m108320a(activity, str, str2, (Bundle) null, fVar);
    }

    /* renamed from: a */
    public static void m108323a(Fragment fragment, String str, String str2, Bundle bundle) {
        m108324a(fragment, str, str2, bundle, (AbstractC34543f) null);
    }

    /* renamed from: a */
    public static void m108325a(Fragment fragment, String str, String str2, AbstractC34543f fVar) {
        m108324a(fragment, str, str2, (Bundle) null, fVar);
    }

    /* renamed from: a */
    public static void m108320a(Activity activity, String str, String str2, Bundle bundle, AbstractC34543f fVar) {
        if (m108317a() == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (activity != null && !activity.isFinishing()) {
            m108317a().mo61010a(activity, str, str2, bundle, fVar);
        }
    }

    /* renamed from: a */
    public static void m108324a(Fragment fragment, String str, String str2, Bundle bundle, AbstractC34543f fVar) {
        if (m108317a() == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            m108317a().mo61011a(fragment, str, str2, bundle, fVar);
        }
    }
}

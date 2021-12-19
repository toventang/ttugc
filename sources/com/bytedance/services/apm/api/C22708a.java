package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.services.apm.api.a */
public final class C22708a {

    /* renamed from: a */
    public static IEnsure f53665a;

    static {
        Covode.recordClassIndex(26537);
    }

    /* renamed from: a */
    public static void m42800a(String str) {
        IEnsure iEnsure = f53665a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(str);
        }
    }

    /* renamed from: a */
    public static void m42802a(Throwable th) {
        IEnsure iEnsure = f53665a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th);
        }
    }

    /* renamed from: a */
    public static boolean m42804a(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = f53665a;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotNull(obj);
        return z;
    }

    /* renamed from: a */
    public static void m42801a(String str, Map<String, String> map) {
        IEnsure iEnsure = f53665a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(str, map);
        }
    }

    /* renamed from: a */
    public static void m42803a(Throwable th, String str) {
        IEnsure iEnsure = f53665a;
        if (iEnsure != null) {
            iEnsure.ensureNotReachHere(th, str);
        }
    }

    /* renamed from: a */
    public static boolean m42805a(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = f53665a;
        if (iEnsure == null) {
            return z;
        }
        iEnsure.ensureNotNull(obj, str);
        return z;
    }
}

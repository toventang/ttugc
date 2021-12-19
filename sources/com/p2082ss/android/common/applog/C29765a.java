package com.p2082ss.android.common.applog;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.common.applog.a */
public class C29765a implements AbstractC29793g {

    /* renamed from: a */
    private static C29765a f70980a;

    /* renamed from: b */
    private String f70981b;

    static {
        Covode.recordClassIndex(36170);
    }

    @Override // com.p2082ss.android.common.applog.AbstractC29793g
    /* renamed from: b */
    public final String mo52030b() {
        return this.f70981b;
    }

    private C29765a() {
        if (m59959c()) {
            String a = m59958a("ro.aliyun.clouduuid", "false");
            this.f70981b = a;
            if (TextUtils.isEmpty(a)) {
                this.f70981b = m59958a("ro.sys.aliyun.clouduuid", "false");
            }
        }
    }

    /* renamed from: a */
    public static C29765a m59957a() {
        MethodCollector.m26663i(11319);
        if (f70980a == null) {
            synchronized (C29765a.class) {
                try {
                    if (f70980a == null) {
                        f70980a = new C29765a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11319);
                    throw th;
                }
            }
        }
        C29765a aVar = f70980a;
        MethodCollector.m26664o(11319);
        return aVar;
    }

    /* renamed from: c */
    private static boolean m59959c() {
        try {
            if ((System.getProperty("java.vm.name") == null || !System.getProperty("java.vm.name").toLowerCase().contains("lemur")) && System.getProperty("ro.yunos.version") == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static String m59958a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}

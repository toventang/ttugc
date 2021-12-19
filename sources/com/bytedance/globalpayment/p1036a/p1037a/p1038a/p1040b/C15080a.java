package com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1040b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.globalpayment.a.a.a.b.a */
public class C15080a {

    /* renamed from: b */
    private static volatile C15080a f36797b;

    /* renamed from: a */
    public final SharedPreferences f36798a;

    static {
        Covode.recordClassIndex(17248);
    }

    private C15080a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f36798a = C34822d.m71158a(applicationContext, "e_commerce_sp", 0);
    }

    /* renamed from: a */
    public static C15080a m27756a(Context context) {
        MethodCollector.m26663i(12126);
        if (f36797b == null) {
            synchronized (C15080a.class) {
                try {
                    if (f36797b == null) {
                        f36797b = new C15080a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12126);
                    throw th;
                }
            }
        }
        C15080a aVar = f36797b;
        MethodCollector.m26664o(12126);
        return aVar;
    }
}

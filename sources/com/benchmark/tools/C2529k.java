package com.benchmark.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.benchmark.tools.k */
public class C2529k {

    /* renamed from: b */
    private static C2529k f7650b;

    /* renamed from: a */
    public String f7651a = "default_config";

    static {
        Covode.recordClassIndex(2900);
    }

    private C2529k() {
    }

    /* renamed from: b */
    private void m7412b() {
        if (TextUtils.isEmpty(this.f7651a)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    /* renamed from: a */
    public static C2529k m7411a() {
        MethodCollector.m26663i(9167);
        if (f7650b == null) {
            synchronized (C2529k.class) {
                try {
                    if (f7650b == null) {
                        f7650b = new C2529k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9167);
                    throw th;
                }
            }
        }
        C2529k kVar = f7650b;
        MethodCollector.m26664o(9167);
        return kVar;
    }

    /* renamed from: a */
    private SharedPreferences m7410a(Context context) {
        if (context == null) {
            return null;
        }
        m7412b();
        return C34822d.m71158a(context, this.f7651a, 0);
    }

    /* renamed from: a */
    public final String mo6984a(Context context, String str) {
        SharedPreferences a = m7410a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, "");
    }

    /* renamed from: a */
    public final void mo6985a(Context context, String str, String str2) {
        SharedPreferences a = m7410a(context);
        if (a != null) {
            SharedPreferences.Editor edit = a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}

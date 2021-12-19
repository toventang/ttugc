package com.bytedance.geckox.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.geckox.utils.n */
public class C15067n {

    /* renamed from: b */
    private static C15067n f36785b;

    /* renamed from: a */
    public SharedPreferences f36786a;

    static {
        Covode.recordClassIndex(17235);
    }

    private C15067n() {
    }

    /* renamed from: a */
    public static C15067n m27740a() {
        MethodCollector.m26663i(3704);
        if (f36785b == null) {
            synchronized (C15067n.class) {
                try {
                    if (f36785b == null) {
                        f36785b = new C15067n();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3704);
                    throw th;
                }
            }
        }
        C15067n nVar = f36785b;
        MethodCollector.m26664o(3704);
        return nVar;
    }

    /* renamed from: a */
    public void mo24339a(Context context) {
        if (this.f36786a == null) {
            this.f36786a = C34822d.m71158a(context, "sp_gecko", 0);
        }
    }

    /* renamed from: a */
    public final void mo24340a(Context context, String str) {
        mo24339a(context);
        this.f36786a.edit().remove(str).apply();
    }

    /* renamed from: b */
    public final String mo24342b(Context context, String str, String str2) {
        mo24339a(context);
        return this.f36786a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo24341a(Context context, String str, String str2) {
        mo24339a(context);
        this.f36786a.edit().putString(str, str2).apply();
    }
}

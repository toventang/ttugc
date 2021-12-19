package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a */
public class C57862a {

    /* renamed from: c */
    private static C57862a f131920c;

    /* renamed from: a */
    public boolean f131921a;

    /* renamed from: b */
    public String f131922b;

    /* renamed from: d */
    private int f131923d = 22;

    /* renamed from: e */
    private int f131924e = -1;

    /* renamed from: f */
    private int f131925f = -1;

    /* renamed from: g */
    private int f131926g = -1;

    static {
        Covode.recordClassIndex(67872);
    }

    private C57862a() {
    }

    /* renamed from: b */
    public static boolean m104610b() {
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C57862a m104609a() {
        MethodCollector.m26663i(9860);
        if (f131920c == null) {
            synchronized (C57862a.class) {
                try {
                    if (f131920c == null) {
                        f131920c = new C57862a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9860);
                    throw th;
                }
            }
        }
        C57862a aVar = f131920c;
        MethodCollector.m26664o(9860);
        return aVar;
    }
}

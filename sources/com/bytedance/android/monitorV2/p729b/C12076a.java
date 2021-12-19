package com.bytedance.android.monitorV2.p729b;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.b.a */
public final class C12076a {

    /* renamed from: a */
    public static SharedPreferences f28937a;

    /* renamed from: b */
    public static final Application f28938b;

    /* renamed from: c */
    public static final C12076a f28939c = new C12076a();

    private C12076a() {
    }

    static {
        Covode.recordClassIndex(13805);
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        C89219l.m154709a((Object) instance, "");
        Application application = instance.getApplication();
        C89219l.m154709a((Object) application, "");
        f28938b = application;
    }

    /* renamed from: a */
    public static final String m21501a(String str, String str2) {
        String string;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        Application application = f28938b;
        if (application == null) {
            return str2;
        }
        SharedPreferences a = C34822d.m71158a(application, "monitor_sp", 0);
        f28937a = a;
        return (a == null || (string = a.getString(str, str2)) == null) ? str2 : string;
    }
}

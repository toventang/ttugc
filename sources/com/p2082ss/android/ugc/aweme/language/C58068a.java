package com.p2082ss.android.ugc.aweme.language;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.language.a */
public final class C58068a {

    /* renamed from: a */
    public static final C58068a f132303a = new C58068a();

    /* renamed from: b */
    private static boolean f132304b;

    /* renamed from: c */
    private static boolean f132305c;

    private C58068a() {
    }

    static {
        Covode.recordClassIndex(68111);
    }

    /* renamed from: a */
    public static boolean m104898a() {
        if (!f132304b) {
            try {
                f132305c = SettingServiceImpl.m120782v().mo108866b(C17867d.m33078a());
                f132304b = true;
            } catch (Throwable unused) {
            }
        }
        return f132305c;
    }
}

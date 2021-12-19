package com.p2082ss.android.ugc.aweme.p4173ug.p4183h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ug.h.a */
public final class C79675a {

    /* renamed from: a */
    public static final C79675a f178784a = new C79675a();

    private C79675a() {
    }

    static {
        Covode.recordClassIndex(92891);
    }

    /* renamed from: a */
    public static boolean m138490a() {
        boolean z = false;
        try {
            z = SettingsManager.m29616a().mo25400a("show_unlogin_push_setting_page", false);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }
}

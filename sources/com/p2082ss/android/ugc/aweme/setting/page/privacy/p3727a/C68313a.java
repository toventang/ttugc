package com.p2082ss.android.ugc.aweme.setting.page.privacy.p3727a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;

/* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.a.a */
public final class C68313a {
    static {
        Covode.recordClassIndex(80528);
    }

    /* renamed from: a */
    public static final boolean m120606a() {
        return Keva.getRepo("contacts_sync_repo").getBoolean("contacts_sync_is_removing", false);
    }

    /* renamed from: b */
    public static final boolean m120608b() {
        return Keva.getRepo("facebook_sync_repo").getBoolean("facebook_sync_is_removing", false);
    }

    /* renamed from: a */
    public static final void m120605a(boolean z) {
        C51648a.f118980a.mo87308a("privacy_setting", z);
    }

    /* renamed from: b */
    public static final void m120607b(boolean z) {
        Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", z);
    }

    /* renamed from: c */
    public static final void m120609c(boolean z) {
        Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", z);
    }
}

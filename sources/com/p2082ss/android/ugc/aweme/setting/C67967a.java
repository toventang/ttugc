package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.setting.a */
public final class C67967a {

    /* renamed from: a */
    public static final C67967a f152285a = new C67967a();

    /* renamed from: b */
    public boolean f152286b;

    /* renamed from: c */
    public boolean f152287c = this.f152288d.getBoolean("settings_keva_enabled", false);

    /* renamed from: d */
    private Keva f152288d;

    static {
        Covode.recordClassIndex(80146);
    }

    private C67967a() {
        Keva repoSync = Keva.getRepoSync("abmock_keva_repo", 1);
        this.f152288d = repoSync;
        this.f152286b = repoSync.getBoolean("keva_enabled", true);
    }

    /* renamed from: a */
    public final void mo108584a() {
        this.f152288d.storeBoolean("keva_enabled", SettingsManager.m29616a().mo25400a("abmock_keva_switch", false));
        this.f152288d.storeBoolean("settings_keva_enabled", SettingsManager.m29616a().mo25400a("settings_keva_switch", false));
    }
}

package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;

/* renamed from: com.bytedance.ies.abmock.datacenter.h */
final class C16069h {

    /* renamed from: a */
    public static final C16069h f38703a = new C16069h();

    /* renamed from: b */
    Keva f38704b = Keva.getRepoSync("settings_data_repo", 1);

    /* renamed from: c */
    C27910f f38705c;

    static {
        Covode.recordClassIndex(18340);
    }

    private C16069h() {
        System.nanoTime();
    }

    /* renamed from: a */
    public final String[] mo25527a(String str) {
        return this.f38704b.getStringArray(str, null);
    }

    /* renamed from: a */
    public final int mo25524a(String str, int i) {
        return this.f38704b.getInt(str, i);
    }

    /* renamed from: b */
    public final String mo25528b(String str, String str2) {
        return this.f38704b.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo25525a(String str, String str2) {
        this.f38704b.storeString(str, str2);
    }

    /* renamed from: a */
    public final boolean mo25526a(String str, boolean z) {
        return this.f38704b.getBoolean(str, z);
    }
}

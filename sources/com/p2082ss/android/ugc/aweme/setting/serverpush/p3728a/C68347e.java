package com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.e */
public final class C68347e {
    @AbstractC27891c(mo46611a = "push_device_recommend_video")

    /* renamed from: a */
    public int f152936a;
    @AbstractC27891c(mo46611a = "push_device_other_channel")

    /* renamed from: b */
    public int f152937b;

    static {
        Covode.recordClassIndex(80572);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68347e)) {
            return false;
        }
        C68347e eVar = (C68347e) obj;
        return this.f152936a == eVar.f152936a && this.f152937b == eVar.f152937b;
    }

    public final int hashCode() {
        return (this.f152936a * 31) + this.f152937b;
    }

    public final String toString() {
        return "NotificationSettingsInfo(pushDeviceRecommendVideo=" + this.f152936a + ", pushDeviceOtherChannel=" + this.f152937b + ")";
    }
}

package com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.d */
public final class C68346d extends BaseResponse {
    @AbstractC27891c(mo46611a = "notification_settings_info")

    /* renamed from: a */
    public final C68347e f152935a;

    static {
        Covode.recordClassIndex(80571);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C68346d) && C89219l.m154714a(this.f152935a, ((C68346d) obj).f152935a);
        }
        return true;
    }

    public final int hashCode() {
        C68347e eVar = this.f152935a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NotificationSettings(notificationSettingsInfo=" + this.f152935a + ")";
    }
}

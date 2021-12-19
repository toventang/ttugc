package com.p2082ss.android.ugc.aweme.commercialize.live.p2575a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.a.a */
public final class C38048a {
    @AbstractC27891c(mo46611a = "enter_from_ad")

    /* renamed from: a */
    public final boolean f89904a;
    @AbstractC27891c(mo46611a = "room_id")

    /* renamed from: b */
    public String f89905b;
    @AbstractC27891c(mo46611a = "author_id")

    /* renamed from: c */
    public String f89906c;
    @AbstractC27891c(mo46611a = "follow_status")

    /* renamed from: d */
    public String f89907d;
    @AbstractC27891c(mo46611a = "live_ad_type")

    /* renamed from: e */
    public final String f89908e;
    @AbstractC27891c(mo46611a = "live_ad_log_param")

    /* renamed from: f */
    public final HashMap<String, String> f89909f;
    @AbstractC27891c(mo46611a = "live_ad_log_extra_param")

    /* renamed from: g */
    public final HashMap<String, String> f89910g;

    static {
        Covode.recordClassIndex(45513);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38048a)) {
            return false;
        }
        C38048a aVar = (C38048a) obj;
        return C89219l.m154714a(this.f89908e, aVar.f89908e) && C89219l.m154714a(this.f89909f, aVar.f89909f) && C89219l.m154714a(this.f89910g, aVar.f89910g);
    }

    public final int hashCode() {
        String str = this.f89908e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap<String, String> hashMap = this.f89909f;
        int hashCode2 = (hashCode + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        HashMap<String, String> hashMap2 = this.f89910g;
        if (hashMap2 != null) {
            i = hashMap2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AdLiveEnterRoomConfig(liveAdType=" + this.f89908e + ", liveAdLogParam=" + this.f89909f + ", liveAdLogExtraParam=" + this.f89910g + ")";
    }

    private /* synthetic */ C38048a() {
        this("0", new HashMap(), new HashMap());
    }

    public C38048a(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(hashMap2, "");
        this.f89908e = str;
        this.f89909f = hashMap;
        this.f89910g = hashMap2;
        this.f89904a = true;
    }
}

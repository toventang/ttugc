package com.bytedance.android.livesdk.mvp;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.mvp.a */
public final class C9919a {
    @AbstractC27891c(mo46611a = "event_name")

    /* renamed from: a */
    public final String f24042a = null;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: b */
    public final String f24043b = null;
    @AbstractC27891c(mo46611a = "detail_url")

    /* renamed from: c */
    public final String f24044c = null;
    @AbstractC27891c(mo46611a = "owner")

    /* renamed from: d */
    public final User f24045d = null;

    static {
        Covode.recordClassIndex(11469);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9919a)) {
            return false;
        }
        C9919a aVar = (C9919a) obj;
        return C89219l.m154714a(this.f24042a, aVar.f24042a) && C89219l.m154714a(this.f24043b, aVar.f24043b) && C89219l.m154714a(this.f24044c, aVar.f24044c) && C89219l.m154714a(this.f24045d, aVar.f24045d);
    }

    public final int hashCode() {
        String str = this.f24042a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24043b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24044c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.f24045d;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "GatedRoomData(eventName=" + this.f24042a + ", description=" + this.f24043b + ", detailUrl=" + this.f24044c + ", owner=" + this.f24045d + ")";
    }

    private C9919a() {
    }
}

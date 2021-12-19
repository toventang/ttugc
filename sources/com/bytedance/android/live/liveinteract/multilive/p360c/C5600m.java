package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.m */
public final class C5600m {
    @AbstractC27891c(mo46611a = "method")

    /* renamed from: a */
    public String f14237a;
    @AbstractC27891c(mo46611a = "param")

    /* renamed from: b */
    public C5601n f14238b;
    @AbstractC27891c(mo46611a = "ts")

    /* renamed from: c */
    public Long f14239c;
    @AbstractC27891c(mo46611a = "msg_id")

    /* renamed from: d */
    public String f14240d;

    static {
        Covode.recordClassIndex(6197);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5600m)) {
            return false;
        }
        C5600m mVar = (C5600m) obj;
        return C89219l.m154714a(this.f14237a, mVar.f14237a) && C89219l.m154714a(this.f14238b, mVar.f14238b) && C89219l.m154714a(this.f14239c, mVar.f14239c) && C89219l.m154714a(this.f14240d, mVar.f14240d);
    }

    public final int hashCode() {
        String str = this.f14237a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C5601n nVar = this.f14238b;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        Long l = this.f14239c;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.f14240d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MultiLiveRTCMessage(method=" + this.f14237a + ", param=" + this.f14238b + ", timeStamp=" + this.f14239c + ", msgId=" + this.f14240d + ")";
    }

    public /* synthetic */ C5600m() {
        this("", Long.valueOf(C11200a.m19851a()), "");
    }

    /* renamed from: a */
    public final void mo11370a() {
        StringBuilder sb = new StringBuilder();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        this.f14240d = sb.append(String.valueOf(b.mo13161c())).append("_").append(this.f14239c).toString();
    }

    /* renamed from: a */
    public final void mo11371a(String str) {
        C89219l.m154721d(str, "");
        this.f14237a = str;
    }

    private C5600m(String str, Long l, String str2) {
        C89219l.m154721d(str, "");
        this.f14237a = str;
        this.f14238b = null;
        this.f14239c = l;
        this.f14240d = str2;
    }
}

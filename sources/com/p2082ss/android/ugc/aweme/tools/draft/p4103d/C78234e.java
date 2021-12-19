package com.p2082ss.android.ugc.aweme.tools.draft.p4103d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.e */
public final class C78234e {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public int f175717a;
    @AbstractC27891c(mo46611a = "is_need_show")

    /* renamed from: b */
    public boolean f175718b;
    @AbstractC27891c(mo46611a = "free_up_space")

    /* renamed from: c */
    public long f175719c;
    @AbstractC27891c(mo46611a = "is_update_sticker")

    /* renamed from: d */
    public boolean f175720d;

    static {
        Covode.recordClassIndex(91349);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78234e)) {
            return false;
        }
        C78234e eVar = (C78234e) obj;
        return this.f175717a == eVar.f175717a && this.f175718b == eVar.f175718b && this.f175719c == eVar.f175719c && this.f175720d == eVar.f175720d;
    }

    public final String toString() {
        return "DraftOperationInfo(type=" + this.f175717a + ", isNeedShow=" + this.f175718b + ", freeUpSpace=" + this.f175719c + ", isUpdateSticker=" + this.f175720d + ")";
    }

    private C78234e() {
        this.f175717a = -1;
        this.f175718b = true;
        this.f175719c = 0;
        this.f175720d = false;
    }

    public final int hashCode() {
        int i = this.f175717a * 31;
        boolean z = this.f175718b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j = this.f175719c;
        int i6 = (((i + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!this.f175720d) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public /* synthetic */ C78234e(byte b) {
        this();
    }
}

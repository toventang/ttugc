package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.e */
public final class C70669e {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f158178a;
    @AbstractC27891c(mo46611a = "change_direction_mode")

    /* renamed from: b */
    public final int f158179b;
    @AbstractC27891c(mo46611a = "direction_status")

    /* renamed from: c */
    public final List<String> f158180c;
    @AbstractC27891c(mo46611a = "safety_status")

    /* renamed from: d */
    public final List<String> f158181d;

    static {
        Covode.recordClassIndex(83140);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70669e)) {
            return false;
        }
        C70669e eVar = (C70669e) obj;
        return C89219l.m154714a(this.f158178a, eVar.f158178a) && this.f158179b == eVar.f158179b && C89219l.m154714a(this.f158180c, eVar.f158180c) && C89219l.m154714a(this.f158181d, eVar.f158181d);
    }

    public final int hashCode() {
        String str = this.f158178a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f158179b) * 31;
        List<String> list = this.f158180c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f158181d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DuetLayoutBean(name=" + this.f158178a + ", changeDirectionMode=" + this.f158179b + ", directionStatus=" + this.f158180c + ", safetyStatus=" + this.f158181d + ")";
    }
}

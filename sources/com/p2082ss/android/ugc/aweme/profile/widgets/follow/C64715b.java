package com.p2082ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.b */
public final class C64715b {

    /* renamed from: a */
    public final String f146454a;

    /* renamed from: b */
    public final String f146455b;

    /* renamed from: c */
    public final String f146456c;

    /* renamed from: d */
    public final String f146457d;

    /* renamed from: e */
    public final String f146458e;

    /* renamed from: f */
    public final C66623g f146459f;

    /* renamed from: g */
    public final String f146460g;

    static {
        Covode.recordClassIndex(76182);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64715b)) {
            return false;
        }
        C64715b bVar = (C64715b) obj;
        return C89219l.m154714a(this.f146454a, bVar.f146454a) && C89219l.m154714a(this.f146455b, bVar.f146455b) && C89219l.m154714a(this.f146456c, bVar.f146456c) && C89219l.m154714a(this.f146457d, bVar.f146457d) && C89219l.m154714a(this.f146458e, bVar.f146458e) && C89219l.m154714a(this.f146459f, bVar.f146459f) && C89219l.m154714a(this.f146460g, bVar.f146460g);
    }

    public final int hashCode() {
        String str = this.f146454a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f146455b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f146456c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f146457d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f146458e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        C66623g gVar = this.f146459f;
        int hashCode6 = (hashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str6 = this.f146460g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "FollowLogEvenParams(liveRequestId=" + this.f146454a + ", liveRoomId=" + this.f146455b + ", liveRoomOwnerId=" + this.f146456c + ", liveType=" + this.f146457d + ", fromSearch=" + this.f146458e + ", recommendEnterProfile=" + this.f146459f + ", position=" + this.f146460g + ")";
    }

    private /* synthetic */ C64715b() {
        this(null, null, null, null, null, null, null);
    }

    public C64715b(String str, String str2, String str3, String str4, String str5, C66623g gVar, String str6) {
        this.f146454a = str;
        this.f146455b = str2;
        this.f146456c = str3;
        this.f146457d = str4;
        this.f146458e = str5;
        this.f146459f = gVar;
        this.f146460g = str6;
    }
}

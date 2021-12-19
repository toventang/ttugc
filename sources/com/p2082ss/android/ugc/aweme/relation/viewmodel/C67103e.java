package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.e */
public final class C67103e {

    /* renamed from: a */
    public final int f150486a;

    /* renamed from: b */
    public FriendList<? extends User> f150487b;

    /* renamed from: c */
    public final String f150488c;

    /* renamed from: d */
    public final String f150489d;

    static {
        Covode.recordClassIndex(78685);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67103e)) {
            return false;
        }
        C67103e eVar = (C67103e) obj;
        return this.f150486a == eVar.f150486a && C89219l.m154714a(this.f150487b, eVar.f150487b) && C89219l.m154714a(this.f150488c, eVar.f150488c) && C89219l.m154714a(this.f150489d, eVar.f150489d);
    }

    public final int hashCode() {
        int i = this.f150486a * 31;
        FriendList<? extends User> friendList = this.f150487b;
        int i2 = 0;
        int hashCode = (i + (friendList != null ? friendList.hashCode() : 0)) * 31;
        String str = this.f150488c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f150489d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SocialRecFlowData(nextStep=" + this.f150486a + ", friends=" + this.f150487b + ", platform=" + this.f150488c + ", skipPlatform=" + this.f150489d + ")";
    }

    public C67103e(int i, FriendList<? extends User> friendList, String str, String str2) {
        this.f150486a = i;
        this.f150487b = friendList;
        this.f150488c = str;
        this.f150489d = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C67103e(int i, FriendList friendList, String str, String str2, int i2) {
        this(i, (i2 & 2) != 0 ? null : friendList, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2);
    }
}

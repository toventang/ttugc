package com.bytedance.android.livesdk.chatroom.model.p495b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.c */
public class C7664c {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public User f18989a;
    @AbstractC27891c(mo46611a = "modify_time")

    /* renamed from: b */
    public long f18990b;
    @AbstractC27891c(mo46611a = "link_type")

    /* renamed from: c */
    public int f18991c;
    @AbstractC27891c(mo46611a = "role_type")

    /* renamed from: d */
    public int f18992d;
    @AbstractC27891c(mo46611a = "payed_money")

    /* renamed from: e */
    public int f18993e;
    @AbstractC27891c(mo46611a = "fan_ticket")

    /* renamed from: f */
    public long f18994f;
    @AbstractC27891c(mo46611a = "linkmic_id_str")

    /* renamed from: g */
    public String f18995g;

    /* renamed from: h */
    public int f18996h;

    static {
        Covode.recordClassIndex(8446);
    }

    public String toString() {
        return "LinkPlayerInfo{, mFanTicket=" + this.f18994f + ", mUser=" + this.f18989a + ", mModifyTime=" + this.f18990b + ", mLinkType=" + this.f18991c + ", mRoleType=" + this.f18992d + ", paidMoney=" + this.f18993e + ", mInteractIdStr='" + this.f18995g + '\'' + '}';
    }
}

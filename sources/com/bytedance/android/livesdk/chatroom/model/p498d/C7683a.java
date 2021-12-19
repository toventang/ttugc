package com.bytedance.android.livesdk.chatroom.model.p498d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.d.a */
public class C7683a {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public User f19027a;
    @AbstractC27891c(mo46611a = "modify_time")

    /* renamed from: b */
    public long f19028b;
    @AbstractC27891c(mo46611a = "link_type")

    /* renamed from: c */
    public int f19029c;
    @AbstractC27891c(mo46611a = "role_type")

    /* renamed from: d */
    public int f19030d;
    @AbstractC27891c(mo46611a = "linkmic_id_str")

    /* renamed from: e */
    public String f19031e;
    @AbstractC27891c(mo46611a = "mute_status")

    /* renamed from: f */
    public int f19032f;

    /* renamed from: g */
    public boolean f19033g;

    static {
        Covode.recordClassIndex(8465);
    }

    public String toString() {
        return "SocialLinkPlayerInfo{, mUser=" + this.f19027a + ", mModifyTime=" + this.f19028b + ", mLinkType=" + this.f19029c + ", mRoleType=" + this.f19030d + ", mInteractIdStr='" + this.f19031e + '\'' + ", outOfDate=" + this.f19033g + '}';
    }
}

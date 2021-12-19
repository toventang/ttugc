package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.cc */
public class C9719cc extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "action")

    /* renamed from: a */
    public long f23687a;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: f */
    public User f23688f;
    @AbstractC27891c(mo46611a = "share_target")

    /* renamed from: g */
    public String f23689g;
    @AbstractC27891c(mo46611a = "share_type")

    /* renamed from: h */
    public long f23690h;
    @AbstractC27891c(mo46611a = "share_display_style")

    /* renamed from: i */
    public long f23691i;
    @AbstractC27891c(mo46611a = "share_count")

    /* renamed from: j */
    public int f23692j;

    static {
        Covode.recordClassIndex(11261);
    }

    public C9719cc() {
        this.f28131L = EnumC9596a.SOCIAL;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23688f != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }
}

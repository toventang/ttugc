package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.p */
public class C9886p extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "digg_count")

    /* renamed from: a */
    public int f23891a;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: f */
    public int f23892f;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: g */
    public int f23893g;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: h */
    public User f23894h;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: i */
    public String f23895i;

    static {
        Covode.recordClassIndex(11428);
    }

    public C9886p() {
        this.f28131L = EnumC9596a.DIGG;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23894h != null) {
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

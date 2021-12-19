package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.a */
public class C9595a extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "asset_id")

    /* renamed from: a */
    public long f23287a;
    @AbstractC27891c(mo46611a = "panel_display_text")

    /* renamed from: f */
    public C9698b f23288f;
    @AbstractC27891c(mo46611a = "show_message")

    /* renamed from: g */
    public boolean f23289g;
    @AbstractC27891c(mo46611a = "show_panel")

    /* renamed from: h */
    public boolean f23290h;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: i */
    public User f23291i;
    @AbstractC27891c(mo46611a = "to_user")

    /* renamed from: j */
    public User f23292j;
    @AbstractC27891c(mo46611a = "priority")

    /* renamed from: k */
    public C9894x f23293k;

    static {
        Covode.recordClassIndex(11137);
    }

    public C9595a() {
        this.f28131L = EnumC9596a.ASSET_MESSAGE;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }
}

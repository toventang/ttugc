package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.q */
public class C9887q extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "donation_total")

    /* renamed from: a */
    public String f23896a;
    @AbstractC27891c(mo46611a = "donation_user_count")

    /* renamed from: f */
    public long f23897f;
    @AbstractC27891c(mo46611a = "currency")

    /* renamed from: g */
    public String f23898g;

    static {
        Covode.recordClassIndex(11429);
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return false;
    }

    public C9887q() {
        this.f28131L = EnumC9596a.DONATION_INFO;
    }
}

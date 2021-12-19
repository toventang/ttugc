package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.y */
public class C8865y extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "list")

    /* renamed from: a */
    public C8860x.C8864c f21817a;

    static {
        Covode.recordClassIndex(9746);
    }

    public C8865y() {
        this.f28131L = EnumC9596a.WISH_LIST_UPDATE_MESSAGE;
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

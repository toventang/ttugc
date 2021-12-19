package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bv */
public class C9690bv extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public String f23599a;

    static {
        Covode.recordClassIndex(11232);
    }

    public C9690bv() {
        this.f28131L = EnumC9596a.ROOM;
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
        if (!TextUtils.isEmpty(this.f23599a)) {
            return true;
        }
        return false;
    }
}

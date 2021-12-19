package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.t */
public class C9890t extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: a */
    public long f23915a = 4000;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: f */
    public String f23916f;
    @AbstractC27891c(mo46611a = "avatar_url")

    /* renamed from: g */
    public ImageModel f23917g;
    @AbstractC27891c(mo46611a = "gift_id")

    /* renamed from: h */
    public long f23918h;
    @AbstractC27891c(mo46611a = "hour_rank_info")

    /* renamed from: i */
    public String f23919i;

    static {
        Covode.recordClassIndex(11432);
    }

    public C9890t() {
        this.f28131L = EnumC9596a.FOLLOW_GUIDE;
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
        if (!TextUtils.isEmpty(this.f23916f)) {
            return true;
        }
        return false;
    }
}

package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.ca */
public class C9717ca extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "chat_id")

    /* renamed from: a */
    public long f23679a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: f */
    public String f23680f;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: g */
    public User f23681g;
    @AbstractC27891c(mo46611a = "screen_chat_type")

    /* renamed from: h */
    public int f23682h;
    @AbstractC27891c(mo46611a = "priority")

    /* renamed from: i */
    public int f23683i;
    @AbstractC27891c(mo46611a = "effect_v2")

    /* renamed from: j */
    public C9877h f23684j;
    @AbstractC27891c(mo46611a = "background_image_v2")

    /* renamed from: k */
    public ImageModel f23685k;

    static {
        Covode.recordClassIndex(11259);
    }

    public C9717ca() {
        this.f28131L = EnumC9596a.SCREEN;
    }

    /* renamed from: c */
    public final boolean mo16596c() {
        if (this.f23683i != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23681g == null || TextUtils.isEmpty(this.f23680f)) {
            return false;
        }
        return true;
    }
}

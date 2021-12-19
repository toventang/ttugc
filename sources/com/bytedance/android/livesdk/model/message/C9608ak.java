package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.ak */
public class C9608ak extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "guide_content")

    /* renamed from: a */
    public String f23338a;
    @AbstractC27891c(mo46611a = "button_content")

    /* renamed from: f */
    public String f23339f;
    @AbstractC27891c(mo46611a = "connect_type")

    /* renamed from: g */
    public int f23340g;

    static {
        Covode.recordClassIndex(11150);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9608ak() {
        this.f28131L = EnumC9596a.LINK_CO_HOST_GUIDE;
    }
}

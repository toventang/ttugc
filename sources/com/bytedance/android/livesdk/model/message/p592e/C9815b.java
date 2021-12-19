package com.bytedance.android.livesdk.model.message.p592e;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.e.b */
public final class C9815b extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "envelope_info")

    /* renamed from: a */
    public C9814a f23839a;
    @AbstractC27891c(mo46611a = "display")

    /* renamed from: f */
    public int f23840f;

    /* renamed from: g */
    public boolean f23841g = true;

    static {
        Covode.recordClassIndex(11357);
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        return true;
    }

    public C9815b() {
        this.f28131L = EnumC9596a.RED_ENVELOPE_MESSAGE;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23840f != 1 || !this.f23841g) {
            return false;
        }
        return true;
    }
}

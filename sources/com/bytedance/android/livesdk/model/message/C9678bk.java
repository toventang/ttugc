package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bk */
public class C9678bk extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public C9676bi f23554a;

    static {
        Covode.recordClassIndex(11220);
    }

    public C9678bk() {
        this.f28131L = EnumC9596a.QUESTION;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        C9676bi biVar = this.f23554a;
        if (biVar == null || biVar.f23550e == null || TextUtils.isEmpty(this.f23554a.f23547b)) {
            return false;
        }
        return true;
    }
}

package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.as */
public class C9619as extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public String f23416a;

    /* renamed from: f */
    private C9618ar f23417f;

    static {
        Covode.recordClassIndex(11161);
    }

    public C9619as() {
        this.f28131L = EnumC9596a.LINK_MIC_SIGNAL;
    }

    /* renamed from: c */
    public final C9618ar mo16572c() {
        C9618ar arVar = this.f23417f;
        if (arVar != null) {
            return arVar;
        }
        try {
            C9618ar arVar2 = (C9618ar) C4139e.C4140a.f11575b.mo46670a(this.f23416a.replaceAll("\\\\", ""), C9618ar.class);
            this.f23417f = arVar2;
            return arVar2;
        } catch (Exception unused) {
            return null;
        }
    }
}

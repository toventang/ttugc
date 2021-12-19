package com.bytedance.android.livesdk.envelope.p520a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.envelope.a.e */
public final class C8429e {
    @AbstractC27891c(mo46611a = "envelope_infos")

    /* renamed from: a */
    public List<C8425a> f20859a;

    static {
        Covode.recordClassIndex(9274);
    }

    public C8429e(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C8429e) && C89219l.m154714a(this.f20859a, ((C8429e) obj).f20859a);
        }
        return true;
    }

    public final int hashCode() {
        List<C8425a> list = this.f20859a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RedEnvelopeListResponse(envelopList=" + this.f20859a + ")";
    }

    private C8429e() {
        this.f20859a = null;
    }

    private /* synthetic */ C8429e(byte b) {
        this();
    }
}

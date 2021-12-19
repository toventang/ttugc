package com.bytedance.ies.p1208im.core.p1223d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.d.c */
public final class C17507c implements Serializable {
    @AbstractC27891c(mo46611a = "msg_type")

    /* renamed from: a */
    private final int f41899a;
    @AbstractC27891c(mo46611a = "msg_content")

    /* renamed from: b */
    private final C17505a f41900b;

    static {
        Covode.recordClassIndex(19996);
    }

    /* renamed from: com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m32486xfbaba4ac(int i) {
        return i;
    }

    public static /* synthetic */ C17507c copy$default(C17507c cVar, int i, C17505a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f41899a;
        }
        if ((i2 & 2) != 0) {
            aVar = cVar.f41900b;
        }
        return cVar.copy(i, aVar);
    }

    public final int component1() {
        return this.f41899a;
    }

    public final C17505a component2() {
        return this.f41900b;
    }

    public final C17507c copy(int i, C17505a aVar) {
        return new C17507c(i, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17507c)) {
            return false;
        }
        C17507c cVar = (C17507c) obj;
        return this.f41899a == cVar.f41899a && C89219l.m154714a(this.f41900b, cVar.f41900b);
    }

    public final int hashCode() {
        int com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m32486xfbaba4ac(this.f41899a) * 31;
        C17505a aVar = this.f41900b;
        return com_bytedance_ies_im_core_model_CheckMessage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckMessage(msgType=" + this.f41899a + ", content=" + this.f41900b + ")";
    }

    public final C17505a getContent() {
        return this.f41900b;
    }

    public final int getMsgType() {
        return this.f41899a;
    }

    public C17507c(int i, C17505a aVar) {
        this.f41899a = i;
        this.f41900b = aVar;
    }
}

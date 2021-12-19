package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.i */
public final class C55138i extends AbstractC56226b {

    /* renamed from: a */
    public final String f126175a;

    static {
        Covode.recordClassIndex(64866);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55138i) && C89219l.m154714a(this.f126175a, ((C55138i) obj).f126175a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f126175a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "LoadConversationsEventKey(userId=" + this.f126175a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55138i(String str) {
        super("aweme_im_load_conversations", str);
        C89219l.m154721d(str, "");
        this.f126175a = str;
    }
}

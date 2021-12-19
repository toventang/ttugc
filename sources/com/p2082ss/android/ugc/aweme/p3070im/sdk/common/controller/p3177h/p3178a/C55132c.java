package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.c */
public final class C55132c extends AbstractC56226b {

    /* renamed from: a */
    public final String f126163a;

    static {
        Covode.recordClassIndex(64860);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55132c) && C89219l.m154714a(this.f126163a, ((C55132c) obj).f126163a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f126163a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "EnterChatEventKey(conversationId=" + this.f126163a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55132c(String str) {
        super("aweme_im_fetch_msg_list", str);
        C89219l.m154721d(str, "");
        this.f126163a = str;
    }
}

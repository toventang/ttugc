package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3128b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.b */
public final class C54363b implements AbstractC81914b {

    /* renamed from: a */
    public final SystemContent f124510a;

    /* renamed from: b */
    public final String f124511b;

    static {
        Covode.recordClassIndex(64065);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54363b)) {
            return false;
        }
        C54363b bVar = (C54363b) obj;
        return C89219l.m154714a(this.f124510a, bVar.f124510a) && C89219l.m154714a(this.f124511b, bVar.f124511b);
    }

    public final int hashCode() {
        SystemContent systemContent = this.f124510a;
        int i = 0;
        int hashCode = (systemContent != null ? systemContent.hashCode() : 0) * 31;
        String str = this.f124511b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShowChatTopTipEvent(content=" + this.f124510a + ", conversationId=" + this.f124511b + ")";
    }

    public C54363b(SystemContent systemContent, String str) {
        C89219l.m154721d(systemContent, "");
        this.f124510a = systemContent;
        this.f124511b = str;
    }
}

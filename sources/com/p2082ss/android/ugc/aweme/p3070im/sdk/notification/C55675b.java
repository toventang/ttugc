package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b */
public final class C55675b {

    /* renamed from: a */
    public final String f126996a;

    /* renamed from: b */
    public final String f126997b;

    /* renamed from: c */
    public final EnumC55687c f126998c;

    static {
        Covode.recordClassIndex(65458);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55675b)) {
            return false;
        }
        C55675b bVar = (C55675b) obj;
        return C89219l.m154714a(this.f126996a, bVar.f126996a) && C89219l.m154714a(this.f126997b, bVar.f126997b) && C89219l.m154714a(this.f126998c, bVar.f126998c);
    }

    public final int hashCode() {
        String str = this.f126996a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126997b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        EnumC55687c cVar = this.f126998c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "NotificationTip(conversationId=" + this.f126996a + ", hint=" + this.f126997b + ", type=" + this.f126998c + ")";
    }

    public C55675b(String str, String str2, EnumC55687c cVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(cVar, "");
        this.f126996a = str;
        this.f126997b = str2;
        this.f126998c = cVar;
    }
}

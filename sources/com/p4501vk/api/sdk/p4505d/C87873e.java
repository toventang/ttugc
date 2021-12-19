package com.p4501vk.api.sdk.p4505d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.d.e */
public final class C87873e {

    /* renamed from: a */
    public final Integer f199599a = null;

    /* renamed from: b */
    public final Boolean f199600b = null;

    /* renamed from: c */
    public final String f199601c = null;

    /* renamed from: d */
    public final Integer f199602d = null;

    static {
        Covode.recordClassIndex(103883);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87873e)) {
            return false;
        }
        C87873e eVar = (C87873e) obj;
        return C89219l.m154714a(this.f199599a, eVar.f199599a) && C89219l.m154714a(this.f199600b, eVar.f199600b) && C89219l.m154714a(this.f199601c, eVar.f199601c) && C89219l.m154714a(this.f199602d, eVar.f199602d);
    }

    public final int hashCode() {
        Integer num = this.f199599a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.f199600b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f199601c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f199602d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "RequestTag(uid=" + this.f199599a + ", awaitNetwork=" + this.f199600b + ", reason=" + this.f199601c + ", retryCount=" + this.f199602d + ")";
    }

    private C87873e() {
    }
}

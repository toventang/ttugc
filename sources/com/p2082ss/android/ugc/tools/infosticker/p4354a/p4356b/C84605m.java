package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.m */
public final class C84605m {

    /* renamed from: a */
    public final Integer f189066a;

    /* renamed from: b */
    public final String f189067b;

    static {
        Covode.recordClassIndex(98570);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84605m)) {
            return false;
        }
        C84605m mVar = (C84605m) obj;
        return C89219l.m154714a(this.f189066a, mVar.f189066a) && C89219l.m154714a(this.f189067b, mVar.f189067b);
    }

    public final int hashCode() {
        Integer num = this.f189066a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f189067b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InfoStickerDownloadInfo(errorCode=" + this.f189066a + ", errorMsg=" + this.f189067b + ")";
    }

    public /* synthetic */ C84605m() {
        this(null, null);
    }

    public C84605m(Integer num, String str) {
        this.f189066a = num;
        this.f189067b = str;
    }
}

package com.p2082ss.android.ugc.aweme.notice.repo.p3515a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.a.a */
public final class C61615a {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final String f139819a;
    @AbstractC27891c(mo46611a = "link_id")

    /* renamed from: b */
    public final String f139820b;
    @AbstractC27891c(mo46611a = "item_id")

    /* renamed from: c */
    public final String f139821c;

    static {
        Covode.recordClassIndex(72309);
    }

    public C61615a() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61615a)) {
            return false;
        }
        C61615a aVar = (C61615a) obj;
        return C89219l.m154714a(this.f139819a, aVar.f139819a) && C89219l.m154714a(this.f139820b, aVar.f139820b) && C89219l.m154714a(this.f139821c, aVar.f139821c);
    }

    public final int hashCode() {
        String str = this.f139819a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139820b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139821c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "LinkBusinessExtra(type=" + this.f139819a + ", linkId=" + this.f139820b + ", itemId=" + this.f139821c + ")";
    }

    /* renamed from: a */
    public static /* synthetic */ C61615a m111626a(C61615a aVar) {
        String str = aVar.f139819a;
        String str2 = aVar.f139820b;
        String str3 = aVar.f139821c;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new C61615a(str, str2, str3);
    }

    public C61615a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f139819a = str;
        this.f139820b = str2;
        this.f139821c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61615a(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

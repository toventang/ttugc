package com.p2082ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.c */
public final class C61287c implements Serializable {
    @AbstractC27891c(mo46611a = "effect_id")

    /* renamed from: a */
    private final String f139190a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    private final String f139191b;
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: c */
    private final String f139192c;

    static {
        Covode.recordClassIndex(71906);
    }

    public static /* synthetic */ C61287c copy$default(C61287c cVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f139190a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f139191b;
        }
        if ((i & 4) != 0) {
            str3 = cVar.f139192c;
        }
        return cVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f139190a;
    }

    public final String component2() {
        return this.f139191b;
    }

    public final String component3() {
        return this.f139192c;
    }

    public final C61287c copy(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new C61287c(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61287c)) {
            return false;
        }
        C61287c cVar = (C61287c) obj;
        return C89219l.m154714a(this.f139190a, cVar.f139190a) && C89219l.m154714a(this.f139191b, cVar.f139191b) && C89219l.m154714a(this.f139192c, cVar.f139192c);
    }

    public final int hashCode() {
        String str = this.f139190a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139191b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139192c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BirthdayEffectTemplate(effectId=" + this.f139190a + ", name=" + this.f139191b + ", iconUrl=" + this.f139192c + ")";
    }

    public final String getEffectId() {
        return this.f139190a;
    }

    public final String getIconUrl() {
        return this.f139192c;
    }

    public final String getName() {
        return this.f139191b;
    }

    public C61287c(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f139190a = str;
        this.f139191b = str2;
        this.f139192c = str3;
    }
}

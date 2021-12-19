package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.c */
public final class C84234c implements Serializable {

    /* renamed from: a */
    private final String f188332a;

    /* renamed from: b */
    private final long f188333b;

    static {
        Covode.recordClassIndex(98143);
    }

    /* renamed from: com_ss_android_ugc_playerkit_simapicommon_model_OriginalLanguageInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m144841x4080bad(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C84234c copy$default(C84234c cVar, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f188332a;
        }
        if ((i & 2) != 0) {
            j = cVar.f188333b;
        }
        return cVar.copy(str, j);
    }

    public final String component1() {
        return this.f188332a;
    }

    public final long component2() {
        return this.f188333b;
    }

    public final C84234c copy(String str, long j) {
        C89219l.m154719c(str, "");
        return new C84234c(str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84234c)) {
            return false;
        }
        C84234c cVar = (C84234c) obj;
        return C89219l.m154714a(this.f188332a, cVar.f188332a) && this.f188333b == cVar.f188333b;
    }

    public final int hashCode() {
        String str = this.f188332a;
        return ((str != null ? str.hashCode() : 0) * 31) + m144841x4080bad(this.f188333b);
    }

    public final String toString() {
        return "OriginalLanguageInfo(language=" + this.f188332a + ", languageId=" + this.f188333b + ")";
    }

    public final String getLanguage() {
        return this.f188332a;
    }

    public final long getLanguageId() {
        return this.f188333b;
    }

    public C84234c(String str, long j) {
        C89219l.m154719c(str, "");
        this.f188332a = str;
        this.f188333b = j;
    }
}

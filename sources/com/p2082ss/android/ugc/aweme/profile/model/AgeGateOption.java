package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AgeGateOption */
public final class AgeGateOption {
    @AbstractC27891c(mo46611a = "content")
    public final String content;
    @AbstractC27891c(mo46611a = StringSet.type)
    public final String type;
    @AbstractC27891c(mo46611a = "url")
    public final String url;

    static {
        Covode.recordClassIndex(75150);
    }

    public AgeGateOption() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AgeGateOption copy$default(AgeGateOption ageGateOption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageGateOption.content;
        }
        if ((i & 2) != 0) {
            str2 = ageGateOption.url;
        }
        if ((i & 4) != 0) {
            str3 = ageGateOption.type;
        }
        return ageGateOption.copy(str, str2, str3);
    }

    public final AgeGateOption copy(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        return new AgeGateOption(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateOption)) {
            return false;
        }
        AgeGateOption ageGateOption = (AgeGateOption) obj;
        return C89219l.m154714a(this.content, ageGateOption.content) && C89219l.m154714a(this.url, ageGateOption.url) && C89219l.m154714a(this.type, ageGateOption.type);
    }

    public final int hashCode() {
        String str = this.content;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AgeGateOption(content=" + this.content + ", url=" + this.url + ", type=" + this.type + ")";
    }

    public AgeGateOption(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        this.content = str;
        this.url = str2;
        this.type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgeGateOption(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
    }
}

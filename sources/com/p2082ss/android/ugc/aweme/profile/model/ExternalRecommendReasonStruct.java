package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct */
public final class ExternalRecommendReasonStruct implements Serializable {
    @AbstractC27891c(mo46611a = "external_username")
    public String externalUsername;
    @AbstractC27891c(mo46611a = "hashed_phone_number")
    public String hashedPhoneNumber;
    @AbstractC27891c(mo46611a = "reason")
    public String reason;

    static {
        Covode.recordClassIndex(75168);
    }

    public ExternalRecommendReasonStruct() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ExternalRecommendReasonStruct copy$default(ExternalRecommendReasonStruct externalRecommendReasonStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalRecommendReasonStruct.reason;
        }
        if ((i & 2) != 0) {
            str2 = externalRecommendReasonStruct.hashedPhoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = externalRecommendReasonStruct.externalUsername;
        }
        return externalRecommendReasonStruct.copy(str, str2, str3);
    }

    public final String component1() {
        return this.reason;
    }

    public final String component2() {
        return this.hashedPhoneNumber;
    }

    public final String component3() {
        return this.externalUsername;
    }

    public final ExternalRecommendReasonStruct copy(String str, String str2, String str3) {
        return new ExternalRecommendReasonStruct(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalRecommendReasonStruct)) {
            return false;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct = (ExternalRecommendReasonStruct) obj;
        return C89219l.m154714a(this.reason, externalRecommendReasonStruct.reason) && C89219l.m154714a(this.hashedPhoneNumber, externalRecommendReasonStruct.hashedPhoneNumber) && C89219l.m154714a(this.externalUsername, externalRecommendReasonStruct.externalUsername);
    }

    public final int hashCode() {
        String str = this.reason;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hashedPhoneNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.externalUsername;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ExternalRecommendReasonStruct(reason=" + this.reason + ", hashedPhoneNumber=" + this.hashedPhoneNumber + ", externalUsername=" + this.externalUsername + ")";
    }

    public final String getExternalUsername() {
        return this.externalUsername;
    }

    public final String getHashedPhoneNumber() {
        return this.hashedPhoneNumber;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getFormatReason() {
        String str = this.reason;
        if (str != null) {
            return C89361p.m154869a(str, "{0}", "%s", false);
        }
        return null;
    }

    public final boolean isValid() {
        String str = this.reason;
        if (str == null || str.length() == 0 || formatArgInvalid()) {
            return false;
        }
        return true;
    }

    public final boolean formatArgInvalid() {
        String str;
        String str2;
        String str3 = this.reason;
        if (str3 != null && C89361p.m154908a((CharSequence) str3, (CharSequence) "{0}", false) && (((str = this.hashedPhoneNumber) == null || str.length() == 0) && ((str2 = this.externalUsername) == null || str2.length() == 0))) {
            return true;
        }
        return false;
    }

    public final void setExternalUsername(String str) {
        this.externalUsername = str;
    }

    public final void setHashedPhoneNumber(String str) {
        this.hashedPhoneNumber = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public ExternalRecommendReasonStruct(String str, String str2, String str3) {
        this.reason = str;
        this.hashedPhoneNumber = str2;
        this.externalUsername = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExternalRecommendReasonStruct(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAweme */
public final class TiktokRelieveAweme extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "aweme_id")
    private final String awemeId;

    static {
        Covode.recordClassIndex(47814);
    }

    public static /* synthetic */ TiktokRelieveAweme copy$default(TiktokRelieveAweme tiktokRelieveAweme, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tiktokRelieveAweme.awemeId;
        }
        return tiktokRelieveAweme.copy(str);
    }

    public final String component1() {
        return this.awemeId;
    }

    public final TiktokRelieveAweme copy(String str) {
        C89219l.m154721d(str, "");
        return new TiktokRelieveAweme(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TiktokRelieveAweme) && C89219l.m154714a(this.awemeId, ((TiktokRelieveAweme) obj).awemeId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.awemeId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "TiktokRelieveAweme(awemeId=" + this.awemeId + ")";
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public TiktokRelieveAweme(String str) {
        C89219l.m154721d(str, "");
        this.awemeId = str;
    }
}

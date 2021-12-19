package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt */
public final class CmplRespForEncrypt extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "cmpl_enc")
    private final String complianceEncrypt;
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean logPb;

    static {
        Covode.recordClassIndex(46881);
    }

    public CmplRespForEncrypt() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CmplRespForEncrypt copy$default(CmplRespForEncrypt cmplRespForEncrypt, String str, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cmplRespForEncrypt.complianceEncrypt;
        }
        if ((i & 2) != 0) {
            logPbBean = cmplRespForEncrypt.logPb;
        }
        return cmplRespForEncrypt.copy(str, logPbBean);
    }

    public final String component1() {
        return this.complianceEncrypt;
    }

    public final LogPbBean component2() {
        return this.logPb;
    }

    public final CmplRespForEncrypt copy(String str, LogPbBean logPbBean) {
        return new CmplRespForEncrypt(str, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmplRespForEncrypt)) {
            return false;
        }
        CmplRespForEncrypt cmplRespForEncrypt = (CmplRespForEncrypt) obj;
        return C89219l.m154714a(this.complianceEncrypt, cmplRespForEncrypt.complianceEncrypt) && C89219l.m154714a(this.logPb, cmplRespForEncrypt.logPb);
    }

    public final int hashCode() {
        String str = this.complianceEncrypt;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CmplRespForEncrypt(complianceEncrypt=" + this.complianceEncrypt + ", logPb=" + this.logPb + ")";
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public CmplRespForEncrypt(String str, LogPbBean logPbBean) {
        this.complianceEncrypt = str;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CmplRespForEncrypt(String str, LogPbBean logPbBean, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : logPbBean);
    }
}

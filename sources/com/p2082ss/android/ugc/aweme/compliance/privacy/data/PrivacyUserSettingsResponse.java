package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyUserSettingsResponse */
public final class PrivacyUserSettingsResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean logPb;
    @AbstractC27891c(mo46611a = "privacy_settings")
    private final C39258q privacyUserSettings;

    static {
        Covode.recordClassIndex(47379);
    }

    public PrivacyUserSettingsResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PrivacyUserSettingsResponse copy$default(PrivacyUserSettingsResponse privacyUserSettingsResponse, C39258q qVar, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = privacyUserSettingsResponse.privacyUserSettings;
        }
        if ((i & 2) != 0) {
            logPbBean = privacyUserSettingsResponse.logPb;
        }
        return privacyUserSettingsResponse.copy(qVar, logPbBean);
    }

    public final C39258q component1() {
        return this.privacyUserSettings;
    }

    public final LogPbBean component2() {
        return this.logPb;
    }

    public final PrivacyUserSettingsResponse copy(C39258q qVar, LogPbBean logPbBean) {
        return new PrivacyUserSettingsResponse(qVar, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyUserSettingsResponse)) {
            return false;
        }
        PrivacyUserSettingsResponse privacyUserSettingsResponse = (PrivacyUserSettingsResponse) obj;
        return C89219l.m154714a(this.privacyUserSettings, privacyUserSettingsResponse.privacyUserSettings) && C89219l.m154714a(this.logPb, privacyUserSettingsResponse.logPb);
    }

    public final int hashCode() {
        C39258q qVar = this.privacyUserSettings;
        int i = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PrivacyUserSettingsResponse(privacyUserSettings=" + this.privacyUserSettings + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final C39258q getPrivacyUserSettings() {
        return this.privacyUserSettings;
    }

    public PrivacyUserSettingsResponse(C39258q qVar, LogPbBean logPbBean) {
        this.privacyUserSettings = qVar;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacyUserSettingsResponse(C39258q qVar, LogPbBean logPbBean, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : qVar, (i & 2) != 0 ? null : logPbBean);
    }
}

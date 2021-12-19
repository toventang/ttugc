package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39254n;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyRestrictionResponse */
public final class PrivacyRestrictionResponse extends BaseResponse {
    private final LogPbBean logPb;
    private final Map<String, C39252m> popupAgreement;
    private final Map<String, C39252m> postRecord;
    private final C39254n privacySettingRestriction;

    static {
        Covode.recordClassIndex(47376);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyRestrictionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacyRestrictionResponse copy$default(PrivacyRestrictionResponse privacyRestrictionResponse, C39254n nVar, Map map, Map map2, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            nVar = privacyRestrictionResponse.privacySettingRestriction;
        }
        if ((i & 2) != 0) {
            map = privacyRestrictionResponse.popupAgreement;
        }
        if ((i & 4) != 0) {
            map2 = privacyRestrictionResponse.postRecord;
        }
        if ((i & 8) != 0) {
            logPbBean = privacyRestrictionResponse.logPb;
        }
        return privacyRestrictionResponse.copy(nVar, map, map2, logPbBean);
    }

    public final C39254n component1() {
        return this.privacySettingRestriction;
    }

    public final Map<String, C39252m> component2() {
        return this.popupAgreement;
    }

    public final Map<String, C39252m> component3() {
        return this.postRecord;
    }

    public final LogPbBean component4() {
        return this.logPb;
    }

    public final PrivacyRestrictionResponse copy(C39254n nVar, Map<String, C39252m> map, Map<String, C39252m> map2, LogPbBean logPbBean) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        return new PrivacyRestrictionResponse(nVar, map, map2, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyRestrictionResponse)) {
            return false;
        }
        PrivacyRestrictionResponse privacyRestrictionResponse = (PrivacyRestrictionResponse) obj;
        return C89219l.m154714a(this.privacySettingRestriction, privacyRestrictionResponse.privacySettingRestriction) && C89219l.m154714a(this.popupAgreement, privacyRestrictionResponse.popupAgreement) && C89219l.m154714a(this.postRecord, privacyRestrictionResponse.postRecord) && C89219l.m154714a(this.logPb, privacyRestrictionResponse.logPb);
    }

    public final int hashCode() {
        C39254n nVar = this.privacySettingRestriction;
        int i = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        Map<String, C39252m> map = this.popupAgreement;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, C39252m> map2 = this.postRecord;
        int hashCode3 = (hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PrivacyRestrictionResponse(privacySettingRestriction=" + this.privacySettingRestriction + ", popupAgreement=" + this.popupAgreement + ", postRecord=" + this.postRecord + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Map<String, C39252m> getPopupAgreement() {
        return this.popupAgreement;
    }

    public final Map<String, C39252m> getPostRecord() {
        return this.postRecord;
    }

    public final C39254n getPrivacySettingRestriction() {
        return this.privacySettingRestriction;
    }

    public PrivacyRestrictionResponse(C39254n nVar, Map<String, C39252m> map, Map<String, C39252m> map2, LogPbBean logPbBean) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        this.privacySettingRestriction = nVar;
        this.popupAgreement = map;
        this.postRecord = map2;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacyRestrictionResponse(C39254n nVar, Map map, Map map2, LogPbBean logPbBean, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : nVar, map, map2, (i & 8) != 0 ? null : logPbBean);
    }
}

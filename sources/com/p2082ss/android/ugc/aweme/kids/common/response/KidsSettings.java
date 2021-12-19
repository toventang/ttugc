package com.p2082ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.response.KidsSettings */
public final class KidsSettings extends BaseResponse {
    @AbstractC27891c(mo46611a = "ab_test_params")
    private final AbstractC28019l abTestParamStruct;
    @AbstractC27891c(mo46611a = "compliance_settings")
    private final KidsComplianceSettings complianceSettings;

    static {
        Covode.recordClassIndex(67269);
    }

    public static /* synthetic */ KidsSettings copy$default(KidsSettings kidsSettings, KidsComplianceSettings kidsComplianceSettings, AbstractC28019l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kidsComplianceSettings = kidsSettings.complianceSettings;
        }
        if ((i & 2) != 0) {
            lVar = kidsSettings.abTestParamStruct;
        }
        return kidsSettings.copy(kidsComplianceSettings, lVar);
    }

    public final KidsComplianceSettings component1() {
        return this.complianceSettings;
    }

    public final AbstractC28019l component2() {
        return this.abTestParamStruct;
    }

    public final KidsSettings copy(KidsComplianceSettings kidsComplianceSettings, AbstractC28019l lVar) {
        return new KidsSettings(kidsComplianceSettings, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsSettings)) {
            return false;
        }
        KidsSettings kidsSettings = (KidsSettings) obj;
        return C89219l.m154714a(this.complianceSettings, kidsSettings.complianceSettings) && C89219l.m154714a(this.abTestParamStruct, kidsSettings.abTestParamStruct);
    }

    public final int hashCode() {
        KidsComplianceSettings kidsComplianceSettings = this.complianceSettings;
        int i = 0;
        int hashCode = (kidsComplianceSettings != null ? kidsComplianceSettings.hashCode() : 0) * 31;
        AbstractC28019l lVar = this.abTestParamStruct;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "KidsSettings(complianceSettings=" + this.complianceSettings + ", abTestParamStruct=" + this.abTestParamStruct + ")";
    }

    public final AbstractC28019l getAbTestParamStruct() {
        return this.abTestParamStruct;
    }

    public final KidsComplianceSettings getComplianceSettings() {
        return this.complianceSettings;
    }

    public KidsSettings(KidsComplianceSettings kidsComplianceSettings, AbstractC28019l lVar) {
        this.complianceSettings = kidsComplianceSettings;
        this.abTestParamStruct = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsSettings(KidsComplianceSettings kidsComplianceSettings, AbstractC28019l lVar, int i, C89214g gVar) {
        this(kidsComplianceSettings, (i & 2) != 0 ? null : lVar);
    }
}

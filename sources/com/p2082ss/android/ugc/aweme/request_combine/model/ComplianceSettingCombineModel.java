package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel */
public final class ComplianceSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private ComplianceSetting complianceSetting;

    static {
        Covode.recordClassIndex(78721);
    }

    public ComplianceSettingCombineModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ ComplianceSettingCombineModel copy$default(ComplianceSettingCombineModel complianceSettingCombineModel, ComplianceSetting complianceSetting2, int i, Object obj) {
        if ((i & 1) != 0) {
            complianceSetting2 = complianceSettingCombineModel.complianceSetting;
        }
        return complianceSettingCombineModel.copy(complianceSetting2);
    }

    public final ComplianceSetting component1() {
        return this.complianceSetting;
    }

    public final ComplianceSettingCombineModel copy(ComplianceSetting complianceSetting2) {
        return new ComplianceSettingCombineModel(complianceSetting2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ComplianceSettingCombineModel) && C89219l.m154714a(this.complianceSetting, ((ComplianceSettingCombineModel) obj).complianceSetting);
        }
        return true;
    }

    public final int hashCode() {
        ComplianceSetting complianceSetting2 = this.complianceSetting;
        if (complianceSetting2 != null) {
            return complianceSetting2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ComplianceSettingCombineModel(complianceSetting=" + this.complianceSetting + ")";
    }

    public final ComplianceSetting getComplianceSetting() {
        return this.complianceSetting;
    }

    public final void setComplianceSetting(ComplianceSetting complianceSetting2) {
        this.complianceSetting = complianceSetting2;
    }

    public ComplianceSettingCombineModel(ComplianceSetting complianceSetting2) {
        this.complianceSetting = complianceSetting2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComplianceSettingCombineModel(ComplianceSetting complianceSetting2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : complianceSetting2);
    }
}

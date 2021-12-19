package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo */
public final class AgeGateInfo implements Serializable {
    @AbstractC27891c(mo46611a = "register_age_gate_action")
    private final int registerAgeGateAction;

    static {
        Covode.recordClassIndex(46877);
    }

    public AgeGateInfo() {
        this(0, 1, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_compliance_api_model_AgeGateInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79634x297b2688(int i) {
        return i;
    }

    public static /* synthetic */ AgeGateInfo copy$default(AgeGateInfo ageGateInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ageGateInfo.registerAgeGateAction;
        }
        return ageGateInfo.copy(i);
    }

    public final int component1() {
        return this.registerAgeGateAction;
    }

    public final AgeGateInfo copy(int i) {
        return new AgeGateInfo(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AgeGateInfo) && this.registerAgeGateAction == ((AgeGateInfo) obj).registerAgeGateAction;
        }
        return true;
    }

    public final int hashCode() {
        return m79634x297b2688(this.registerAgeGateAction);
    }

    public final String toString() {
        return "AgeGateInfo(registerAgeGateAction=" + this.registerAgeGateAction + ")";
    }

    public final int getRegisterAgeGateAction() {
        return this.registerAgeGateAction;
    }

    public AgeGateInfo(int i) {
        this.registerAgeGateAction = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgeGateInfo(int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

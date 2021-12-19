package com.p2082ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationResponse */
public final class VerificationResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "cert_status")
    private MtCertStatusEnum mtCertStatusEnum;
    @AbstractC27891c(mo46611a = "certing_action")
    private MtCertingActionEnum mtCertingActionEnum;

    static {
        Covode.recordClassIndex(80969);
    }

    public final MtCertStatusEnum getMtCertStatusEnum() {
        return this.mtCertStatusEnum;
    }

    public final MtCertingActionEnum getMtCertingActionEnum() {
        return this.mtCertingActionEnum;
    }

    public final boolean isCerted() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_EMPTY) {
            return true;
        }
        return false;
    }

    public final boolean isCertedAgain() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING) {
            return true;
        }
        return false;
    }

    public final boolean isUpdating() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING) {
            return true;
        }
        return false;
    }

    public final boolean isCerting() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTING) {
            return true;
        }
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_EMPTY && this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if ((this.mtCertStatusEnum == MtCertStatusEnum.CS_EMPTY && this.mtCertingActionEnum == MtCertingActionEnum.CA_EMPTY) || this.mtCertStatusEnum == MtCertStatusEnum.CS_DENIED) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowChangeMobileDialog() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED || this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING || this.mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowProfileUpdatingToast() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING || this.mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING) {
            return true;
        }
        return false;
    }

    public final void setMtCertStatusEnum(MtCertStatusEnum mtCertStatusEnum2) {
        this.mtCertStatusEnum = mtCertStatusEnum2;
    }

    public final void setMtCertingActionEnum(MtCertingActionEnum mtCertingActionEnum2) {
        this.mtCertingActionEnum = mtCertingActionEnum2;
    }
}

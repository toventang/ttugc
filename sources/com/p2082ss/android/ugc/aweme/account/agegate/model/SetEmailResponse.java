package com.p2082ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.SetEmailResponse */
public final class SetEmailResponse {
    private final int status_code;
    private final String status_msg;

    static {
        Covode.recordClassIndex(38257);
    }

    /* renamed from: com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m65796x47ad567(int i) {
        return i;
    }

    public static /* synthetic */ SetEmailResponse copy$default(SetEmailResponse setEmailResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setEmailResponse.status_code;
        }
        if ((i2 & 2) != 0) {
            str = setEmailResponse.status_msg;
        }
        return setEmailResponse.copy(i, str);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final SetEmailResponse copy(int i, String str) {
        C89219l.m154721d(str, "");
        return new SetEmailResponse(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetEmailResponse)) {
            return false;
        }
        SetEmailResponse setEmailResponse = (SetEmailResponse) obj;
        return this.status_code == setEmailResponse.status_code && C89219l.m154714a(this.status_msg, setEmailResponse.status_msg);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m65796x47ad567(this.status_code) * 31;
        String str = this.status_msg;
        return com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SetEmailResponse(status_code=" + this.status_code + ", status_msg=" + this.status_msg + ")";
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public SetEmailResponse(int i, String str) {
        C89219l.m154721d(str, "");
        this.status_code = i;
        this.status_msg = str;
    }
}

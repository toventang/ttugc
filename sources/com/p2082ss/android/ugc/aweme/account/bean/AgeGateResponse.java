package com.p2082ss.android.ugc.aweme.account.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.bean.AgeGateResponse */
public final class AgeGateResponse implements Serializable {
    public static final C31593a Companion = new C31593a((byte) 0);
    @AbstractC27891c(mo46611a = "age_gate_post_action")
    private final int ageGatePostAction;
    private final boolean is_prompt;
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean logPb;
    @AbstractC27891c(mo46611a = "register_age_gate_post_action")
    private final int registerAgeGatePostAction;
    private final int status_code;
    private final String status_msg;

    static {
        Covode.recordClassIndex(38319);
    }

    public AgeGateResponse() {
        this(0, null, false, 0, 0, null, 63, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m65892x989db9fd(int i) {
        return i;
    }

    public static /* synthetic */ AgeGateResponse copy$default(AgeGateResponse ageGateResponse, int i, String str, boolean z, int i2, int i3, LogPbBean logPbBean, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ageGateResponse.status_code;
        }
        if ((i4 & 2) != 0) {
            str = ageGateResponse.status_msg;
        }
        if ((i4 & 4) != 0) {
            z = ageGateResponse.is_prompt;
        }
        if ((i4 & 8) != 0) {
            i2 = ageGateResponse.registerAgeGatePostAction;
        }
        if ((i4 & 16) != 0) {
            i3 = ageGateResponse.ageGatePostAction;
        }
        if ((i4 & 32) != 0) {
            logPbBean = ageGateResponse.logPb;
        }
        return ageGateResponse.copy(i, str, z, i2, i3, logPbBean);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final boolean component3() {
        return this.is_prompt;
    }

    public final int component4() {
        return this.registerAgeGatePostAction;
    }

    public final int component5() {
        return this.ageGatePostAction;
    }

    public final LogPbBean component6() {
        return this.logPb;
    }

    public final AgeGateResponse copy(int i, String str, boolean z, int i2, int i3, LogPbBean logPbBean) {
        return new AgeGateResponse(i, str, z, i2, i3, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateResponse)) {
            return false;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
        return this.status_code == ageGateResponse.status_code && C89219l.m154714a(this.status_msg, ageGateResponse.status_msg) && this.is_prompt == ageGateResponse.is_prompt && this.registerAgeGatePostAction == ageGateResponse.registerAgeGatePostAction && this.ageGatePostAction == ageGateResponse.ageGatePostAction && C89219l.m154714a(this.logPb, ageGateResponse.logPb);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m65892x989db9fd(this.status_code) * 31;
        String str = this.status_msg;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.is_prompt;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((((hashCode + i2) * 31) + m65892x989db9fd(this.registerAgeGatePostAction)) * 31) + m65892x989db9fd(this.ageGatePostAction)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i;
    }

    public final String toString() {
        return "AgeGateResponse(status_code=" + this.status_code + ", status_msg=" + this.status_msg + ", is_prompt=" + this.is_prompt + ", registerAgeGatePostAction=" + this.registerAgeGatePostAction + ", ageGatePostAction=" + this.ageGatePostAction + ", logPb=" + this.logPb + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.bean.AgeGateResponse$a */
    public static final class C31593a {
        static {
            Covode.recordClassIndex(38320);
        }

        private C31593a() {
        }

        public /* synthetic */ C31593a(byte b) {
            this();
        }
    }

    public final int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getRegisterAgeGatePostAction() {
        return this.registerAgeGatePostAction;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public AgeGateResponse(int i, String str, boolean z, int i2, int i3, LogPbBean logPbBean) {
        this.status_code = i;
        this.status_msg = str;
        this.is_prompt = z;
        this.registerAgeGatePostAction = i2;
        this.ageGatePostAction = i3;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgeGateResponse(int i, String str, boolean z, int i2, int i3, LogPbBean logPbBean, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) == 0 ? i3 : 0, (i4 & 32) != 0 ? null : logPbBean);
    }
}

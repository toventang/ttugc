package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning */
public final class GradientPunishWarning {
    @AbstractC27891c(mo46611a = "toast_text")
    private final String bubbleText;
    @AbstractC27891c(mo46611a = "detail_url")
    private final String detailUrl;
    @AbstractC27891c(mo46611a = "popup_confirm")
    private final String dialogButton;
    @AbstractC27891c(mo46611a = "popup_text")
    private final String dialogMessage;
    @AbstractC27891c(mo46611a = "warn_type")
    private final int warnType;

    static {
        Covode.recordClassIndex(47023);
    }

    public GradientPunishWarning() {
        this(null, null, null, 0, null, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_compliance_business_banappeal_gradientpunish_GradientPunishWarning_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79986xe17d0d28(int i) {
        return i;
    }

    public static /* synthetic */ GradientPunishWarning copy$default(GradientPunishWarning gradientPunishWarning, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gradientPunishWarning.dialogMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = gradientPunishWarning.dialogButton;
        }
        if ((i2 & 4) != 0) {
            str3 = gradientPunishWarning.bubbleText;
        }
        if ((i2 & 8) != 0) {
            i = gradientPunishWarning.warnType;
        }
        if ((i2 & 16) != 0) {
            str4 = gradientPunishWarning.detailUrl;
        }
        return gradientPunishWarning.copy(str, str2, str3, i, str4);
    }

    public final String component1() {
        return this.dialogMessage;
    }

    public final String component2() {
        return this.dialogButton;
    }

    public final String component3() {
        return this.bubbleText;
    }

    public final int component4() {
        return this.warnType;
    }

    public final String component5() {
        return this.detailUrl;
    }

    public final GradientPunishWarning copy(String str, String str2, String str3, int i, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new GradientPunishWarning(str, str2, str3, i, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientPunishWarning)) {
            return false;
        }
        GradientPunishWarning gradientPunishWarning = (GradientPunishWarning) obj;
        return C89219l.m154714a(this.dialogMessage, gradientPunishWarning.dialogMessage) && C89219l.m154714a(this.dialogButton, gradientPunishWarning.dialogButton) && C89219l.m154714a(this.bubbleText, gradientPunishWarning.bubbleText) && this.warnType == gradientPunishWarning.warnType && C89219l.m154714a(this.detailUrl, gradientPunishWarning.detailUrl);
    }

    public final int hashCode() {
        String str = this.dialogMessage;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dialogButton;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bubbleText;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + m79986xe17d0d28(this.warnType)) * 31;
        String str4 = this.detailUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "GradientPunishWarning(dialogMessage=" + this.dialogMessage + ", dialogButton=" + this.dialogButton + ", bubbleText=" + this.bubbleText + ", warnType=" + this.warnType + ", detailUrl=" + this.detailUrl + ")";
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getDialogButton() {
        return this.dialogButton;
    }

    public final String getDialogMessage() {
        return this.dialogMessage;
    }

    public final int getWarnType() {
        return this.warnType;
    }

    public GradientPunishWarning(String str, String str2, String str3, int i, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.dialogMessage = str;
        this.dialogButton = str2;
        this.bubbleText = str3;
        this.warnType = i;
        this.detailUrl = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GradientPunishWarning(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, int r12, p4600h.p4611f.p4613b.C89214g r13) {
        /*
            r6 = this;
            r3 = r9
            r4 = r10
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001b
            r0 = 0
            r4 = 0
        L_0x001b:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0024
        L_0x001f:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0024:
            r5 = r11
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, h.f.b.g):void");
    }
}

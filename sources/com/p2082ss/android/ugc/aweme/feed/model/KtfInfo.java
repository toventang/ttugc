package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.KtfInfo */
public final class KtfInfo implements Serializable {
    @AbstractC27891c(mo46611a = "caution_label")
    private final String cautionLabel;
    private boolean hasShowOnce;
    @AbstractC27891c(mo46611a = "message_text_on_share")
    private final String messageTextOnShare;
    @AbstractC27891c(mo46611a = "show_message_on_share")
    private final boolean showMessageOnShare;
    @AbstractC27891c(mo46611a = "show_warning")
    private final boolean showWarning;
    @AbstractC27891c(mo46611a = "warning_text")
    private final String warningText;

    static {
        Covode.recordClassIndex(58720);
    }

    public KtfInfo() {
        this(false, null, null, false, null, false, 63, null);
    }

    public static /* synthetic */ KtfInfo copy$default(KtfInfo ktfInfo, boolean z, String str, String str2, boolean z2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ktfInfo.showWarning;
        }
        if ((i & 2) != 0) {
            str = ktfInfo.cautionLabel;
        }
        if ((i & 4) != 0) {
            str2 = ktfInfo.warningText;
        }
        if ((i & 8) != 0) {
            z2 = ktfInfo.showMessageOnShare;
        }
        if ((i & 16) != 0) {
            str3 = ktfInfo.messageTextOnShare;
        }
        if ((i & 32) != 0) {
            z3 = ktfInfo.hasShowOnce;
        }
        return ktfInfo.copy(z, str, str2, z2, str3, z3);
    }

    public final boolean component1() {
        return this.showWarning;
    }

    public final String component2() {
        return this.cautionLabel;
    }

    public final String component3() {
        return this.warningText;
    }

    public final boolean component4() {
        return this.showMessageOnShare;
    }

    public final String component5() {
        return this.messageTextOnShare;
    }

    public final boolean component6() {
        return this.hasShowOnce;
    }

    public final KtfInfo copy(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new KtfInfo(z, str, str2, z2, str3, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtfInfo)) {
            return false;
        }
        KtfInfo ktfInfo = (KtfInfo) obj;
        return this.showWarning == ktfInfo.showWarning && C89219l.m154714a(this.cautionLabel, ktfInfo.cautionLabel) && C89219l.m154714a(this.warningText, ktfInfo.warningText) && this.showMessageOnShare == ktfInfo.showMessageOnShare && C89219l.m154714a(this.messageTextOnShare, ktfInfo.messageTextOnShare) && this.hasShowOnce == ktfInfo.hasShowOnce;
    }

    public final int hashCode() {
        boolean z = this.showWarning;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.cautionLabel;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.warningText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.showMessageOnShare;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode2 + i7) * 31;
        String str3 = this.messageTextOnShare;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        if (!this.hasShowOnce) {
            i = 0;
        }
        return i11 + i;
    }

    public final void resetState() {
        this.hasShowOnce = false;
    }

    public final String toString() {
        return "KtfInfo(showWarning=" + this.showWarning + ", cautionLabel=" + this.cautionLabel + ", warningText=" + this.warningText + ", showMessageOnShare=" + this.showMessageOnShare + ", messageTextOnShare=" + this.messageTextOnShare + ", hasShowOnce=" + this.hasShowOnce + ")";
    }

    public final String getCautionLabel() {
        return this.cautionLabel;
    }

    public final boolean getHasShowOnce() {
        return this.hasShowOnce;
    }

    public final String getMessageTextOnShare() {
        return this.messageTextOnShare;
    }

    public final boolean getShowMessageOnShare() {
        return this.showMessageOnShare;
    }

    public final boolean getShowWarning() {
        return this.showWarning;
    }

    public final String getWarningText() {
        return this.warningText;
    }

    public final void setHasShowOnce(boolean z) {
        this.hasShowOnce = z;
    }

    public KtfInfo(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.showWarning = z;
        this.cautionLabel = str;
        this.warningText = str2;
        this.showMessageOnShare = z2;
        this.messageTextOnShare = str3;
        this.hasShowOnce = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KtfInfo(boolean r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13, boolean r14, int r15, p4600h.p4611f.p4613b.C89214g r16) {
        /*
            r8 = this;
            r7 = r14
            r2 = r9
            r4 = r11
            r3 = r10
            r5 = r12
            r1 = r15 & 1
            r0 = 0
            if (r1 == 0) goto L_0x000b
            r2 = 0
        L_0x000b:
            r0 = r15 & 2
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0012
            r3 = r6
        L_0x0012:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0017
            r4 = r6
        L_0x0017:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x002a
        L_0x0020:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0025
            r7 = 0
        L_0x0025:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x002a:
            r6 = r13
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.KtfInfo.<init>(boolean, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, int, h.f.b.g):void");
    }
}

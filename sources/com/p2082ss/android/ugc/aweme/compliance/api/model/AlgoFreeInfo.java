package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo */
public final class AlgoFreeInfo extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "background_video_url")
    private final String backgroundVideoUrl;
    @AbstractC27891c(mo46611a = "body")
    private final String body;
    @AbstractC27891c(mo46611a = "icon_url")
    private final String iconUrl;
    @AbstractC27891c(mo46611a = "learn_more_link")
    private final String learnMoreLink;
    @AbstractC27891c(mo46611a = "learn_more_text")
    private final String learnMoreText;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(46878);
    }

    public AlgoFreeInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AlgoFreeInfo copy$default(AlgoFreeInfo algoFreeInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = algoFreeInfo.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = algoFreeInfo.title;
        }
        if ((i & 4) != 0) {
            str3 = algoFreeInfo.body;
        }
        if ((i & 8) != 0) {
            str4 = algoFreeInfo.learnMoreText;
        }
        if ((i & 16) != 0) {
            str5 = algoFreeInfo.learnMoreLink;
        }
        if ((i & 32) != 0) {
            str6 = algoFreeInfo.backgroundVideoUrl;
        }
        return algoFreeInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.body;
    }

    public final String component4() {
        return this.learnMoreText;
    }

    public final String component5() {
        return this.learnMoreLink;
    }

    public final String component6() {
        return this.backgroundVideoUrl;
    }

    public final AlgoFreeInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        return new AlgoFreeInfo(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoFreeInfo)) {
            return false;
        }
        AlgoFreeInfo algoFreeInfo = (AlgoFreeInfo) obj;
        return C89219l.m154714a(this.iconUrl, algoFreeInfo.iconUrl) && C89219l.m154714a(this.title, algoFreeInfo.title) && C89219l.m154714a(this.body, algoFreeInfo.body) && C89219l.m154714a(this.learnMoreText, algoFreeInfo.learnMoreText) && C89219l.m154714a(this.learnMoreLink, algoFreeInfo.learnMoreLink) && C89219l.m154714a(this.backgroundVideoUrl, algoFreeInfo.backgroundVideoUrl);
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.body;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.learnMoreText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.learnMoreLink;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.backgroundVideoUrl;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AlgoFreeInfo(iconUrl=" + this.iconUrl + ", title=" + this.title + ", body=" + this.body + ", learnMoreText=" + this.learnMoreText + ", learnMoreLink=" + this.learnMoreLink + ", backgroundVideoUrl=" + this.backgroundVideoUrl + ")";
    }

    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final String getTitle() {
        return this.title;
    }

    public AlgoFreeInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.iconUrl = str;
        this.title = str2;
        this.body = str3;
        this.learnMoreText = str4;
        this.learnMoreLink = str5;
        this.backgroundVideoUrl = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AlgoFreeInfo(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, p4600h.p4611f.p4613b.C89214g r15) {
        /*
            r7 = this;
            r5 = r12
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0 = r14 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r1 = r6
        L_0x000c:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            r6 = r13
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}

package com.p2082ss.android.ugc.aweme.notice.repo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo */
public final class TutorialVideoInfo {
    @AbstractC27891c(mo46611a = "button_caption")
    private final String button;
    @AbstractC27891c(mo46611a = "deep_link")
    private final String deepLink;
    @AbstractC27891c(mo46611a = "desc")
    private final String desc;
    @AbstractC27891c(mo46611a = "icon")
    private final String icon;
    @AbstractC27891c(mo46611a = "msg_id")
    private final String msgId;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(72307);
    }

    public TutorialVideoInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TutorialVideoInfo copy$default(TutorialVideoInfo tutorialVideoInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tutorialVideoInfo.msgId;
        }
        if ((i & 2) != 0) {
            str2 = tutorialVideoInfo.icon;
        }
        if ((i & 4) != 0) {
            str3 = tutorialVideoInfo.title;
        }
        if ((i & 8) != 0) {
            str4 = tutorialVideoInfo.desc;
        }
        if ((i & 16) != 0) {
            str5 = tutorialVideoInfo.button;
        }
        if ((i & 32) != 0) {
            str6 = tutorialVideoInfo.deepLink;
        }
        return tutorialVideoInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.msgId;
    }

    public final String component2() {
        return this.icon;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.desc;
    }

    public final String component5() {
        return this.button;
    }

    public final String component6() {
        return this.deepLink;
    }

    public final TutorialVideoInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        return new TutorialVideoInfo(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TutorialVideoInfo)) {
            return false;
        }
        TutorialVideoInfo tutorialVideoInfo = (TutorialVideoInfo) obj;
        return C89219l.m154714a(this.msgId, tutorialVideoInfo.msgId) && C89219l.m154714a(this.icon, tutorialVideoInfo.icon) && C89219l.m154714a(this.title, tutorialVideoInfo.title) && C89219l.m154714a(this.desc, tutorialVideoInfo.desc) && C89219l.m154714a(this.button, tutorialVideoInfo.button) && C89219l.m154714a(this.deepLink, tutorialVideoInfo.deepLink);
    }

    public final int hashCode() {
        String str = this.msgId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.desc;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.button;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.deepLink;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "TutorialVideoInfo(msgId=" + this.msgId + ", icon=" + this.icon + ", title=" + this.title + ", desc=" + this.desc + ", button=" + this.button + ", deepLink=" + this.deepLink + ")";
    }

    public final String getButton() {
        return this.button;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getTitle() {
        return this.title;
    }

    public TutorialVideoInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.msgId = str;
        this.icon = str2;
        this.title = str3;
        this.desc = str4;
        this.button = str5;
        this.deepLink = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TutorialVideoInfo(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, p4600h.p4611f.p4613b.C89214g r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}

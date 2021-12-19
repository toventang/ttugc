package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoMaskInfo */
public final class VideoMaskInfo implements Serializable {
    @AbstractC27891c(mo46611a = "cancel_mask_label")
    public String cancelMaskLabel;
    @AbstractC27891c(mo46611a = "content")
    public String content;
    @AbstractC27891c(mo46611a = "mask_type")
    public Integer maskType;
    @AbstractC27891c(mo46611a = "show_mask")
    public Boolean showMask;
    @AbstractC27891c(mo46611a = "status")
    public Integer status;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(58774);
    }

    public VideoMaskInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ VideoMaskInfo copy$default(VideoMaskInfo videoMaskInfo, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = videoMaskInfo.showMask;
        }
        if ((i & 2) != 0) {
            num = videoMaskInfo.maskType;
        }
        if ((i & 4) != 0) {
            num2 = videoMaskInfo.status;
        }
        if ((i & 8) != 0) {
            str = videoMaskInfo.title;
        }
        if ((i & 16) != 0) {
            str2 = videoMaskInfo.content;
        }
        if ((i & 32) != 0) {
            str3 = videoMaskInfo.cancelMaskLabel;
        }
        return videoMaskInfo.copy(bool, num, num2, str, str2, str3);
    }

    public final Boolean component1() {
        return this.showMask;
    }

    public final Integer component2() {
        return this.maskType;
    }

    public final Integer component3() {
        return this.status;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.content;
    }

    public final String component6() {
        return this.cancelMaskLabel;
    }

    public final VideoMaskInfo copy(Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        return new VideoMaskInfo(bool, num, num2, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMaskInfo)) {
            return false;
        }
        VideoMaskInfo videoMaskInfo = (VideoMaskInfo) obj;
        return C89219l.m154714a(this.showMask, videoMaskInfo.showMask) && C89219l.m154714a(this.maskType, videoMaskInfo.maskType) && C89219l.m154714a(this.status, videoMaskInfo.status) && C89219l.m154714a(this.title, videoMaskInfo.title) && C89219l.m154714a(this.content, videoMaskInfo.content) && C89219l.m154714a(this.cancelMaskLabel, videoMaskInfo.cancelMaskLabel);
    }

    public final int hashCode() {
        Boolean bool = this.showMask;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.maskType;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.status;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.content;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cancelMaskLabel;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "VideoMaskInfo(showMask=" + this.showMask + ", maskType=" + this.maskType + ", status=" + this.status + ", title=" + this.title + ", content=" + this.content + ", cancelMaskLabel=" + this.cancelMaskLabel + ")";
    }

    public final String getCancelMaskLabel() {
        return this.cancelMaskLabel;
    }

    public final String getContent() {
        return this.content;
    }

    public final Integer getMaskType() {
        return this.maskType;
    }

    public final Boolean getShowMask() {
        return this.showMask;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public VideoMaskInfo(Boolean bool, Integer num, Integer num2, String str, String str2, String str3) {
        this.showMask = bool;
        this.maskType = num;
        this.status = num2;
        this.title = str;
        this.content = str2;
        this.cancelMaskLabel = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoMaskInfo(java.lang.Boolean r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, p4600h.p4611f.p4613b.C89214g r16) {
        /*
            r8 = this;
            r6 = r13
            r2 = r9
            r3 = r10
            r5 = r12
            r4 = r11
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
        L_0x000e:
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x0016:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x001b
            r4 = 0
        L_0x001b:
            r0 = r15 & 8
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0022
            r5 = r7
        L_0x0022:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0027
            r6 = r7
        L_0x0027:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0030
        L_0x002b:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            r7 = r14
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo.<init>(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}

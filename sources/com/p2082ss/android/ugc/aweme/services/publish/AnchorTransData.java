package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.publish.AnchorTransData */
public final class AnchorTransData implements Serializable {
    private Long addTime;
    private String anchorContent;
    private final UrlModel anchorIcon;
    private final String anchorTag;
    private final int businessType;
    private final boolean canDelete;
    private final String extra;

    /* renamed from: id */
    private final String f152055id;
    private final String language;
    private final Integer source;
    private String subtype;
    private final String title;
    private final String url;

    static {
        Covode.recordClassIndex(79923);
    }

    public AnchorTransData(int i, String str) {
        this(i, str, null, null, null, null, null, false, null, null, null, null, null, 8188, null);
    }

    public AnchorTransData(int i, String str, String str2) {
        this(i, str, str2, null, null, null, null, false, null, null, null, null, null, 8184, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3) {
        this(i, str, str2, str3, null, null, null, false, null, null, null, null, null, 8176, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num) {
        this(i, str, str2, str3, num, null, null, false, null, null, null, null, null, 8160, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4) {
        this(i, str, str2, str3, num, str4, null, false, null, null, null, null, null, 8128, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel) {
        this(i, str, str2, str3, num, str4, urlModel, false, null, null, null, null, null, 8064, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z) {
        this(i, str, str2, str3, num, str4, urlModel, z, null, null, null, null, null, 7936, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, null, null, null, null, 7680, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, null, null, null, 7168, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, null, null, 6144, null);
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7) {
        this(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, null, 4096, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120129x7b1b869b(int i) {
        return i;
    }

    public static /* synthetic */ AnchorTransData copy$default(AnchorTransData anchorTransData, int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = anchorTransData.businessType;
        }
        if ((i2 & 2) != 0) {
            str = anchorTransData.anchorContent;
        }
        if ((i2 & 4) != 0) {
            str2 = anchorTransData.title;
        }
        if ((i2 & 8) != 0) {
            str3 = anchorTransData.anchorTag;
        }
        if ((i2 & 16) != 0) {
            num = anchorTransData.source;
        }
        if ((i2 & 32) != 0) {
            str4 = anchorTransData.f152055id;
        }
        if ((i2 & 64) != 0) {
            urlModel = anchorTransData.anchorIcon;
        }
        if ((i2 & 128) != 0) {
            z = anchorTransData.canDelete;
        }
        if ((i2 & 256) != 0) {
            str5 = anchorTransData.url;
        }
        if ((i2 & 512) != 0) {
            str6 = anchorTransData.language;
        }
        if ((i2 & 1024) != 0) {
            l = anchorTransData.addTime;
        }
        if ((i2 & 2048) != 0) {
            str7 = anchorTransData.extra;
        }
        if ((i2 & 4096) != 0) {
            str8 = anchorTransData.subtype;
        }
        return anchorTransData.copy(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8);
    }

    public final int component1() {
        return this.businessType;
    }

    public final String component10() {
        return this.language;
    }

    public final Long component11() {
        return this.addTime;
    }

    public final String component12() {
        return this.extra;
    }

    public final String component13() {
        return this.subtype;
    }

    public final String component2() {
        return this.anchorContent;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.anchorTag;
    }

    public final Integer component5() {
        return this.source;
    }

    public final String component6() {
        return this.f152055id;
    }

    public final UrlModel component7() {
        return this.anchorIcon;
    }

    public final boolean component8() {
        return this.canDelete;
    }

    public final String component9() {
        return this.url;
    }

    public final AnchorTransData copy(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8) {
        C89219l.m154721d(str, "");
        return new AnchorTransData(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorTransData)) {
            return false;
        }
        AnchorTransData anchorTransData = (AnchorTransData) obj;
        return this.businessType == anchorTransData.businessType && C89219l.m154714a(this.anchorContent, anchorTransData.anchorContent) && C89219l.m154714a(this.title, anchorTransData.title) && C89219l.m154714a(this.anchorTag, anchorTransData.anchorTag) && C89219l.m154714a(this.source, anchorTransData.source) && C89219l.m154714a(this.f152055id, anchorTransData.f152055id) && C89219l.m154714a(this.anchorIcon, anchorTransData.anchorIcon) && this.canDelete == anchorTransData.canDelete && C89219l.m154714a(this.url, anchorTransData.url) && C89219l.m154714a(this.language, anchorTransData.language) && C89219l.m154714a(this.addTime, anchorTransData.addTime) && C89219l.m154714a(this.extra, anchorTransData.extra) && C89219l.m154714a(this.subtype, anchorTransData.subtype);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m120129x7b1b869b(this.businessType) * 31;
        String str = this.anchorContent;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_services_publish_AnchorTransData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.anchorTag;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.source;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f152055id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.anchorIcon;
        int hashCode6 = (hashCode5 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        boolean z = this.canDelete;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode6 + i2) * 31;
        String str5 = this.url;
        int hashCode7 = (i5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.language;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Long l = this.addTime;
        int hashCode9 = (hashCode8 + (l != null ? l.hashCode() : 0)) * 31;
        String str7 = this.extra;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.subtype;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "AnchorTransData(businessType=" + this.businessType + ", anchorContent=" + this.anchorContent + ", title=" + this.title + ", anchorTag=" + this.anchorTag + ", source=" + this.source + ", id=" + this.f152055id + ", anchorIcon=" + this.anchorIcon + ", canDelete=" + this.canDelete + ", url=" + this.url + ", language=" + this.language + ", addTime=" + this.addTime + ", extra=" + this.extra + ", subtype=" + this.subtype + ")";
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final String getAnchorContent() {
        return this.anchorContent;
    }

    public final UrlModel getAnchorIcon() {
        return this.anchorIcon;
    }

    public final String getAnchorTag() {
        return this.anchorTag;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.f152055id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8) {
        C89219l.m154721d(str, "");
        this.businessType = i;
        this.anchorContent = str;
        this.title = str2;
        this.anchorTag = str3;
        this.source = num;
        this.f152055id = str4;
        this.anchorIcon = urlModel;
        this.canDelete = z;
        this.url = str5;
        this.language = str6;
        this.addTime = l;
        this.extra = str7;
        this.subtype = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnchorTransData(int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, com.p2082ss.android.ugc.aweme.base.model.UrlModel r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.Long r25, java.lang.String r26, java.lang.String r27, int r28, p4600h.p4611f.p4613b.C89214g r29) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.publish.AnchorTransData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }

    public final void setAddTime(Long l) {
        this.addTime = l;
    }

    public final void setSubtype(String str) {
        this.subtype = str;
    }

    public final void setAnchorContent(String str) {
        C89219l.m154721d(str, "");
        this.anchorContent = str;
    }
}

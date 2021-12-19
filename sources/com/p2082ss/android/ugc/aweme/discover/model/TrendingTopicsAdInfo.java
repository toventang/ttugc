package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo */
public final class TrendingTopicsAdInfo implements Serializable {
    @AbstractC27891c(mo46611a = "ad_id")
    private final long adId;
    @AbstractC27891c(mo46611a = "ad_label")
    private final AdLabel adLabel;
    @AbstractC27891c(mo46611a = "ad_position")
    private final int adPosition;
    @AbstractC27891c(mo46611a = "click_track_url_list")
    private final UrlModel clickTrackUrlList;
    @AbstractC27891c(mo46611a = "creative_id")
    private final long creativeId;
    @AbstractC27891c(mo46611a = "description")
    private final String description;
    @AbstractC27891c(mo46611a = "image_list")
    private final List<UrlModel> imageList;
    @AbstractC27891c(mo46611a = "is_preview")
    private final boolean isPreview;
    @AbstractC27891c(mo46611a = "label")
    private final AwemeTextLabelModel label;
    @AbstractC27891c(mo46611a = "log_extra")
    private final String logExtra;
    @AbstractC27891c(mo46611a = "mp_url")
    private final String mpUrl;
    @AbstractC27891c(mo46611a = "open_url")
    private final String openUrl;
    @AbstractC27891c(mo46611a = "source")
    private final String source;
    @AbstractC27891c(mo46611a = "title")
    private final String title;
    @AbstractC27891c(mo46611a = "track_url_list")
    private final UrlModel trackUrlList;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final String type;
    @AbstractC27891c(mo46611a = "web_title")
    private final String webTitle;
    @AbstractC27891c(mo46611a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(50538);
    }

    public TrendingTopicsAdInfo() {
        this(0, 0, 0, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 262143, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84893x102344c7(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84894x102344c7(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ TrendingTopicsAdInfo copy$default(TrendingTopicsAdInfo trendingTopicsAdInfo, int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel2, int i2, Object obj) {
        String str10 = str2;
        int i3 = i;
        long j3 = j2;
        long j4 = j;
        String str11 = str;
        List list2 = list;
        UrlModel urlModel3 = urlModel2;
        UrlModel urlModel4 = urlModel;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        boolean z2 = z;
        String str16 = str9;
        AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
        String str17 = str7;
        AdLabel adLabel3 = adLabel2;
        String str18 = str8;
        if ((i2 & 1) != 0) {
            i3 = trendingTopicsAdInfo.adPosition;
        }
        if ((i2 & 2) != 0) {
            j4 = trendingTopicsAdInfo.adId;
        }
        if ((i2 & 4) != 0) {
            j3 = trendingTopicsAdInfo.creativeId;
        }
        if ((i2 & 8) != 0) {
            str11 = trendingTopicsAdInfo.type;
        }
        if ((i2 & 16) != 0) {
            str10 = trendingTopicsAdInfo.source;
        }
        if ((i2 & 32) != 0) {
            str12 = trendingTopicsAdInfo.logExtra;
        }
        if ((i2 & 64) != 0) {
            str13 = trendingTopicsAdInfo.webUrl;
        }
        if ((i2 & 128) != 0) {
            str14 = trendingTopicsAdInfo.title;
        }
        if ((i2 & 256) != 0) {
            str15 = trendingTopicsAdInfo.webTitle;
        }
        if ((i2 & 512) != 0) {
            urlModel4 = trendingTopicsAdInfo.clickTrackUrlList;
        }
        if ((i2 & 1024) != 0) {
            urlModel3 = trendingTopicsAdInfo.trackUrlList;
        }
        if ((i2 & 2048) != 0) {
            list2 = trendingTopicsAdInfo.imageList;
        }
        if ((i2 & 4096) != 0) {
            z2 = trendingTopicsAdInfo.isPreview;
        }
        if ((i2 & 8192) != 0) {
            str17 = trendingTopicsAdInfo.openUrl;
        }
        if ((i2 & 16384) != 0) {
            str18 = trendingTopicsAdInfo.mpUrl;
        }
        if ((32768 & i2) != 0) {
            str16 = trendingTopicsAdInfo.description;
        }
        if ((65536 & i2) != 0) {
            awemeTextLabelModel2 = trendingTopicsAdInfo.label;
        }
        if ((i2 & 131072) != 0) {
            adLabel3 = trendingTopicsAdInfo.adLabel;
        }
        return trendingTopicsAdInfo.copy(i3, j4, j3, str11, str10, str12, str13, str14, str15, urlModel4, urlModel3, list2, z2, str17, str18, str16, awemeTextLabelModel2, adLabel3);
    }

    public final int component1() {
        return this.adPosition;
    }

    public final UrlModel component10() {
        return this.clickTrackUrlList;
    }

    public final UrlModel component11() {
        return this.trackUrlList;
    }

    public final List<UrlModel> component12() {
        return this.imageList;
    }

    public final boolean component13() {
        return this.isPreview;
    }

    public final String component14() {
        return this.openUrl;
    }

    public final String component15() {
        return this.mpUrl;
    }

    public final String component16() {
        return this.description;
    }

    public final AwemeTextLabelModel component17() {
        return this.label;
    }

    public final AdLabel component18() {
        return this.adLabel;
    }

    public final long component2() {
        return this.adId;
    }

    public final long component3() {
        return this.creativeId;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.source;
    }

    public final String component6() {
        return this.logExtra;
    }

    public final String component7() {
        return this.webUrl;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.webTitle;
    }

    public final TrendingTopicsAdInfo copy(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        C89219l.m154721d(str9, "");
        return new TrendingTopicsAdInfo(i, j, j2, str, str2, str3, str4, str5, str6, urlModel, urlModel2, list, z, str7, str8, str9, awemeTextLabelModel, adLabel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopicsAdInfo)) {
            return false;
        }
        TrendingTopicsAdInfo trendingTopicsAdInfo = (TrendingTopicsAdInfo) obj;
        return this.adPosition == trendingTopicsAdInfo.adPosition && this.adId == trendingTopicsAdInfo.adId && this.creativeId == trendingTopicsAdInfo.creativeId && C89219l.m154714a(this.type, trendingTopicsAdInfo.type) && C89219l.m154714a(this.source, trendingTopicsAdInfo.source) && C89219l.m154714a(this.logExtra, trendingTopicsAdInfo.logExtra) && C89219l.m154714a(this.webUrl, trendingTopicsAdInfo.webUrl) && C89219l.m154714a(this.title, trendingTopicsAdInfo.title) && C89219l.m154714a(this.webTitle, trendingTopicsAdInfo.webTitle) && C89219l.m154714a(this.clickTrackUrlList, trendingTopicsAdInfo.clickTrackUrlList) && C89219l.m154714a(this.trackUrlList, trendingTopicsAdInfo.trackUrlList) && C89219l.m154714a(this.imageList, trendingTopicsAdInfo.imageList) && this.isPreview == trendingTopicsAdInfo.isPreview && C89219l.m154714a(this.openUrl, trendingTopicsAdInfo.openUrl) && C89219l.m154714a(this.mpUrl, trendingTopicsAdInfo.mpUrl) && C89219l.m154714a(this.description, trendingTopicsAdInfo.description) && C89219l.m154714a(this.label, trendingTopicsAdInfo.label) && C89219l.m154714a(this.adLabel, trendingTopicsAdInfo.adLabel);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((m84893x102344c7(this.adPosition) * 31) + m84894x102344c7(this.adId)) * 31) + m84894x102344c7(this.creativeId)) * 31;
        String str = this.type;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_discover_model_TrendingTopicsAdInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.logExtra;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.webUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.webTitle;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        UrlModel urlModel = this.clickTrackUrlList;
        int hashCode7 = (hashCode6 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        int hashCode8 = (hashCode7 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        List<UrlModel> list = this.imageList;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isPreview;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode9 + i2) * 31;
        String str7 = this.openUrl;
        int hashCode10 = (i5 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.mpUrl;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.description;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        AwemeTextLabelModel awemeTextLabelModel = this.label;
        int hashCode13 = (hashCode12 + (awemeTextLabelModel != null ? awemeTextLabelModel.hashCode() : 0)) * 31;
        AdLabel adLabel2 = this.adLabel;
        if (adLabel2 != null) {
            i = adLabel2.hashCode();
        }
        return hashCode13 + i;
    }

    public final String toString() {
        return "TrendingTopicsAdInfo(adPosition=" + this.adPosition + ", adId=" + this.adId + ", creativeId=" + this.creativeId + ", type=" + this.type + ", source=" + this.source + ", logExtra=" + this.logExtra + ", webUrl=" + this.webUrl + ", title=" + this.title + ", webTitle=" + this.webTitle + ", clickTrackUrlList=" + this.clickTrackUrlList + ", trackUrlList=" + this.trackUrlList + ", imageList=" + this.imageList + ", isPreview=" + this.isPreview + ", openUrl=" + this.openUrl + ", mpUrl=" + this.mpUrl + ", description=" + this.description + ", label=" + this.label + ", adLabel=" + this.adLabel + ")";
    }

    public final long getAdId() {
        return this.adId;
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final int getAdPosition() {
        return this.adPosition;
    }

    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getCreativeId() {
        return this.creativeId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<UrlModel> getImageList() {
        return this.imageList;
    }

    public final AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopicsAdInfo(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        C89219l.m154721d(str9, "");
        this.adPosition = i;
        this.adId = j;
        this.creativeId = j2;
        this.type = str;
        this.source = str2;
        this.logExtra = str3;
        this.webUrl = str4;
        this.title = str5;
        this.webTitle = str6;
        this.clickTrackUrlList = urlModel;
        this.trackUrlList = urlModel2;
        this.imageList = list;
        this.isPreview = z;
        this.openUrl = str7;
        this.mpUrl = str8;
        this.description = str9;
        this.label = awemeTextLabelModel;
        this.adLabel = adLabel2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TrendingTopicsAdInfo(int r23, long r24, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.p2082ss.android.ugc.aweme.base.model.UrlModel r34, com.p2082ss.android.ugc.aweme.base.model.UrlModel r35, java.util.List r36, boolean r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r41, com.p2082ss.android.ugc.aweme.discover.model.AdLabel r42, int r43, p4600h.p4611f.p4613b.C89214g r44) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo.<init>(int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.base.model.UrlModel, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel, com.ss.android.ugc.aweme.discover.model.AdLabel, int, h.f.b.g):void");
    }
}

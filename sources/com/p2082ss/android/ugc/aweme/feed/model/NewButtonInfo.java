package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewButtonInfo */
public final class NewButtonInfo implements Serializable {
    @AbstractC27891c(mo46611a = "app_data")
    private final AppRawData appData;
    @AbstractC27891c(mo46611a = "apple_id")
    private final String appleId;
    @AbstractC27891c(mo46611a = "button_background_color")
    private final String buttonBackgroundColor;
    @AbstractC27891c(mo46611a = "button_text")
    private final String buttonText;
    @AbstractC27891c(mo46611a = "image_url_list")
    private final AwemeUrl imageUrlList;
    @AbstractC27891c(mo46611a = "show_text_link")
    private final Integer showTextLink;
    @AbstractC27891c(mo46611a = "source")
    private final String source;
    @AbstractC27891c(mo46611a = "style_type")
    private final Integer styleType;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(58735);
    }

    public NewButtonInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ NewButtonInfo copy$default(NewButtonInfo newButtonInfo, Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newButtonInfo.styleType;
        }
        if ((i & 2) != 0) {
            str = newButtonInfo.buttonText;
        }
        if ((i & 4) != 0) {
            str2 = newButtonInfo.buttonBackgroundColor;
        }
        if ((i & 8) != 0) {
            appRawData = newButtonInfo.appData;
        }
        if ((i & 16) != 0) {
            str3 = newButtonInfo.appleId;
        }
        if ((i & 32) != 0) {
            str4 = newButtonInfo.source;
        }
        if ((i & 64) != 0) {
            str5 = newButtonInfo.title;
        }
        if ((i & 128) != 0) {
            awemeUrl = newButtonInfo.imageUrlList;
        }
        if ((i & 256) != 0) {
            num2 = newButtonInfo.showTextLink;
        }
        return newButtonInfo.copy(num, str, str2, appRawData, str3, str4, str5, awemeUrl, num2);
    }

    public final Integer component1() {
        return this.styleType;
    }

    public final String component2() {
        return this.buttonText;
    }

    public final String component3() {
        return this.buttonBackgroundColor;
    }

    public final AppRawData component4() {
        return this.appData;
    }

    public final String component5() {
        return this.appleId;
    }

    public final String component6() {
        return this.source;
    }

    public final String component7() {
        return this.title;
    }

    public final AwemeUrl component8() {
        return this.imageUrlList;
    }

    public final Integer component9() {
        return this.showTextLink;
    }

    public final NewButtonInfo copy(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2) {
        return new NewButtonInfo(num, str, str2, appRawData, str3, str4, str5, awemeUrl, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewButtonInfo)) {
            return false;
        }
        NewButtonInfo newButtonInfo = (NewButtonInfo) obj;
        return C89219l.m154714a(this.styleType, newButtonInfo.styleType) && C89219l.m154714a(this.buttonText, newButtonInfo.buttonText) && C89219l.m154714a(this.buttonBackgroundColor, newButtonInfo.buttonBackgroundColor) && C89219l.m154714a(this.appData, newButtonInfo.appData) && C89219l.m154714a(this.appleId, newButtonInfo.appleId) && C89219l.m154714a(this.source, newButtonInfo.source) && C89219l.m154714a(this.title, newButtonInfo.title) && C89219l.m154714a(this.imageUrlList, newButtonInfo.imageUrlList) && C89219l.m154714a(this.showTextLink, newButtonInfo.showTextLink);
    }

    public final int hashCode() {
        Integer num = this.styleType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.buttonText;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.buttonBackgroundColor;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        AppRawData appRawData = this.appData;
        int hashCode4 = (hashCode3 + (appRawData != null ? appRawData.hashCode() : 0)) * 31;
        String str3 = this.appleId;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.source;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        AwemeUrl awemeUrl = this.imageUrlList;
        int hashCode8 = (hashCode7 + (awemeUrl != null ? awemeUrl.hashCode() : 0)) * 31;
        Integer num2 = this.showTextLink;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "NewButtonInfo(styleType=" + this.styleType + ", buttonText=" + this.buttonText + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ", appData=" + this.appData + ", appleId=" + this.appleId + ", source=" + this.source + ", title=" + this.title + ", imageUrlList=" + this.imageUrlList + ", showTextLink=" + this.showTextLink + ")";
    }

    public final AppRawData getAppData() {
        return this.appData;
    }

    public final String getAppleId() {
        return this.appleId;
    }

    public final String getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final AwemeUrl getImageUrlList() {
        return this.imageUrlList;
    }

    public final Integer getShowTextLink() {
        return this.showTextLink;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final String getTitle() {
        return this.title;
    }

    public NewButtonInfo(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2) {
        this.styleType = num;
        this.buttonText = str;
        this.buttonBackgroundColor = str2;
        this.appData = appRawData;
        this.appleId = str3;
        this.source = str4;
        this.title = str5;
        this.imageUrlList = awemeUrl;
        this.showTextLink = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewButtonInfo(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : appRawData, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? awemeUrl : null, (i & 256) == 0 ? num2 : 0);
    }
}

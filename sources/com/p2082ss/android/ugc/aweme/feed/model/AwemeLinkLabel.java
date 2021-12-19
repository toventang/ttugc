package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeLinkLabel */
public final class AwemeLinkLabel implements Serializable {
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    private final String color;
    @AbstractC27891c(mo46611a = "color_icon")
    private final String colorIcon;
    @AbstractC27891c(mo46611a = "color_text")
    private final String colorText;
    @AbstractC27891c(mo46611a = "icon")
    private final UrlModel icon;
    @AbstractC27891c(mo46611a = "show_seconds")
    private final int showSeconds;
    @AbstractC27891c(mo46611a = "style_type")
    private final int styleType;
    @AbstractC27891c(mo46611a = "text")
    private final String text;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;
    @AbstractC27891c(mo46611a = "white_color_icon")
    private final String whiteColorIcon;
    @AbstractC27891c(mo46611a = "white_color_text")
    private final String whiteColorText;

    static {
        Covode.recordClassIndex(58630);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AwemeLinkLabel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93162x885ee90b(int i) {
        return i;
    }

    public static /* synthetic */ AwemeLinkLabel copy$default(AwemeLinkLabel awemeLinkLabel, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = awemeLinkLabel.color;
        }
        if ((i4 & 2) != 0) {
            str2 = awemeLinkLabel.text;
        }
        if ((i4 & 4) != 0) {
            str3 = awemeLinkLabel.colorText;
        }
        if ((i4 & 8) != 0) {
            str4 = awemeLinkLabel.whiteColorText;
        }
        if ((i4 & 16) != 0) {
            i = awemeLinkLabel.type;
        }
        if ((i4 & 32) != 0) {
            str5 = awemeLinkLabel.colorIcon;
        }
        if ((i4 & 64) != 0) {
            str6 = awemeLinkLabel.whiteColorIcon;
        }
        if ((i4 & 128) != 0) {
            i2 = awemeLinkLabel.styleType;
        }
        if ((i4 & 256) != 0) {
            i3 = awemeLinkLabel.showSeconds;
        }
        if ((i4 & 512) != 0) {
            urlModel = awemeLinkLabel.icon;
        }
        return awemeLinkLabel.copy(str, str2, str3, str4, i, str5, str6, i2, i3, urlModel);
    }

    public final String component1() {
        return this.color;
    }

    public final UrlModel component10() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.colorText;
    }

    public final String component4() {
        return this.whiteColorText;
    }

    public final int component5() {
        return this.type;
    }

    public final String component6() {
        return this.colorIcon;
    }

    public final String component7() {
        return this.whiteColorIcon;
    }

    public final int component8() {
        return this.styleType;
    }

    public final int component9() {
        return this.showSeconds;
    }

    public final AwemeLinkLabel copy(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel) {
        return new AwemeLinkLabel(str, str2, str3, str4, i, str5, str6, i2, i3, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeLinkLabel)) {
            return false;
        }
        AwemeLinkLabel awemeLinkLabel = (AwemeLinkLabel) obj;
        return C89219l.m154714a(this.color, awemeLinkLabel.color) && C89219l.m154714a(this.text, awemeLinkLabel.text) && C89219l.m154714a(this.colorText, awemeLinkLabel.colorText) && C89219l.m154714a(this.whiteColorText, awemeLinkLabel.whiteColorText) && this.type == awemeLinkLabel.type && C89219l.m154714a(this.colorIcon, awemeLinkLabel.colorIcon) && C89219l.m154714a(this.whiteColorIcon, awemeLinkLabel.whiteColorIcon) && this.styleType == awemeLinkLabel.styleType && this.showSeconds == awemeLinkLabel.showSeconds && C89219l.m154714a(this.icon, awemeLinkLabel.icon);
    }

    public final int hashCode() {
        String str = this.color;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.colorText;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.whiteColorText;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + m93162x885ee90b(this.type)) * 31;
        String str5 = this.colorIcon;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.whiteColorIcon;
        int hashCode6 = (((((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + m93162x885ee90b(this.styleType)) * 31) + m93162x885ee90b(this.showSeconds)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "AwemeLinkLabel(color=" + this.color + ", text=" + this.text + ", colorText=" + this.colorText + ", whiteColorText=" + this.whiteColorText + ", type=" + this.type + ", colorIcon=" + this.colorIcon + ", whiteColorIcon=" + this.whiteColorIcon + ", styleType=" + this.styleType + ", showSeconds=" + this.showSeconds + ", icon=" + this.icon + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorIcon() {
        return this.colorIcon;
    }

    public final String getColorText() {
        return this.colorText;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final int getStyleType() {
        return this.styleType;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getWhiteColorIcon() {
        return this.whiteColorIcon;
    }

    public final String getWhiteColorText() {
        return this.whiteColorText;
    }

    public AwemeLinkLabel(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel) {
        this.color = str;
        this.text = str2;
        this.colorText = str3;
        this.whiteColorText = str4;
        this.type = i;
        this.colorIcon = str5;
        this.whiteColorIcon = str6;
        this.styleType = i2;
        this.showSeconds = i3;
        this.icon = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeLinkLabel(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel, int i4, C89214g gVar) {
        this(str, str2, str3, str4, (i4 & 16) != 0 ? 4 : i, str5, str6, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0 : i3, urlModel);
    }
}

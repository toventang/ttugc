package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Title */
public final class Title {
    @AbstractC27891c(mo46611a = "color_type")
    private final int colorType;
    private final UrlModel icon;
    private final String title;

    static {
        Covode.recordClassIndex(63488);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_chat_data_model_Title_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m99076x745c0c03(int i) {
        return i;
    }

    public static /* synthetic */ Title copy$default(Title title2, UrlModel urlModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = title2.icon;
        }
        if ((i2 & 2) != 0) {
            str = title2.title;
        }
        if ((i2 & 4) != 0) {
            i = title2.colorType;
        }
        return title2.copy(urlModel, str, i);
    }

    public final UrlModel component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.colorType;
    }

    public final Title copy(UrlModel urlModel, String str, int i) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        return new Title(urlModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Title)) {
            return false;
        }
        Title title2 = (Title) obj;
        return C89219l.m154714a(this.icon, title2.icon) && C89219l.m154714a(this.title, title2.title) && this.colorType == title2.colorType;
    }

    public final int hashCode() {
        UrlModel urlModel = this.icon;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.title;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + m99076x745c0c03(this.colorType);
    }

    public final String toString() {
        return "Title(icon=" + this.icon + ", title=" + this.title + ", colorType=" + this.colorType + ")";
    }

    public final int getColorType() {
        return this.colorType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public Title(UrlModel urlModel, String str, int i) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        this.icon = urlModel;
        this.title = str;
        this.colorType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Title(UrlModel urlModel, String str, int i, int i2, C89214g gVar) {
        this(urlModel, str, (i2 & 4) != 0 ? 0 : i);
    }
}

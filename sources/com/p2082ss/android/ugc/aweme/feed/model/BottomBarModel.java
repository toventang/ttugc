package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BottomBarModel */
public final class BottomBarModel implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    public String content;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(58658);
    }

    public BottomBarModel() {
        this(null, 0, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_BottomBarModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93169x2db2db19(int i) {
        return i;
    }

    public static /* synthetic */ BottomBarModel copy$default(BottomBarModel bottomBarModel, String str, int i, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bottomBarModel.content;
        }
        if ((i2 & 2) != 0) {
            i = bottomBarModel.type;
        }
        if ((i2 & 4) != 0) {
            urlModel = bottomBarModel.icon;
        }
        return bottomBarModel.copy(str, i, urlModel);
    }

    public final String component1() {
        return this.content;
    }

    public final int component2() {
        return this.type;
    }

    public final UrlModel component3() {
        return this.icon;
    }

    public final BottomBarModel copy(String str, int i, UrlModel urlModel) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(urlModel, "");
        return new BottomBarModel(str, i, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarModel)) {
            return false;
        }
        BottomBarModel bottomBarModel = (BottomBarModel) obj;
        return C89219l.m154714a(this.content, bottomBarModel.content) && this.type == bottomBarModel.type && C89219l.m154714a(this.icon, bottomBarModel.icon);
    }

    public final int hashCode() {
        String str = this.content;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m93169x2db2db19(this.type)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BottomBarModel(content=" + this.content + ", type=" + this.type + ", icon=" + this.icon + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getType() {
        return this.type;
    }

    public BottomBarModel(String str, int i, UrlModel urlModel) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(urlModel, "");
        this.content = str;
        this.type = i;
        this.icon = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomBarModel(String str, int i, UrlModel urlModel, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new UrlModel() : urlModel);
    }
}

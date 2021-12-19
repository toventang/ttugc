package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.LinkInfo */
public final class LinkInfo {
    @AbstractC27891c(mo46611a = "action_type")
    private final int actionType;
    @AbstractC27891c(mo46611a = "link_url")
    private final String linkUrl;

    static {
        Covode.recordClassIndex(63449);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_chat_data_model_LinkInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m99074x481ab5ed(int i) {
        return i;
    }

    public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = linkInfo.linkUrl;
        }
        if ((i2 & 2) != 0) {
            i = linkInfo.actionType;
        }
        return linkInfo.copy(str, i);
    }

    public final String component1() {
        return this.linkUrl;
    }

    public final int component2() {
        return this.actionType;
    }

    public final LinkInfo copy(String str, int i) {
        C89219l.m154721d(str, "");
        return new LinkInfo(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkInfo)) {
            return false;
        }
        LinkInfo linkInfo = (LinkInfo) obj;
        return C89219l.m154714a(this.linkUrl, linkInfo.linkUrl) && this.actionType == linkInfo.actionType;
    }

    public final int hashCode() {
        String str = this.linkUrl;
        return ((str != null ? str.hashCode() : 0) * 31) + m99074x481ab5ed(this.actionType);
    }

    public final String toString() {
        return "LinkInfo(linkUrl=" + this.linkUrl + ", actionType=" + this.actionType + ")";
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public LinkInfo(String str, int i) {
        C89219l.m154721d(str, "");
        this.linkUrl = str;
        this.actionType = i;
    }
}

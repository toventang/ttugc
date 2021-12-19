package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ACLCommonShare */
public final class ACLCommonShare implements Serializable {
    public static final Companion Companion = new Companion(null);
    public AclType awemeAclType = AclType.SHARE_GENERAL;
    @AbstractC27891c(mo46611a = "code")
    public int code;
    @AbstractC27891c(mo46611a = "extra")
    public String extra = "";
    @AbstractC27891c(mo46611a = "mute")
    public boolean mute;
    @AbstractC27891c(mo46611a = "platform_id")
    public String platformId = "";
    @AbstractC27891c(mo46611a = "popup_msg")
    public String popupMsg = "";
    @AbstractC27891c(mo46611a = "show_type")
    public int showType = 2;
    @AbstractC27891c(mo46611a = "toast_msg")
    public String toastMsg = "";
    @AbstractC27891c(mo46611a = "transcode")
    public int transcode = 3;

    static {
        Covode.recordClassIndex(58590);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.ACLCommonShare$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58591);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final AclType getAwemeAclType() {
        return this.awemeAclType;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final String getPlatformId() {
        return this.platformId;
    }

    public final String getPopupMsg() {
        return this.popupMsg;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final String getToastMsg() {
        return this.toastMsg;
    }

    public final int getTranscode() {
        return this.transcode;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setMute(boolean z) {
        this.mute = z;
    }

    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    public final void setPopupMsg(String str) {
        this.popupMsg = str;
    }

    public final void setShowType(int i) {
        this.showType = i;
    }

    public final void setToastMsg(String str) {
        this.toastMsg = str;
    }

    public final void setTranscode(int i) {
        this.transcode = i;
    }

    public final void setAwemeAclType(AclType aclType) {
        C89219l.m154721d(aclType, "");
        this.awemeAclType = aclType;
    }
}

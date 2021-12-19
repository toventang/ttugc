package com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.InsDialogSettings */
public final class InsDialogSettings {
    @AbstractC27891c(mo46611a = "body")
    private String body = "body";
    @AbstractC27891c(mo46611a = "cancel_btn_text")
    private String cancelBtnText = "not now";
    @AbstractC27891c(mo46611a = "jump_url")
    private String jumpUrl = "";
    @AbstractC27891c(mo46611a = "ok_btn_text")
    private String okBtnText = "ok";
    @AbstractC27891c(mo46611a = "title")
    private String title = "title";

    static {
        Covode.recordClassIndex(59435);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCancelBtnText() {
        return this.cancelBtnText;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getOkBtnText() {
        return this.okBtnText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        C89219l.m154721d(str, "");
        this.body = str;
    }

    public final void setCancelBtnText(String str) {
        C89219l.m154721d(str, "");
        this.cancelBtnText = str;
    }

    public final void setJumpUrl(String str) {
        C89219l.m154721d(str, "");
        this.jumpUrl = str;
    }

    public final void setOkBtnText(String str) {
        C89219l.m154721d(str, "");
        this.okBtnText = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }
}

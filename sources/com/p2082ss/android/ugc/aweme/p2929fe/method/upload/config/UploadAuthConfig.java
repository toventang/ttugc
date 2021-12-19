package com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.config.UploadAuthConfig */
public final class UploadAuthConfig extends AbstractC34479a {
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "code")
    private int code;
    @AbstractC27891c(mo46611a = "data")
    private UploadConfig config;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "message")
    private String message = "";

    static {
        Covode.recordClassIndex(56701);
    }

    public final int getCode() {
        return this.code;
    }

    public final UploadConfig getConfig() {
        return this.config;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UploadConfig getUploadConfig() {
        return this.config;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setConfig(UploadConfig uploadConfig) {
        this.config = uploadConfig;
    }

    public final void setMessage(String str) {
        C89219l.m154721d(str, "");
        this.message = str;
    }
}

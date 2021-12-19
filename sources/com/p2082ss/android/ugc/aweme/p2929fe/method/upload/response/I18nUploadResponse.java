package com.p2082ss.android.ugc.aweme.p2929fe.method.upload.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.response.I18nUploadResponse */
public final class I18nUploadResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "cover")
    private UrlModel cover;
    @AbstractC27891c(mo46611a = "video")
    private UrlModel video;

    static {
        Covode.recordClassIndex(56733);
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final UrlModel getVideo() {
        return this.video;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }
}

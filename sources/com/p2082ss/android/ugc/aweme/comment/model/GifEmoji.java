package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.GifEmoji */
public final class GifEmoji implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private final String f86530id = "";
    @AbstractC27891c(mo46611a = "image_id")
    private final long imageId;
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "origin")
    private final UrlModel origin;
    @AbstractC27891c(mo46611a = "stcker_type")
    private final int stickerType;
    @AbstractC27891c(mo46611a = "thumbnail")
    private final UrlModel thumbnail;

    static {
        Covode.recordClassIndex(43871);
    }

    public final String getId() {
        return this.f86530id;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final UrlModel getOrigin() {
        return this.origin;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}

package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.GifEmojiResponse */
public final class GifEmojiResponse implements Serializable {
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "emoticon_data")
    private StickerBean stickers;

    static {
        Covode.recordClassIndex(43872);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final StickerBean getStickers() {
        return this.stickers;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setStickers(StickerBean stickerBean) {
        this.stickers = stickerBean;
    }
}

package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.StickerBean */
public final class StickerBean implements Serializable {
    @AbstractC27891c(mo46611a = "has_more")
    private boolean hasMore;
    @AbstractC27891c(mo46611a = "next_cursor")
    private int nextCursor;
    @AbstractC27891c(mo46611a = "sticker_source")
    private int source;
    @AbstractC27891c(mo46611a = "sticker_list")
    private List<GifEmoji> stickerList;

    static {
        Covode.recordClassIndex(43874);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final int getSource() {
        return this.source;
    }

    public final List<GifEmoji> getStickerList() {
        return this.stickerList;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setStickerList(List<GifEmoji> list) {
        this.stickerList = list;
    }
}

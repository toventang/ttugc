package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct */
public class StickerAttrStruct {
    @AbstractC27891c(mo46611a = "comment_sticker_id")
    private String commentStickerId;
    @AbstractC27891c(mo46611a = "poll_sticker_id")
    private String pollStickerId;

    static {
        Covode.recordClassIndex(88220);
    }

    public String getCommentStickerId() {
        return this.commentStickerId;
    }

    public String getPollStickerId() {
        return this.pollStickerId;
    }

    public void setCommentStickerId(String str) {
        this.commentStickerId = str;
    }

    public void setPollStickerId(String str) {
        this.pollStickerId = str;
    }
}

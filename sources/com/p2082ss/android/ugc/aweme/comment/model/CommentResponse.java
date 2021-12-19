package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentResponse */
public class CommentResponse extends BaseCommentResponse {
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)
    public Comment comment;
    @AbstractC27891c(mo46611a = "rethink_popup")
    public CommentRethinkPopup commentRethinkPopup;
    @AbstractC27891c(mo46611a = "label_info")
    public String starFakeLabel;

    static {
        Covode.recordClassIndex(43864);
    }

    public void setStarFakeLabel(String str) {
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}

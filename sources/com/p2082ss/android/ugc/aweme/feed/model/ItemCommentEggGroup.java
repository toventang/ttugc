package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup */
public class ItemCommentEggGroup implements Serializable {
    @AbstractC27891c(mo46611a = "item_comment_eggs")
    List<ItemCommentEggData> commentEggData;
    @AbstractC27891c(mo46611a = "edit_hint_list")
    List<EditHint> editintist;

    static {
        Covode.recordClassIndex(58718);
    }

    public List<ItemCommentEggData> getCommentEggData() {
        return this.commentEggData;
    }

    public List<EditHint> getEditintist() {
        return this.editintist;
    }

    public String toString() {
        return "ItemCommentEggGroup{editintist=" + this.editintist + ", commentEggData=" + this.commentEggData + '}';
    }

    public void setCommentEggData(List<ItemCommentEggData> list) {
        this.commentEggData = list;
    }

    public void setEditintist(List<EditHint> list) {
        this.editintist = list;
    }
}

package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CommerceConfigData */
public class CommerceConfigData implements Serializable {
    @AbstractC27890b(mo46609a = StringJsonAdapterFactory.class)
    @AbstractC27891c(mo46611a = "data")
    public ItemCommentEggGroup itemCommentEggGroup;
    @AbstractC27891c(mo46611a = "item_like_egg")
    public ItemLikeEggData itemLikeEggData;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(58669);
    }

    public ItemCommentEggGroup getItemCommentEggGroup() {
        return this.itemCommentEggGroup;
    }

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemCommentEggGroup(ItemCommentEggGroup itemCommentEggGroup2) {
        this.itemCommentEggGroup = itemCommentEggGroup2;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData2) {
        this.itemLikeEggData = itemLikeEggData2;
    }

    public void setType(int i) {
        this.type = i;
    }
}

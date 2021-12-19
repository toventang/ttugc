package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelNew */
public final class RelationLabelNew implements Serializable {
    @AbstractC27890b(mo46609a = StringJsonAdapterFactory.class)
    @AbstractC27891c(mo46611a = "extra")
    public RelationLabelExtra extra;
    @AbstractC27891c(mo46611a = StringSet.type)
    public Integer type = 0;
    @AbstractC27891c(mo46611a = "user_list")
    public List<RelationLabelUser> userList;

    static {
        Covode.recordClassIndex(58752);
    }

    public final RelationLabelExtra getExtra() {
        return this.extra;
    }

    public final Integer getType() {
        return this.type;
    }

    public final List<RelationLabelUser> getUserList() {
        return this.userList;
    }

    public final void setExtra(RelationLabelExtra relationLabelExtra) {
        this.extra = relationLabelExtra;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setUserList(List<RelationLabelUser> list) {
        this.userList = list;
    }
}

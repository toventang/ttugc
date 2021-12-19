package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.NewRecommendList */
public final class NewRecommendList extends RecommendList {
    @AbstractC27891c(mo46611a = "next_cursor")
    private int nextCursor;
    @AbstractC27891c(mo46611a = "users")
    private List<User> users;

    static {
        Covode.recordClassIndex(60909);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.RecommendList
    public final int getCursor() {
        return this.nextCursor;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.RecommendList
    public final List<User> getUserList() {
        List<User> list = this.users;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.RecommendList
    public final void setCursor(int i) {
        this.nextCursor = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.model.RecommendList
    public final void setUserList(List<User> list) {
        this.users = list;
    }
}

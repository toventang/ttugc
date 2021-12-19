package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMixUserData */
public class SearchMixUserData {
    public C42410g cardInfo;
    public String cardTitle;
    public boolean hasTopUser;
    public List<SearchUser> users;

    static {
        Covode.recordClassIndex(50502);
    }

    public SearchMixUserData setCardTitle(String str) {
        this.cardTitle = str;
        return this;
    }

    public SearchMixUserData setHasTopUser(boolean z) {
        this.hasTopUser = z;
        return this;
    }

    public SearchMixUserData setUsers(List<SearchUser> list) {
        this.users = list;
        return this;
    }
}

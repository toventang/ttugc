package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.challenge.model.Segment;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendItem */
public class SummonFriendItem {
    public boolean isMentionBlocked;
    public String label;
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "user_info")
    public User mUser;
    public String searchId;
    @AbstractC27891c(mo46611a = "position")
    public List<Segment> segments;
    public int type = 1;

    static {
        Covode.recordClassIndex(60921);
    }
}

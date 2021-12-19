package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.challenge.model.Segment;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem */
public class CommentAtSummonFriendItem {
    public boolean isFromSug;
    public boolean isMentionBlocked;
    public String keyword;
    public String label;
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "user_info")
    public CommentAtUser mUser;
    public List<Position> positions;
    public String requestId;
    public String searchId;
    @AbstractC27891c(mo46611a = "position")
    public List<Segment> segments;
    public int type = 1;
    public Word wordRecord;

    static {
        Covode.recordClassIndex(43852);
    }

    public static CommentAtSummonFriendItem toCommentAtSummonFriendItem(SummonFriendItem summonFriendItem) {
        CommentAtSummonFriendItem commentAtSummonFriendItem = new CommentAtSummonFriendItem();
        commentAtSummonFriendItem.label = summonFriendItem.label;
        commentAtSummonFriendItem.segments = summonFriendItem.segments;
        commentAtSummonFriendItem.type = summonFriendItem.type;
        commentAtSummonFriendItem.mUser = CommentAtUser.Companion.toCommentAtUser(summonFriendItem.mUser);
        commentAtSummonFriendItem.logPbBean = summonFriendItem.logPbBean;
        commentAtSummonFriendItem.searchId = summonFriendItem.searchId;
        commentAtSummonFriendItem.isMentionBlocked = summonFriendItem.isMentionBlocked;
        return commentAtSummonFriendItem;
    }

    public static CommentAtSummonFriendItem fromSearchSugEntity(C67679e eVar, String str, String str2) {
        CommentAtSummonFriendItem commentAtSummonFriendItem = new CommentAtSummonFriendItem();
        commentAtSummonFriendItem.positions = eVar.f151668c;
        commentAtSummonFriendItem.mUser = CommentAtUser.Companion.fromSearchSugInfo(eVar.f151672g);
        boolean z = true;
        commentAtSummonFriendItem.isFromSug = true;
        commentAtSummonFriendItem.requestId = str2;
        commentAtSummonFriendItem.keyword = str;
        commentAtSummonFriendItem.wordRecord = eVar.f151671f;
        if (eVar.f151672g.getMentionBlockType() == 0) {
            z = false;
        }
        commentAtSummonFriendItem.isMentionBlocked = z;
        return commentAtSummonFriendItem;
    }
}

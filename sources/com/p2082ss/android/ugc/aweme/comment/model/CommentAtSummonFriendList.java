package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendList */
public class CommentAtSummonFriendList extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "user_list")
    public List<CommentAtSummonFriendItem> items;
    @AbstractC27891c(mo46611a = "input_keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "rid")
    public String requestId;

    static {
        Covode.recordClassIndex(43853);
    }

    public CommentAtSummonFriendList() {
    }

    public static List<CommentAtSummonFriendItem> toCommonAtSummonFriendItems(List<SummonFriendItem> list) {
        ArrayList arrayList = new ArrayList();
        for (SummonFriendItem summonFriendItem : list) {
            arrayList.add(CommentAtSummonFriendItem.toCommentAtSummonFriendItem(summonFriendItem));
        }
        return arrayList;
    }

    public static CommentAtSummonFriendList toCommonAtSummonFriendList(SummonFriendList summonFriendList) {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList();
        commentAtSummonFriendList.cursor = summonFriendList.cursor;
        commentAtSummonFriendList.hasMore = summonFriendList.hasMore;
        commentAtSummonFriendList.keyword = summonFriendList.keyword;
        commentAtSummonFriendList.logPbBean = summonFriendList.logPbBean;
        commentAtSummonFriendList.requestId = summonFriendList.requestId;
        commentAtSummonFriendList.items = toCommonAtSummonFriendItems(summonFriendList.items);
        return commentAtSummonFriendList;
    }

    public static CommentAtSummonFriendList fromSearchSug(C67683h hVar, String str) {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList();
        commentAtSummonFriendList.hasMore = hVar.mo106753a();
        commentAtSummonFriendList.keyword = str;
        commentAtSummonFriendList.logPbBean = hVar.f151689b;
        commentAtSummonFriendList.requestId = hVar.f151690c;
        commentAtSummonFriendList.items = fromSearchSugToList(hVar, str);
        return commentAtSummonFriendList;
    }

    public static List<CommentAtSummonFriendItem> fromSearchSugToList(C67683h hVar, String str) {
        ArrayList arrayList = new ArrayList();
        if (!(hVar == null || hVar.f151688a == null || hVar.f151688a.isEmpty())) {
            for (C67679e eVar : hVar.f151688a) {
                arrayList.add(CommentAtSummonFriendItem.fromSearchSugEntity(eVar, str, hVar.f151690c));
            }
        }
        return arrayList;
    }

    public CommentAtSummonFriendList(List<CommentAtSummonFriendItem> list, long j, boolean z, String str) {
        this.items = list;
        this.cursor = j;
        this.hasMore = z;
        this.keyword = str;
    }
}

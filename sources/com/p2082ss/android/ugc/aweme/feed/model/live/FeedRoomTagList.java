package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList */
public final class FeedRoomTagList implements Serializable {
    @AbstractC27891c(mo46611a = "tag")
    private List<FeedFirstTag> firstTags;
    @AbstractC27891c(mo46611a = "sub_tag")
    private List<FeedSubTag> subTags;

    static {
        Covode.recordClassIndex(58792);
    }

    public FeedRoomTagList() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedRoomTagList copy$default(FeedRoomTagList feedRoomTagList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedRoomTagList.firstTags;
        }
        if ((i & 2) != 0) {
            list2 = feedRoomTagList.subTags;
        }
        return feedRoomTagList.copy(list, list2);
    }

    public final List<FeedFirstTag> component1() {
        return this.firstTags;
    }

    public final List<FeedSubTag> component2() {
        return this.subTags;
    }

    public final FeedRoomTagList copy(List<FeedFirstTag> list, List<FeedSubTag> list2) {
        return new FeedRoomTagList(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedRoomTagList)) {
            return false;
        }
        FeedRoomTagList feedRoomTagList = (FeedRoomTagList) obj;
        return C89219l.m154714a(this.firstTags, feedRoomTagList.firstTags) && C89219l.m154714a(this.subTags, feedRoomTagList.subTags);
    }

    public final int hashCode() {
        List<FeedFirstTag> list = this.firstTags;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<FeedSubTag> list2 = this.subTags;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FeedRoomTagList(firstTags=" + this.firstTags + ", subTags=" + this.subTags + ")";
    }

    public final List<FeedFirstTag> getFirstTags() {
        return this.firstTags;
    }

    public final List<FeedSubTag> getSubTags() {
        return this.subTags;
    }

    public final void setFirstTags(List<FeedFirstTag> list) {
        this.firstTags = list;
    }

    public final void setSubTags(List<FeedSubTag> list) {
        this.subTags = list;
    }

    public FeedRoomTagList(List<FeedFirstTag> list, List<FeedSubTag> list2) {
        this.firstTags = list;
        this.subTags = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedRoomTagList(List list, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}

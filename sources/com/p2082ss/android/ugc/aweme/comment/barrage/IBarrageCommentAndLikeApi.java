package com.p2082ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.IBarrageCommentAndLikeApi */
public interface IBarrageCommentAndLikeApi {

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.IBarrageCommentAndLikeApi$a */
    public static final class C36295a {
        static {
            Covode.recordClassIndex(43572);
        }
    }

    static {
        Covode.recordClassIndex(43571);
    }

    @AbstractC22000h(mo35789a = "/aweme/v2/comment/list/")
    AbstractC88979t<CommentItemList> fetchCommentList(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_ids") String str2, @AbstractC22018z(mo35807a = "channel_id") int i2, @AbstractC22018z(mo35807a = "source_type") int i3, @AbstractC22018z(mo35807a = "scenario") int i4);
}

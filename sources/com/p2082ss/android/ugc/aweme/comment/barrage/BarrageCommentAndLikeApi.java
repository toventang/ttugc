package com.p2082ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.BarrageCommentAndLikeApi */
public final class BarrageCommentAndLikeApi implements IBarrageCommentAndLikeApi {

    /* renamed from: a */
    public static final BarrageCommentAndLikeApi f85806a = new BarrageCommentAndLikeApi();

    /* renamed from: b */
    private final /* synthetic */ IBarrageCommentAndLikeApi f85807b;

    @Override // com.p2082ss.android.ugc.aweme.comment.barrage.IBarrageCommentAndLikeApi
    @AbstractC22000h(mo35789a = "/aweme/v2/comment/list/")
    public final AbstractC88979t<CommentItemList> fetchCommentList(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_ids") String str2, @AbstractC22018z(mo35807a = "channel_id") int i2, @AbstractC22018z(mo35807a = "source_type") int i3, @AbstractC22018z(mo35807a = "scenario") int i4) {
        C89219l.m154721d(str, "");
        return this.f85807b.fetchCommentList(str, j, i, str2, i2, i3, i4);
    }

    static {
        Covode.recordClassIndex(43570);
    }

    private BarrageCommentAndLikeApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IBarrageCommentAndLikeApi.class);
        C89219l.m154716b(a, "");
        this.f85807b = (IBarrageCommentAndLikeApi) a;
    }
}

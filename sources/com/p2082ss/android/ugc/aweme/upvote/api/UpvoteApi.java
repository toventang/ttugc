package com.p2082ss.android.ugc.aweme.upvote.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79708b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79709c;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79712f;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79713g;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.api.UpvoteApi */
public final class UpvoteApi implements IUpvoteApi {

    /* renamed from: a */
    public static final UpvoteApi f178837a = new UpvoteApi();

    /* renamed from: b */
    private final /* synthetic */ IUpvoteApi f178838b;

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22012t(mo35799a = "tiktok/v1/upvote/delete")
    @AbstractC21999g
    public final AbstractC88403ab<BaseResponse> deleteUpvote(@AbstractC21997e(mo35786a = "item_id") String str) {
        C89219l.m154721d(str, "");
        return this.f178838b.deleteUpvote(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22000h(mo35789a = "aweme/v1/comment/digg/")
    public final AbstractC88979t<BaseResponse> digg(@AbstractC22018z(mo35807a = "cid") String str, @AbstractC22018z(mo35807a = "aweme_id") String str2, @AbstractC22018z(mo35807a = "digg_type") int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f178838b.digg(str, str2, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22000h(mo35789a = "tiktok/v1/upvote/batch_list")
    public final AbstractC88979t<C79708b> getUpvoteBatchList(@AbstractC22018z(mo35807a = "item_ids") String str, @AbstractC22018z(mo35807a = "upvote_reasons") String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f178838b.getUpvoteBatchList(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22000h(mo35789a = "tiktok/v1/upvote/list")
    public final AbstractC88979t<C79712f> getUpvoteList(@AbstractC22018z(mo35807a = "item_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_ids") String str2, @AbstractC22018z(mo35807a = "upvote_reason") String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f178838b.getUpvoteList(str, j, i, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22012t(mo35799a = "tiktok/v1/upvote/publish")
    @AbstractC21999g
    public final AbstractC88403ab<C79713g> publishUpvote(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "text") String str2, @AbstractC21997e(mo35786a = "skip_rethink") Boolean bool) {
        C89219l.m154721d(str, "");
        return this.f178838b.publishUpvote(str, str2, bool);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22012t(mo35799a = "tiktok/v1/upvote/batch_publish")
    @AbstractC21999g
    public final AbstractC88403ab<C79709c> publishUpvoteBatch(@AbstractC21997e(mo35786a = "item_ids") String str) {
        C89219l.m154721d(str, "");
        return this.f178838b.publishUpvoteBatch(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @AbstractC22012t(mo35799a = "/aweme/v1/contents/translation/")
    @AbstractC21999g
    public final AbstractC88979t<C79027a> translate(@AbstractC21997e(mo35786a = "trg_lang") String str, @AbstractC21997e(mo35786a = "translation_info") String str2, @AbstractC22018z(mo35807a = "scene") int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f178838b.translate(str, str2, i);
    }

    static {
        Covode.recordClassIndex(92925);
    }

    private UpvoteApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IUpvoteApi.class);
        C89219l.m154716b(a, "");
        this.f178838b = (IUpvoteApi) a;
    }
}

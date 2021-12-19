package com.p2082ss.android.ugc.aweme.upvote.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79708b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79709c;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79712f;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79713g;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.upvote.api.IUpvoteApi */
public interface IUpvoteApi {
    static {
        Covode.recordClassIndex(92924);
    }

    @AbstractC22012t(mo35799a = "tiktok/v1/upvote/delete")
    @AbstractC21999g
    AbstractC88403ab<BaseResponse> deleteUpvote(@AbstractC21997e(mo35786a = "item_id") String str);

    @AbstractC22000h(mo35789a = "aweme/v1/comment/digg/")
    AbstractC88979t<BaseResponse> digg(@AbstractC22018z(mo35807a = "cid") String str, @AbstractC22018z(mo35807a = "aweme_id") String str2, @AbstractC22018z(mo35807a = "digg_type") int i);

    @AbstractC22000h(mo35789a = "tiktok/v1/upvote/batch_list")
    AbstractC88979t<C79708b> getUpvoteBatchList(@AbstractC22018z(mo35807a = "item_ids") String str, @AbstractC22018z(mo35807a = "upvote_reasons") String str2);

    @AbstractC22000h(mo35789a = "tiktok/v1/upvote/list")
    AbstractC88979t<C79712f> getUpvoteList(@AbstractC22018z(mo35807a = "item_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "insert_ids") String str2, @AbstractC22018z(mo35807a = "upvote_reason") String str3);

    @AbstractC22012t(mo35799a = "tiktok/v1/upvote/publish")
    @AbstractC21999g
    AbstractC88403ab<C79713g> publishUpvote(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "text") String str2, @AbstractC21997e(mo35786a = "skip_rethink") Boolean bool);

    @AbstractC22012t(mo35799a = "tiktok/v1/upvote/batch_publish")
    @AbstractC21999g
    AbstractC88403ab<C79709c> publishUpvoteBatch(@AbstractC21997e(mo35786a = "item_ids") String str);

    @AbstractC22012t(mo35799a = "/aweme/v1/contents/translation/")
    @AbstractC21999g
    AbstractC88979t<C79027a> translate(@AbstractC21997e(mo35786a = "trg_lang") String str, @AbstractC21997e(mo35786a = "translation_info") String str2, @AbstractC22018z(mo35807a = "scene") int i);
}

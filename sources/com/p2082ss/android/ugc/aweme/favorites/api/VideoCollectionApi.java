package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.VideoCollectionApi */
public interface VideoCollectionApi {

    /* renamed from: a */
    public static final C47188a f109833a = C47188a.f109834a;

    static {
        Covode.recordClassIndex(55797);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/aweme/listcollection/")
    AbstractC88979t<C47189a> allFavoritesContent(@AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/overall/detail/v1")
    AbstractC88979t<C47190b> allFavoritesDetail(@AbstractC89736t(mo144292a = "scene") int i);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/item/candidate/list/v1")
    AbstractC88979t<C47191c> candidateContent(@AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "pull_type") int i2);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/item/list/v1")
    AbstractC88979t<C47191c> collectionContent(@AbstractC89736t(mo144292a = "item_archive_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "pull_type") int i2);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/detail/v1")
    AbstractC88979t<Object> collectionDetail(@AbstractC89736t(mo144292a = "item_archive_id") String str);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/list/v1")
    AbstractC88979t<C47195e> collectionDetailList(@AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "exclude_id") String str);

    @AbstractC89731o(mo144285a = "/tiktok/collection/item_archive/manage/v1")
    @AbstractC89721e
    AbstractC88979t<C47197g> collectionManage(@AbstractC89719c(mo144273a = "operation") int i, @AbstractC89719c(mo144273a = "item_archive_id") String str, @AbstractC89719c(mo144273a = "item_archive_name") String str2, @AbstractC89719c(mo144273a = "item_archive_id_from") String str3, @AbstractC89719c(mo144273a = "item_archive_id_to") String str4, @AbstractC89719c(mo144273a = "add_ids") String str5, @AbstractC89719c(mo144273a = "remove_ids") String str6, @AbstractC89719c(mo144273a = "move_ids") String str7);

    @AbstractC89731o(mo144285a = "/tiktok/collection/item_archive/manage/v1")
    AbstractC88979t<C47197g> collectionManage(@AbstractC89717a C47196f fVar);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/check/v1")
    AbstractC88979t<C47198h> collectionNameCheck(@AbstractC89736t(mo144292a = "check_type") int i, @AbstractC89736t(mo144292a = "name") String str);

    @AbstractC89722f(mo144276a = "/tiktok/collection/item_archive/item/list/v1")
    AbstractC21983b<C47191c> syncCollectionContent(@AbstractC89736t(mo144292a = "item_archive_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "pull_type") int i2);

    @AbstractC89722f(mo144276a = "/aweme/v1/aweme/collect/")
    AbstractC88979t<BaseResponse> unFavorites(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "action") int i);

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.VideoCollectionApi$a */
    public static final class C47188a {

        /* renamed from: a */
        static final /* synthetic */ C47188a f109834a = new C47188a();

        private C47188a() {
        }

        static {
            Covode.recordClassIndex(55798);
        }

        /* renamed from: a */
        public static VideoCollectionApi m90370a() {
            Object a = RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(VideoCollectionApi.class);
            C89219l.m154716b(a, "");
            return (VideoCollectionApi) a;
        }
    }
}

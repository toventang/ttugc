package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.favorites.model.C47471b;
import com.p2082ss.android.ugc.aweme.favorites.model.C47472c;
import com.p2082ss.android.ugc.aweme.favorites.model.C47473d;
import com.p2082ss.android.ugc.aweme.favorites.p2920b.C47201b;
import com.p2082ss.android.ugc.aweme.music.model.CollectMusicResponse;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi */
public final class UserFavoritesApi {

    /* renamed from: a */
    public static final RetrofitApi f109832a = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(55796);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/aweme/collect/")
        C1731i<BaseResponse> collectAweme(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/collect/")
        C1731i<BaseResponse> collectChallenge(@AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89731o(mo144285a = "/tiktok/comment/collect/v1/")
        C1731i<BaseResponse> collectComment(@AbstractC89736t(mo144292a = "comment_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89731o(mo144285a = "/aweme/v1/lvideo/collect/")
        C1731i<BaseResponse> collectLongVideo(@AbstractC89736t(mo144292a = "album_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/mix/collect/")
        C1731i<BaseResponse> collectMix(@AbstractC89736t(mo144292a = "mix_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/collect/")
        C1731i<CollectMusicResponse> collectMusic(@AbstractC89736t(mo144292a = "music_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89731o(mo144285a = "/tiktok/v1/forum/question/collect/")
        C1731i<BaseResponse> collectQuestion(@AbstractC89736t(mo144292a = "question_id") long j, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/aweme/v2/shop/seeding/collect/")
        C1731i<BaseResponse> collectSeeding(@AbstractC89736t(mo144292a = "seed_id") String str, @AbstractC89736t(mo144292a = "operate_type") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/aweme/listcollection/")
        C1731i<BaseResponse> fetchCollectAwemeList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/listcollection/")
        C1731i<C47471b> fetchCollectChallengeList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/tiktok/comment/listcollection/v1/")
        C1731i<C47472c> fetchCollectCommentList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/listcollection/")
        C1731i<BaseResponse> fetchCollectMusicList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/tiktok/v1/forum/question/listcollection/")
        C1731i<C47473d> fetchCollectQuestionList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/sticker/listcollection/")
        C1731i<C47201b> fetchStickerList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);
    }

    static {
        Covode.recordClassIndex(55795);
    }

    /* renamed from: a */
    public static C47471b m90366a(int i, int i2) {
        C1731i<C47471b> fetchCollectChallengeList = f109832a.fetchCollectChallengeList(i, i2);
        try {
            fetchCollectChallengeList.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (fetchCollectChallengeList.mo5544c()) {
            try {
                throw fetchCollectChallengeList.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return fetchCollectChallengeList.mo5545d();
    }

    /* renamed from: b */
    public static C47472c m90367b(int i, int i2) {
        C1731i<C47472c> fetchCollectCommentList = f109832a.fetchCollectCommentList(i, i2);
        try {
            fetchCollectCommentList.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (fetchCollectCommentList.mo5544c()) {
            try {
                throw fetchCollectCommentList.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return fetchCollectCommentList.mo5545d();
    }

    /* renamed from: c */
    public static C47473d m90368c(int i, int i2) {
        C1731i<C47473d> fetchCollectQuestionList = f109832a.fetchCollectQuestionList(i, i2);
        try {
            fetchCollectQuestionList.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (fetchCollectQuestionList.mo5544c()) {
            try {
                throw fetchCollectQuestionList.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return fetchCollectQuestionList.mo5545d();
    }

    /* renamed from: d */
    public static C47201b m90369d(int i, int i2) {
        C1731i<C47201b> fetchStickerList = f109832a.fetchStickerList(i, i2);
        try {
            fetchStickerList.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (fetchStickerList.mo5544c()) {
            try {
                throw fetchStickerList.mo5546e();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return fetchStickerList.mo5545d();
    }
}

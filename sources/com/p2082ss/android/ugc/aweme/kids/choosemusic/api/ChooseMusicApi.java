package com.p2082ss.android.ugc.aweme.kids.choosemusic.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57254p;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57256r;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3304b.AbstractC57084a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57108b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57111e;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57112f;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi */
public final class ChooseMusicApi {

    /* renamed from: a */
    public static API f130230a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(AbstractC57084a.f129965a).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(67095);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/music/collect/")
        C1731i<BaseResponse> collectMusic(@AbstractC89736t(mo144292a = "music_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/hot/music/")
        C1731i<C57111e> getHotMusicList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "not_duplicate") boolean z);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/music/collection/")
        C1731i<C57108b> getMusicSheet(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/recommend/by/video/")
        C1731i<C57111e> getRecommenMusicListFromAI(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "from") String str, @AbstractC89736t(mo144292a = "zip_uri") String str2, @AbstractC89736t(mo144292a = "music_ailab_ab") String str3, @AbstractC89736t(mo144292a = "creation_id") String str4, @AbstractC89736t(mo144292a = "micro_app_id") String str5, @AbstractC89736t(mo144292a = "video_duration") long j);

        @AbstractC89722f(mo144276a = "/aweme/v1/sticker/music")
        C1731i<C57111e> getStickerMusic(@AbstractC89736t(mo144292a = "sticker") String str);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/music/collection/feed/")
        C1731i<C57254p> musicCollectionFeed(@AbstractC89736t(mo144292a = "cursor") Integer num, @AbstractC89736t(mo144292a = "count") Integer num2);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/music/list/")
        C1731i<C57111e> musicList(@AbstractC89736t(mo144292a = "mc_id") String str, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/music/pick/")
        C1731i<C57256r> musicPick(@AbstractC89736t(mo144292a = "radio_cursor") Integer num, @AbstractC89736t(mo144292a = "extra_music_ids") String str, @AbstractC89736t(mo144292a = "is_commerce_music") Boolean bool);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/detail/")
        AbstractFutureC27655q<C57112f> queryMusic(@AbstractC89736t(mo144292a = "music_id") String str, @AbstractC89736t(mo144292a = "click_reason") int i);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/music/list/")
        C1731i<C57111e> secondLevelMusicList(@AbstractC89736t(mo144292a = "mc_id") String str, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "level") int i3);

        @AbstractC89722f(mo144276a = "/tiktok/v1/kids/user/music/collect/")
        C1731i<CollectedMusicList> userCollectedMusicList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "scene") String str);
    }

    static {
        Covode.recordClassIndex(67094);
    }

    /* renamed from: a */
    public static C1731i<CollectedMusicList> m103644a(int i) {
        return f130230a.userCollectedMusicList(i, 20, "");
    }

    /* renamed from: b */
    public static C1731i<C57108b> m103648b(int i) {
        return f130230a.getMusicSheet(i, 20);
    }

    /* renamed from: a */
    public static C57112f m103647a(String str) {
        API api = f130230a;
        if (str != null) {
            str = str.trim();
        }
        return api.queryMusic(str, 0).get();
    }

    /* renamed from: a */
    public static C1731i<C57256r> m103645a(Integer num, String str) {
        return f130230a.musicPick(num, str, false);
    }

    /* renamed from: b */
    public static C1731i<C57111e> m103649b(String str, int i, int i2, int i3) {
        return f130230a.secondLevelMusicList(str, i, i2, i3);
    }

    /* renamed from: a */
    public static C1731i<C57111e> m103646a(String str, int i, int i2, int i3) {
        if (i3 == 0) {
            return f130230a.musicList(str, i, i2);
        }
        return m103649b(str, i, i2, i3);
    }
}

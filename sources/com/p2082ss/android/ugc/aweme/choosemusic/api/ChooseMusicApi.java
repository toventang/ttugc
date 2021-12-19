package com.p2082ss.android.ugc.aweme.choosemusic.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35886af;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35888ah;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollection;
import com.p2082ss.android.ugc.aweme.music.model.MusicList;
import com.p2082ss.android.ugc.aweme.music.p3469d.AbstractC60751a;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi */
public final class ChooseMusicApi {

    /* renamed from: a */
    public static API f84343a = ((API) C18097a.m33698a(AbstractC60751a.f138050a, API.class));

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(42989);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/music/collect/")
        C1731i<BaseResponse> collectMusic(@AbstractC89736t(mo144292a = "music_id") String str, @AbstractC89736t(mo144292a = "action") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/music/collection/feed/")
        C1731i<C35886af> commerceMusicCollectionFeed(@AbstractC89736t(mo144292a = "cursor") Integer num, @AbstractC89736t(mo144292a = "count") Integer num2);

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/music/list/")
        C1731i<MusicList> commerceMusicList(@AbstractC89736t(mo144292a = "mc_id") String str, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/music/pick/")
        C1731i<C35888ah> commerceMusicPick(@AbstractC89736t(mo144292a = "radio_cursor") Integer num, @AbstractC89736t(mo144292a = "extra_music_ids") String str, @AbstractC89736t(mo144292a = "is_commerce_music") Boolean bool);

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/music/choices/")
        C1731i<MusicList> getCommerceMusicList();

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/music/collection/")
        C1731i<MusicCollection> getCommerceMusicSheet(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/hot/music/")
        C1731i<MusicList> getHotMusicList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "not_duplicate") boolean z, @AbstractC89736t(mo144292a = "sound_page_scene") int i3);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/collection/")
        C1731i<MusicCollection> getMusicSheet(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "sound_page_scene") int i3);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/recommend/by/video/")
        C1731i<MusicList> getRecommenMusicListFromAI(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "from") String str, @AbstractC89736t(mo144292a = "zip_uri") String str2, @AbstractC89736t(mo144292a = "music_ailab_ab") String str3, @AbstractC89736t(mo144292a = "creation_id") String str4, @AbstractC89736t(mo144292a = "micro_app_id") String str5, @AbstractC89736t(mo144292a = "video_duration") long j);

        @AbstractC89722f(mo144276a = "/aweme/v1/sticker/music")
        C1731i<MusicList> getStickerMusic(@AbstractC89736t(mo144292a = "sticker") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/collection/feed/")
        C1731i<C35886af> musicCollectionFeed(@AbstractC89736t(mo144292a = "cursor") Integer num, @AbstractC89736t(mo144292a = "count") Integer num2, @AbstractC89736t(mo144292a = "sound_page_scene") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/list/")
        C1731i<MusicList> musicList(@AbstractC89736t(mo144292a = "mc_id") String str, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "sound_page_scene") int i3);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/pick/")
        C1731i<C35888ah> musicPick(@AbstractC89736t(mo144292a = "radio_cursor") Integer num, @AbstractC89736t(mo144292a = "extra_music_ids") String str, @AbstractC89736t(mo144292a = "is_commerce_music") Boolean bool, @AbstractC89736t(mo144292a = "sound_page_scene") Integer num2);

        @AbstractC89722f(mo144276a = "/aweme/v1/music/list/")
        C1731i<MusicList> secondLevelMusicList(@AbstractC89736t(mo144292a = "mc_id") String str, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "level") int i3, @AbstractC89736t(mo144292a = "sound_page_scene") int i4);

        @AbstractC89722f(mo144276a = "/aweme/v1/user/music/collect/")
        C1731i<CollectedMusicList> userCollectedMusicList(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "scene") String str, @AbstractC89736t(mo144292a = "sound_page_scene") int i3);
    }

    static {
        Covode.recordClassIndex(42988);
    }

    /* renamed from: a */
    public static C1731i<MusicCollection> m72935a(int i, int i2) {
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return f84343a.getCommerceMusicSheet(i, 20);
        }
        return f84343a.getMusicSheet(i, 20, i2);
    }

    /* renamed from: a */
    public static C1731i<CollectedMusicList> m72936a(int i, int i2, int i3) {
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return f84343a.userCollectedMusicList(i, i2, "commerce", i3);
        }
        return f84343a.userCollectedMusicList(i, i2, "", i3);
    }

    /* renamed from: a */
    public static C1731i<C35888ah> m72938a(Integer num, String str, boolean z, int i) {
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return f84343a.commerceMusicPick(num, str, Boolean.valueOf(z));
        }
        return f84343a.musicPick(num, str, Boolean.valueOf(z), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static C1731i<MusicList> m72940b(String str, int i, int i2, int i3, int i4) {
        return f84343a.secondLevelMusicList(str, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C1731i<MusicList> m72937a(int i, int i2, boolean z, int i3, boolean z2) {
        if (z2) {
            return f84343a.getHotMusicList(i, i2, z, i3);
        }
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return f84343a.getCommerceMusicList();
        }
        return f84343a.getHotMusicList(i, i2, z, i3);
    }

    /* renamed from: a */
    public static C1731i<MusicList> m72939a(String str, int i, int i2, int i3, int i4) {
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            return f84343a.commerceMusicList(str, i, i2);
        }
        if (i3 == 0) {
            return f84343a.musicList(str, i, i2, i4);
        }
        return m72940b(str, i, i2, i3, i4);
    }
}

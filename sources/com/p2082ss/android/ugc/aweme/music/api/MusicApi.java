package com.p2082ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollection;
import com.p2082ss.android.ugc.aweme.music.model.MusicList;
import com.p2082ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import com.p2082ss.android.ugc.aweme.music.p3469d.AbstractC60751a;
import java.util.Map;
import okhttp3.AbstractC90025ab;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicApi */
public final class MusicApi {

    /* renamed from: a */
    public static final MusicService f137504a = ((MusicService) RetrofitFactory.m33635a().mo28817b(AbstractC60751a.f138050a).mo28832d().mo28858a(MusicService.class));

    /* renamed from: b */
    private static final String f137505b = (AbstractC60751a.f138050a + "/aweme/v1/upload/file/");

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicApi$MusicService */
    public interface MusicService {
        static {
            Covode.recordClassIndex(70871);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/commerce/music/collection/")
        AbstractFutureC27655q<MusicCollection> fetchCommerceMusicCollection(@AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i);

        @AbstractC22000h(mo35789a = "/aweme/v1/commerce/music/pick/")
        AbstractFutureC27655q<MusicList> fetchCommerceMusicHotList(@AbstractC22018z(mo35807a = "radio_cursor") long j);

        @AbstractC22000h(mo35789a = "/aweme/v1/commerce/music/list")
        AbstractFutureC27655q<MusicList> fetchCommerceMusicList(@AbstractC22018z(mo35807a = "mc_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i);

        @AbstractC22000h(mo35789a = "/aweme/v1/commerce/music/beats/songs/")
        AbstractFutureC27655q<com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList> fetchCommerceStickPointMusicList(@AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "video_count") int i3, @AbstractC22018z(mo35807a = "video_duration") String str);

        @AbstractC22000h(mo35789a = "/aweme/v1/music/collection/")
        AbstractFutureC27655q<MusicCollection> fetchMusicCollection(@AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "sound_page_scene") int i2);

        @AbstractC22000h(mo35789a = "/aweme/v1/music/pick/")
        AbstractFutureC27655q<MusicList> fetchMusicHotList(@AbstractC22018z(mo35807a = "radio_cursor") long j, @AbstractC22018z(mo35807a = "sound_page_scene") int i);

        @AbstractC22000h(mo35789a = "/aweme/v1/music/list/")
        AbstractFutureC27655q<MusicList> fetchMusicList(@AbstractC22018z(mo35807a = "mc_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "sound_page_scene") int i2);

        @AbstractC22000h(mo35789a = "/aweme/v1/music/beats/songs/")
        AbstractFutureC27655q<com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList> fetchStickPointMusicList(@AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "video_count") int i3, @AbstractC22018z(mo35807a = "video_duration") String str);

        @AbstractC22000h(mo35789a = "/aweme/v1/user/music/collect/")
        AbstractFutureC27655q<CollectedMusicList> fetchUserCollectedMusicList(@AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "scene") String str, @AbstractC22018z(mo35807a = "sound_page_scene") int i3);

        @AbstractC22000h(mo35789a = "/aweme/v1/music/detail/")
        AbstractFutureC27655q<SimpleMusicDetail> queryMusic(@AbstractC22018z(mo35807a = "music_id") String str, @AbstractC22018z(mo35807a = "click_reason") int i);

        @AbstractC22012t(mo35799a = "/aweme/v1/upload/file/")
        C1731i<String> uploadLocalMusic(@AbstractC21994b AbstractC90025ab abVar);

        @AbstractC22012t(mo35799a = "/aweme/v1/music/user/create/")
        @AbstractC21999g
        AbstractC21983b<String> uploadLocalMusicInfo(@AbstractC21998f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(70870);
    }

    /* renamed from: a */
    public static SimpleMusicDetail m110045a(String str, int i) {
        MusicService musicService = f137504a;
        if (str != null) {
            str = str.trim();
        }
        return musicService.queryMusic(str, 0).get();
    }
}

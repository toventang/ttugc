package com.p2082ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p2082ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicAwemeApi */
public final class MusicAwemeApi {

    /* renamed from: a */
    public static final MusicService f137506a = ((MusicService) C18097a.m33698a(Api.f79771d, MusicService.class));

    /* renamed from: b */
    public static final String f137507b = (Api.f79771d + "/aweme/v1/music/aweme/");

    /* renamed from: c */
    public static final String f137508c = (Api.f79771d + "/aweme/v1/music/fresh/aweme/");

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicAwemeApi$MusicService */
    public interface MusicService {
        static {
            Covode.recordClassIndex(70873);
        }

        @AbstractC22012t(mo35799a = "/aweme/v1/music/create/")
        @AbstractC21999g
        AbstractC21983b<String> createMusic(@AbstractC21998f Map<String, String> map);

        @AbstractC22000h(mo35789a = "/aweme/v1/original/music/list/")
        AbstractFutureC27655q<OriginalMusicList> fetchOriginalMusicList(@AbstractC22018z(mo35807a = "user_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2, @AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2);

        @AbstractC22000h(mo35789a = "/tiktok/user/pinned_pgc_music/list/v1/")
        AbstractFutureC27655q<PinnedMusicList> getPinnedMusicList(@AbstractC22018z(mo35807a = "sec_user_id") String str);

        @AbstractC22000h
        AbstractFutureC27655q<MusicAwemeList> queryMusicAwemeList(@AbstractC21993ag String str, @AbstractC22018z(mo35807a = "music_id") String str2, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "type") int i2);

        @AbstractC22000h(mo35789a = "/tiktok/user/pgc_music/query/v1/")
        AbstractFutureC27655q<OriginalMusicList> searchMusicList(@AbstractC22018z(mo35807a = "sec_user_id") String str, @AbstractC22018z(mo35807a = "keyword") String str2, @AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2);
    }

    static {
        Covode.recordClassIndex(70872);
    }

    /* renamed from: a */
    public static OriginalMusicList m110046a(String str, String str2, int i, int i2) {
        return f137506a.fetchOriginalMusicList(str, str2, i, i2).get();
    }
}

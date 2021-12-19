package com.p2082ss.android.ugc.aweme.music.p3481ui.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d.C61164g;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi */
public interface MusicAwemeApi {

    /* renamed from: a */
    public static final C61122a f138798a = C61122a.f138799a;

    static {
        Covode.recordClassIndex(71725);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/music/aweme/")
    AbstractC88979t<MusicAwemeList> queryMusicAwemeList(@AbstractC22018z(mo35807a = "music_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "type") int i2);

    @AbstractC22000h(mo35789a = "/aweme/v1/music/discovery/")
    AbstractC88979t<C61164g> queryMusicList(@AbstractC22018z(mo35807a = "music_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi$a */
    public static final class C61122a {

        /* renamed from: a */
        static final /* synthetic */ C61122a f138799a = new C61122a();

        private C61122a() {
        }

        static {
            Covode.recordClassIndex(71726);
        }

        /* renamed from: a */
        public static MusicAwemeApi m110745a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(MusicAwemeApi.class);
            C89219l.m154716b(create, "");
            return (MusicAwemeApi) create;
        }
    }
}

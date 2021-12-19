package com.p2082ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.p2082ss.android.ugc.aweme.discover.model.MusicTitleModel;
import com.p2082ss.android.ugc.aweme.music.api.C60333a;
import com.p2082ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.p2082ss.android.ugc.aweme.music.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.a */
public final class C60841a {

    /* renamed from: a */
    public boolean f138258a;

    /* renamed from: b */
    private long f138259b;

    static {
        Covode.recordClassIndex(71429);
    }

    /* renamed from: a */
    public static AwemeSearchMusicList m110439a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (AwemeSearchMusicList) C80361dw.m139333a(str, AwemeSearchMusicList.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList<MusicModel> mo98493a(AwemeSearchMusicList awemeSearchMusicList) {
        ArrayList<MusicModel> arrayList = null;
        if (awemeSearchMusicList == null) {
            return null;
        }
        this.f138259b = (long) awemeSearchMusicList.cursor;
        List<SearchMusic> list = awemeSearchMusicList.searchMusicList;
        if (list != null) {
            arrayList = new ArrayList<>();
            for (SearchMusic searchMusic : list) {
                MusicModel convertToMusicModel = searchMusic.convertToMusicModel();
                if (convertToMusicModel != null) {
                    convertToMusicModel.setLogPb(awemeSearchMusicList.logPb);
                    arrayList.add(convertToMusicModel);
                }
                if ((convertToMusicModel instanceof DynamicMusicModel) && convertToMusicModel.getDynamicPatch() != null && convertToMusicModel.getDynamicPatch().getOriginType() == 1) {
                    arrayList.add(new MusicTitleModel());
                }
            }
            this.f138258a = awemeSearchMusicList.isHasMore();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo98492a(String str, boolean z, String str2, boolean z2, int i, int i2, int i3, long j, boolean z3) {
        String str3;
        int i4;
        int i5;
        if (!z) {
            try {
                this.f138259b = 0;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        long j2 = this.f138259b;
        C29844g gVar = new C29844g(C60333a.f137512a);
        gVar.mo52129a("cursor", j2);
        gVar.mo52128a("count", 8);
        gVar.mo52130a("keyword", str);
        gVar.mo52130a("search_source", str2);
        if (i3 == 0) {
            str3 = "tiktok_music_create";
        } else {
            str3 = "tiktok_music_prolong";
        }
        gVar.mo52130a("search_channel", str3);
        gVar.mo52130a("enter_from", str2);
        int i6 = 1;
        if (z2) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        gVar.mo52128a("query_correct_type", i4);
        gVar.mo52128a("filter_by", i);
        gVar.mo52128a("sort_type", i2);
        if (i == 0 && i2 == 0) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        gVar.mo52128a("is_filter_search", i5);
        gVar.mo52129a("user_video_length", j);
        if (!z3) {
            i6 = 0;
        }
        gVar.mo52128a("user_video_created", i6);
        if (j2 == 0) {
            gVar.mo52130a("search_context", SearchServiceImpl.m119336t().mo106225n().mo71202a());
        }
        return gVar.toString();
    }
}

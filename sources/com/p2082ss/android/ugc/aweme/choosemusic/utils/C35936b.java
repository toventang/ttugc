package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61143be;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.b */
public final class C35936b {

    /* renamed from: a */
    public static String f84812a;

    /* renamed from: b */
    public static String f84813b;

    /* renamed from: c */
    public static int f84814c = -1;

    /* renamed from: d */
    public static String f84815d;

    /* renamed from: e */
    public static String f84816e;

    /* renamed from: f */
    static C35946e f84817f;

    /* renamed from: b */
    private static String m73322b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "local_song" : "favourite_song" : "popular_song";
    }

    /* renamed from: a */
    public static boolean m73321a() {
        return CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e();
    }

    /* renamed from: a */
    public static void m73320a(boolean z, String str, C35754b bVar, int i, LogPbBean logPbBean) {
        if (bVar != null) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", bVar.f84347a).mo59983a("music_id", str).mo59983a("category_name", bVar.f84348b).mo59983a("enter_method", bVar.f84349c).mo59983a("previous_page", bVar.f84350d).mo59980a("order", i).mo59983a("creation_id", f84815d);
            if (!TextUtils.isEmpty(bVar.f84351e)) {
                dVar.mo59983a("category_id", bVar.f84351e);
            }
            if (!TextUtils.isEmpty(bVar.f84353g)) {
                dVar.mo59983a("tag_id", bVar.f84353g);
            }
            if (!TextUtils.isEmpty(bVar.f84352f)) {
                dVar.mo59983a("prop_id", bVar.f84352f);
            }
            if (bVar.f84355i != null) {
                dVar.mo59982a("log_pb", bVar.f84355i);
                dVar.mo59983a("impr_id", !TextUtils.isEmpty(bVar.f84355i.getImprId()) ? bVar.f84355i.getImprId() : "");
            }
            String str2 = "favourite_song";
            if (TextUtils.equals(bVar.f84347a, "search_music")) {
                dVar.mo59983a("search_keyword", f84813b);
                dVar.mo59983a("search_id", bVar.f84356j);
                dVar.mo59983a("search_result_id", str);
                dVar.mo59983a("log_pb", new C27910f().mo46674b(logPbBean));
                if (!z) {
                    str2 = "cancel_favourite_song";
                }
                if (m73321a()) {
                    dVar.mo59983a("is_commercial", "1");
                }
                C39162r.m79461a(str2, C61143be.m110761a(dVar.f79943a));
            } else if (z) {
                if (m73321a()) {
                    dVar.mo59983a("is_commercial", "1");
                }
                C39162r.m79460a(str2, dVar.f79943a);
            }
        }
    }

    static {
        Covode.recordClassIndex(43178);
    }

    /* renamed from: b */
    public static void m73323b() {
        C33744d dVar = new C33744d();
        dVar.mo59983a("enter_from", "change_music_page").mo59983a("creation_id", f84815d);
        if (m73321a()) {
            dVar.mo59983a("is_commercial", "1");
        }
        C39162r.m79460a("enter_search", dVar.f79943a);
    }

    /* renamed from: a */
    public static void m73316a(String str) {
        C35946e eVar = f84817f;
        if (eVar != null) {
            eVar.mo63061a(str);
        }
    }

    /* renamed from: a */
    public static void m73311a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("tab_name", "local_song");
        hashMap.put("read_duration", String.valueOf(j));
        C39162r.m79461a("local_music_read_duration", C61143be.m110761a(hashMap));
    }

    /* renamed from: a */
    public static void m73310a(int i) {
        C33744d dVar = new C33744d();
        dVar.mo59983a("tab_name", m73322b(i)).mo59983a("previous_page", f84812a);
        if (m73321a()) {
            dVar.mo59983a("is_commercial", "1");
        }
        C39162r.m79460a("enter_music_tab", dVar.f79943a);
    }

    /* renamed from: a */
    public static void m73312a(C35754b bVar, String str, int i) {
        m73314a(bVar, str, i, true, false);
    }

    /* renamed from: a */
    public static void m73317a(String str, C35754b bVar, MusicModel musicModel) {
        int c;
        long b;
        String str2;
        if (bVar != null && f84817f != null) {
            C33744d dVar = new C33744d();
            C33744d a = dVar.mo59983a("music_id", str).mo59983a("category_name", bVar.f84348b);
            C35946e eVar = f84817f;
            if (eVar == null) {
                c = 0;
            } else {
                c = eVar.mo63064c(str);
            }
            C33744d a2 = a.mo59980a("time", c);
            C35946e eVar2 = f84817f;
            if (eVar2 == null) {
                b = 0;
            } else {
                b = eVar2.mo63063b(str);
            }
            a2.mo59981a("stay_time", b).mo59983a("enter_from", bVar.f84347a).mo59983a("enter_method", bVar.f84349c).mo59983a("previous_page", bVar.f84350d).mo59983a("creation_id", f84815d);
            if (!TextUtils.isEmpty(bVar.f84353g)) {
                dVar.mo59983a("tag_id", bVar.f84353g);
            }
            if (!TextUtils.isEmpty(bVar.f84352f)) {
                dVar.mo59983a("prop_id", bVar.f84352f);
            }
            if (bVar.f84355i != null) {
                dVar.mo59982a("log_pb", bVar.f84355i);
                if (!TextUtils.isEmpty(bVar.f84355i.getImprId())) {
                    str2 = bVar.f84355i.getImprId();
                } else {
                    str2 = "";
                }
                dVar.mo59983a("impr_id", str2);
            }
            if (TextUtils.equals(bVar.f84347a, "search_music")) {
                dVar.mo59983a("search_keyword", f84813b);
                dVar.mo59983a("search_id", musicModel.getSearchId());
                dVar.mo59981a("search_result_id", musicModel.getId());
            }
            C39162r.m79460a("music_play_time", dVar.f79943a);
            f84817f = null;
        }
    }

    /* renamed from: a */
    public static void m73315a(C35754b bVar, String str, boolean z, String str2) {
        String str3;
        String str4;
        if (bVar != null) {
            C33744d dVar = new C33744d();
            C33744d a = dVar.mo59983a("enter_from", bVar.f84347a).mo59983a("music_id", str).mo59983a("category_name", bVar.f84348b).mo59983a("creation_id", f84815d);
            if (z) {
                str3 = "click_banner";
            } else {
                str3 = "click_button";
            }
            a.mo59983a("enter_method", str3);
            if (!TextUtils.isEmpty(bVar.f84351e)) {
                dVar.mo59983a("category_id", bVar.f84351e);
            }
            if (!TextUtils.isEmpty(str2)) {
                dVar.mo59983a("process_id", str2);
            }
            if (bVar.f84355i != null) {
                dVar.mo59982a("log_pb", bVar.f84355i);
                if (!TextUtils.isEmpty(bVar.f84355i.getImprId())) {
                    str4 = bVar.f84355i.getImprId();
                } else {
                    str4 = "";
                }
                dVar.mo59983a("impr_id", str4);
            }
            C39162r.m79460a("enter_music_detail", dVar.f79943a);
        }
    }

    /* renamed from: a */
    public static void m73313a(C35754b bVar, String str, int i, LogPbBean logPbBean) {
        String str2;
        String str3;
        if (bVar != null) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", bVar.f84347a).mo59983a("music_id", str).mo59983a("category_name", bVar.f84348b).mo59983a("enter_method", bVar.f84349c).mo59980a("order", i).mo59983a("previous_page", f84812a).mo59983a("creation_id", f84815d);
            if (!TextUtils.isEmpty(bVar.f84353g)) {
                dVar.mo59983a("tag_id", bVar.f84353g);
            }
            if (!TextUtils.isEmpty(bVar.f84352f)) {
                dVar.mo59983a("prop_id", bVar.f84352f);
            }
            if (!TextUtils.isEmpty(bVar.f84351e)) {
                dVar.mo59983a("category_id", bVar.f84351e);
            }
            if (bVar.f84355i != null) {
                dVar.mo59982a("log_pb", bVar.f84355i);
                if (!TextUtils.isEmpty(bVar.f84355i.getImprId())) {
                    str3 = bVar.f84355i.getImprId();
                } else {
                    str3 = "";
                }
                dVar.mo59983a("impr_id", str3);
            }
            Long videoLength = EditVideoInfoServiceImpl.m141997a().getVideoLength(f84815d);
            if (videoLength != null) {
                str2 = videoLength.toString();
            } else {
                str2 = "0";
            }
            dVar.mo59983a("creation_duration", str2);
            if (TextUtils.equals(bVar.f84347a, "search_music")) {
                dVar.mo59983a("search_keyword", f84813b);
                dVar.mo59983a("search_id", bVar.f84356j);
                dVar.mo59983a("search_result_id", str);
                dVar.mo59983a("log_pb", new C27910f().mo46674b(logPbBean));
                if (m73321a()) {
                    dVar.mo59983a("is_commercial", "1");
                }
                C39162r.m79461a("add_music", C61143be.m110761a(dVar.f79943a));
            } else {
                if (m73321a()) {
                    dVar.mo59983a("is_commercial", "1");
                }
                C39162r.m79460a("add_music", dVar.f79943a);
            }
            if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
                AVExternalServiceImpl.m113114a().publishService().setFromCommercialSoundPage(true);
                AVExternalServiceImpl.m113114a().publishService().setHasOpenCommercialSoundPage(true);
                return;
            }
            AVExternalServiceImpl.m113114a().publishService().setFromCommercialSoundPage(false);
            AVExternalServiceImpl.m113114a().publishService().setHasOpenCommercialSoundPage(false);
        }
    }

    /* renamed from: a */
    public static void m73318a(String str, String str2, String str3, String str4) {
        C33744d dVar = new C33744d();
        dVar.mo59983a("enter_from", str).mo59983a("playlist_id", str2).mo59983a("playlist_name", str3).mo59983a("platform", str4);
        C39162r.m79460a("share_playlist", dVar.f79943a);
    }

    /* renamed from: a */
    public static void m73314a(C35754b bVar, String str, int i, boolean z, boolean z2) {
        String str2;
        if (bVar != null && z) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", bVar.f84347a).mo59983a("music_id", str).mo59983a("category_name", bVar.f84348b).mo59983a("enter_method", bVar.f84349c).mo59983a("previous_page", bVar.f84350d).mo59980a("order", i).mo59983a("creation_id", f84815d).mo59980a("ugc_to_pgc_meta", z2 ? 1 : 0);
            if (!TextUtils.isEmpty(bVar.f84351e)) {
                dVar.mo59983a("category_id", bVar.f84351e);
            }
            if (!TextUtils.isEmpty(bVar.f84353g)) {
                dVar.mo59983a("tag_id", bVar.f84353g);
            }
            if (!TextUtils.isEmpty(bVar.f84352f)) {
                dVar.mo59983a("prop_id", bVar.f84352f);
            }
            if (bVar.f84355i != null) {
                dVar.mo59982a("log_pb", bVar.f84355i);
                if (!TextUtils.isEmpty(bVar.f84355i.getImprId())) {
                    str2 = bVar.f84355i.getImprId();
                } else {
                    str2 = "";
                }
                dVar.mo59983a("impr_id", str2);
            }
            if (m73321a()) {
                dVar.mo59983a("is_commercial", "1");
            }
            C39162r.m79460a("show_music", dVar.f79943a);
        }
    }

    /* renamed from: a */
    public static void m73319a(String str, String str2, String str3, String str4, String str5) {
        C33744d dVar = new C33744d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59983a("banner_id", str3);
        }
        dVar.mo59983a("category_name", str).mo59983a("enter_method", str2).mo59983a("enter_from", str4).mo59983a("creation_id", f84815d);
        if (!TextUtils.isEmpty(str5)) {
            dVar.mo59983a("category_id", str5);
        }
        if (m73321a()) {
            dVar.mo59983a("is_commercial", "1");
        }
        C39162r.m79460a("enter_song_category", dVar.f79943a);
    }
}

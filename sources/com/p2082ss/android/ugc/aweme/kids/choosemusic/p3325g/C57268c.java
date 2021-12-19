package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.g.c */
public final class C57268c {

    /* renamed from: a */
    public static String f130442a;

    /* renamed from: b */
    public static int f130443b = -1;

    /* renamed from: c */
    public static String f130444c;

    /* renamed from: d */
    public static String f130445d;

    /* renamed from: e */
    static C57270e f130446e;

    static {
        Covode.recordClassIndex(67173);
    }

    /* renamed from: a */
    public static void m103828a(String str) {
        C57270e eVar = f130446e;
        if (eVar != null) {
            eVar.mo94468a(str);
        }
    }

    /* renamed from: a */
    public static void m103826a(C57171a aVar, String str, int i) {
        if (aVar != null) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", aVar.f130159a).mo59983a("music_id", str).mo59983a("category_name", aVar.f130160b).mo59983a("enter_method", aVar.f130161c).mo59980a("order", i).mo59983a("previous_page", f130442a);
            C39162r.m79460a("add_music", dVar.f79943a);
        }
    }

    /* renamed from: a */
    public static void m103830a(boolean z, String str, C57171a aVar) {
        String str2;
        if (aVar != null) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", aVar.f130159a).mo59983a("music_id", str);
            if (z) {
                str2 = "favorite_song";
            } else {
                str2 = "cancel_favorite_song";
            }
            C39162r.m79460a(str2, dVar.f79943a);
        }
    }

    /* renamed from: a */
    public static void m103827a(C57171a aVar, String str, int i, boolean z) {
        if (aVar != null && z) {
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", aVar.f130159a).mo59983a("music_id", str).mo59983a("category_name", aVar.f130160b).mo59983a("enter_method", aVar.f130161c).mo59980a("order", i);
            C39162r.m79460a("show_music", dVar.f79943a);
        }
    }

    /* renamed from: a */
    public static void m103829a(String str, String str2, String str3, String str4, String str5) {
        C33744d dVar = new C33744d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59983a("banner_id", str3);
        }
        dVar.mo59983a("category_name", str).mo59983a("enter_method", str2).mo59983a("enter_from", str4).mo59983a("creation_id", f130444c);
        if (!TextUtils.isEmpty(str5)) {
            dVar.mo59983a("category_id", str5);
        }
        C39162r.m79460a("enter_song_category", dVar.f79943a);
    }
}

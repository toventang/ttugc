package com.p2082ss.android.ugc.aweme.favorites.p2926h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.favorites.h.a */
public final class C47434a {

    /* renamed from: a */
    public static String f110164a = "personal_homepage";

    /* renamed from: b */
    public static boolean f110165b;

    /* renamed from: com.ss.android.ugc.aweme.favorites.h.a$a */
    public interface AbstractC47435a {
        static {
            Covode.recordClassIndex(56048);
        }

        /* renamed from: c */
        void mo79706c();
    }

    /* renamed from: a */
    public static void m90451a(String str, boolean z) {
        C39162r.m79460a(m90444a(1), m90452b("music", "collection_music").mo59983a("music_id", str).mo59983a("ugc_to_pgc_meta", z ? "1" : "0").f79943a);
    }

    static {
        Covode.recordClassIndex(56047);
    }

    /* renamed from: a */
    public static String m90444a(int i) {
        if (i == 1) {
            return "show_personal_collection";
        }
        if (i == 2) {
            return "click_personal_collection";
        }
        throw new IllegalArgumentException("wrong action value");
    }

    /* renamed from: b */
    public static void m90453b(String str) {
        C39162r.m79460a(m90444a(1), m90452b(UGCMonitor.EVENT_COMMENT, "collection_comment").mo59983a("comment_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m90446a(String str) {
        C39162r.m79460a(m90444a(1), m90452b("tag", "collection_tag").mo59983a("tag_id", str).f79943a);
    }

    /* renamed from: b */
    public static C33744d m90452b(String str, String str2) {
        return new C33744d().mo59983a("content", str).mo59983a("enter_from", str2);
    }

    /* renamed from: a */
    public static void m90445a(int i, String str) {
        C39162r.m79460a(m90444a(i), m90452b("prop", "collection_prop").mo59983a("prop_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m90447a(String str, String str2) {
        C39162r.m79460a("change_personal_collection_tab", new C33744d().mo59983a("enter_from", f110164a).mo59983a("enter_method", str).mo59983a("tab_name", str2).f79943a);
    }

    /* renamed from: b */
    public static void m90454b(String str, String str2, String str3) {
        C33744d dVar = new C33744d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59983a("tab_name", str3);
        }
        C39162r.m79460a("click_personal_collection", dVar.mo59983a("enter_from", str2).mo59983a("content", "tag").mo59983a("tag_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m90448a(String str, String str2, String str3) {
        C33744d dVar = new C33744d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59983a("tab_name", str3);
        }
        C39162r.m79460a("click_personal_collection", dVar.mo59983a("enter_from", str2).mo59983a("content", "music").mo59983a("music_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m90449a(String str, String str2, String str3, String str4) {
        C33744d dVar = new C33744d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59983a("tab_name", str3);
        }
        C39162r.m79460a("enter_tag_detail", dVar.mo59983a("enter_from", str2).mo59983a("enter_method", "click_collection_tag").mo59983a("tag_id", str).mo59983a("process_id", str4).f79943a);
    }

    /* renamed from: a */
    public static void m90450a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C33744d dVar = new C33744d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo59983a("tab_name", str3);
        }
        C33744d a = dVar.mo59983a("music_id", str).mo59983a("enter_from", str2).mo59983a("process_id", str4).mo59983a("enter_method", "click_collection_music");
        if (z) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        C39162r.m79460a("enter_music_detail", a.mo59983a("ugc_to_pgc_meta", str5).f79943a);
    }
}

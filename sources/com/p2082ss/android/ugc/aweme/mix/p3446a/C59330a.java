package com.p2082ss.android.ugc.aweme.mix.p3446a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.a.a */
public final class C59330a {

    /* renamed from: a */
    public static final C59330a f135564a = new C59330a();

    private C59330a() {
    }

    /* renamed from: a */
    public static void m109037a(String str, String str2, boolean z) {
        C39162r.m79460a("cancel_editing_playlist", new C33744d().mo59983a("enter_from", str2).mo59980a("is_discard", z ? 1 : 0).mo59983a("playlist_id", str).f79943a);
    }

    static {
        Covode.recordClassIndex(69713);
    }

    /* renamed from: a */
    public static void m109031a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("enter_playlist_name", new C33744d().mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: b */
    public static void m109038b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("create_playlist", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).f79943a);
    }

    /* renamed from: c */
    public static void m109039c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("enter_playlist_intro_page", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).f79943a);
    }

    /* renamed from: d */
    public static void m109040d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("enter_playlist_name_page", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).f79943a);
    }

    /* renamed from: e */
    public static void m109041e(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("enter_playlist_selection_page", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).f79943a);
    }

    /* renamed from: f */
    public static void m109042f(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("enter_playlist_reorder_page", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).f79943a);
    }

    /* renamed from: a */
    public static void m109033a(String str, String str2) {
        C39162r.m79460a("delete_playlist", new C33744d().mo59983a("enter_from", str2).mo59983a("playlist_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m109029a(Aweme aweme, String str, String str2) {
        String str3;
        User author;
        C33744d a = new C33744d().mo59983a("enter_from", str2).mo59983a("playlist_id", str);
        String str4 = null;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str3 = null;
        } else {
            str3 = author.getUid();
        }
        C33744d a2 = a.mo59983a("author_id", str3);
        if (aweme != null) {
            str4 = aweme.getGroupId();
        }
        C39162r.m79460a("leave_playlist", a2.mo59983a("group_id", str4).f79943a);
    }

    /* renamed from: a */
    public static void m109034a(String str, String str2, String str3) {
        C39162r.m79460a("add_multiple_playlist_video_fail", new C33744d().mo59983a("enter_from", str2).mo59983a("enter_method", str3).mo59983a("playlist_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m109030a(Aweme aweme, String str, String str2, C59538b bVar) {
        String str3;
        String str4;
        Integer num;
        String str5;
        User author;
        C33744d a = new C33744d().mo59983a("enter_from", str2).mo59983a("playlist_id", str);
        String str6 = null;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str3 = null;
        } else {
            str3 = author.getUid();
        }
        C33744d a2 = a.mo59983a("author_id", str3);
        if (bVar == null || (str4 = bVar.getSearchId()) == null) {
            str4 = "";
        }
        C33744d a3 = a2.mo59983a("search_id", str4);
        if (bVar != null) {
            num = bVar.isFromVideo();
        } else {
            num = null;
        }
        C33744d a4 = a3.mo59982a("is_from_video", num);
        if (bVar != null) {
            str5 = bVar.getSearchType();
        } else {
            str5 = null;
        }
        C33744d a5 = a4.mo59983a("search_type", str5);
        if (aweme != null) {
            str6 = aweme.getGroupId();
        }
        C39162r.m79460a("enter_playlist", a5.mo59983a("group_id", str6).f79943a);
    }

    /* renamed from: a */
    public static void m109032a(String str, int i, String str2, String str3) {
        C39162r.m79460a("post_creating_playlist", new C33744d().mo59980a("video_cnt", i).mo59983a("playlist_id", str).mo59983a("enter_from", str2).mo59983a("enter_method", str3).f79943a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m109036a(String str, String str2, String str3, String str4, String str5, String str6, String str7, C59538b bVar, int i) {
        Integer num;
        String searchId;
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        if ((i & 64) != 0) {
            str7 = "";
        }
        String str8 = null;
        if ((i & 128) != 0) {
            bVar = null;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("playlist_id", str2).mo59983a("group_id", str3).mo59983a("author_id", str4);
        if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
            str5 = searchId;
        }
        C33744d a2 = a.mo59983a("search_id", str5).mo59983a("search_result_id", str6).mo59983a("search_keyword", str7);
        if (bVar != null) {
            num = bVar.isFromVideo();
        } else {
            num = null;
        }
        C33744d a3 = a2.mo59982a("is_from_video", num);
        if (bVar != null) {
            str8 = bVar.getSearchType();
        }
        C39162r.m79460a("show_playlist_entrance", a3.mo59983a("search_type", str8).f79943a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m109035a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, C59538b bVar, int i2) {
        Integer num;
        String searchId;
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 8) != 0) {
            str4 = "";
        }
        if ((i2 & 32) != 0) {
            str5 = "";
        }
        if ((i2 & 64) != 0) {
            str6 = "";
        }
        if ((i2 & 128) != 0) {
            str7 = "";
        }
        if ((i2 & 256) != 0) {
            str8 = "";
        }
        String str9 = null;
        if ((i2 & 512) != 0) {
            bVar = null;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        C33744d a = new C33744d().mo59983a("enter_method", str5).mo59983a("previous_page", str).mo59983a("enter_from", str).mo59983a("author_id", str3).mo59983a("group_id", str4).mo59983a("playlist_id", str2).mo59980a("order", i);
        if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
            str6 = searchId;
        }
        C33744d a2 = a.mo59983a("search_id", str6).mo59983a("search_result_id", str7).mo59983a("search_keyword", str8);
        if (bVar != null) {
            num = bVar.isFromVideo();
        } else {
            num = null;
        }
        C33744d a3 = a2.mo59982a("is_from_video", num);
        if (bVar != null) {
            str9 = bVar.getSearchType();
        }
        C39162r.m79460a("enter_playlist_detail", a3.mo59983a("search_type", str9).f79943a);
    }
}

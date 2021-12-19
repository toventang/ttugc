package com.p2082ss.android.ugc.aweme.p2398bn;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Date;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bn.a */
public final class C34891a {

    /* renamed from: a */
    public static String f82340a = "profile_photo_page";

    /* renamed from: b */
    public static final C34891a f82341b = new C34891a();

    private C34891a() {
    }

    /* renamed from: a */
    public static void m71267a() {
        C39162r.m79460a("show_exit_avatar_confirmation_popup", new C33744d().f79943a);
    }

    static {
        Covode.recordClassIndex(41902);
    }

    /* renamed from: b */
    public static void m71270b(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("cancel_more_option_avatar_profile", new C33744d().mo59983a("enter_from", "avatar_hub").mo59983a("exit_method", str).f79943a);
    }

    /* renamed from: a */
    public static void m71268a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("create_avatar", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "click").mo59983a("start_time", String.valueOf(new Date().getTime())).f79943a);
    }

    /* renamed from: a */
    public static void m71269a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str3, "");
        C39162r.m79460a("select_avatar_item", new C33744d().mo59983a("item_id", str).mo59983a("item_tab", str2).mo59983a("item_subcategory", str3).mo59983a(C19386b.f45894a, str4).f79943a);
    }
}

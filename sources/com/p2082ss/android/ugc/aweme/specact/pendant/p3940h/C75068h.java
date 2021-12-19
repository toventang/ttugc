package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.h */
public final class C75068h {

    /* renamed from: a */
    public static final C75068h f168720a = new C75068h();

    private C75068h() {
    }

    static {
        Covode.recordClassIndex(87940);
    }

    /* renamed from: a */
    public static void m131834a(String str, int i, String str2, UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("widget_time_tracker_show", new C33744d().mo59983a("widget_name", str).mo59983a("page", C75063d.m131828c()).mo59980a("is_selected", i).mo59983a("position", str2).mo59983a("event_keyword", C75060a.m131805g(ugAwemeActivitySetting)).f79943a);
    }

    /* renamed from: a */
    public static void m131835a(String str, String str2, int i, String str3, int i2, String str4, UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C39162r.m79460a("widget_time_tracker_click", new C33744d().mo59983a("position", str).mo59983a("widget_name", str2).mo59983a("page", C75063d.m131828c()).mo59980a("is_selected", i).mo59983a("group_id", str3).mo59980a("is_tiktok_bonus", i2).mo59983a("click", str4).mo59983a("event_keyword", C75060a.m131805g(ugAwemeActivitySetting)).f79943a);
    }
}

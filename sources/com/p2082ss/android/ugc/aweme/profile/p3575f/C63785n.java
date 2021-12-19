package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63373m;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.n */
public final class C63785n {

    /* renamed from: a */
    public static final C63785n f144579a = new C63785n();

    /* renamed from: b */
    private static boolean f144580b;

    private C63785n() {
    }

    static {
        Covode.recordClassIndex(75113);
    }

    /* renamed from: a */
    public static void m115346a() {
        C39162r.m79460a("shoot_bubble_show", new C33744d().mo59983a("enter_from", "personal_homepage").f79943a);
    }

    /* renamed from: a */
    public static void m115348a(boolean z) {
        int i;
        int i2;
        String str;
        String str2;
        if (z != f144580b) {
            f144580b = z;
            ArrayList<C63373m> g = C63786o.m115357g();
            int i3 = 0;
            int i4 = -1;
            if (!g.get(0).f143885e || !C63786o.f144582b) {
                i2 = -1;
                i = -1;
            } else {
                Iterator<T> it = g.iterator();
                i4 = 0;
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    int i5 = it.next().f143882b;
                    if (i5 == R.string.cm4) {
                        i4 = i3;
                    } else if (i5 == R.string.cm0) {
                        i2 = i3;
                    } else if (i5 == R.string.clw) {
                        i = i3;
                    }
                    i3++;
                }
            }
            C33744d dVar = new C33744d();
            if (C63786o.m115356f()) {
                str = "set_up_profile";
            } else {
                str = "edit_profile";
            }
            C33744d a = dVar.mo59983a("edit_profile_icon", str).mo59980a("create_video_show", C63786o.f144583c ? 1 : 0).mo59980a("personal_videos_cnt", C63786o.f144585e).mo59980a("photo_card_order", i4).mo59980a("photo_card_edited", C63786o.m115349a() ? 1 : 0).mo59980a("name_card_order", i2).mo59980a("name_card_edited", C63786o.m115351b() ? 1 : 0).mo59980a("bio_card_order", i).mo59980a("bio_card_edited", C63786o.m115353c() ? 1 : 0);
            if (z) {
                str2 = "enter";
            } else {
                str2 = "leave";
            }
            C39162r.m79460a("personal_homepage_profile_status", a.mo59983a("enter_from", str2).mo59980a("fans_1K", C63786o.m115354d() ? 1 : 0).f79943a);
        }
    }

    /* renamed from: a */
    public static void m115347a(String str, boolean z) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59983a(StringSet.type, str);
        if (z) {
            str2 = "edit";
        } else {
            str2 = "add";
        }
        C39162r.m79460a("enter_personal_homepage_click_add", a.mo59983a("btn_name", str2).f79943a);
    }
}

package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67573s;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.c */
public final class C42318c {

    /* renamed from: a */
    public static final C42318c f98564a = new C42318c();

    private C42318c() {
    }

    static {
        Covode.recordClassIndex(50261);
    }

    /* renamed from: a */
    public static final void m84682a(C67568r rVar, String str, String str2) {
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String str3 = rVar.f151317l;
        String str4 = rVar.f151315j;
        String str5 = rVar.f151314i;
        String str6 = rVar.f151311f;
        C67540c x = ((C67542d) ((C67542d) ((C67540c) ((C67542d) new C67496as(rVar).mo106480a(str5).mo106482b(str6).mo106483c(str3)).mo106493t(rVar.f151324s).mo106456l(rVar.f151323r)).mo106484d(str4).mo106459o(rVar.f151312g)).mo106496w("0").mo106479a(Integer.valueOf(rVar.f151318m))).mo106497x("live_card");
        x.mo106452c("room_id", String.valueOf(rVar.f151319n));
        ((C67496as) x.mo106487g(rVar.f151319n)).mo106439A(str).mo96792f();
    }

    /* renamed from: a */
    public static void m84683a(String str, User user, C67568r rVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(rVar, "");
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("is_english", "1");
            hashMap.put("sdk_version", "2150");
            hashMap.put("_param_live_platform", "live");
            C67573s a = ((C67573s) ((C67573s) ((C67573s) ((C67573s) ((C67573s) ((C67573s) ((C67573s) ((C67573s) ((C67573s) ((C67573s) new C67573s().mo106433s("general_search")).mo106460p(str)).mo106434t(String.valueOf(user.roomId))).mo106485e(user.getUid())).mo106488q("click")).mo106480a(rVar.f151314i)).mo106486f(rVar.f151309d)).mo106482b(rVar.f151311f)).mo106487g(rVar.f151319n)).mo106458n(user.getRequestId())).mo106525a(user.getFollowerStatus());
            if (rVar.f151320o == 1) {
                a.mo106526r(String.valueOf(user.roomId));
            }
            a.mo96788a(hashMap);
            a.mo96792f();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m84681a(C67568r rVar, String str, C42410g gVar, String str2, String str3) {
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        String str4 = rVar.f151317l;
        String str5 = rVar.f151315j;
        String str6 = rVar.f151314i;
        String str7 = rVar.f151311f;
        ((C67496as) ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67542d) new C67496as(rVar).mo106480a(str6).mo106482b(str7).mo106483c(str4).mo106484d(str5)).mo106493t(rVar.f151324s).mo106456l(rVar.f151323r).mo106459o(rVar.f151312g)).mo106496w("1").mo106479a(Integer.valueOf(rVar.f151318m))).mo106490d((Integer) 0)).mo106491r("live")).mo106495v(str2)).mo106497x(gVar.f98786b)).mo106492s(str3)).mo106440B(str).mo106487g(rVar.f151319n).mo96792f();
    }
}

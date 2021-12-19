package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42303f;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67484al;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.d */
public final class C42319d {

    /* renamed from: a */
    public static final C42319d f98565a = new C42319d();

    private C42319d() {
    }

    static {
        Covode.recordClassIndex(50262);
    }

    /* renamed from: a */
    public static final C67484al m84685a(String str, C67568r rVar, User user) {
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(user, "");
        C67484al alVar = new C67484al(str);
        alVar.mo106480a(rVar.f151314i).mo106487g(user.getUid()).mo106482b(rVar.f151311f).mo106484d(rVar.f151315j).mo106459o(rVar.f151312g);
        alVar.mo106452c("to_user_id", user.getUid());
        String str3 = "0";
        if (C42303f.m84663a(user)) {
            str2 = str3;
        } else {
            str2 = "1";
        }
        alVar.mo106452c("can_message", str2);
        if (user.getFollowStatus() == 4) {
            str3 = "1";
        }
        alVar.mo106452c("is_requested", str3);
        return alVar;
    }

    /* renamed from: a */
    public static final C59260v m84684a(C67568r rVar, String str, int i, User user, Map<String, String> map, boolean z) {
        String str2 = "";
        C89219l.m154721d(rVar, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(user, str2);
        if (i == 1) {
            if (user.getFollowerStatus() == 1) {
                str2 = "mutual";
            } else {
                str2 = "single";
            }
        }
        C59260v vVar = new C59260v(str);
        if (map != null) {
            vVar.mo96788a(map);
        }
        if (!z) {
            vVar.f135409s = "click_search_result";
            vVar.f135403c = "follow_button";
        }
        C59260v vVar2 = (C59260v) vVar.mo96810l(rVar.f151314i);
        vVar2.f135383ah = 1;
        C59260v a = ((C59260v) vVar2.mo96804f(user.getUid())).mo96847a(rVar.f151312g);
        a.f135405e = user.getUid();
        C59260v vVar3 = (C59260v) a.mo96776k(rVar.f151315j);
        vVar3.f135402b = rVar.f151312g;
        vVar3.f135412v = str2;
        vVar3.f135407q = user.getRequestId();
        vVar3.mo96786a("search_keyword", rVar.f151311f).mo96786a("is_search_scene", "1").mo96785a("relation_tag", C42320e.m84686a(user));
        return vVar;
    }
}

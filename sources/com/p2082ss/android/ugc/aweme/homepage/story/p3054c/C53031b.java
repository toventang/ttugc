package com.p2082ss.android.ugc.aweme.homepage.story.p3054c;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.story.container.C53055h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.c.b */
public final class C53031b {

    /* renamed from: a */
    public static final C53031b f121915a = new C53031b();

    private C53031b() {
    }

    static {
        Covode.recordClassIndex(62571);
    }

    /* renamed from: a */
    public static boolean m97956a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        return C76706a.m134288n(aweme);
    }

    /* renamed from: a */
    public static boolean m97957a(String str) {
        String str2;
        User b = C63770ai.m139683b();
        if (b != null) {
            str2 = b.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    /* renamed from: a */
    public static String m97955a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        String a = C53055h.m98051a(eVar);
        int hashCode = a.hashCode();
        if (hashCode != -1525083535) {
            return (hashCode == 984907784 && !a.equals("For You")) ? "homepage_hot" : "homepage_hot";
        }
        if (a.equals("Following")) {
            return "homepage_follow";
        }
    }
}

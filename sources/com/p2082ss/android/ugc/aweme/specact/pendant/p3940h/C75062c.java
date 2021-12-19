package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.c */
public final class C75062c {

    /* renamed from: a */
    public static final C75062c f168715a = new C75062c();

    private C75062c() {
    }

    static {
        Covode.recordClassIndex(87934);
    }

    /* renamed from: a */
    public static Aweme m131823a() {
        Activity j = C17873f.m33102j();
        if (j instanceof ActivityC0945e) {
            return AwemeChangeCallBack.m108593a((ActivityC0945e) j);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m131824a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C37699a.m76314s(aweme);
    }

    /* renamed from: b */
    public static boolean m131825b(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 101) {
            return true;
        }
        return false;
    }
}

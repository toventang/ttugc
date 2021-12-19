package com.p2082ss.android.ugc.aweme.setting;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80466fy;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.bf */
public final class C68020bf {

    /* renamed from: a */
    public static final C68020bf f152369a = new C68020bf();

    private C68020bf() {
    }

    static {
        Covode.recordClassIndex(80216);
    }

    /* renamed from: b */
    private static boolean m120319b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m120318a() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean b = m120319b();
        C58029j.f132256h = b;
        return b;
    }

    /* renamed from: a */
    public static void m120317a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (!m120318a()) {
            new C79459a(activity).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C29844g gVar = new C29844g(C80466fy.m139470a("terms-of-use"));
        gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(activity));
        SmartRouter.buildRoute(activity, "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", activity.getString(R.string.d9w)).open();
    }
}

package com.p2082ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.k */
public final class C62268k {
    static {
        Covode.recordClassIndex(73042);
    }

    /* renamed from: a */
    public static void m112648a(Context context) {
        SmartRouter.buildRoute(context, "aweme://check_profile").open();
    }

    /* renamed from: a */
    public static void m112649a(Context context, String str, String str2, String str3) {
        SmartRouter.buildRoute(context, "aweme://challenge/detail/").withParam("cid", str).withParam("enter_from", str2).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("process_id", str3).open();
    }

    /* renamed from: a */
    public static void m112650a(Context context, String str, String str2, String str3, int i) {
        C36125t.m73596a(C36125t.m73591a(), (Activity) context, C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(str))).mo63247a("profile_enterprise_type", i).mo63248a("cid", str3).mo63248a("refer", str2).mo63248a("video_from", "from_launch_forward").f85356a.mo52126a());
    }
}

package com.p2082ss.android.ugc.aweme.follow.p2995a;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.follow.a.a */
public final class C51066a {

    /* renamed from: a */
    public static final String f117789a;

    /* renamed from: b */
    public static final String f117790b;

    /* renamed from: c */
    public static final C51066a f117791c = new C51066a();

    /* renamed from: d */
    private static File f117792d;

    /* renamed from: e */
    private static final C27910f f117793e = new C27910f();

    private C51066a() {
    }

    /* renamed from: a */
    public static boolean m95482a() {
        File file = f117792d;
        if (file != null && file.exists()) {
            return true;
        }
        C80313cs.m139225a(f117789a, false);
        File a = C80313cs.m139225a(f117790b, true);
        f117792d = a;
        if (a == null || !a.exists()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(60252);
        String str = C80720e.m139929c() + File.separator + "follow_feed_cache";
        f117789a = str;
        String str2 = str + File.separator + "cache";
        f117790b = str2;
        C80313cs.m139225a(str, false);
        f117792d = C80313cs.m139225a(str2, true);
    }

    /* renamed from: a */
    public static FollowFeedList m95480a(String str) {
        try {
            return (FollowFeedList) f117793e.mo46670a(str, FollowFeedList.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m95481a(FollowFeedList followFeedList) {
        try {
            String b = f117793e.mo46674b(followFeedList);
            if (b == null) {
                return "";
            }
            return b;
        } catch (Exception unused) {
            return "";
        }
    }
}

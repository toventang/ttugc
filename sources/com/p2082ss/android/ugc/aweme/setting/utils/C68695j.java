package com.p2082ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.j */
public final class C68695j {

    /* renamed from: a */
    public static final C68695j f153699a = new C68695j();

    private C68695j() {
    }

    static {
        Covode.recordClassIndex(80956);
    }

    /* renamed from: a */
    public static int m121129a() {
        return (C16048b.m29633a().mo25412a(true, "push_sound_type", 0) + 2) / 3;
    }

    /* renamed from: b */
    public static boolean m121130b() {
        int a = C16048b.m29633a().mo25412a(true, "push_sound_type", 0);
        if (a == 0 || a == 1 || a == 4 || a == 7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String[] m121131c() {
        int a = C16048b.m29633a().mo25412a(true, "push_sound_type", 0);
        if (a == 0) {
            return new String[0];
        }
        int i = a % 3;
        if (i == 2) {
            return new String[]{"comment_push", "follow_push", "digg_push", "im_push"};
        }
        if (i == 0) {
            return new String[]{"recommend_video_push", "follow_new_video_push", "live_push"};
        }
        return new String[0];
    }
}

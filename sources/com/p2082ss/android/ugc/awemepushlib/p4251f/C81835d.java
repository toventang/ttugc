package com.p2082ss.android.ugc.awemepushlib.p4251f;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.awemepushlib.f.d */
public final class C81835d {

    /* renamed from: a */
    public static final C81835d f182971a = new C81835d();

    private C81835d() {
    }

    static {
        Covode.recordClassIndex(95248);
    }

    /* renamed from: a */
    public static int m141729a() {
        return (C16048b.m29633a().mo25412a(true, "push_sound_type", 0) + 2) / 3;
    }

    /* renamed from: b */
    public static boolean m141731b() {
        int a = C16048b.m29633a().mo25412a(true, "push_sound_type", 0);
        if (a == 0 || a == 1 || a == 4 || a == 7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String[] m141732c() {
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

    /* renamed from: a */
    public static Uri m141730a(Context context, int i) {
        C89219l.m154721d(context, "");
        String str = "android.resource://" + context.getPackageName() + "/";
        Uri uri = null;
        if (i != 2) {
            return null;
        }
        try {
            uri = Uri.parse(str + R.raw.tiktok_new_customezed_tone);
            return uri;
        } catch (Exception e) {
            e.printStackTrace();
            return uri;
        }
    }
}

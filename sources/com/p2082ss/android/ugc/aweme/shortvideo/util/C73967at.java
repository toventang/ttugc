package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.at */
public final class C73967at {

    /* renamed from: a */
    static long f166055a = -1;

    /* renamed from: b */
    static String f166056b = "";

    /* renamed from: c */
    public static final C73967at f166057c = new C73967at();

    /* renamed from: d */
    private static final List<String> f166058d = C89070n.m154522b("enter_video_shoot_page", "enter_clip_edit_page", "enter_video_edit_page", "enter_video_post_page");

    private C73967at() {
    }

    /* renamed from: a */
    public static final void m130093a() {
        f166055a = -1;
        f166056b = "";
    }

    static {
        Covode.recordClassIndex(86717);
    }

    /* renamed from: a */
    public static final void m130094a(String str) {
        C89219l.m154721d(str, "");
        List<String> list = f166058d;
        if (list.contains(str)) {
            if (!list.contains(f166056b)) {
                f166056b = str;
            } else if (list.indexOf(f166056b) < list.indexOf(str)) {
                f166056b = str;
            }
        }
    }
}

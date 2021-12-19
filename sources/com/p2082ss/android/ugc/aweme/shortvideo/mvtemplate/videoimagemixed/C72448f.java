package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.f */
public final class C72448f {

    /* renamed from: a */
    public static final C72448f f162423a = new C72448f();

    /* renamed from: b */
    private static String f162424b;

    /* renamed from: c */
    private static String f162425c;

    private C72448f() {
    }

    static {
        Covode.recordClassIndex(85122);
    }

    /* renamed from: a */
    public static void m127823a(boolean z) {
        C39162r.m79460a("edit_clips_order", m127824b(z).mo129406a("edit_way", "press").f188764a);
    }

    /* renamed from: b */
    static C84425b m127824b(boolean z) {
        String str;
        C84425b a = new C84425b().mo129406a("shoot_way", f162425c).mo129406a("creation_id", f162424b).mo129406a("content_source", "upload").mo129406a("enter_from", "album_panel");
        if (z) {
            str = "video";
        } else {
            str = UGCMonitor.TYPE_PHOTO;
        }
        C84425b a2 = a.mo129406a("content_type", str);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public static void m127822a(String str, String str2) {
        f162424b = str;
        f162425c = str2;
    }
}

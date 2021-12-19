package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b */
public final class C71427b {

    /* renamed from: a */
    public static final C71427b f160043a = new C71427b();

    /* renamed from: b */
    private static String f160044b;

    /* renamed from: c */
    private static String f160045c;

    /* renamed from: d */
    private static String f160046d;

    /* renamed from: e */
    private static String f160047e;

    /* renamed from: f */
    private static String f160048f;

    private C71427b() {
    }

    static {
        Covode.recordClassIndex(83961);
    }

    /* renamed from: a */
    public static void m126141a() {
        C39162r.m79460a("cancel_video_trim", m126147c().f188764a);
    }

    /* renamed from: b */
    public static void m126145b() {
        C39162r.m79460a("exit_video_trim", m126147c().f188764a);
    }

    /* renamed from: c */
    public static C84425b m126147c() {
        C84425b a = new C84425b().mo129406a("shoot_way", f160045c).mo129406a("creation_id", f160044b).mo129406a("enter_from", f160046d).mo129406a("content_type", f160047e).mo129406a("content_source", f160048f).mo129406a("enter_from", "video_edit_page");
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static void m126142a(int i) {
        C39162r.m79460a("reshoot_video_section", m126147c().mo129406a("order", String.valueOf(i + 1)).f188764a);
    }

    /* renamed from: b */
    public static final void m126146b(int i) {
        C39162r.m79460a("back_to_video_trim", m126147c().mo129403a("videoSegment", i).f188764a);
    }

    /* renamed from: a */
    public static void m126143a(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null) {
            f160044b = shortVideoContext.f155830o;
            f160045c = shortVideoContext.f155831p;
            f160046d = shortVideoContext.f155837v;
            f160047e = "video";
            f160048f = "shoot";
        }
    }

    /* renamed from: a */
    public static void m126144a(boolean z, boolean z2, int i, int i2, int i3) {
        String str;
        if (z2) {
            str = "single";
        } else if (z) {
            str = "multi_part";
        } else {
            str = "multi_entire";
        }
        C39162r.m79460a("edit_video_length", m126147c().mo129406a("trim_type", str).mo129406a("order", String.valueOf(i + 1)).mo129406a("from_length", String.valueOf(i2)).mo129406a("to_length", String.valueOf(i3)).f188764a);
    }
}

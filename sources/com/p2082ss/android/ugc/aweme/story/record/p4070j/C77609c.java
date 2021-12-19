package com.p2082ss.android.ugc.aweme.story.record.p4070j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.j.c */
public final class C77609c {

    /* renamed from: a */
    public static long f174065a = -1;

    /* renamed from: b */
    public static String f174066b = "";

    /* renamed from: c */
    public static final C77609c f174067c = new C77609c();

    /* renamed from: d */
    private static final List<String> f174068d = C89070n.m154522b("enter_video_shoot_page", "enter_video_edit_page");

    private C77609c() {
    }

    static {
        Covode.recordClassIndex(90646);
    }

    /* renamed from: a */
    public static void m135599a(String str) {
        C89219l.m154721d(str, "");
        List<String> list = f174068d;
        if (list.contains(str)) {
            if (!list.contains(f174066b)) {
                f174066b = str;
            } else if (list.indexOf(f174066b) < list.indexOf(str)) {
                f174066b = str;
            }
        }
    }

    /* renamed from: a */
    public static void m135597a(C77561a aVar, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("click_upload_entrance", new C84425b().mo129406a("creation_id", aVar.f173950b).mo129406a("shoot_way", aVar.f173951c).mo129406a("is_westwindow_exist", aVar.f173957i).mo129406a("enter_from", "video_shoot_page").mo129406a("enter_method", str).mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story").f188764a);
    }

    /* renamed from: b */
    public static void m135600b(C77561a aVar, String str) {
        Object obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C84425b a = new C84425b().mo129406a("creation_id", aVar.f173950b).mo129406a("shoot_way", "story").mo129406a("shoot_page", "story_shoot_page").mo129406a("is_westwindow_exist", aVar.f173957i).mo129406a("shoot_enter_method", aVar.f173952d).mo129406a("exit_method", str);
        if (f174065a >= 0) {
            obj = Long.valueOf(System.currentTimeMillis() - f174065a);
        } else {
            obj = "-1";
        }
        Map<String, String> map = a.mo129405a("shoot_exit_duration", obj).mo129406a("furthest_page", f174066b).f188764a;
        f174065a = -1;
        C80322d.m139251a("shoot_exit", map);
    }

    /* renamed from: a */
    public static void m135598a(C77561a aVar, boolean z) {
        String str;
        C89219l.m154721d(aVar, "");
        C84425b a = new C84425b().mo129406a("creation_id", aVar.f173950b).mo129406a("shoot_way", aVar.f173951c).mo129406a("is_westwindow_exist", aVar.f173957i).mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story");
        if (z) {
            str = "video";
        } else {
            str = UGCMonitor.TYPE_PHOTO;
        }
        C80322d.m139251a("record_video", a.mo129406a("record_type", str).f188764a);
    }
}

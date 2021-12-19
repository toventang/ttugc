package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69791b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73967at;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h */
public final class C70463h {

    /* renamed from: a */
    public static String f157436a;

    /* renamed from: b */
    public static String f157437b;

    /* renamed from: c */
    public static String f157438c = "";

    /* renamed from: d */
    public static String f157439d = "";

    /* renamed from: e */
    public static final C70463h f157440e = new C70463h();

    /* renamed from: f */
    private static String f157441f;

    /* renamed from: g */
    private static String f157442g = "video_sync_page";

    /* renamed from: h */
    private static String f157443h;

    private C70463h() {
    }

    static {
        Covode.recordClassIndex(82906);
    }

    /* renamed from: a */
    public static C84425b m124284a() {
        C84425b a = new C84425b().mo129406a("shoot_way", f157436a).mo129406a("creation_id", f157441f).mo129406a("enter_from", f157442g);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static String m124285a(boolean z) {
        if (z) {
            return "sound_sync";
        }
        String str = f157443h;
        if (str == null) {
            return "video";
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    /* renamed from: b */
    private static C84425b m124291b(boolean z) {
        C84425b a = new C84425b().mo129406a("shoot_way", f157436a).mo129406a("creation_id", f157441f).mo129406a("content_source", "upload").mo129406a("content_type", m124285a(z));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: c */
    public static void m124293c(List<? extends VideoSegment> list) {
        if (!C84904k.m145909a(list)) {
            long j = 0;
            if (list == null) {
                C89219l.m154715b();
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                j += it.next().f156710b;
            }
            C39162r.m79460a("smart_sync_cancel", m124284a().mo129404a("content_duration_ms", j).f188764a);
        }
    }

    /* renamed from: a */
    public static void m124287a(List<? extends VideoSegment> list) {
        if (!C84904k.m145909a(list)) {
            long j = 0;
            if (list == null) {
                C89219l.m154715b();
            }
            int i = 0;
            int i2 = 0;
            for (T t : list) {
                j += t.f156710b;
                if (t.f156732x) {
                    i2++;
                }
            }
            if (!C89219l.m154714a((Object) "comment_reply", (Object) f157436a)) {
                f157438c = "";
                f157439d = "";
            }
            C73967at.m130094a("enter_clip_edit_page");
            C84425b a = m124284a().mo129406a("content_type", "sound_sync").mo129406a("content_source", "upload").mo129404a("content_duration_ms", j).mo129406a("reply_comment_id", f157438c).mo129406a("reply_user_id", f157439d).mo129403a("video_cnt", list.size() - i2).mo129403a("pic_cnt", i2);
            if (list.size() > 1) {
                i = 1;
            }
            C39162r.m79460a("enter_clip_edit_page", a.mo129403a("is_multi_content", i).mo129406a("mix_type", C69791b.m123314a(list.size() - i2, i2)).mo129406a("enter_from", "video_sync_page").f188764a);
        }
    }

    /* renamed from: b */
    public static void m124292b(List<? extends VideoSegment> list) {
        int i;
        if (!C84904k.m145909a(list)) {
            long j = 0;
            if (list == null) {
                C89219l.m154715b();
            }
            int i2 = 0;
            for (T t : list) {
                j += t.f156710b;
                if (t.f156732x) {
                    i2++;
                }
            }
            if (!C89219l.m154714a((Object) "comment_reply", (Object) f157436a)) {
                f157438c = "";
                f157439d = "";
            }
            C84425b a = m124284a().mo129406a("content_type", m124285a(false)).mo129406a("content_source", "upload").mo129404a("content_duration_ms", j).mo129406a("reply_comment_id", f157438c).mo129406a("reply_user_id", f157439d).mo129403a("video_cnt", list.size() - i2).mo129403a("pic_cnt", i2);
            if (list.size() > 1) {
                i = 1;
            } else {
                i = 0;
            }
            C84425b a2 = a.mo129403a("is_multi_content", i).mo129406a("mix_type", C69791b.m123314a(list.size() - i2, i2)).mo129406a("enter_from", "clip_edit_page");
            String str = f157437b;
            if (!(str == null || str.length() == 0)) {
                a2.mo129406a("enter_method", f157437b);
            }
            C73967at.m130094a("enter_clip_edit_page");
            C39162r.m79460a("enter_clip_edit_page", a2.f188764a);
        }
    }

    /* renamed from: a */
    public static void m124286a(String str, String str2) {
        f157436a = str;
        f157441f = str2;
    }

    /* renamed from: a */
    public static void m124288a(List<? extends VideoSegment> list, String str, boolean z) {
        if (!C84904k.m145909a(list)) {
            ArrayList<VideoSegment> arrayList = new ArrayList();
            if (list == null) {
                C89219l.m154715b();
            }
            for (T t : list) {
                if (!t.f156717i) {
                    arrayList.add(t);
                }
            }
            long j = 0;
            for (VideoSegment videoSegment : arrayList) {
                j += videoSegment.f156710b;
            }
            C39162r.m79460a(str, m124284a().mo129406a("content_type", m124285a(z)).mo129406a("content_source", "upload").mo129404a("content_duration_ms", j).f188764a);
        }
    }

    /* renamed from: a */
    public static void m124289a(boolean z, int i, String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("single_fast_import_cover_rate", new C84425b().mo129403a("fast_import", z ? 1 : 0).mo129403a("clip_mode", i).mo129406a("fast_import_fail", str).f188764a);
    }

    /* renamed from: a */
    public static void m124290a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z2) {
            C39162r.m79460a("edit_clip", m124291b(z).mo129406a("edit_way", "click").f188764a);
        } else if (z5) {
            C39162r.m79460a("edit_clip_delete", m124291b(z).f188764a);
        } else if (z3) {
            C39162r.m79460a("edit_clip_complete", m124291b(z).f188764a);
        } else if (z4) {
            C39162r.m79460a("edit_clip_cancel", m124291b(z).f188764a);
        } else if (z6) {
            C39162r.m79460a("edit_clips_order", m124291b(z).mo129406a("edit_way", "press").f188764a);
        }
    }
}

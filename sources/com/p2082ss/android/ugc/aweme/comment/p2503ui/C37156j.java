package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.keva.Keva;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.j */
public final class C37156j {

    /* renamed from: a */
    static final boolean f87552a = C16048b.m29633a().mo25421a(true, "comment_keyboard_workaround", false);

    /* renamed from: b */
    static final long f87553b = TimeUnit.DAYS.toMillis(3);

    /* renamed from: c */
    static final Keva f87554c;

    /* renamed from: d */
    static long f87555d;

    /* renamed from: e */
    static int f87556e;

    /* renamed from: f */
    public static final C37156j f87557f = new C37156j();

    private C37156j() {
    }

    /* renamed from: b */
    public static final boolean m74947b() {
        boolean z = !f87552a;
        if (!z) {
            m74945a(true);
        }
        return z;
    }

    static {
        Covode.recordClassIndex(44510);
        Keva repo = Keva.getRepo(UGCMonitor.EVENT_COMMENT);
        C89219l.m154716b(repo, "");
        f87554c = repo;
    }

    /* renamed from: a */
    public static final boolean m74946a() {
        Keva keva = f87554c;
        boolean z = true;
        boolean z2 = keva.getBoolean("keyboard_can_dismiss", true);
        if (keva.getLong("keyboard_can_dismiss_expire_time", 0) < System.currentTimeMillis()) {
            keva.storeBoolean("keyboard_can_dismiss", true);
        } else {
            z = z2;
            if (!z) {
                m74945a(false);
            }
        }
        return z;
    }

    /* renamed from: a */
    private static void m74945a(boolean z) {
        String str;
        if (z) {
            str = "by_network";
        } else {
            str = "by_local";
        }
        try {
            HashMap c = C89041ag.m154428c(C89387v.m154943a("wont_dismiss_type", str));
            C51423a.m95784a(2, "comment_keyboard_wont_dismiss", str);
            C12290b.m22064a("comment_keyboard_wont_dismiss", new JSONObject(C89041ag.m154429c(c)));
        } catch (Throwable unused) {
        }
    }
}

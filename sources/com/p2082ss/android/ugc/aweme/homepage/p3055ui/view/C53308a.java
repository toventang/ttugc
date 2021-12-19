package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view;

import android.content.Context;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a */
public final class C53308a {

    /* renamed from: a */
    public static float f122370a;

    /* renamed from: b */
    public static float f122371b;

    /* renamed from: c */
    public static boolean f122372c = true;

    /* renamed from: d */
    public static final C53308a f122373d = new C53308a();

    private C53308a() {
    }

    static {
        Covode.recordClassIndex(62867);
    }

    /* renamed from: a */
    private static SpecialTopicEntry m98306a() {
        try {
            return (SpecialTopicEntry) C16048b.m29633a().mo25415a(true, "special_event_entrypoint", SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static float m98307b(Context context, float f) {
        float b;
        C89219l.m154721d(context, "");
        if (C16048b.m29633a().mo25421a(true, "i18n_following_badge_type_number", false)) {
            b = C13628n.m24520b(context, 82.0f);
        } else {
            b = C13628n.m24520b(context, 57.0f);
        }
        return f + b;
    }

    /* renamed from: a */
    public static float m98304a(Context context, boolean z) {
        float f;
        C89219l.m154721d(context, "");
        SpecialTopicEntry a = m98306a();
        float b = C13628n.m24520b(context, 20.0f);
        if (a == null || !a.getEnable() || a.getLandingRoute().length() <= 0 || a.getIconUrl().length() <= 0 || (C63770ai.m139687c() && !a.getChildViewable())) {
            f = 0.0f;
        } else if (z) {
            f = C13628n.m24520b(context, 56.0f);
        } else {
            f = C13628n.m24520b(context, 40.0f);
        }
        return b + f;
    }

    /* renamed from: a */
    public static int m98305a(Context context, float f) {
        C89219l.m154721d(context, "");
        float b = m98307b(context, f);
        int a = C13628n.m24504a(context);
        float f2 = f122370a;
        if (f2 == 0.0f) {
            f2 = m98304a(context, true);
        }
        float f3 = f122371b;
        if (f3 == 0.0f) {
            f3 = m98304a(context, false);
        }
        float f4 = (float) a;
        if (b <= f4 - (f2 * 2.0f)) {
            f122372c = true;
            return 17;
        } else if (b <= f4 - (f3 * 2.0f)) {
            f122372c = false;
            return 17;
        } else if (b < f4 - C13628n.m24520b(context, 72.0f)) {
            f122372c = false;
            return 16;
        } else {
            f122372c = false;
            return 14;
        }
    }
}

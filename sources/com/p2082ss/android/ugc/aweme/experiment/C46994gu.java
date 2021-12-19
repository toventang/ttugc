package com.p2082ss.android.ugc.aweme.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.gu */
public final class C46994gu {

    /* renamed from: a */
    public static final C46994gu f109504a = new C46994gu();

    private C46994gu() {
    }

    static {
        Covode.recordClassIndex(55595);
    }

    /* renamed from: a */
    public static boolean m90273a() {
        return C16048b.m29633a().mo25421a(true, "tap_to_pause_wallpaper", false);
    }

    /* renamed from: a */
    public static boolean m90274a(Context context) {
        C89219l.m154721d(context, "");
        if (!m90273a() || !C58901f.m108227a(context)) {
            return false;
        }
        return true;
    }
}

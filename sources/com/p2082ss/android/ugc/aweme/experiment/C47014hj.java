package com.p2082ss.android.ugc.aweme.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.hj */
public final class C47014hj {

    /* renamed from: a */
    public static final C47014hj f109541a = new C47014hj();

    private C47014hj() {
    }

    static {
        Covode.recordClassIndex(55615);
    }

    /* renamed from: a */
    public static boolean m90284a() {
        if (C16048b.m29633a().mo25421a(true, "wallpaper_adjust_volume", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m90285a(Context context) {
        C89219l.m154721d(context, "");
        if (!m90284a() || !C58901f.m108227a(context)) {
            return false;
        }
        return true;
    }
}
